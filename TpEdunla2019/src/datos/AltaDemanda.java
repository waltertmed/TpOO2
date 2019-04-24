package datos;
import java.util.*;

public class AltaDemanda extends Cliente {
			private int idAltaDemanda;
			private String nombreEmpresa;
			private long cuil;
			private Medidor medidor;
			private String direccion;
			private List<Medidor> lstMedidor;
			
			public AltaDemanda() {}

			public AltaDemanda(String nombreEmpresa, long cuil, Medidor medidor, String direccion,String nroCliente, Zona zona, Contacto contacto) {
				super(nroCliente, zona, contacto);
				this.nombreEmpresa = nombreEmpresa;
				this.cuil = cuil;
				this.medidor = medidor;
				this.direccion = direccion;
			};
			
			
}
