package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.Comandos.Mensagens;

import java.util.EnumSet;

public class Main {
    public static JDA jda;
    public static void main(String[] args) {
        jda = JDABuilder.create("Coloque-aqui-o-token-do-bot",
                EnumSet.allOf(GatewayIntent.class)).build();

            jda.addEventListener(new Mensagens());
    }
}