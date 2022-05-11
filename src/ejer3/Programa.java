package ejer3;

import java.util.Scanner;

public class Programa {
	
	void iniciar(){
		String or1, or2;
		
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);
	}
	
	//carga de teclado dos String
	String cargarString(){
		
		Scanner entrada=new Scanner(System.in);
		 
		 System.out.println("Ingrese un String: ");
		 String oracion=entrada.nextLine();//para leer lineas de texto sino lee hasta un espacio en blanco
		 return oracion;
		 
		 
	}
	
	//despliega men�
	void menu(String a, String b){
		int select=-1;
		char [] arr1;
				
		//Mientras la opci�n elegida sea 0, preguntamos al usuario
			while(select != 0){
					System.out.println("Men� de opciones\n"+
							    "\n1.- Imprimir ambas cadenas y su largo." +
								"\n2.- Comparar igualdad y quien es menor" +
								"\n3.- Cambiar una cadena a todo may�sculas y otra a todo min�sculas" +
								"\n4.- Cargar nuevamente ambos String" +
								"\n0.- Salir"
								+ "\nElige opci�n: ");
						//Recoger una variable por consola
						Scanner entrada=new Scanner(System.in);
						select =entrada.nextInt();
						//Ejemplo de switch case en Java
						switch(select){
						case 1: 
								System.out.println("Primer String: "+a.toString()+"\nSegundo String: "+b.toString());
								System.out.println("Largo del Primer String: "+a.length()+"\nLargo del Segundo String: "+b.length());
								break;
						case 2: 
								System.out.println("Sin hacer!!!!");
								break;
						case 3: 
							System.out.println("Primer String a mayuscula: "+a.toUpperCase().toString()+"\n Segundo String: "+b.toLowerCase().toString());
							
							break;
						case 4: 
							a=cargarString();
							b=cargarString();
							break;
						case 0: 
							System.out.println("Adios!");
							break;
						default:
							System.out.println("N�mero no reconocido");break;
						}
						
						System.out.println("\n"); //Mostrar un salto de l�nea en Java
						
					
			}

		}
	
	
		
		
	}
	
	
