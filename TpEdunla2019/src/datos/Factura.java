package datos;
import java.time.LocalDate;
import java.util.*;

public class Factura {
		private int idFactura;
		private Lectura lectura;
		private Cliente cliente;
		private LocalDate fecha;
		
		public Factura () {}

		public Factura(int idLectura, Lectura lectura, Cliente cliente, LocalDate fecha) {
			super();
			this.idFactura = idLectura;
			this.lectura = lectura;
			this.cliente = cliente;
			this.fecha = fecha;
		}

		public int getIdLectura() {
			return idFactura;
		}

		public void setIdLectura(int idLectura) {
			this.idFactura = idLectura;
		}

		public Lectura getLectura() {
			return lectura;
		}

		public void setLectura(Lectura lectura) {
			this.lectura = lectura;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		@Override
		public String toString() {
			return "Factura [idLectura=" + idFactura + ", cliente=" + cliente + ", fecha=" + fecha + "]";
		}
		
		
		
}
