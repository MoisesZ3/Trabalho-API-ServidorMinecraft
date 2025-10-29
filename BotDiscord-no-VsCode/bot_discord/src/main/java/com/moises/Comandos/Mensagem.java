package com.moises.Comandos;

import org.jetbrains.annotations.NotNull;

import com.moises.Modelos.DadosServidor;
import com.moises.Modelos.Players;
import com.moises.Servicos.ConsomeApi;
import com.moises.Servicos.ConverteDadosServidor;
import com.moises.Servicos.FormatadorMensagem;

import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Mensagem extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        FormatadorMensagem mensagemCompleta = new FormatadorMensagem();
        ConsomeApi consomeApi = new ConsomeApi();
        ConverteDadosServidor converteDadosServidor = new ConverteDadosServidor();
        String json = consomeApi.obterDados("https://api.mcsrvstat.us/3/Coloque-aqui-o-id-do-servidor");
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
