import java.util.Scanner;

public class Menu {

    public void login(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nLogin: ");
            sc.nextLine();
            System.out.print("\nSenha: ");
            sc.nextLine();
        }finally {
            sc.close();
        }
    }

    private void menuAlunoOrientador(){
        System.out.println("1- Criar Trabalho");
        System.out.println("2- Agendar Apresentacao");
        System.out.println("3- Cancelar Apresentacao");
        System.out.println("4- Listar Meus trabalhos");
        System.out.println("5- Editar Trabalho");
        System.out.println("6- Sair");
        int menu = 0;
        do {
            switch (menu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }
        }   while (menu!=6);
    }

    private void menuFuncionario(){
        System.out.println("1- Criar Trabalho");
        System.out.println("2- Agendar Apresentacao");
        System.out.println("3- Cancelar Apresentacao");
        System.out.println("4- Listar Trabalhos");
        System.out.println("5- Editar Trabalho");
        System.out.println("6- Atribuir Nota");
        System.out.println("7- Excluir Usuario");
        System.out.println("8- Sair");

        int menu = 0;
        do {
            switch (menu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }
        }   while (menu!=6);
    }
}
