//Escreva uma função que receba dois números e retorne verdadeiro se o primeiro número for múltiplo do segundo.

public class exercicio11 {
    public static boolean verificarMultiplo(int numero, int divisor) {
        return numero % divisor == 0;
    }

    public static void main(String[] args) {
        int numero = 10;
        int divisor = 5;

        boolean resultado = verificarMultiplo(numero, divisor);

        if (resultado) {
            System.out.println(numero + " é múltiplo de " + divisor);
        } else {
            System.out.println(numero + " não é múltiplo de " + divisor);
        }
    }
}

