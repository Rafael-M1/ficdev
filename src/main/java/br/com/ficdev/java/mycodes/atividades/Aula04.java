package br.com.ficdev.java.mycodes.atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author rafaelmuzzi
 */
public class Aula04 {

    public void mostrarMenu() {
        int opcao;
        String menu = "Menu:\n"
                + "1- Calcular o fatorial de um número\n"
                + "2- Mostrar o n-ésimo termo da sequência de Fibonacci\n";
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu + "Digite a opção desejada: "));

        switch (opcao) {
            case 1:
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
                int fatorial = calcularFatorial(opcao);
                JOptionPane.showMessageDialog(null, "O Fatorial de " + opcao + " é : " + fatorial);
                break;
            case 2:
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
                int termo = calcularTermoFibonacci(opcao);
                JOptionPane.showMessageDialog(null, "O " + opcao + "º termo da sequência de Fibonacci é : " + termo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
        System.out.println("Programa finalizado!");
    }

    public int calcularFatorial(int numero) {
        int soma = 1;
        while (numero > 1) {
            soma = soma * numero;
            numero--;
        }
        return soma;
    }

    //Sendo a sequencia de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
    public int calcularTermoFibonacci(int numero) {
        switch (numero) {
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return calcularTermoFibonacci(numero - 1) + calcularTermoFibonacci(numero - 2);
        }
    }
}
