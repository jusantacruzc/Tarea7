
package Data;

public abstract class DispositivoEntrada extends Tecnologia {
    private String tipoEntrada;

    public DispositivoEntrada(String marca, String impuesto, String nombre, int precio) {
        super(marca, impuesto, nombre, precio);
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

//    @Override
//    public String toString() {
//        return super.toString() +"\nDispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + '}';
//    }
       
}
