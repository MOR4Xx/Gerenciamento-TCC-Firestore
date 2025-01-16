public class Orientador extends Pessoa{
    private Integer matricula;
    private String area;

    public Orientador(String nome, String data_nasc, String senha, String cpf, Integer matricula, String area) {
        super(nome, data_nasc, senha, cpf);
        this.matricula = matricula;
        this.area = area;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

