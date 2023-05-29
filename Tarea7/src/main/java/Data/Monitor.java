
package Data;

public class Monitor extends DispositivoEntrada {
    private float tamanoPulgadas;
    private final int idMonitor;
    private static int contadorMonitor;

    public Monitor(float tamanoPulgadas, String marca, String impuesto, String nombre, int precio) {
        super(marca, impuesto, nombre, precio);
        this.tamanoPulgadas = tamanoPulgadas;
        this.idMonitor = ++Monitor.contadorMonitor;
    }

    public float getTamanoPulgadas() {
        return tamanoPulgadas;
    }

    public void setTamanoPulgadas(float tamanoPulgadas) {
        this.tamanoPulgadas = tamanoPulgadas;
    }
    
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "\nMonitor - " + nombre + " - $"+ precio ;
    }
    
    
    
    
}
