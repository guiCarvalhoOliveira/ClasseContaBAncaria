1. Objetivo
– Praticar encapsulamento de atributos
– Implementar construtor
– Criar métodos getter e setter

2. Enunciado
Você deverá criar uma classe ContaBancaria que represente uma conta corrente em um banco. Essa
classe deve atender aos seguintes requisitos:
1. Atributos privados
- int numeroConta
- String titular
- double saldo
2. Construtor
- Um construtor público que receba numeroConta, titular e saldoInicial e inicialize os
  atributos correspondentes.
3. Getters e Setters
- Métodos getNumeroConta(), setNumeroConta(int)
- Métodos getTitular(), setTitular(String)
- Método getSaldo() (apenas getter para saldo; o ajuste de saldo será feito pelos métodos
abaixo)
4. Métodos de operação
- public void depositar(double valor) — aumenta o saldo.
- public boolean sacar(double valor) — diminui o saldo se houver fundos; retorna true
  se a operação foi bem-sucedida ou false caso contrário.
5. Teste em main
- Crie uma classe Main com o método public static void main(String[] args).
- Instancie duas contas com dados diferentes.
- Faça um depósito e um saque em cada conta, exibindo o saldo antes e depois de cada
  operação.
  
3. Estrutura de arquivos sugerida

src/
 ├─ ContaBancaria.java
 └─ Main.java
 
4. Dicas de implementação
- Encapsulamento: todos os atributos devem ser private.
- Construtor: use this.numeroConta = numeroConta; etc.
- Getters/Setters: siga a convenção getXxx() e setXxx(...).
- Validação no saque: só permita o saque se valor <= saldo.
- Saída no console: use System.out.printf(...) para formatar valores monetários.
  
Exemplo de uso no main:

public class Main {
 public static void main(String[] args) {
     ContaBancaria c1 = new ContaBancaria(1001, "Ana Silva", 500.0);
     System.out.println("Saldo inicial (c1): " + c1.getSaldo());
     c1.depositar(150.0);
     System.out.println("Após depósito de R$150: " + c1.getSaldo());
     boolean ok = c1.sacar(700.0);
     System.out.println("Tentativa de saque de R$700: " + (ok ? "sucesso" :
"falha"));
     System.out.println("Saldo final (c1): " + c1.getSaldo());

     // ... crie e teste a segunda conta da mesma forma
 }
}
