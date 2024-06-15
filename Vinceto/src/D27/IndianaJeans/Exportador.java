package D27.IndianaJeans;

import java.util.List;

public abstract class Exportador {
    public abstract void exportar(List<Producto> productos, String archivo);
}