# 🔐 Gerador de Senhas Seguras

Um serviço REST simples e seguro para gerar senhas aleatórias com critérios personalizáveis. Construído com **Spring Boot**.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **SecureRandom (Java Security)**
- **Maven**

## 📌 Funcionalidades

✅ Gerar senhas aleatórias de qualquer tamanho (padrão: 12 caracteres)  
✅ Escolher entre incluir letras maiúsculas, números e caracteres especiais  
✅ API REST para integração fácil com aplicações externas  

## 📂 Estrutura do Projeto

```
gerador-senhas/
│── src/main/java/com/exemplo/geradorsenhas/
│   ├── controllers/ (Controlador da API)
│   ├── services/ (Lógica da geração de senha)
│   ├── GeradorSenhasApplication.java (Main)
│── pom.xml (Dependências)
```

## ⚙️ Como Rodar o Projeto

### 1️⃣ Clonar o repositório
```sh
https://github.com/Reediajf/Gerador_De_Senhas.git
cd gerador-senhas
```

### 2️⃣ Construir o projeto com Maven
```sh
mvn clean install
```

### 3️⃣ Executar o projeto
```sh
mvn spring-boot:run
```

## 🌐 Como Usar a API

A API expõe um endpoint para gerar senhas seguras:

### 🔹 Endpoint: Gerar Senha
```http
GET /api/senha/gerar
```
#### 🔹 Parâmetros disponíveis:
| Parâmetro       | Tipo     | Padrão | Descrição |
|----------------|---------|--------|-----------|
| `tamanho`       | int     | `12`   | Define o tamanho da senha |
| `usarMaiusculas`     | boolean | `true` | Incluir letras maiúsculas? |
| `usarMinusculas`   | boolean | `true` | Incluir letras minúsculas? |
| `usarNumeros`   | boolean | `true` | Incluir numeros? |
| `usarEspeciais`   | boolean | `true` | Incluir caracteres especiais? |

#### 🔹 Exemplo de Requisição:
```http
GET http://localhost:8080/api/senha/gerar?tamanho=16&usarMaiusculas=true&usarMinusculas=true&usarNumeros=true&usarEspeciais=true
```
#### 🔹 Exemplo de Resposta:
```json
"A7$dRt9!qLp@Zx5N"
```

## 🤝 Contribuição
Sinta-se à vontade para abrir **issues** e **pull requests**!

## 📜 Licença
Este projeto é open-source e está licenciado sob a **MIT License**.

---
**Desenvolvido por Jaider Flávio github.com/Reediajf/ 🚀**
