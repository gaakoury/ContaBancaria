# Projeto Conta Bancária

## Descrição

Este projeto contém testes de comportamento para as operações de uma conta bancária. A especificação é escrita em Gherkin, e a implementação dos passos de teste pode ser feita utilizando o Cucumber.

## Autor

Gabriel Koury de Lima

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/`: Contém a implementação dos passos de teste em Java.
- `features/`: Contém os arquivos de especificação em Gherkin.
- `README.md`: Documentação principal do projeto.

## Utilização do Cucumber
A utilização da ferramenta Cucumber foi dada da seguinte maneira, onde econtramos duas situações:

![image](https://github.com/gaakoury/ContaBancaria/assets/114704606/44423e1f-952b-4a52-b81b-4bb3e5a81041)

## Cliente Especial com Saldo Negativo

@tag1
- Scenario: Cliente especial com saldo negativo
- Given um cliente especial com saldo atual de -200 reais
- When for solicitado um saque no valor de 100 reais
- Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
- And check more outcomes

## Cliente Comum com Saldo Negativo

@tag2
- Scenario Outline: Cliente comum com saldo negativo
- Given um cliente comum com saldo atual de -200 reais
- When solicitar um saque de 200 reais
- Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente

## Classe conta

A classe conta foi gerada a partir das orientações indicadas pelo Cucumber, e comentadas seguindo o padrão Javadoc,
assim como pode ser verificado no trecho a seguir, onde tratamos o caso do Cliente Especial com saldo negativo:

![image](https://github.com/gaakoury/ContaBancaria/assets/114704606/c291c1f6-d614-4d56-9b19-a0ca0c02f313)
![image](https://github.com/gaakoury/ContaBancaria/assets/114704606/711fa538-fb8b-4816-a657-7bbf23425f0c)






