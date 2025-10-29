package com.moises.Servicos;

import com.moises.Modelos.DadosServidor;
import com.moises.Modelos.Players;

public class FormatadorMensagem {

    public String formatador(DadosServidor dadosServidor) {
        Players players = dadosServidor.players();

        String statusMensagem = dadosServidor.status() ? "Online ✅" : "Offline ❌";

        return String.format("""
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
    }
}
