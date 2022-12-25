import java.util.*;

import static java.lang.Integer.valueOf;
import static java.lang.Math.pow;

public class Main {

    /**
     * Um número feliz é um número definido pelo seguinte processo:
     * <p>
     * • Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
     * • Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
     * • Aqueles números para os quais esse processo termina em 1 são felizes.
     * • Retorna true se n for um número feliz e false se não for.
     * <p>
     * Escreva um algoritmo para determinar se o número n é feliz.
     *
     */

    public static void main(String[] args) {
        int n = LeitorTeclado.getNumero("Digite um número inteiro positivo: ");

        //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não

        boolean retorno = NumeroFeliz.testaNumero(n);

        System.out.println(retorno);
    }

}