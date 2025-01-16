public class Aluno extends Pessoa{
    private Integer matricula;
    private String curso;
    private int periodo;

    public Aluno(String nome, String data_nasc, String senha, String cpf, Integer matricula, String curso, int periodo) {
        super(nome, data_nasc, senha, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}
