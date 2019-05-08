package datos;

public class TAlta extends Tarifario {
		private int idTAlta;
		private double cargoFijo;
		private double cargoPico;
		private double cargoValle;
		private double cargoResto;
		
		public TAlta() {}

		public TAlta(int idTAlta, double cargoFijo, double cargoPico, double cargoValle, double cargoResto) {
			super();
			this.idTAlta = idTAlta;
			this.cargoFijo = cargoFijo;
			this.cargoPico = cargoPico;
			this.cargoValle = cargoValle;
			this.cargoResto = cargoResto;
		}

		public int getIdTAlta() {
			return idTAlta;
		}

		public void setIdTAlta(int idTAlta) {
			this.idTAlta = idTAlta;
		}

		public double getCargoFijo() {
			return cargoFijo;
		}

		public void setCargoFijo(double cargoFijo) {
			this.cargoFijo = cargoFijo;
		}

		public double getCargoPico() {
			return cargoPico;
		}

		public void setCargoPico(double cargoPico) {
			this.cargoPico = cargoPico;
		}

		public double getCargoValle() {
			return cargoValle;
		}

		public void setCargoValle(double cargoValle) {
			this.cargoValle = cargoValle;
		}

		public double getCargoResto() {
			return cargoResto;
		}

		public void setCargoResto(double cargoResto) {
			this.cargoResto = cargoResto;
		}

		@Override
		public String toString() {
			return "TAlta [idTAlta=" + idTAlta + ", cargoFijo=" + cargoFijo + ", cargoPico=" + cargoPico
					+ ", cargoValle=" + cargoValle + ", cargoResto=" + cargoResto + "]";
		}
		

}
