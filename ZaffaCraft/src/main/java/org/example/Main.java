package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.Comandos.Status;

import java.util.EnumSet;

public class Main {
    public static JDA jda;
    public static void main(String[] args) {
        jda = JDABuilder.create("MTQyOTk2MDQxOTYwMjA3NTc3Mw.GYetnc.C0lE1KUnOBtr3EUjx4MptSzIRg4Q4LUydLBNRg",
                EnumSet.allOf(GatewayIntent.class)).build();

            jda.addEventListener(new Status());
    }
}