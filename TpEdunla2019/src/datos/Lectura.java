package datos;
import java.util.*;
import java.time.LocalDate;
public class Lectura {
		private int idLectura;
		private Medidor medidor;
		private Inspector inspector;
		private LocalDate fecha;
		private LocalDate hora;
		
		public Lectura() {}

		public Lectura(int idLectura, Medidor medidor, Inspector inspector, LocalDate fecha, LocalDate hora) {
			super();
			this.idLectura = idLectura;
			this.medidor = medidor;
			this.inspector = inspector;
			this.fecha = fecha;
			this.hora = hora;
		}

		public int getIdLectura() {
			return idLectura;
		}

		public void setIdLectura(int idLectura) {
			this.idLectura = idLectura;
		}

		public Medidor getMedidor() {
			return medidor;
		}

		public void setMedidor(Medidor medidor) {
			this.medidor = medidor;
		}

		public Inspector getInspector() {
			return inspector;
		}

		public void setInspector(Inspector inspector) {
			this.inspector = inspector;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public LocalDate getHora() {
			return hora;
		}

		public void setHora(LocalDate hora) {
			this.hora = hora;
		}

		@Override
		public String toString() {
			return "Lectura [idLectura=" + idLectura + ", medidor=" + medidor + ", fecha=" + fecha + ", hora=" + hora
					+ "]";
		}
		
		
		

}
