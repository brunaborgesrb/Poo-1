
public class Medico {
        private int codigo;
        private String nome;
        private String sexo;
        private String especialidade;
        private String endereco;

        public Medico(int codigo, String nome, String sexo, String especialidade, String endereco){
            this.codigo = codigo;
            this.nome = nome;
            this.sexo = sexo;
            this.especialidade = especialidade;
            this.endereco = endereco;
        }

        public String toString() {
            return "Medico [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", especialidade=" + especialidade
                    + ", endereco=" + endereco + "]";
        }

        public void imprimirDados(){
            System.out.println("Código: "+codigo);
            System.out.println("Nome do médico: "+nome);
            System.out.println("Sexo: "+sexo);
            System.out.println("Especialidade médica: "+especialidade);
            System.out.println("Endereço: "+endereco);
        }

        public void novosDados(int codigoNovo, String nomeNovo, String sexoNovo, String especialidadeNovo, String enderecoNovo){
            codigo =  codigoNovo;
            nome = nomeNovo;
            sexo = sexoNovo;
            especialidade = especialidadeNovo;
            endereco = enderecoNovo;
        }

    }
