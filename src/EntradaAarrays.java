import java.util.Scanner;

public class EntradaAarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el numero de los alumnos");
		Scanner read = new Scanner(System.in);
		int contadorAlumnos = read.nextInt();
		double notas [] = new double[contadorAlumnos];
		//carga de datos
		/*System.out.println("Introduce nota");
		notas[0]=read.nextDouble();
		notas[1]=read.nextDouble();
		hasta la eternidad */
		
		//carga aleatoria
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce nota");
			notas[i]=Math.random()*11;
		}
		/*for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce nota");
			notas[i]=read.nextDouble();
		}
		*/
		//salida
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno" + i + "-" + notas[i]);
			
		}
		read.close();
	}
}


/*
 *     1. Hacer un programa que:
    3. Calcular la suma de los primeros N elementos almacenados en el array
    4. Muestre el resultado obtenido así como el contenido del array en pantalla
    2. Hacer un programa en el que dado el siguiente array de nombre origen:

    1. Lo recorre metiendo en un segundo array de nombre destino todos aquellos elementos que sean pares y mayores de 25
    2. Muestre en pantalla el contenido de los dos arrays unidimensionales
    3. Hacer un programa que:
    1. Lea una secuencia de 15 números enteros almacenándolos en un array de nombre “números”
    2. Los visualice en el dispositivo estándar de salida en orden inverso al de entrada
    4. Hacer un programa que:
    1. Cree un array bidimensional de 10x10
    2. Inicialice la matriz de forma que las filas pares se rellenen a uno y las impares a cero
    3. Una vez inicializada la matriz, muestre su contenido en pantalla
    5. Hacer un programa que:
    1. Cree un array bidimensional de 5x5 y nombre “diagonal”
    2. Inicialice la matriz de forma que los componentes pertenecientes a la diagonal de la matriz valgan 1 y el resto 0
    3. Muestre el contenido del array en pantalla
    */
