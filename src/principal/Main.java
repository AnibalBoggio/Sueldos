package principal;
import gui.Interface;
public class Main {

	public static void main(String[] args) {
		new Interface().setVisible(true);
		
	}
	
	public static void procesarDatos() {
	    double horasComunes = Double.parseDouble(Interface.textHorasComunes.getText());
	    double horasExtras = Double.parseDouble(Interface.textHorasExtras.getText());
	    double precioHora = Double.parseDouble(Interface.textPrecioHora.getText());
	    int turno = Integer.parseInt(Interface.textTurno.getText());
	    int hijos = Integer.parseInt(Interface.textHijos.getText());
	    Processing processing = new Processing(horasComunes, horasExtras, precioHora, turno, hijos);
	    processing.realizarProcesamiento();
	}
}
