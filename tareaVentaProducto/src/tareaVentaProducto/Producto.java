package tareaVentaProducto;

public abstract class Producto {
	
	protected String nombre;
	protected int precio;
	protected int saldo;
	
	public Producto(String nombre, int precio, int saldo) {
		this.nombre = nombre;
		this.precio = precio;
		this.saldo = saldo;
    }
	
	public boolean estaDisponible(String nombreBuscado)
	{	
		boolean respuesta = false;
		if(nombre == nombreBuscado)
			respuesta = true;
		return respuesta;
	}
	public abstract int calcularTarifa();
}
