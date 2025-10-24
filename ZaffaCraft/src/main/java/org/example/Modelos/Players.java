package org.example.Modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Players(@JsonAlias("online") int jogadoresOnline,
                      @JsonAlias("max") int maxJogadores) {
}
