public class Funcionario extends Pessoa{
    private String area;

    public Funcionario(String nome, String data_nasc, String senha, String cpf, String area) {
        super(nome, data_nasc, senha, cpf);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
