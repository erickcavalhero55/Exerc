//Escreva uma função que receba um array de inteiros e retorne o array ordenado em ordem crescente.

import java.util.Arrays;

public class exercicio01 {
    // Função para ordenar um array de inteiros
    public static int[] ordenarArray(int[] array) {
        // Utiliza o método sort da classe Arrays para ordenar o array
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        int[] arrayOrdenado = ordenarArray(array);

        // Imprime o array ordenado
        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenado));
    }
}