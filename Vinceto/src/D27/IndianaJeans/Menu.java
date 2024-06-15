package D27.IndianaJeans;
import Util.Utilidad;
import Util.SScan;

public class Menu {

    private ProductoServicio productoServicio = new ProductoServicio();
    private ExportarTxt exportarTxt = new ExportarTxt();
    private SScan sscan = new SScan();

    public void mostrarMenu() {
        int opcion;
        do {
            Utilidad.limpiarPantalla();
            System.out.println("1. Listar Producto");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Exportar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = (int) sscan.escanear("int");

            Utilidad.limpiarPantalla();

            switch (opcion) {
                case 1:
                    productoServicio.listarProductos();
                    Utilidad.esperar(1);
                    break;
                case 2:
                    agregarProducto();
                    Utilidad.esperar(1);
                    break;
                case 3:
                    exportarDatos();
                    Utilidad.esperar(1);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    Utilidad.esperar(2);
            }
        } while (opcion != 4);
    }

    private void agregarProducto() {
        System.out.println("Crear Producto");

        System.out.print("Ingresar nombre articulo: ");
        String articulo = (String) sscan.escanear("string");

        System.out.print("Ingresa precio: ");
        String precio = (String) sscan.escanear("string");

        System.out.print("Ingresa descripción: ");
        String descripcion = (String) sscan.escanear("string");

        System.out.print("Ingresa código: ");
        String codigo = (String) sscan.escanear("string");

        System.out.print("Ingresa talla: ");
        String talla = (String) sscan.escanear("string");

        System.out.print("Ingresa marca: ");
        String marca = (String) sscan.escanear("string");

        System.out.print("Ingresa color: ");
        String color = (String) sscan.escanear("string");

        Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
        productoServicio.agregarProducto(producto);
    }

    private void exportarDatos() {
        System.out.print("Ingrese el nombre del archivo para exportar: ");
        String archivo = (String) sscan.escanear("string");
        exportarTxt.exportar(productoServicio.getListaProductos(), archivo);
    }
}