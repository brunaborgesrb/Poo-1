

public class MedicoEnd {

    public static void main(String[] args) {
        Medico medico = new Medico(1, "Matheus", "Masculino", "Cirurgião", "ABC");
        System.out.println("Dados do médico: ");
        medico.imprimirDados();

        System.out.println("");
        
        Endereco endereco = new Endereco("ABC", 1, "Apartamento 10", "Boa Viagem", "Recife", "abc", "123-45");
        System.out.println("Endereço: ");
        endereco.imprimirDados();
        
        System.out.println("----------------------------------------------------------------------------------");
        
        medico.novosDados(2, "Rennan", "Masculino", "Cirurgião", "DEF");
        System.out.println("Dados do médico: ");
        medico.imprimirDados();

        System.out.println("");

        endereco.novosDados("DEF", 2, "Apartamento 2", "Candeias", "Recife", "def", "678-90");
        System.out.println("Endereço: ");
        endereco.imprimirDados();
    }
}