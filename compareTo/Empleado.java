package compareTo;

public class Empleado {

	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre,int edad,double sueldo) {
						
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
	}
	
	//--------------Metodos
	
	public String getDatos() {
		return "El Empleado se llama " + nombre + ".Tiene "+ edad+" a�os."+" Y un salario de " +sueldo;		
	}
}
