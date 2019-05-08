package datos;

public class TBaja extends Tarifario {
		private int idTBaja;
		private double cargoFijo;
		private double cargoVariable;
		
		public TBaja() {}

		public TBaja(int idTBaja, double cargoFijo, double cargoVariable) {
			super();
			this.idTBaja = idTBaja;
			this.cargoFijo = cargoFijo;
			this.cargoVariable = cargoVariable;
		}

		public int getIdTBaja() {
			return idTBaja;
		}

		public void setIdTBaja(int idTBaja) {
			this.idTBaja = idTBaja;
		}

		public double getCargoFijo() {
			return cargoFijo;
		}

		public void setCargoFijo(double cargoFijo) {
			this.cargoFijo = cargoFijo;
		}

		public double getCargoVariable() {
			return cargoVariable;
		}

		public void setCargoVariable(double cargoVariable) {
			this.cargoVariable = cargoVariable;
		}

		@Override
		public String toString() {
			return "TBaja [idTBaja=" + idTBaja + ", cargoFijo=" + cargoFijo + ", cargoVariable=" + cargoVariable + "]";
		}
		
		
		
		

}
