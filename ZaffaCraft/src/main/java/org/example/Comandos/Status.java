package org.example.Comandos;

import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import org.example.Servicos.FormatadorMensagem;
import org.jetbrains.annotations.NotNull;

public class Status extends ListenerAdapter {


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        FormatadorMensagem texto = new FormatadorMensagem();

        String[] mensagem = event.getMessage().getContentRaw().split(" ");
        MessageChannel channel = event.getChannel();

        if (mensagem[0].equalsIgnoreCase("!" + "status")) {
            String resposta = texto.formatador();
            channel.sendMessage(resposta).queue();
        }
    }
}