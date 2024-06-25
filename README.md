# Padrões de Design com Java

Um estudo de padrões de design. Vamos abordar e 
analisar os padrões: Builder, Factory Method, 
Singleton, Prototype, Proxy, Adapter, Strategy, 
Chain of Responsibility e Template Method.


Padrões de design são criados para resolverem problemas existentes ouo que podem vir a aparecer no projeto.

## Builder
É um design onde você cria uma classe auxiliar para ajudar com a criação de um objeto de outra classe. As vantagens são que você não precisa se lembrar da ordem de declaração das propriedades quando passar os valores no construtor e mesmo que você fique muito tempo sem ver o código, uma vez que você volte nele é só passar o olho e você vai saber quais atributos aquela classe precisa receber. Em casos onde se escolhem aplicar esse design, apenas a classe builder fica responsável pela criação da instância da classe.


## Factory Method
É um método que cria instâncias de objetos baseado nas regras de negócio que esses objetos precisam seguir a partir da criação. Ex: uma apllicação de e-commerce onde existem produtos físicos e digitais no catálogo.


## Singleton
Esse padrão faz com que tenhamos apenas uma instância de classe na aplicação, ex: agenda pessoal, tabuleiro de xadrez. Aprendemos 2 formas de fazer um singleton:

- Eager: Quando iniciamos a instância junto com a aplicação
- Lazy: Quando iniciamos a instância sob demanda, apenas quando a aplicação pede


Vale ressaltar que a forma mais segura de fazer um singleton é com um enum, pois isso vai impedir que usuários mal intencionados criem mais de uma instância com métodos de reflection.


## Prototype
O prototype permite que criemos cópias de um objeto a partir de uma instância existente. Isso é interessante quando queremos copiar um objeto e manter suas características específicas.
 É um design  bastante usando no framework React, para criação de partes reutilizáveis de um site (por exemplo, toda página do site precisa de uma barra de navegador, então criamos um protótipo "navegador" e vamos adicionando a cada página do site). É um padrão fácil de refatorar e fazer manutenção.


## Proxy
Proxy é um padrão que permite controlar o acesso a algum objeto, executando tarefas antes ou depois desse acesso. Pode ser usado para realizar loggs, caching, etc.
