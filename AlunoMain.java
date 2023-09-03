public class AlunoMain {

    public static void main(String[] args) {
        // Passo 1: Instanciar um objeto Aluno com nome e cpf
        Aluno aluno = new Aluno("João", "123.456.789-00");

        // Passo 2: Definir as quatro notas do aluno
        double[] notas = { 7.5, 8.0, 6.5, 9.0 };
        aluno.setNotas(notas);

        // Passo 3: Calcular a média e armazenar o resultado em uma variável
        double media = aluno.calcularMedia();

        // Passo 4: Imprimir o valor da média
        System.out.println("Média do aluno: " + media);

        // Passo 5: Modificar a segunda nota com um valor diferente
        notas[1] = 7.0;
        aluno.setNotas(notas);

        // Passo 6: Recalcular a média
        media = aluno.calcularMedia();

        // Passo 7: Imprimir o valor da nova média
        System.out.println("Nova média do aluno: " + media);
    }
    
}
