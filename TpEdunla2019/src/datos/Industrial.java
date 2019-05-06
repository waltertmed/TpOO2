package datos;

public class Industrial extends Medidor {
		private double consumoPico;
		private double consumoValle;
		private double consumoResto;
		
		public Industrial () {}

		public Industrial(double consumoPico, double consumoValle, double consumoResto, int idMedidor, int nroMedidor) {
			super(idMedidor, nroMedidor);
			this.consumoPico = consumoPico;
			this.consumoValle = consumoValle;
			this.consumoResto = consumoResto;
		}

		public double getConsumoPico() {
			return consumoPico;
		}

		public void setConsumoPico(double consumoPico) {
			this.consumoPico = consumoPico;
		}

		public double getConsumoValle() {
			return consumoValle;
		}

		public void setConsumoValle(double consumoValle) {
			this.consumoValle = consumoValle;
		}

		public double getConsumoResto() {
			return consumoResto;
		}

		public void setConsumoResto(double consumoResto) {
			this.consumoResto = consumoResto;
		}

		@Override
		public String toString() {
			return "Medidor Industrial [consumoPico=" + consumoPico + ", consumoValle=" + consumoValle + ", consumoResto="
					+ consumoResto + "]";
		}
		
		

		

}
