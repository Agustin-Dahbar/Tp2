package Tp2;

import java.util.Scanner;

//PUNTO 1.
public class Operaciones 
{	
	//Metodo que suma dos int´s.
	public int sumar(int a, int b) 
	{
		return a + b;
	}
	
	//Metodo que pide un número entre dos, antes imprime una cadena.
	public int pedirNumero(String texto, int minimo, int maximo) 
	{
		Scanner scanner = new Scanner(System.in); //Creamos scanner para entrada del numero.
		
		System.out.println(texto); //Imprimimos la instrucción.
		int numero = scanner.nextInt(); //Le pedimos el numero
		
		while(!(numero > minimo && numero < maximo)) //Validamos que este entre los 2 números que le indicamos. 
		{
			System.out.println("Error. Dije entre " + minimo + " y " + maximo);
			numero = scanner.nextInt(); 
		}
		
		return numero; //Una vez se ingrese un número correcto, lo devolvemos.
	}
	
	
	//Metodo Main
	public static void main(String[] args) 
	{
		Operaciones operaciones = new Operaciones(); //Instanciamos la clase operaciones para poder usar el metodo deseado (pedirNumero)
		
		int numero = operaciones.pedirNumero("Ingresa un numero entre 5 y 7", 5, 7); //Se llama al metodo con dichos argumentos, hasta que el usuario no ingrese el número 6 no se ejecutará la siguiente línea del main.
		System.out.println("El número ingresado es " + numero);
	}
	
}
