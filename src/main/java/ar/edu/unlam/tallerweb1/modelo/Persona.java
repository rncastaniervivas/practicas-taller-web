package ar.edu.unlam.tallerweb1.modelo;

public class Persona {
	
	public String nombre;
	public String apellido;
	public int edad;
	public int dni;
	public String genero;
	
	
	public Persona(String nombre, String apellido, int edad, int dni, String genero) {
	this.nombre= nombre;
	this.apellido= apellido;
	this.edad= edad;
	this.dni= dni;
	this.genero= genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
