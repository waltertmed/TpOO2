package datos;
import java.util.*;

public class Medidor {
		private int idMedidor;
		protected int nroMedidor;
		
		public Medidor() {}

		public Medidor(int idMedidor, int nroMedidor) {
			super();
			this.idMedidor = idMedidor;
			this.nroMedidor = nroMedidor;
		}

		public int getIdMedidor() {
			return idMedidor;
		}

		public void setIdMedidor(int idMedidor) {
			this.idMedidor = idMedidor;
		}

		public int getNroMedidor() {
			return nroMedidor;
		}

		public void setNroMedidor(int nroMedidor) {
			this.nroMedidor = nroMedidor;
		}

		@Override
		public String toString() {
			return "Medidor [idMedidor=" + idMedidor + ", nroMedidor=" + nroMedidor + "]";
		}
		

}
