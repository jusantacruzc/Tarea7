package Data;

import java.util.Date;

public class Huevos extends Comidas {

    private String peso;
    private final int idHuevo;
    private static int contadorHuevo;
    private int cantidad;

    public Huevos(String peso, int cantidad, double medidaEnKl, Date fechaCaducidad, String impuesto, String nombre, int precio) {
        super(medidaEnKl, fechaCaducidad, impuesto, nombre, precio);
        this.peso = peso;
        this.cantidad = cantidad;
        this.idHuevo = ++Huevos.contadorHuevo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getIdHuevo() {
        return idHuevo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\nHuevos - " + nombre + " - $"+ precio ;
    }
}
