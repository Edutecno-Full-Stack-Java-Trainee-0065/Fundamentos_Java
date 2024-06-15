package D28.ReciclaJeans;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ArchivoServicio {

    public void cargarDatos(String archivo, List<Producto> listaProductos) {
        // el archvo esta en : src/D28/ProductosImportados.csv
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 7) {
                    Producto producto = new Producto(
                            datos[0], // articulo
                            datos[1], // precio
                            datos[2], // descripcion
                            datos[3], // codigo
                            datos[4], // talla
                            datos[5], // marca
                            datos[6]  // color
                    );
                    listaProductos.add(producto);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }
}
