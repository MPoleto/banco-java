# Criação de um banco com Java

Neste projeto criei um banco seguindo o paradigma da orientação à objetos usando Java, seguindo como base o desafio de projeto "Criando um banco digital com Java e orientação à objetos" apresentado pelo Venilton Falvo Jr. na plataforma da DIO.

No projeto adicionei:

- A classe *Banco*, que possui diversos atributos, entre eles: nome, agência bancária e uma lista das contas. 
    -  Um método para exibir as informações das contas adicionadas à lista (tipo de conta, número da conta e nome do cliente).
- A interface *Conta* onde foram criados os métodos de *saque*, *depósito*, *transferência* e *imprimir extrato*.
- A classe *abstrata Conta* que possui os atributos agência bancária (informação que vem da classe *Banco*), número da conta, tipo de conta, saldo e cliente (informação que vem da classe *Cliente*).
    - os atributos agência bancária e número da conta são criados utilizando `Math.random()`.
    - implementa a interface *Conta*.
    - os métodos *saque* e *transferência* possuem condicionais para não concluir a operação caso o valor seja maior que o saldo.
    - o método *imprimir extrato* mostra as informações: nome, conta, agência e saldo.
- As classes *Conta Corrente* e *Conta Poupança* são classes filhas de *Conta*.
- Na classe *Conta Poupança* os métodos *saque* e *transferência* são sobreescritos para receber a condição que só permite as operações caso o cliente tenha 18 anos ou mais (seguindo a ideia de quando os pais criam uma poupança para seus filhos, que só podem acessar ao dinheiro quando forem maiores de idade).
- A classe *Cliente* que possui os atributos de cadastro (para deixar o mais próximo da realidade): nome, data de nascimento, cpf, número do celular, email, endereço. Sendo os atributos nome e data de nascimento utilizados nas contas.

\*\* A nomenclatura utilizada no projeto foi escrita em inglês, aqui escrevi em português para facilitar a descrição.