package iterator;

public class Empleado {

	private String nombre;
	private int edad;
	private double salario;
	
	
	public Empleado(String nombre,int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	
	
	
	//--------------Metodos
	
	public String getDatos() {
		return "El Empleado se llama " + nombre + ".Tiene "+ edad+" años."+" Y un salario de " +salario;		
	}
	
}
