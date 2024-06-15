package D27.IndianaJeans;
import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() { return listaProductos; }
    public void setListaProductos(ArrayList<Producto> listaProductos) { this.listaProductos = listaProductos; }

    public void listarProductos() {
        System.out.println("Productos en la lista: " + listaProductos.toArray().length);
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }
}

