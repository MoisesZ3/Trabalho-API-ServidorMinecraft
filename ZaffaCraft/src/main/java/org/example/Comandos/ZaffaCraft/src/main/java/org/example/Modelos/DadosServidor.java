package org.example.Modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosServidor(@JsonAlias("hostname") String nome,
                            @JsonAlias("online") boolean status,
                            @JsonAlias("version") String versao,
                            @JsonAlias("players") Players players) {

}

