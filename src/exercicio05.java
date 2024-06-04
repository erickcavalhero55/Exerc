//Escreva uma função que receba um valor em quilômetros e retorne o valor convertido em milhas.

public class exercicio05 {
    public static int quilometro(int km){
        return (int) (km * 0.621371);
    }
    public static void main(String[] args) {
        int quilometros = 90;

        int conversao = quilometro(quilometros);

        System.out.println(quilometros + " quilômetros é igual a " + conversao + " milhas.");

    }
}
