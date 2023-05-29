package Data;

import java.util.Date;

public class Gasificada extends Bebidas {

    private boolean ExcesoSodio;
    private boolean ExcesoAzucar;
    private boolean ContieneEndulcorantes;
    private final int idGaseosa;
    private static int contadorGaseosas;

    public Gasificada(boolean ExcesoSodio, boolean ExcesoAzucar, boolean ContieneEndulcorantes, float medidaEnMl, Date fechaCaducidad, String impuesto, String nombre, int precio) {
        super(medidaEnMl, fechaCaducidad, impuesto, nombre, precio);
        this.ExcesoSodio = ExcesoSodio;
        this.ExcesoAzucar = ExcesoAzucar;
        this.ContieneEndulcorantes = ContieneEndulcorantes;
        this.idGaseosa = ++Gasificada.contadorGaseosas;
    }

    public boolean isExcesoSodio() {
        return ExcesoSodio;
    }

    public void setExcesoSodio(boolean ExcesoSodio) {
        this.ExcesoSodio = ExcesoSodio;
    }

    public boolean isExcesoAzucar() {
        return ExcesoAzucar;
    }

    public void setExcesoAzucar(boolean ExcesoAzucar) {
        this.ExcesoAzucar = ExcesoAzucar;
    }

    public boolean isContieneEndulcorantes() {
        return ContieneEndulcorantes;
    }

    public void setContieneEndulcorantes(boolean ContieneEndulcorantes) {
        this.ContieneEndulcorantes = ContieneEndulcorantes;
    }

    public int getIdGaseosa() {
        return this.idGaseosa;
    }

@Override
    public String toString() {
        return "\nGaseosa - " + nombre + " - $"+ precio ;
    }

}
