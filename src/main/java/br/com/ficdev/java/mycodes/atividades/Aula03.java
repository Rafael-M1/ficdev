package br.com.ficdev.java.mycodes.atividades;

/**
 *
 * @author rafaelmuzzi
 */
public class Aula03 {
    public String calcularImc(String nome, String sobrenome, int idade, float peso, float altura) {
        float imc = peso/altura/altura;
        String mensagem = "Olá " + nome + " " + sobrenome + ", seu imc é: " + imc;
        if (imc < 14) {
            mensagem += "\nVocê está na categoria de Desnutrição";
        } else if (imc < 25) {
            mensagem += "\nVocê está na categoria de Peso Normal";
        } else if (imc < 30) {
            mensagem += "\nVocê está na categoria de Sobrepeso";
        } else {
            mensagem += "\nVocê está na categoria de Obesidade";
        }
        return mensagem;
    }
}
