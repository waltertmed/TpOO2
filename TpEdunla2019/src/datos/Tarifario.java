package datos;

public class Tarifario {
		private int idTarifario;

		
		public Tarifario () {}


		public Tarifario(int idTarifario) {
			super();
			this.idTarifario = idTarifario;
		}


		public int getIdTarifario() {
			return idTarifario;
		}


		public void setIdTarifario(int idTarifario) {
			this.idTarifario = idTarifario;
		}


		@Override
		public String toString() {
			return "Tarifario [idTarifario=" + idTarifario + "]";
		}
		

}
