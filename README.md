# Springboot API (Desafio da DIO)

## 📖 Descrição

Este projeto consiste em uma pequena API desenvolvida com Java, Springboot e Gradle. Esse foi meu primeiro contato com a framework e consegui aprender diversos conceitos sobre desenvolvimento de APIs em Java.

## 📦 Configuração

Para executar o projeto como perfil de `desenvolvimento`, é necessário configurar a seguinte variável de ambiente:

```bash
SPRING_PROFILES_ACTIVE=dev
```

O perfil de `produção` requer essa outras variáveis para configurar o PostgreSQL (elas estão em uso no arquivo `application-prd.yml`):

```bash
SPRING_PROFILES_ACTIVE=prd
PGDATABASE=...
PGHOST=...
PGPASSWORD=...
PGPORT=...
PGUSER=...
```

## 🗂️ Estrutura do projeto

```
📁 src/
  📁 build/ -> versão de produção.
  📁 gradle/ -> arquivos do gradle.
  📁 src/ -> código fonte do projeto.
    📁 main/ -> arquivos principais.
      📁 java/ -> código do projeto.
      📁 resources/ -> configuração dos ambientes (dev e prd).
    📁 test/ -> testes do projeto.
  📄 build.gradle -> plugins e informações do projeto.
```

### 🔀 Rotas

#### 📍 Rotas dos corredores

| Método | Endpoint     | Descrição            |
| ------ | ------------ | -------------------- |
| GET    | `/users/:id` | Lista um usuário     |
| POST   | `/users/:id` | Cria um novo usuário |

## 🛠️ Ferramentas e tecnologias

[![Ferramentas](https://skillicons.dev/icons?i=idea,java,spring,gradle)](https://skillicons.dev)

- Desenvolvido com a IDE do Intellij.
- Gradle utilizado para o gerenciamento das dependencias.
- Projeto criado com Spring Framework.

## 🔗 Links

- [Digital Innovation One](https://www.dio.me/)
- [Repo do desafio](https://github.com/falvojr/santander-dev-week-2023)
- [Template do initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.5.5&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,data-jpa,h2,postgresql)
- [OpenAPI](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui/2.8.11)

## 🧑🏻‍💻 Author

| [<img src="https://avatars.githubusercontent.com/u/72778164?s=96&v=4"><br><sub>GracilianoOG</sub>](https://github.com/GracilianoOG) |
| :---------------------------------------------------------------------------------------------------------------------------------: |
|                                       [Linkedin](https://www.linkedin.com/in/gabrielgmbarros)                                       |

## 📝 Licença

O código fonte está sob a licença [MIT](./LICENSE).
