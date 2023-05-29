package Data;

import java.util.Date;

public class Alimentos extends Productos {
    private final int idAlimento;
    private static int contadorAlimento;
    private Date fechaCaducidad;
    

    public Alimentos(Date fechaCaducidad, String impuesto, String nombre, int precio) {
        super(impuesto, nombre, precio);
        this.idAlimento = ++Alimentos.contadorAlimento;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdAlimento() {
        return idAlimento;
    }
    
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "\nAlimentos{" + "idAlimento=" + idAlimento + ", fechaCaducidad=" + fechaCaducidad + '}';
//    }
    
}
