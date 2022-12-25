
public class NumeroFeliz {

    public static boolean testaNumero(int n) {

        char[] numerosSeparados; int soma = 0;
        do {
            // transforma o numero inteiro em String
            String numeroString = String.valueOf(n);

            // transforma o número em String em arrya de char
            numerosSeparados = numeroString.toCharArray();

            int num = 0;
            for (int i = 0; i < numerosSeparados.length; i++) {
                // lê o valor interior do caracter e carrega em uma variável tipo int
                num = Character.getNumericValue(numerosSeparados[i]);


                // eleva ao quadrado este número
                num = (int) Math.pow(num,2);


                // carrega o valor na soma
                soma += num;

            }

            n = soma;
            soma = 0;

        } while (n >= 10 );

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
