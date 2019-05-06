package datos;

public class Residencial extends Medidor {
			private double consumo;
			
			public Residencial() {}

			public Residencial(double consumo,int idMedidor, int nroMedidor) {
				super(idMedidor, nroMedidor);
				
			}

			public double getConsumo() {
				return consumo;
			}

			public void setConsumo(double consumo) {
				this.consumo = consumo;
			}

			@Override
			public String toString() {
				return "Medidor Residencial [consumo=" + consumo + "]";
			}
			

}
