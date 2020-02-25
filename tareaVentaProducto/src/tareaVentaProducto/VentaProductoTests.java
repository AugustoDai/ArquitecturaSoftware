package tareaVentaProducto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VentaProductoTests {

	//Pruebas de Servicio---------------------------------------------------------------
	
	@Test
	// Si ingreso el precio 150 deberia devolverme 1500 al calcularTarifa()
    public void pruebaCalculoDeTarifaServicio(){
        Servicio servicio = new Servicio("Masajes", 150);
        assertEquals(1500, servicio.calcularTarifa());
    }
	@Test
	// Si ingreso Masajes y busco Masajes en disponibilidad me deberia devolver true
    public void pruebaDisponibilidadServicio(){
        Servicio servicio = new Servicio("Masajes", 150);
        assertEquals(true, servicio.estaDisponible("Masajes"));
    }
	
	@Test
	/* Si ingreso en precio 200 de TV Cable me deberia de devolver un resultado distinto a 2000
	 para que la prueba pase */
    public void pruebaCalculoErroneoDeTarifaServicio(){
        Servicio servicio = new Servicio("TV Cable", 200);
        assertNotEquals(200, servicio.calcularTarifa());
    }
	/* Si creo un servicio TV Fake Cable y busco en disponibilidad
	TV Cable deberia de dar false el resultado*/
	@Test
    public void pruebaDisponibilidadServicio2(){
        Servicio servicio = new Servicio("TV Fake Cable", 200);
        assertEquals(false, servicio.estaDisponible("TV Cable"));
    }
	
	//Pruebas de Articulo--------------------------------------------------------------
	
	@Test
	/* Si creo un articulo Foco 100W con precio 7bs y saldo 2, al momento de calcularTarifa()
	me deberia de devolver 14*/
    public void pruebaCalculoDeTarifaArticulo(){
		Articulo articulo = new Articulo("Foco 100W", 7, 2);
        assertEquals(14, articulo.calcularTarifa());
    }
	@Test
	// creo y busco disponibilidad de Foco 100W, porque lo que el resultado deberia ser true 
    public void pruebaDisponibilidadArticulo(){
		Articulo articulo = new Articulo("Foco 100W", 7, 1);
        assertEquals(true, articulo.estaDisponible("Foco 100W"));
    }
	
	@Test
	/* creo un articulo con Tenis Nike de precio 700 y saldo 3, el resultado de
	calcularTarifa() deberia ser distinto a 2100 para que la prueba pase*/
    public void pruebaCalculoErroneoDeTarifaArticulo(){
		Articulo articulo = new Articulo("Tenis Nike", 700, 3);
        assertNotEquals(700, articulo.calcularTarifa());
    }
	
	@Test
	// se crea Tenis Pike y se busca la disponibilidad de Tenis Nike, resultado false
    public void pruebaDisponibilidadArticulo2(){
		Articulo articulo = new Articulo("Tenis Pike", 200, 2);
        assertEquals(false, articulo.estaDisponible("Tenis Nike"));
    }

	//Pruebas de Producto--------------------------------------------------------------
	
	@Test
	/* se crea un producto servicio, por lo cual al momento de llamar al calcularTarifa()
	deberia de ser distinta a la de articulo*/
    public void pruebaDeCalcularTarifaAlCrearUnProductoServicio(){
		Producto producto = new Servicio("Luz", 320);
        assertEquals(3200, producto.calcularTarifa());
    }
	
	@Test
	/* se crea un producto articulo, por lo cual al momento de llamar al calcularTarifa()
	deberia de ser distinta a la de servicio*/
    public void pruebaDeCalcularTarifaAlCrearUnProductoArticulo(){
		Producto producto = new Articulo("Galletas Frac", 8, 5);
        assertEquals(40, producto.calcularTarifa());
    }
	
	//Pruebas de Ventas--------------------------------------------------------------
	
	@Test
	// si no hay nada, el total de ventas deberia de ser 0
    public void pruebaVentas(){
		Ventas ventas = new Ventas();
        assertEquals(0, ventas.calcularVentaDeProductos());
    }
	
	@Test
	/* se crean productos, uno de servicio y otro de articulo y se calcula la suma de
	todas las tarifas, por lo cual al momento de calculaTarifa esta deberia de reconocer
	que es*/
    public void pruebaVentas2(){
		Ventas ventas = new Ventas();
		Producto prod1 = new Servicio("Agua", 120); //tarifa = 1200
		Producto prod2 = new Articulo("Globos", 10, 7); //tarifa = 70
		ventas.ingresarProducto(prod1);
		ventas.ingresarProducto(prod2);
        assertEquals(1270, ventas.calcularVentaDeProductos()); //total de venta = 1200 + 70
    }
}
