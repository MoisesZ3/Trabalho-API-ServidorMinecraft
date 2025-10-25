package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.Comandos.Mensagens;

import java.util.EnumSet;

public class Main {
    public static JDA jda;
    public static void main(String[] args) {
        jda = JDABuilder.create("MTQyOTk2MDQxOTYwMjA3NTc3Mw.Gnpx9j.w5b7bK_7z4cfAMDYYwwS5BrCA9mrTpE2b4ye-U",
                EnumSet.allOf(GatewayIntent.class)).build();

            jda.addEventListener(new Mensagens());
    }
}