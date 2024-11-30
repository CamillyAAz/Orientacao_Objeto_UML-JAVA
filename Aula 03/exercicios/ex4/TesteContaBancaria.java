public class TesteContaBancaria {
    public static void main(String[] args) {


        ContaBancaria conta1 = new ContaBancaria(1, 300.00);
        ContaBancaria conta2 = new ContaBancaria(2, 500.00);


        System.out.println(conta1);
        System.out.println(conta2);


        conta1.depositar(100.00);
        conta2.sacar(50.00);



        System.out.println(conta1);
        System.out.println(conta2);
    }
}
