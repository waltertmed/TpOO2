package datos;

public class Inspector {
		private int idInspector;
		private int dni;
		private String nombre;
		private String apellido;
		private Zona zona;
		
		public Inspector () {}

		public Inspector(int idInspector, int dni, String nombre, String apellido, Zona zona) {
			super();
			this.idInspector = idInspector;
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.zona = zona;
		}

		public int getIdInspector() {
			return idInspector;
		}

		public void setIdInspector(int idInspector) {
			this.idInspector = idInspector;
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

		public Zona getZona() {
			return zona;
		}

		public void setZona(Zona zona) {
			this.zona = zona;
		}

		@Override
		public String toString() {
			return "Inspector [idInspector=" + idInspector + ", dni=" + dni + ", nombre=" + nombre + ", apellido="
					+ apellido + ", zona=" + zona + "]";
		}
		

}
