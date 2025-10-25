package org.example.Comandos;

import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import org.example.Modelos.DadosServidor;
import org.example.Modelos.Players;
import org.example.Servicos.ConsomeApi;
import org.example.Servicos.ConverteDadosServidor;
import org.example.Servicos.FormatadorMensagem;
import org.jetbrains.annotations.NotNull;

public class Mensagens extends ListenerAdapter {


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        FormatadorMensagem mensagemCompleta = new FormatadorMensagem();
        ConsomeApi consomeApi = new ConsomeApi();
        ConverteDadosServidor converteDadosServidor = new ConverteDadosServidor();
        String json = consomeApi.obterDados("https://api.mcsrvstat.us/3/bmc.mc-complex.com");
        DadosServidor dadosServidor = converteDadosServidor.obterDados(json, DadosServidor.class);
        Players players = dadosServidor.players();
        String statusMensagem = dadosServidor.status() ? "Online ✅" : "Offline ❌";

        String[] mensagem = event.getMessage().getContentRaw().split(" ");
        MessageChannel channel = event.getChannel();


        switch (mensagem[0]) {
            case "!" + "dados"->
                channel.sendMessage(mensagemCompleta.formatador(dadosServidor)).queue();
            case "!" + "nome"->
                channel.sendMessage(dadosServidor.nome()).queue();
            case "!" + "status"->
                channel.sendMessage(statusMensagem).queue();
            case "!" + "versão"->
                channel.sendMessage(String.valueOf(dadosServidor.versao())).queue();
            case "!" + "jogadoresOnline"->
                channel.sendMessage(String.valueOf(players.jogadoresOnline())).queue();
            case "!" + "jogadoresMax"->
                channel.sendMessage(String.valueOf(players.maxJogadores())).queue();
        }
    }
}