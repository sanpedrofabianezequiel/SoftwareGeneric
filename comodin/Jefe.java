package comodin;

public class Jefe extends Empleado {

	public Jefe(String nombre, int edad, double sueldo) {
		super(nombre, edad, sueldo);
		// TODO Auto-generated constructor stub
	}

	
	//Metodos propios
	public double incentivo(double inc) {
		return inc;
	}
}
