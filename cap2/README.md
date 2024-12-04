# Requisitos do Analista de Extratos Bancários

1. Ler um arquivo de texto que contém uma lista de transações bancárias;
2. O arquivo irá utilizar uma estrutura CSV;
3. Os valores estarão separados por vírgula.

# Princípios

## KISS

"keep it simple stupid"

- prevê que deve ser simples localizar o cóidog responsável por determinado recurso
- deve ser simples entender o que o código faz
- deve oferecer um bom encap- sulamento, onde o usuário não deve ver os detalhes da implementação

## SRP

- single responsabily principle: afirma que toda classe deve ser responsável por uma e exclusivamente por uma coisa.
- caso você não siga o SRP você pode acabar caindo no que se chama de Classe Deus (God Class) onde uma só classe retém toda a lógica
- o código em questão só tem uma razão para que a classe mude. Vários motivos focados em uma única classe pode gerar problemas de manteneabilidade do código.
