package Data;

public class Productos {
    private final int idProducto;
    private static int contadorProductos;
    private String impuesto;
    String nombre;
    int precio;

    
    public Productos(){
        this.idProducto = ++Productos.contadorProductos; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Productos(int idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    public Productos(String impuesto, String nombre, int precio) {
        this();
        this.impuesto = impuesto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }
    
    public int getIdProducto(){
        return this.idProducto;
    }
    
//    @Override
//    public String toString() {
//        return "\nProducto{" + nombre + precio + '}';
//    }
    
    
}
