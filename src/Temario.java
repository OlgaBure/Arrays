import java.util.Scanner;
public class Temario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horasLunes = 7;
		int cuantosDias = 10;
		int horasDormidas [] = new int [7];
		//char diasSemana [] = new char [7];
		for (int i = 0; i < horasDormidas.length; i++) {
			System.out.println(horasDormidas[i]);
		}
		//opcion1
		char diasSemana[] = new char [7];
		diasSemana [0] = 'L';
		diasSemana [1] = 'M';
		diasSemana [2] = 'X';
		diasSemana [3] = 'J';
		diasSemana [4] = 'V';
		diasSemana [5] = 'S';
		diasSemana [6] = 'D';
		
		//Opcion2
		char diasSemana2 [] = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};
		int mesesAnyo []= {1,2,3,4,5,6,7,8,9,10,11,12};
		int mesesAnyo2 []= new int [12];
		//carga de datos del array
		 for (int posicion = 0; posicion < mesesAnyo2.length; posicion++) {
			mesesAnyo2[posicion] = posicion+1;
		}
		 //Visualizar en la pantalla
		 for (int contador = 0; contador < mesesAnyo2.length; contador++) {
			System.out.println(mesesAnyo2[contador]);
		}
		 Scanner read = new Scanner(System.in);
		 System.out.println("Introduce horas dormido");
		 
		 for (int i = 0; i < horasDormidas.length; i++) {
			 System.out.println("Introduce horas dormidas el "+ horasDormidas);
			 horasDormidas[i] = read.nextInt();
		 }
		 int total = 0;
			 for (int i = 0; i < horasDormidas.length; i++) {
				total = total + horasDormidas[i];
			}
			 System.out.println("Ha dormido de media" + total/horasDormidas.length);
			 read.close();
	}
}

/* Para que sirven Arrays?
*para trabajar en bloque, reserva de ran Estatica no crece ni decrese (tamaño fijo).
*memoria estatica,
*posiciones continuo RAM
*almacenar conjunto de datos de mismo tipo
*tipo complejo de datos.
*Permiten acceso directo
*
*/

