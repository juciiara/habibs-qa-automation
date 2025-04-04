<h1 align="center">🍔 Projeto de Testes Automatizados - Habib's</h1>

<p align="center">
  <img src="https://img.shields.io/badge/status-finalizado-green?style=flat-square"/>
  <img src="https://img.shields.io/badge/testes-automatizados-blue?style=flat-square"/>
  <img src="https://img.shields.io/badge/cucumber-BDD-brightgreen?style=flat-square"/>
  <img src="https://img.shields.io/badge/java-21-orange?style=flat-square"/>
</p>

👩‍💻 Autor(a)

Juciara E. Conceição

🎯 QA | Automação de Testes | Java | Selenium | Cucumber

<p align="left"> <a href="https://www.linkedin.com/in/juciara-e-c/" target="_blank">🔗 LinkedIn</a> </p> 
---

## 🧪 Sobre o Projeto

Este repositório contém testes automatizados desenvolvidos para validar funcionalidades do sistema web do Habib's. Os testes foram escritos utilizando Java, Selenium WebDriver, Cucumber e JUnit, com cenários no padrão BDD.

---

## 📁 Estrutura do Projeto

📦 habbibs/
├── 📂 evidencia/                  → Evidências de execução (prints)
├── 📂 src/
│   └── 📂 test/
│       ├── 📂 java/
│       │   ├── 📂 runner/         → Runner do Cucumber
│       │   └── 📂 steps/          → Step Definitions
│       └── 📂 resources/
│           └── 📂 features/      → Arquivos .feature com os cenários
├── 📄 pom.xml                    → Gerenciador de dependências Maven
└── 📄 .gitignore                 → Arquivos ignorados pelo Git


---

## ⚙️ Tecnologias Utilizadas

- Java 21
- Maven 3.9.9
- Selenium WebDriver 4.25.0
- Cucumber 7.19.0
- JUnit 4+

---

## 🧾 Funcionalidades Testadas

- ✅ Verificação de funcionalidades principais do sistema
- ✅ Testes positivos e negativos
- ✅ Cenários em Gherkin
- ✅ Integração com Selenium
- ✅ Geração automática de evidências (prints)

---

## ▶️ Como Executar os Testes
      
### 1️⃣ Pré-requisitos

- Java 21 instalado  
  `java -version`

- Maven instalado  
  `mvn -version`
 
---

### 2️⃣ Clonar o Repositório   

```bash
git clone https://github.com/juciiara/habibs-qa-automation.git
cd habibs-qa-automation

3️⃣ Executar os Testes
    mvn test

📸 Evidência
A cada execução de cenário, prints são gerados automaticamente e armazenados na pasta evidencia/,
 facilitando o acompanhamento dos testes realizados.





