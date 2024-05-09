package Tp2;

public class Test 
{
	public static void main(String[] args) 
	{
		//Punto 4.
		Persona persona = new Persona();
		
		persona.ponerNombre("Fulano");
		persona.ponerApellido("Gomez");
		
		System.out.println(persona.obtenerNombreCompleto());
		//Se muestra "Fulano Gomez"
		
		//Creamos otra persona
		Persona yo = new Persona();
		
		yo.ponerNombre("Agustin");
		yo.ponerApellido("Dahbar");
		
		System.out.println(yo.obtenerNombreCompleto());
		
		//En este código creamos una instancia de clase / objeto de Persona y mediante el setter de dos atributos le dimos valores a estos.
		
		//5D Crear domicilio y asignarlo a Fulano (persona)
		Domicilio domicilioDeFulano = new Domicilio();
		
		domicilioDeFulano.setCalle("Calle");
		domicilioDeFulano.setNumero(1919);
		domicilioDeFulano.setCiudad("Toronto");
		
		//Se lo asignamos a fulano.
		persona.ponerDomicilio(domicilioDeFulano);
		
	}
}
