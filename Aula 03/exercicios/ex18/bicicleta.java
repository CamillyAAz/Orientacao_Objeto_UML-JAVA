public class bicicleta {
    String modelo;
    String marca;
    int tamanhoRoda;


    public bicicleta(String modelo, String marca, int tamanhoRoda) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar(){
        System.out.println("Pedalando a bicicleta: " + marca);

    }

    public void frear(){

        System.out.println("Freiando a bicicleta: " + marca);
    }


}

