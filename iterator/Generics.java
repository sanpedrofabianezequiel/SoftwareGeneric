package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Delayed;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
		
		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));

		listaEmpleados.add(new Empleado("ezequiel", 27, 50000));
		
		
		for (Empleado var : listaEmpleados) {
			System.out.println(var.getDatos());//Necesitamos Utilizar el metodo ya que sino nos trae solo el Objeto iterator
		}
		
		
		
		//--------------------Iterator
		
		Iterator<Empleado> miIterator=listaEmpleados.iterator();
		
		//Metodos a utilizar hasNext()/Next()
		
		while(miIterator.hasNext()) {//Si tengo mas elemento siguientes
			
			//imprimimimos el siguiente elemento Delayed arrayList
			System.out.println(miIterator.next().getDatos());
		}
	}

}







