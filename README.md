# Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework

Reprodução do lab project "Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework",p ela Digital Innovation One

## Visão Geral
Esta aplicação Spring Boot demonstra o uso de padrões de projeto e integração com APIs externas para gerenciar dados de clientes e seus endereços. Utiliza o cliente Feign para se comunicar com a API ViaCep para consulta de endereços baseada em códigos postais (CEPs).

## Funcionalidades
- Recuperar todos os clientes e seus detalhes.
- Consultar um único cliente pelo ID.
- Adicionar novos clientes juntamente com os detalhes do endereço.
- Atualizar informações de clientes existentes.
- Excluir clientes do sistema.

## Endpoints
A aplicação expõe os seguintes endpoints RESTful:
- GET /clientes: Busca todos os clientes.
- GET /clientes/{id}: Recupera um cliente pelo seu ID.
- POST /clientes: Adiciona um novo cliente.
- PUT /clientes/{id}: Atualiza os detalhes de um cliente existente.
- DELETE /clientes/{id}: Remove um cliente do sistema.

## API Externa
A aplicação utiliza a API ViaCep (https://viacep.com.br) para buscar detalhes de endereços.
