
public class Peixe extends Animal{
    private Number tempoDeNado;
    private Number quantidadeDeEscamas;

    public Number getTempoDeNado() {
        return tempoDeNado;
    }

    public void setTempoDeNado(Number tempoDeNado) {
        this.tempoDeNado = tempoDeNado;
    }

    public Number getQuantidadeDeEscamas() {
        return quantidadeDeEscamas;
    }

    public void setQuantidadeDeEscamas(Number quantidadeDeEscamas) {
        this.quantidadeDeEscamas = quantidadeDeEscamas;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "tempoDeNado=" + tempoDeNado +
                ", quantidadeDeEscamas=" + quantidadeDeEscamas +
                '}';
    }

    @Override
    public void teste(){
        super.teste();
        System.out.println("este aqui e outro teste");
    }

}