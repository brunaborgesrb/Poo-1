public class Aluno {

    //atributos
    private String nome;
    private String cpf;
    private double [] notas;

    //construtores
    public Aluno (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.notas = new double[4]; // Inicializa um array de notas com 4 elementos;
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // métodos getters e setters para as notas
    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        if (notas.length == 4) {
            this.notas = notas;
        } else {
            System.out.println("Erro: O número de notas deve ser 4.");
        }
    }

    // métodos getters para nome e cpf
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
}
