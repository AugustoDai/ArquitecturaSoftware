package tareaVentaProducto;

public class Articulo extends Producto{

	public Articulo(String nombre, int precio, int saldo) {
		super(nombre, precio, saldo);
	}
	@Override
	public int calcularTarifa() {	
		return precio * saldo;
	}
	
}
