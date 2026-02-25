//uvus:SQV8126
//pass:459

package us.dit;

public class Evaluation {

    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina"));
    }

    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }
}