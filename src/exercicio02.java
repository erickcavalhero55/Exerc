//Escreva uma função que receba dois números e retorne a diferença entre eles.

public class exercicio02 {
    public static int diferenca(int a, int b){
            return a -  b;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        int resultado = diferenca(numero1,numero2);

        System.out.println("A difrença entre " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}
