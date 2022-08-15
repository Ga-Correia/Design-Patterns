# Design-Patterns
 Códigos em Java, que aplicam padrões de projeto, que fiz ao longo da disciplina de Projeto Orientado à Objetos

Descrição dos exercícios para cada padrão de projeto:

### Adapter

Escreva uma classe que permita que o cliente VectorDraw,
que já usa a classe Shape, use as operações de RasterBox (e
Coords) para obter os mesmos dados.

### Composite

Implemente o padrão Composite para representar os componentes de uma máquina,
utilizando as classe MachineComposite, MachineComponent e Machine.

### Singleton

Escreva uma classe executável (com main) que obtenha
três referências do objeto que você escreveu no exercício
do Adapter e verifique que realmente se tratam da mesma
referência.

### Mediator

Implemente o padrão Mediator para 3 pessoas que escolherão para seu texto 
uma cor das seguintes cores: vermelho, azul e verde. Tendo escolhido uma 
cor por meio de uma mensagem, o mediador deve retornar o texto nas outras 
duas cores não escolhidas.

### Proxy

Implementação do padrão Proxy para as classes Cliente, SujeitoReal, Intermediario
e Sujeito.

### Chain of Responsibility

Escreva uma aplicação em Java que
receba um texto ou arquivo de texto da linha
de comando.
- O texto deve ser lido e estatísticas devem ser
impressas sobre: a) o número de espaços
encontrados, b) o número de letras 'a' e c) o
número de pontos.
- Use Chain of Responsibility e faça com que cada
tipo de caractere seja tratado por um elo
diferente da corrente.

### Flyweight

Implemente uma aplicação que imprima
aleatoriamente 10 números de 10 algarismos.
- Cada algarismo deve ser uma instancia do objeto
Algarismo que possui o numero 1, 2, 3, etc. como membro
imutável.
- Use Flyweight para que objetos que representam o mesmo
algarismo sejam reutilizados.

### Builder

Uma aplicação precisa construir objetos Pessoa,
e Empresa. Para isto, precisa ler dados de um banco
para cada produto.
- Para construir uma Pessoa é preciso obter nome e
identidade. Apenas se os dois forem lidos a pessoa pode
ser criada.

### Abstract Factory

Implemente uma aplicação que constrói
Pontos (x, y), Circulos (Ponto, raio), Retangulos
(Ponto, Ponto), Triangulos (Ponto, Ponto, Ponto)
e use uma fábrica abstrata para controlar a
criação de todos os objetos.

### Prototype

Implemente, na fábrica de Figuras
(capítulos anteriores), métodos createXXX()
que aceitem um objeto como argumento e
retornem um clone.
- Implemente o método clone() em todos os objetos.
- Garanta que a cópia realmente copia todo o
estado do objeto.

### Memento

Escreva uma aplicação referente aos conceitos do padrão Memento para
a classe Ponto.

### Template Method

16.1 Escreva um Comparator para ordenar palavras
pela última letra. Escreva uma aplicação que use
Arrays.sort() para testar a aplicação.

16.2 Mostre como você poderia escrever um
template method para gerar uma classe Java
genérica (contendo nome, extends, métodos etc.).

### State

Escreva uma aplicação referente aos conceitos do padrão State para
o paradoxo do Gato de Schrödinger, tendo os seguintes estados:
vivo, morto e quântico.

### Decorator

Crie um objeto simples que armazene um texto que possa ser
recuperado com um método getTexto(). Crie decoradores que
retornem o texto: a) em caixa-alta, b) invertido e c) cercado por tags
<b> e </b>. Teste os decoradores individualmente e em cascata.
