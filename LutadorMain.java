


public class LutadorMain {

    public static void main(String[] args) {
        // passo 1: Instanciar o lutador Ryu
        Lutador ryu = new Lutador("Ryu", 100, 10);

        // passo 2: Instanciar o lutador Bison
        Lutador bison = new Lutador("Bison", 100, 12);

        // passo 3: Ryu aplica 3 golpes em Bison
        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
        }

        // passo 4: Imprimir a energia de Bison após receber os golpes
        System.out.println("Energia de Bison após os golpes: " + bison.getEnergia());

        // passo 5: Bison aplica 8 golpes em Ryu
        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(ryu);
        }

        // passo 6: Imprimir a energia de Ryu após receber os golpes
        System.out.println("Energia de Ryu após os golpes: " + ryu.getEnergia());
    }
    }
    

