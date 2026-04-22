package com.example;

public class App {
    
	//Metodo que recibe un objeto como parametro y muestra los detalles de dicho objeto
	//utilizando la sentencia if y Pattern Matching con el metodo instanceof 
	//y ademas destructure del tipo record que es uno de los record patterns
	static void imprimeDetalles(Object obj) {
		
		//En java 21 con record patern, especificamente con destructure
		if (obj instanceof Book (String titulo,String autor)) {
			System.out.println("Titulo del libro: "+ titulo);
			System.out.println("Autor del libro: "+ autor);
		}
	}
	
	 
	public static void main(String[] args) {
    	
    //Crear un objeto de tipo record Book
    //Book libro = new Book("Java es bueno", "Yo mismo");
    	Book libro = Book.builder()
    			.title("Java es bueno")
    			.author("Yo mismo")
    			.build();
    	
    	imprimeDetalles(libro);
    	
    	/**
    	 * Comentario para Javadoc
    	 * 
    	 * @author apilicita
    	 * Pattern records tambien puede estar aninados
    	 * */
    	
    	Library library = Library.builder()
    			.name("Biblioteca de Mostoles")
    			.bestSeller(Book.builder()
    					.title("Java Programing")
    					.author("Sebas Barranquilla")
    					.build())
    	       .build();
    	
    	
    	if (library instanceof Library(String nombre,Book(String titulo, String author))) {
    	  System.out.println("En la biblioteca:  " + nombre + " ,el bestSeller  es: " + titulo + " ,por el autor: "+author);	
    	}
    	
    }
}
