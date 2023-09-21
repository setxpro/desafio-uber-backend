# Java Spring + Arquitetura limpa

1) Criando o CORE da Aplicação (use cases) 
    - file : src/main/java/com.kipper.emailservice/core
   # define contract with Interface 

   # Camada de aplicação

- CORE: Definição dos casos de uso
  - Defini os casos de uso
  - Mantive as regras de negócio
  - não conhece ninguém
    
- Application: contem a implementação dos casos de uso
    - Implementação dos casos de uso
    - Pegar a interface e implementar numa class
    - a camada application só conhece a camada core

- Adapters: Adaptador de interface
  - Adaptar o mundo de fora para uma interface 
  - Com isso a minha aplicação vai depender dessa interface e não do mundo de fora.
  - Para que ele interaja com serviços de fora, como o serviço de email da AWS

2) Camada de infra e estrutura;
  - Comunicação com a AWS-ses
  - OBS.: o SES -> pode não ser o único serviço que a a minha aplicação esteja utilizando
  - posso estar utilizando outros serviços 

# infra
  - Camada de infra e estrutura que vai se comunicar com serviços externos
  - Vai conter toda a parte que é responsável por fazer comunicação com serviços externos
  - assim eu vou criando pacotes para cada serviço que eu vou utilizando.

- Create Exception
  - 

- Controllers
  - 

3) Configuração do SDK AWS
 - Variáveis no application.properties
 - Configuração do AwsSesConfig -> para que o SesEmailSender.
 - Dizer para o SesEmailSender as configirações antes de inicializar
 - Para o SesEmailSender criar a instancia correta, pois ele não sabe criar.

4) Configuração no console da AWS
  ...

