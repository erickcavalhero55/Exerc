//Escreva uma função que receba uma string e retorne a mesma string em minúsculas.

public class exercicio10 {
    public static String converterParaMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static void main(String[] args) {
        String texto = "EXEMPLO DE TEXTO";

        String textoMinusculo = converterParaMinusculas(texto);


        System.out.println("Texto em minúsculas: " + textoMinusculo);
    }
}

