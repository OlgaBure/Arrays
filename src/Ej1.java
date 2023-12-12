import java.util.Scanner;
/*    1. Hacer un programa que:
    1. Cree un array unidimensional de nombre “vector” y 15 elementos, siendo sus componentes de tipo numérico entero
    2. Cargar el array con valores aleatorios que sean introducidos por teclado
    3. Calcular la suma de los primeros N elementos almacenados en el array
    4. Muestre el resultado obtenido así como el contenido del array en pantalla*/
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[] = new int [15];
		int contador;
		
		for (contador = 0; contador < vector.length; contador++) {
			vector[contador]=(int) (Math.random() * 10 + 1);
		}
		
		for (contador = 0; contador < vector.length; contador++) {
			System.out.println(vector[contador]+ " ");
		}
		System.out.println();
		for ( contador = (vector.length-1); contador>=0; contador--) { //no esta acabado acabarlo
			System.out.println(vector[contador]+ " ");
		}
		System.out.println("Cuantos elementos quieres sumar");
		Scanner read = new Scanner(System.in);
		int N = read.nextInt();
		int suma = 0;
		for (int i = 0; i < N; i++) {
			suma+=vector[1];
		}
		System.out.println(suma);
		read.close();
	}
	
}


