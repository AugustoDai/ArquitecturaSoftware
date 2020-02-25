package tareaVentaProducto;

public class Servicio extends Producto {
	
	private static final int _SALDO = 1;
	public Servicio(String nombre, int precio) {
		super(nombre, precio, _SALDO);
	}
	@Override
	public int calcularTarifa() {
		return precio * 10;
	}
}
