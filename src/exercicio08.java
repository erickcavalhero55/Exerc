//Escreva uma função que receba um número inteiro e retorne a quantidade de dígitos desse número.

public class exercicio08 {
    // Função para contar a quantidade de dígitos em um número
    public static int contarDigitos(int numero) {
        // Convertendo o número para uma string e retornando o comprimento da string
        return String.valueOf(numero).length();
    }

    public static void main(String[] args) {
        int numero = 12345;

        int quantidadeDigitos = contarDigitos(numero);

        // Imprime a quantidade de dígitos
        System.out.println("O número " + numero + " tem " + quantidadeDigitos + " dígitos.");
    }
}
