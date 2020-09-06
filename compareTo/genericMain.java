package compareTo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class genericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[] = {"Jose","Maria","Pepe"};
		
		String elementos= MisMatrices.getElementoStandar(nombres);
			System.out.println(elementos);
		
		//----------------------------------------
			//PARA REALIZAR ESTE TIPO DE METODOS GENERICOS, NECESITARIA CREAR UNA CLASE ABSTRACTA
			//QUE IMPLEMENTE LA CLASE COMPARABLE 
		/*Empleado listaEmpleados[]= {
				new Empleado("ezequiel", 27, 45000),
				new Empleado("Noelia", 25, 60000),
				new Empleado("Santi", 25, 38000)
		};
		
		
		System.out.println(MisMatrices.getElementosGenericos(listaEmpleados));
		*/
			
			
			//-------------------------------
			//Las clases que implementan por defecto la clase Comparable son DATE,STRING, GREGORIANCALENDARA
			
		GregorianCalendar[] listaFechas= {
				new GregorianCalendar(2020, 3, 13),
				new GregorianCalendar(2020, 3, 14),
				new GregorianCalendar(2020, 3, 15)
		};	
		
	
		System.out.println(	MisMatrices.getElementosGenericos(listaFechas).getTime());
		
	}

}

class MisMatrices{
	
	//Metodos estaticos Genericos
	//El void es reemplazo por T
	//Return un tipo Generic T
	//Recibe un paramatro T[] var
	public static <T> String getElementoStandar(T[] array) {
		
		
		return "El array tiene " + array.length +"Elementos";
		
	}
	
	public static <T extends Comparable> T getElementosGenericos(T[] array) {
		
		//Verificamos el array no este vacio o tenga 0
		if(array == null || array.length==0) {
			return null;
		}
		//------------------------Utilizamos el metodo CompareTo
		//es necesario implementar o extender de la clase Comparable
		//Realizamos una simple comparacion de ordenar donde los resultados posibles
		// -1=menor  o 0 =igual   o 1= mayor
		
		
		//Analizamos el array recibido con una variable temporal menor como referencia
		//Suponemos que la primera opcion va a ser la opcion mas chica
		T tmpMenor=array[0];//Determinamos que sera el mas pequeño en primera instancia
		
		int tamaño= array.length;
		
		//Recorremos el array recibido para comparar desde la SEGUNDA posicion en adelante
		
		for (int i = 1; i < array.length; i++) {
			
			if(tmpMenor.compareTo(array[i]) >=1  ) {//Quiere decir si es mas grande que array[i]
													//en este caso array[i] seria mas chico
				tmpMenor = array[i];
				
			}
			
			
		}
		
		
		//En conclusion retornamos la variable T 
		
		return  tmpMenor;
		
		
	}
	
	
}
