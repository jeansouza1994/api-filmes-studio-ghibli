# API Filmes Studio Ghibli

API REST desenvolvida com Java e Spring Boot para gerenciamento de filmes do Studio Ghibli.

O projeto foi criado com foco em estudos de desenvolvimento Back-End e implementação de operações CRUD utilizando boas práticas com Spring Boot.

A aplicação permite:

- Cadastrar filmes
- Listar filmes
- Atualizar filmes
- Remover filmes

---

# Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL (Neon)
- Jakarta Validation
- Lombok
- Maven

---

# Objetivo da API

A API foi desenvolvida como projeto de portfólio com o objetivo de praticar conceitos fundamentais de desenvolvimento Back-End, incluindo:

- Criação de APIs REST
- Operações CRUD
- Arquitetura em camadas
- Utilização de DTOs
- Validações de dados
- Integração com banco de dados PostgreSQL
- Persistência de dados com JPA/Hibernate

Toda a persistência de dados é realizada utilizando PostgreSQL hospedado na plataforma Neon.

---

# Endpoints

## Cadastrar Filme

Endpoint responsável por registrar um novo filme.

```http
POST /filme
```

### Body da Requisição

```json
{
  "nome": "A Viagem de Chihiro",
  "sobre": "Filme de fantasia dirigido por Hayao Miyazaki",
  "sinopse": "Uma garota entra em um mundo mágico habitado por espíritos",
  "anoLancamento": 2001,
  "duracao": 125,
  "genero": "Fantasia"
}
```

### Parâmetros

| Campo | Tipo | Obrigatório | Descrição |
|---|---|---|---|
| nome | String | Sim | Nome do filme |
| sobre | String | Sim | Pequena descrição sobre o filme |
| sinopse | String | Sim | Sinopse do filme |
| anoLancamento | Integer | Sim | Ano de lançamento do filme |
| duracao | Integer | Sim | Duração do filme em minutos |
| genero | String | Sim | Gênero do filme |

### Validações

- Nenhum campo textual pode estar vazio
- O campo `duracao` deve possuir valor mínimo igual a 1
- Todos os campos obrigatórios devem ser informados

### Respostas

| Código | Descrição |
|---|---|
| 201 | Filme cadastrado com sucesso |
| 400 | Dados inválidos na requisição |

---

## Listar Filmes

Retorna todos os filmes cadastrados.

```http
GET /filme
```

### Exemplo de Resposta

```json
[
  {
    "id": 1,
    "nome": "A Viagem de Chihiro",
    "sobre": "Filme de fantasia dirigido por Hayao Miyazaki",
    "sinopse": "Uma garota entra em um mundo mágico habitado por espíritos",
    "anoLancamento": 2001,
    "duracao": 125,
    "genero": "Fantasia"
  }
]
```

### Respostas

| Código | Descrição |
|---|---|
| 200 | Filmes retornados com sucesso |

---

## Atualizar Filme

Atualiza os dados de um filme existente.

```http
PUT /filme?id=1
```

### Body da Requisição

```json
{
  "nome": "Meu Amigo Totoro",
  "sobre": "Filme clássico do Studio Ghibli",
  "sinopse": "Duas irmãs conhecem criaturas mágicas na floresta",
  "anoLancamento": 1988,
  "duracao": 86,
  "genero": "Fantasia"
}
```

### Query Params

| Parâmetro | Tipo | Obrigatório | Descrição |
|---|---|---|---|
| id | long | Sim | ID do filme que será atualizado |

### Respostas

| Código | Descrição |
|---|---|
| 204 | Filme atualizado com sucesso |
| 400 | Dados inválidos |
| 404 | Filme não encontrado |

---

## Remover Filme

Remove um filme cadastrado.

```http
DELETE /filme?id=1
```

### Query Params

| Parâmetro | Tipo | Obrigatório | Descrição |
|---|---|---|---|
| id | long | Sim | ID do filme que será removido |

### Respostas

| Código | Descrição |
|---|---|
| 204 | Filme removido com sucesso |
| 404 | Filme não encontrado |

---

# Estrutura do Projeto

```bash
src
 └── main
     ├── java
     │    └── com.api_filmes.api_filmes_studio_ghibli
     │         ├── controlador
     │         │    └── dtos
     │         ├── negocio
     │         │    └── services
     │         └── infraestrutura
     │              ├── entity
     │              └── repository
     └── resources
```

---

# Banco de Dados

A aplicação utiliza PostgreSQL hospedado na plataforma Neon para persistência dos dados.

A comunicação com o banco é realizada utilizando:

- Spring Data JPA
- Hibernate

---

# Autor

Projeto desenvolvido para fins de estudo e prática de desenvolvimento Back-End com Java e Spring Boot.

