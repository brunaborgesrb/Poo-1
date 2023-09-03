
public class Lutador {

    //atributos
    private String nome;
    private int energia;
    private int forca;

    //construtor
    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    // método para reduzir a energia do lutador
    public void reduzirEnergia(int quantidade) {
        this.energia -= quantidade;
    }

    // método para aplicar um golpe em outro lutador
    public void aplicarGolpe(Lutador outroLutador) {
        int dano = this.forca;
        outroLutador.reduzirEnergia(dano);
        System.out.println(this.nome + " aplicou um golpe em " + outroLutador.getNome() + " causando " + dano + " de dano.");
    }

    // métodos getters
    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getForca() {
        return forca;
    }


    
}
