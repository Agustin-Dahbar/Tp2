package Tp2;


//PUNTO 3.
public class Persona 
{
	//Atributos de la clase persona.
	private String nombre;
	private String apellido;
	private Domicilio domicilio; //5.B
	
	//Constructor
	public Persona() 
	{
		nombre = "";
		apellido = "";
	}
	
	//Setter del atributo nombre
	public void ponerNombre(String nombre) 
	{
		this.nombre = nombre;
	}
		
	//Setter del atributo apellido
	public void ponerApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	//Setter del atributo domicilio. 5.B
	public void ponerDomicilio(Domicilio domicilio) 
	{
		this.domicilio = domicilio;
	}
	
	//5C) Metodo de Persona que mostrará su domicilio, si no tiene advertirá esto.
	public void mostrarDomicilio() 
	{
		if(domicilio == null) //Si domicilio no tiene valor
		{
			System.out.println("Esta persona no tiene domicilio."); // lo indicamos
		}
		else  //Si tiene valor
		{
			System.out.println(domicilio); //lo mostramos
		}
		
	}
	
	//Metodo que devuelve una suma de ambos atributos
	public String obtenerNombreCompleto() 
	{
		return nombre + " " + apellido;
	}
	
	//Getter del domicilio
	public Domicilio obtenerDomicilio() 
	{
		return domicilio;
	}
	
	
}
