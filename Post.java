

public class Post {
    
    //atributos
    private String link;
    private String texto;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    //construtor
    public Post (String link, String texto){
        this.link = link;
        this.texto = texto;
        this.numeroCurtidas = 0;
        this.numeroCompartilhamentos = 0;
    }


    // método para curtir o post
    public void curtir() {
        this.numeroCurtidas++;
    }

    // método para compartilhar o post
    public void compartilhar() {
        this.numeroCompartilhamentos++;
    }

    // métodos getters
    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }


}
