//Escreva uma função que receba uma string e retorne a mesma string em maiúsculas.

public class exercicio09 {
    public static String converterParaMaiusculas(String texto) {
        return texto.toUpperCase();
    }

    public static void main(String[] args) {
        String texto = "exemplo de texto";

        String textoMaiusculo = converterParaMaiusculas(texto);


        System.out.println("Texto em maiúsculas: " + textoMaiusculo);
    }
}

