import java.util.Scanner;

public class ControleMenu {
    private Scanner sc = new Scanner(System.in);


    public String mostrarMenuInicial() {
        System.out.println("\n ---- Sistema Financeiro ----");
        System.out.println("1. Cadastrar");
        System.out.println("2. Login");
        System.out.println("3. Sair");
        System.out.println("Escolha: ");
        return sc.nextLine();
    }


}
