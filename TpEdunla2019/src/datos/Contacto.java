package datos;

public class Contacto {
		private int idContacto;
		private int telefono;
		private String mail;
		
		public Contacto () {}

		public Contacto(int idContacto, int telefono, String mail) {
			super();
			this.idContacto = idContacto;
			this.telefono = telefono;
			this.mail = mail;
		}

		@Override
		public String toString() {
			return "Contacto [idContacto=" + idContacto + ", telefono=" + telefono + ", mail=" + mail + "]";
		}
		

}
