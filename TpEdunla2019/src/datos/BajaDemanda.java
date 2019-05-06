package datos;

public class BajaDemanda extends Cliente {
		private int dni;
		private String nombre;
		private String apellido;
		private Medidor medidor;
		
		public BajaDemanda() {}

		public BajaDemanda(int dni, String nombre, String apellido, Medidor medidor, String nroCliente, int idCliente, Zona zona, Contacto contacto) {
			super(nroCliente, zona, contacto);
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.medidor = medidor;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
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

		public Medidor getMedidor() {
			return medidor;
		}

		public void setMedidor(Medidor medidor) {
			this.medidor = medidor;
		}

		@Override
		public String toString() {
			return "ClienteBajaDemanda [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", medidor=" + medidor
					+ "]";
		}
		
		

}
