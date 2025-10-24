package org.example.Servicos;

public interface IConverteDadosServidor {
    <T> T obterDados(String json, Class<T> classe);
}
