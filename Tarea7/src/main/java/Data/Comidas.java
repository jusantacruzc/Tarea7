package Data;

import java.util.Date;

public class Comidas extends Alimentos {
    private static int contadorComidas;
    private final int idComidas;
    private double medidaEnKl;
    

    public Comidas(double medidaEnKl, Date fechaCaducidad, String impuesto, String nombre, int precio) {
        super(fechaCaducidad, impuesto, nombre, precio);
        this.idComidas = ++Comidas.contadorComidas;
        this.medidaEnKl = medidaEnKl;
    }

    public int getIdComidas() {
        return idComidas;
    }

    public static void setContadorComidas(int contadorComidas) {
        Comidas.contadorComidas = contadorComidas;
    }

    public double getMedidaEnKl() {
        return medidaEnKl;
    }

    public void setMedidaEnKl(float medidaEnKl) {
        this.medidaEnKl = medidaEnKl;
    }

//    @Override
//    public String toString() {
//        return super.toString() +"\nComidas{" + "idComidas=" + idComidas + ", medidaEnKl=" + medidaEnKl + '}';
//    }
    
    
            
}
