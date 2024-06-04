//Escreva uma função que receba duas strings e retorne uma nova string que é a concatenação das duas.

public class exercicio07 {
    public static String concatenar(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String string1 = "Olá, ";
        String string2 = "mundo!";

        String resultado = concatenar(string1, string2);


        System.out.println("As strings concatenadas são: " + resultado);
    }
}

