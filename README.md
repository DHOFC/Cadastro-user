# 📌 Cadastro User API

API REST desenvolvida com **Spring Boot** para gerenciamento de usuários.

---

## 🚀 Tecnologias Utilizadas

- Java 25  
- Spring Boot 4  
- Spring Data JPA  
- H2 Database (em memória)  
- Maven  
- Postman  

---

## 📂 Estrutura do Projeto

- **Controller** → Camada de requisição HTTP  
- **Service** → Regras de negócio  
- **Repository** → Acesso ao banco (JPA)  
- **Entity** → Representação da tabela no banco  

---

## 🗄 Banco de Dados

- Banco utilizado: **H2 (em memória)**  
- URL: `jdbc:h2:mem:usuario`  
- Console H2: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  

**Credenciais:**  
- **User:** gabriel  
- **Password:** (deixe em branco)  

---

## 📌 Endpoints

| Ação | Método | URL | Body JSON |
|------|--------|-----|-----------|
| Criar usuário | POST | `/usuario` | `{ "nome": "Gabriel", "email": "gabriel@email.com" }` |
| Listar usuários | GET | `/usuario` | - |
| Buscar usuário por ID | GET | `/usuario/{id}` | - |
| Atualizar usuário | PUT | `/usuario/{id}` | `{ "nome": "Novo Nome", "email": "novoemail@email.com" }` |
| Deletar usuário | DELETE | `/usuario/{id}` | - |

---

## ▶️ Como Executar o Projeto

1. Clonar o repositório  
2. Abrir no **IntelliJ IDEA**  
3. Executar a classe principal: `CadastroUserApplication`  
4. Acessar: [http://localhost:8080](http://localhost:8080)  

---

## 🧪 Testando com Postman

- URL base: `http://localhost:8080/usuario`  
- Configure o **Body** no formato JSON conforme os exemplos acima  

---

## 👨‍💻 Autor

**Gabriel**
