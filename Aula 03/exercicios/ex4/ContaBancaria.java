public class ContaBancaria {
    public Integer numeroConta;
    public Double saldo;

    public ContaBancaria(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void depositar(Double valor) {
        if (valor <= 0) {
            return;
        }
        saldo += valor;
    }

    public void sacar(Double valor) {
        if (valor <= 0) {
            return;
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
