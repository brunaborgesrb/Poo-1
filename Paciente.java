

public class Paciente{

    //atributos
    private String nome,sexo,planoSaude,alergia,tipoSanguineo,codigo,dataNascimento;

    //construtores
    public Paciente(String nome, String sexo, String planoSaude, String alergia, String tipoSanguineo, String codigo, String dataNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
    }
    public String toString() {
        return "Paciente{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo='" + sexo + '\'' +
                ", planoSaude='" + planoSaude + '\'' +
                ", alergia='" + alergia + '\'' +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                '}';
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}




