package comodin;

public class genericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pareja<Empleado> administrativa=new Pareja<Empleado>();
		Pareja<Jefe> directoraComercial=new Pareja<Jefe>();
		
		//No se aplica Herencia en genericos, de la misma forma que en POO
		//Pareja<Empleado> nuevoEmpleado=directoraComercial;
		
		
		//Para ello usamos ? como comidin
		
		Pareja.imprimirTrabajador(administrativa);
		//Para poder usar este metodo con un JEFE que es un EMPLEADO previamente neceistamos el comodin
		Pareja.imprimirTrabajador(directoraComercial);
		
	}

}
