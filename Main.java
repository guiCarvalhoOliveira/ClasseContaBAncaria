public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria(101, "Pedro", 500.0);
        ContaBancaria conta2 = new ContaBancaria(102, "Guilherme", 1000.0);

        
        System.out.println("Saldo inicial da conta1: " + conta1.getSaldo());
        conta1.depositar(200.0);
        System.out.println("Saldo após depósito na conta1: " + conta1.getSaldo());
        boolean saqueConta1 = conta1.sacar(100.0);
        System.out.println("Saque na conta1 " + (saqueConta1 ? "realizado" : "falhou"));
        System.out.println("Saldo final da conta1: " + conta1.getSaldo());

        System.out.println("-------------------------");

        
        System.out.println("Saldo inicial da conta2: " + conta2.getSaldo());
        conta2.depositar(500.0);
        System.out.println("Saldo após depósito na conta2: " + conta2.getSaldo());
        boolean saqueConta2 = conta2.sacar(2000.0); 
        System.out.println("Saque na conta2 " + (saqueConta2 ? "realizado" : "falhou"));
        System.out.println("Saldo final da conta2: " + conta2.getSaldo());
    }
}
