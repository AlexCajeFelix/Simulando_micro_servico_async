# Simulação de Microserviço - Requisições Assíncronas

## Descrição

Este projeto simula um microserviço que realiza requisições assíncronas para APIs externas, processando as respostas de forma eficiente. O sistema faz chamadas para a API do Pokémon e a API de CEP, processando os dados recebidos e realizando verificações condicionais para executar ações com base nas respostas.

O objetivo principal deste projeto é aprender sobre o uso de **threads** em Java, melhorar os conhecimentos de programação e desenvolver habilidades em **requisições HTTP** e **manipulação de JSON**.

## Tecnologias

- **Java 17+** (para aproveitar as funcionalidades mais recentes de threads e HTTP)
- **Biblioteca Gson** (para trabalhar com JSON)
- **HTTP Client** (para fazer requisições HTTP assíncronas)

## Funcionalidades

1. **Requisição para API do Pokémon**: A primeira parte do serviço consulta a API do Pokémon para buscar dados sobre um Pokémon específico (como `bulbasaur`).
2. **Requisição para API de CEP**: Após obter a resposta da API do Pokémon, o serviço faz uma requisição para a API de CEP, obtendo informações sobre um endereço com base no CEP fornecido.
3. **Processamento Condicional**: Após receber as respostas das duas APIs, o serviço verifica certas condições (como o nome do Pokémon) e executa ações específicas.

## Objetivo

O principal objetivo deste projeto é:
- Estudar **programação multithread** em Java.
- Melhorar a **manipulação de dados em JSON**.
- Praticar o uso de **requisições HTTP assíncronas** em Java.
- Aperfeiçoar o entendimento de como trabalhar com **APIs externas** e **processamento de respostas assíncronas**.

## Como rodar o projeto

1. Certifique-se de ter o **Java 17+** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone <URL do repositório>

   Navegue ate o diretorio e cole 
   javac -cp .:gson-2.8.8.jar App.java

   Execute o projeto 
   java -cp .:gson-2.8.8.jar App

## Aprendizados

- **Trabalhando com Threads**: Aprender a criar e gerenciar threads em Java para executar tarefas assíncronas.
- **Requisições HTTP**: Como realizar chamadas HTTP para APIs externas e processar as respostas.
- **JSON e Gson**: Como manipular dados no formato JSON usando a biblioteca Gson.
- **Estruturas condicionais**: Como trabalhar com dados recebidos das APIs para tomar decisões no código.

## Contribuições

Este é um projeto pessoal e está em constante evolução. Qualquer contribuição, sugestão ou melhoria é bem-vinda! Se você deseja contribuir, pode fazer isso de várias maneiras:

1. **Abrir Issues**: Relatar bugs ou sugerir melhorias.
2. **Fazer Pull Requests**: Submeter melhorias de código ou correções.
3. **Documentação**: Ajudar a melhorar a documentação do projeto.
4. **Feedback**: Deixe suas sugestões e experiências com o projeto!

Agradeço desde já qualquer colaboração! 🙏

