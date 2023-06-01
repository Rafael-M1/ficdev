
import br.com.ficdev.java.mycodes.atividades.Aula03;
import java.util.Scanner;

/**
 *
 * @author rafaelmuzzi
 */
public class Start {
    public static void main(String[] args) {
        Aula03 aula03 = new Aula03();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu peso em quilogramas:");
        float peso = scanner.nextFloat();
        System.out.println("Digite sua altura em metros:");
        float altura = scanner.nextFloat();
        System.out.println(aula03.calcularImc(nome, sobrenome, idade, peso, altura));
    }
}

