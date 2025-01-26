package edu.alonso.tema3;

public class Profesor {

		protected String nombre;
		protected int edad;
		protected String asignatura;
		
		public Profesor(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		} 
		
		public Profesor(String nombre, int edad, String asignatura) {
			this(nombre, edad);
			this.asignatura = asignatura;
		} 
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre (String valor) {
			this.nombre = valor;
		}
		
		public int getEdad() {
			return edad;
		}
		public void setEdad (int edad) {
			this.edad = edad;
		}
		
		public String getAsignatura() {
			return asignatura;
		}
		
		public void setAsignatura (String asignatura) {
			this.asignatura = asignatura;
		}
		
		@Override
		public String toString() {
			String aux = ("Nombre: "+ nombre +", Edad: "+ edad +", Asignatura: "+ asignatura);
			return aux;
		}
	
}
