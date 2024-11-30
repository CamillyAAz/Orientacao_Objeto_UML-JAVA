public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria = 0;


    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;

    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }


    public void ligarCelular(){
            if(capacidadeBateria==0){
                System.out.println("Sua Batéria do celular " + marca + " está descarregada, você não pode ligar seu celular");
            } else {
                System.out.println("Sua Batéria do celular " + marca + " está em " + capacidadeBateria  + " ,Você pode ligar seu celular");
            }

    }

    public void desligarCelular(){
        System.out.println("Desligando o celular " + marca);
    }



}
