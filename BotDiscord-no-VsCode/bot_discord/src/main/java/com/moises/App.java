package com.moises;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import com.moises.Comandos.Mensagem;

import java.util.EnumSet;

public class App {
    public static JDA jda;
    public static void main( String[] args ) {
        jda = JDABuilder.create("Coloque-aqui-o-token-do-bot",
                EnumSet.allOf(GatewayIntent.class)).build();

                jda.addEventListener(new Mensagem());
    }
}
