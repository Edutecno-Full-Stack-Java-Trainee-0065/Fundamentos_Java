package D27.IndianaJeans;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportarTxt extends Exportador {

    @Override
    public void exportar(List<Producto> productos, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Producto producto : productos) {
                writer.write(producto.toString());
                writer.newLine();
            }
            System.out.println("Datos exportados a " + archivo);
        } catch (IOException e) {
            System.err.println("Error al exportar los datos: " + e.getMessage());
        }
    }
}
