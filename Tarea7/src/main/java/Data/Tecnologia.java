package Data;

public class Tecnologia extends Productos {

    private String marca;
    private final int idProductoTecnologico;
    private static int contadorProductoTecnologico;


    public Tecnologia(String marca, String impuesto, String nombre, int precio) {
        super(impuesto, nombre, precio);
        this.marca = marca;
        this.idProductoTecnologico = ++Tecnologia.contadorProductoTecnologico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdProductoTecnologico(){
        return this.idProductoTecnologico;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "\nTecnologia{" + "marca=" + marca + ", idProductoTecnologico=" + idProductoTecnologico + '}';
//    }
}
