

public class Endereco {
        private String rua;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String uf;
        private String cep;

        public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep){
            this.rua = rua;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.cep = cep;
        }

        public String toString() {
            return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
                    + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + "]";
        }

        public void imprimirDados(){
            System.out.println("Rua: "+rua);
            System.out.println("Número: "+numero);
            System.out.println("Complemento: "+complemento);
            System.out.println("Bairro: "+bairro);
            System.out.println("Cidade: "+cidade);
            System.out.println("UF: "+uf);
            System.out.println("Cep: "+cep);
        }

        public void novosDados(String ruaNovo, int numeroNovo, String complementoNovo, String bairroNovo, String cidadeNovo, String ufNovo, String cepNovo){
            rua = ruaNovo;
            numero = numeroNovo;
            complemento = complementoNovo;
            bairro = bairroNovo;
            cidade =  cidadeNovo;
            uf = ufNovo;
            cep = cepNovo;
        }
    }