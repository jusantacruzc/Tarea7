package Data;

import java.util.Date;

public class Carne extends Comidas {

    private String animal;
    private final int idCarne;
    private static int contadorCarne;

    public Carne(String animal, double medidaEnKl, Date fechaCaducidad, String impuesto, String nombre, int precio) {
        super(medidaEnKl, fechaCaducidad, impuesto, nombre, precio);
        this.animal = animal;
        this.idCarne = ++Carne.contadorCarne;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getIdCarne() {
        return this.idCarne;
    }

    @Override
    public String toString() {
        return "\nCarne - " + nombre + " - $"+ precio ;
    }

}
