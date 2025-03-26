# Desafio Controle de Fluxo
📚 Repositório criado para fins de estudos do Bootcamp Bradesco - Java Cloud Native pela plataforma da [DIO](https://web.dio.me/).

# Descrição
- O programa solicita que o usuário digite no terminal dois parâmetros inteiros;
- Chama o método "contar" que verifica se que o primeiro parâmetro é maior que o segundo;
- Em caso positivo, lança exceção customizada "ParametrosInvalidosException". Caso negativo, o programa prossegue;
- Calcula o intervalo entre os dois parâmetros;
- Imprime no terminal a contagem de números entre os parâmetros fornecidos.
  
## Detalhes da exceção
O programa possui tratamento de exceções customizada:
- Avalia se o primeiro parâmetro fornecido é maior que o segundo;
- Caso verdadeiro, lança a exceção "InvalidParametersException";
- A exceção passa como parâmetro a seguinte mensagem: "O segundo parâmetro deve ser maior que o primeiro", que é exibida no terminal.
