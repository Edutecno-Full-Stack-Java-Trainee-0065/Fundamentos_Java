package D28.ReciclaJeans;
import Util.Menu;
import Util.SScan;
import Util.Utilidad;

import java.util.Arrays;
import java.util.List;

public class MenuReciclaJeans {
    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        ArchivoServicio archivoServicio = new ArchivoServicio();
        SScan sscan = new SScan();

        List<String> opcionesMenu = Arrays.asList(
                "Listar Producto",
                "Editar Datos",
                "Importar Datos",
                "Salir"
        );

        while (true) {
            Utilidad.limpiarPantalla();
            Menu.mostrarMenu(opcionesMenu);
            String opcion = Menu.seleccionarOpcionMenu();

            switch (opcion) {
                case "a":
                    Utilidad.limpiarPantalla();
                    productoServicio.listarProductos();
                    Utilidad.esperar(2);
                    break;
                case "b":
                    Utilidad.limpiarPantalla();
                    if (productoServicio.isEmptyListaProductos()){
                        System.out.println("No puedes editar un producto, la lista esta vacia");
                        Utilidad.esperar(2);
                        break;
                    }
                    String codigo = sscan.getString("Ingrese el código del producto a editar: ");
                    System.out.println("Seleccione el campo a editar:");
                    System.out.println("1. Articulo");
                    System.out.println("2. Precio");
                    System.out.println("3. Descripcion");
                    System.out.println("4. Talla");
                    System.out.println("5. Marca");
                    System.out.println("6. Color");
                    int campo = sscan.getInt("Elige una opción: ");
                    String nuevoValor = sscan.getString("Ingrese el nuevo valor: ");
                    String campoStr = null;
                    switch (campo) {
                        case 1:
                            campoStr = "articulo";
                            break;
                        case 2:
                            campoStr = "precio";
                            break;
                        case 3:
                            campoStr = "descripcion";
                            break;
                        case 4:
                            campoStr = "talla";
                            break;
                        case 5:
                            campoStr = "marca";
                            break;
                        case 6:
                            campoStr = "color";
                            break;
                    }
                    if (campoStr != null) {
                        productoServicio.editarProducto(codigo, campoStr, nuevoValor);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    Utilidad.esperar(2);
                    break;
                case "c":
                    Utilidad.limpiarPantalla();
                    String archivo = sscan.getString("Ingrese el nombre del archivo a importar (incluyendo la extensión): ");
                    archivoServicio.cargarDatos(archivo, productoServicio.getListaProductos());
                    System.out.println("Datos importados correctamente.");
                    Utilidad.esperar(2);
                    break;
                case "d":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
                    Utilidad.esperar(2);
                    break;
            }
        }
    }
}
