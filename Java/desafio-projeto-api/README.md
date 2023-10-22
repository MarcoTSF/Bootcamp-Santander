### Projeto desenvolvido durante realização do desafio de projeto "Publicando sua API REST na nuvem usando Spring Boot 3, Java 17 e Railway" do Santander Bootcamp 2023 - Fullstack Java+Angular.


Diagrama de classes da aplicação criado a partir do ChatGPT:
```mermaid
classDiagram
    class User {
        -name: String
        -account: Account
        -features: Feature[]
        -card: Card
        -news: News[]
    }
    
    class Account {
        -number: String
        -agency: String
        -balance: Double
        -limit: Double
    }
    
    class Feature {
        -icon: String
        -description: String
    }
    
    class Card {
        -number: String
        -limit: Double
    }
    
    class News {
        -icon: String
        -description: String
    }
    
    User "1" *-- "1" Account 
    User "1" *-- "N" Feature 
    User "1" *-- "1" Card 
    User "1" *-- "N" News 
```