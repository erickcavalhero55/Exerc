//Escreva uma função que receba um número, um valor mínimo e um valor máximo, e retorne verdadeiro se o número estiver dentro do intervalo, inclusive.

public class exercicio03 {
    public static boolean intervalo(int numero, int minimo, int maximo){
        return numero >= minimo && numero <= maximo;
    }
    public static void main(String[] args) {
        int numero  = 11;
        int minimo = 1;
        int maximo = 10;

        boolean  resultado = intervalo(numero, minimo, maximo);


        if (resultado) {
            System.out.println("O número " + numero + " está dentro do intervalo [" + minimo + ", " + maximo + "].");
        } else {
            System.out.println("O número " + numero + " não está dentro do intervalo [" + minimo + ", " + maximo + "].");

        }
    }
}
