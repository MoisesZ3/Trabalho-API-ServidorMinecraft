package org.example.Servicos;

import org.example.Modelos.DadosServidor;
import org.example.Modelos.Players;

public class FormatadorMensagem {

    public String formatador() {
        ConsomeApi consomeApi = new ConsomeApi();
        ConverteDadosServidor converteDadosServidor = new ConverteDadosServidor();
        String json = consomeApi.obterDados("https://api.mcsrvstat.us/3/bmc.mc-complex.com");
        DadosServidor dadosServidor = converteDadosServidor.obterDados(json, DadosServidor.class);
        Players players = dadosServidor.players();

        String statusMensagem = dadosServidor.status() ? "Online ✅" : "Offline ❌";

        String textoFormatado = String.format("""
                            Nome: %s
                            Status: %s
                            Versão: %s
                            JogadoresOnline: %s
                            maxJogadores: %s
                            """,
                dadosServidor.nome(),
                statusMensagem,
                dadosServidor.versao(),
                players.jogadoresOnline(),
                players.maxJogadores()
            );
        return textoFormatado;
    }
}
