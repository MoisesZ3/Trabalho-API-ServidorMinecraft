package com.moises.Servicos;

public interface IConverteDadosServidor {
    <T> T obterDados(String json, Class<T> classe);
}
