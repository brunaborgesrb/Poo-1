

public class PostMain {

    public static void main(String[] args) {
        // passo 1: Instanciar um objeto Post com texto e link
        Post meuPost = new Post("Texto do meu post", "https://www.meusite.com");

        // passo 2: Curtir o post 3 vezes
        for (int i = 0; i < 3; i++) {
            meuPost.curtir();
        }

        // passo 3: Imprimir o número de curtidas do post
        System.out.println("Número de Curtidas: " + meuPost.getNumeroCurtidas());

        // passo 4: Compartilhar o post 2 vezes
        for (int i = 0; i < 2; i++) {
            meuPost.compartilhar();
        }

        // passo 5: Imprimir o número de compartilhamentos do post
        System.out.println("Número de Compartilhamentos: " + meuPost.getNumeroCompartilhamentos());
    }
    }

