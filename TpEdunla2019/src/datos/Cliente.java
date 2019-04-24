package datos;
import java.util.*;

public class Cliente{
		private int idCliente;
		protected String nroCliente;
		private Zona zona;
		private Contacto contacto;
	
		
		public Cliente() {}

		public Cliente(String nroCliente , Zona zona, Contacto contacto) {
			super();
			this.nroCliente = nroCliente;
			this.zona = zona;
			this.contacto = contacto;
			
		}

		public int getIdCliente() {
			return idCliente;
		}

		protected void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}
		
		public String getNroCliente() {
			return nroCliente;
		}

		public void setNroCliente(String nroCliente) {
			this.nroCliente = nroCliente;
		}

		public Zona getZona() {
			return zona;
		}

		public void setZona(Zona zona) {
			this.zona = zona;
		}

		public Contacto getContacto() {
			return contacto;
		}

		public void setContacto(Contacto contacto) {
			this.contacto = contacto;
		}

		

		@Override
		public String toString() {
			return "Cliente [idCliente=" + idCliente + ", zona=" + zona + ", contacto=" + contacto + ", medidor="
					+ nroCliente + "]";
		};
		
		
		
		
		
		

}
