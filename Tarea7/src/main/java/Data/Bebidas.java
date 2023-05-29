
package Data;

import java.util.Date;


public class Bebidas extends Alimentos{
    private float medidaEnMl;
    private final int idIdBebida;
    private static int contadorBebida;

    public Bebidas(float medidaEnMl, Date fechaCaducidad, String impuesto, String nombre, int precio) {
        super(fechaCaducidad, impuesto, nombre, precio);
        this.medidaEnMl = medidaEnMl;
        this.idIdBebida = ++Bebidas.contadorBebida;
    }

    public float getMedidaEnMl() {
        return medidaEnMl;
    }

    public void setMedidaEnMl(float medidaEnMl) {
        this.medidaEnMl = medidaEnMl;
    }

    public int getIdBebida(){
        return this.idIdBebida;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "\nBebidas{" + "medidaEnMl=" + medidaEnMl + ", idIdBebida=" + idIdBebida + '}';
//    }
    
    
    
    
    
    
}
