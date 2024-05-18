import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo r = new Retangulo();
        System.out.println("Largura: ");
        r.setWidth(leitor.nextInt());
        System.out.println("Altura: ");
        r.setHeight(leitor.nextInt());
        leitor.nextLine();
        System.out.println("Texto: ");
        r.setTexto(leitor.nextLine());
        r.desenha();
        r.desenhaRosa();
    }
}