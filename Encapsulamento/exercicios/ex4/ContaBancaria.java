public class ContaBancaria {
    private int numeroConta;
    private int saldo;


    public ContaBancaria(int numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }


    public void depositar(){
        System.out.println("Seu saldo: " + saldo);
        System.out.println("Depositando 200 reais...");
        saldo += 200;
        System.out.println("Seu saldo atual: " + saldo);
    }


    public void sacar(){
        System.out.println("Seu saldo: " + saldo);
        System.out.println("Sacando 50 reais...");
        saldo -= 50;
        System.out.println("Seu saldo atual: " + saldo);
    }


}
