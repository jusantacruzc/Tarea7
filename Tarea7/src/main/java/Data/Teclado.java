
package Data;

public class Teclado extends DispositivoEntrada {
    private String lenguaje;
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String lenguaje, String marca, String impuesto, String nombre, int precio) {
        super(marca, impuesto, nombre, precio);
        this.lenguaje = lenguaje;
        this.idTeclado = ++Teclado.contadorTeclado;
    }

       
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public int getIdTeclado(){
        return this.idTeclado;
    }

    @Override
    public String toString() {
        return "\n Teclado - " + nombre + " - $" + precio;
    }

    
    
    
    
}
