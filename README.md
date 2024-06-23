# Padrões de Design com Java

Um estudo de padrões de design. Vamos abordar e 
analisar os padrões: Builder, Factory Method, 
Singleton, Prototype, Proxy, Adapter, Strategy, 
Chain of Responsibility e Template Method.


Padrões de design são criados para resolverem problemas existentes ouo que podem vir a aparecer no projeto.

## Builder
É um design onde você cria uma classe auxiliar para ajudar com a criação de um objeto de outra classe. As vantagens são que você não precisa se lembrar da ordem de declaração das propriedades quando passar os valores no construtor e mesmo que você fique muito tempo sem ver o código, uma vez que você volte nele é só passar o olho e você vai saber quais atributos aquela classe precisa receber. Em casos onde se escolhem aplicar esse design, apenas a classe builder fica responsável pela criação da instância da classe.


