import java.util.Scanner;

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

// Remove accents too

public class palindromo {

	public static void main(String[] args) {
		
	String reverseText = "";
	boolean isPalindromo = false;
	

	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Write your text or work ");
	 String text = scanner.nextLine().toLowerCase();
	 
	 for (int i = text.length() - 1; i >= 0; i--) {
		 reverseText += text.split("")[i].toLowerCase();
	}
	
	 isPalindromo = reverseText.replaceAll("\\s","").equals(text.replaceAll("\\s",""));
	 System.out.println("This is a PALINDROMO: "+ isPalindromo );
    
	}

}
