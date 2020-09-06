package comodin;
//Es un GENERICO DEL TIPO xxx

//Es una clase del tipo Generica
public class Pareja<T> {

	private T primero;
	
	
	
	public Pareja(){//Constructor
		this.primero=null; 	//Setiamos su valor cuando llamamos al constructor
	}
	
	public void setPrimero(T nuevoValor) {
		this.primero=nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	
	
	//creamos un metodo que recibe del tipo empleado y sus herencias
	
	//-------------------------------Metodo que acepta un tipo generico 
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) {//Recibe un objeto del tipo pareja, puntualmente del tipo Empleado
															   //Es un GENERICO DEL TIPO EMPLEADO
		Empleado primero= p.getPrimero();
		
		System.out.println(primero);
	}
	
	
	
}
