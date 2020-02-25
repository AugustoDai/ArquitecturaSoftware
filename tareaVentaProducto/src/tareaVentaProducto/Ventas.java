package tareaVentaProducto;

public class Ventas {

	private static final int _CANTIDAD_PRODUCTOS = 100;
	
	public int totalVenta = 0;
	public int indice = 0;
	Producto[] listaProductos = new Producto[_CANTIDAD_PRODUCTOS];
	
	public void ingresarProducto(Producto producto) {
		listaProductos[indice] = producto;
		indice++;
	}
	public int calcularVentaDeProductos() {
		
		for(int i = 0; i < indice; i++)
		{
			totalVenta = listaProductos[i].calcularTarifa() + totalVenta;
		}
		
		return totalVenta;
	}
}
