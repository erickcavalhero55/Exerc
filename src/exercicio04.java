//    Escreva uma função que receba um número e retorne o cubo desse número.

public class exercicio04 {
     public static int numero(int cubo){
         return cubo * cubo * cubo;
     }
    public static void main(String[] args) {
         int numero = 5;

         int resultado = numero(numero);

        System.out.println("O cubo de " + numero + " é: " + resultado);

    }
}
