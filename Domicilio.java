package Tp2;

//Punto 5A.
public class Domicilio 
{
	//Atributos de la clase Domicilio.
	private String calle;
	private int numero;
	private String ciudad;
	
	//Constructor de la clase.
	public Domicilio() 
	{
		calle = "";
		numero = -100;
		ciudad = "";
	}
	
	
	//Getters de los 3 atributos.
	public String getCalle() 
	{
		return calle;
	}
	
	
	public int getNumero() 
	{
		return numero;
	}
	
	public String getCiudad() 
	{
		return ciudad;
	}
	
	//Setters de los 3 atributos.
	public void setCalle(String calle) 
	{
		this.calle = calle;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public void setCiudad(String ciudad) 
	{
		this.ciudad = ciudad;
	}
	
}
