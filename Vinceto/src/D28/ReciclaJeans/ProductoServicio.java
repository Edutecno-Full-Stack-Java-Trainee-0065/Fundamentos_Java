package D28.ReciclaJeans;
import java.util.ArrayList;
import java.util.List;

public class ProductoServicio {
    private List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public boolean isEmptyListaProductos(){
        if (listaProductos.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }
        }
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void editarProducto(String codigo, String campo, String nuevoValor) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                switch (campo.toLowerCase()) {
                    case "articulo":
                        producto.setArticulo(nuevoValor);
                        break;
                    case "precio":
                        producto.setPrecio(nuevoValor);
                        break;
                    case "descripcion":
                        producto.setDescripcion(nuevoValor);
                        break;
                    case "talla":
                        producto.setTalla(nuevoValor);
                        break;
                    case "marca":
                        producto.setMarca(nuevoValor);
                        break;
                    case "color":
                        producto.setColor(nuevoValor);
                        break;
                }
                break;
            }
        }
    }
}
