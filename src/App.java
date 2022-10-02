import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        float nota1, nota2, nota3, nota4;
        double soma, media;

        System.out.println("Digite a sua nota 1.");
        nota1 = console.nextFloat();
        System.out.println("Digite a sua nota 2");
        nota2 = console.nextFloat();
        System.out.println("Digite a sua nota 3");
        nota3 = console.nextFloat();
        System.out.println("Digite a sua nota 4");
        nota4 = console.nextFloat();

        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;

        System.out.println("A sua media foi de : " + media);
        console.close();

    }
}
