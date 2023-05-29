package Data;

public class Computadora extends DispositivoEntrada {

    private final int idComputadora;
    private static int contadorComputadora;
    private String name;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    public Computadora(Monitor monitor, Teclado teclado, Mouse mouse, String marca, String impuesto, String nombre, int precio) {
        super(marca, impuesto, nombre, precio);
        this.name = name;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    @Override
    public String toString() {
        return "\nComputadora - " + nombre + " - $" + precio;
    }

}
