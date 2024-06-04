//Escreva uma função que receba um array de inteiros e retorne o menor valor presente no array.

public class exercicio06 {
    // Função para encontrar o menor valor em um array de inteiros
    public static int menorValor(int[] array) {
        int menor = array[0]; // Assume que o primeiro elemento é o menor
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};

        int menor = menorValor(array);

        // Imprime o menor valor
        System.out.println("O menor valor no array é: " + menor);
    }
}


