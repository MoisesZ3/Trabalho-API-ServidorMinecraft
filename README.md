@"
# 🧩 ZaffaCraft - Bot de Status do Servidor Minecraft

Bem-vindo!  
Neste trabalho mostrarei como usar a **Minecraft Server Status API** para exibir o status do meu servidor **Minecraft**, utilizando um **bot do Discord** que envia essas informações por mensagem diretamente no canal do Discord.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Maven**
- **JDA (Java Discord API)** — para integração com o Discord  
- **Minecraft Server Status API** — para consultar o status do servidor Minecraft

---

## 🌐 Links Importantes

- [Minecraft Server Status API](https://api.mcsrvstat.us)
- [Documentação JDA](https://jda.wiki/using-jda/getting-started)

---

## ⚙️ Como Funciona

O projeto consulta a **API de status do servidor Minecraft** para obter informações como:
- Status online/offline
- Quantidade de jogadores conectados
- Versão do servidor
- Mensagem do dia (MOTD)

Esses dados são então formatados e enviados para um canal do Discord por meio do **bot** configurado com **JDA**.

---

## 🧱 Requisitos

- Java 17 instalado  
- Maven configurado no sistema  
- Token de bot do Discord válido  
- Acesso à API [mcsrvstat.us](https://api.mcsrvstat.us)
