package Logica;

import Data.*;
import UI.UI;
import java.util.Date;
import java.util.TreeMap;

public class Tarea7 {

    public static TreeMap<String, Productos> treeMapProductos = new TreeMap();
    public static Date doñaGallinaCaducidad = new Date(123, 5, 3);
    public static Huevos doñaGallina = new Huevos("AA", 12, 0.06, doñaGallinaCaducidad, "17%", "doñaGallina", 6000);
    public static Date huevosDoradosCaducidad = new Date(123, 5, 7);
    public static Huevos huevosDorados = new Huevos("AAA", 24, 0.07, huevosDoradosCaducidad, "17%", "huevosDorados", 6500);
    public static Date gallinaDoradaCaducidad = new Date(123, 5, 4);
    public static Huevos gallinaDorada = new Huevos("A", 6, 0.05, gallinaDoradaCaducidad, "17%", "gallinaDorada", 5500);
    public static Date carne1Caducidad = new Date(123, 5, 3);
    public static Carne carne1 = new Carne("Pollo", 1.2, carne1Caducidad, "20%", "Pechuga", 9600 );
    public static Date carne2Caducidad = new Date(123, 5, 3);
    public static Carne carne2 = new Carne("Carne", .7, carne2Caducidad, "20%", "Carne Molida", 9000);
    public static Date carne3Caducidad = new Date(123, 5, 3);
    public static Carne carne3 = new Carne("Pescado", 2.2, carne3Caducidad, "21%", "Salmon", 24000);
    public static Date gaseosa1Caducidad = new Date(124, 6, 6);
    public static Gasificada gaseosa1 = new Gasificada(true, true, true, 700, gaseosa1Caducidad, "7%", "Coca-cola", 7500);
    public static Date gaseosa2Caducidad = new Date(124, 6, 6);
    public static Gasificada gaseosa2 = new Gasificada(false, true, true, 500, gaseosa2Caducidad, "7%", "Colombiana", 9000);
    public static Date gaseosa3Caducidad = new Date(124, 6, 6);
    public static Gasificada gaseosa3 = new Gasificada(false, true, false, 1000, gaseosa3Caducidad, "7%", "H2O", 4900);
    public static Date alcohol1Caducidad = new Date(127, 7, 10);
    public static Alcoholicas alcohol1 = new Alcoholicas(23, 1000, alcohol1Caducidad, "24%", "Aguardiente", 4500);
    public static Date alcohol2Caducidad = new Date(127, 7, 10);
    public static Alcoholicas alcohol2 = new Alcoholicas(40, 600, alcohol2Caducidad, "24%", "Ron de caldas", 27000);
    public static Date alcohol3Caducidad = new Date(127, 7, 10);
    public static Alcoholicas alcohol3 = new Alcoholicas(13, 2000, alcohol3Caducidad, "24%", "Corona", 3500);
    public static Monitor monitor1 = new Monitor(17, "Raizer", "4%", "Raizer 17 pulgadas", 1200000);
    public static Monitor monitor2 = new Monitor(27, "Lg", "4%", "Lg 27 pulgadas", 2000000);
    public static Monitor monitor3 = new Monitor(10, "Hp", "4%", "Hp 10 pulgadas", 1000000);
    public static Mouse mouse1 = new Mouse(2, "Microsoft", "1%", "Microsoft 2 gramos", 250000);
    public static Mouse mouse2 = new Mouse(5, "Lenovo", "1%", "Lenovo 5 gramos", 100000);
    public static Mouse mouse3 = new Mouse(7, "Apple", "1%", "Apple 7 gramos", 750000);
    public static Teclado teclado1 = new Teclado("QWERTY", "Lenovo", "10%", "Lenovo QWERTY", 230000);
    public static Teclado teclado2 = new Teclado("Dvorak", "Microsoft", "10%", "Microsoft Dvorak", 140000);
    public static Teclado teclado3 = new Teclado("Colemak", "Hp", "10%", "Hp colemak", 75000);
    public static Computadora pc1 = new Computadora(monitor1, teclado1, mouse1, "Raizer", "17%", "Monitor con monitor Raizer, teclado lenovo, mouse microsoft", 4000000);
    public static Computadora pc2 = new Computadora (monitor2, teclado2, mouse2, "Apple", "17%", "Monitor con monitor Lg, teclado Microsoft, mouse lenovo", 4000000);
    public static Computadora pc3 = new Computadora( monitor3, teclado3, mouse3, "Microsoft", "17%", "Monitor con monitor Hp, teclado HP, mouse apple", 4000000);

    private static void asignarValores() {
        treeMapProductos.put("tree-H1", doñaGallina);
        treeMapProductos.put("tree-H2", huevosDorados);
        treeMapProductos.put("tree-H3", gallinaDorada);
        treeMapProductos.put("tree-C1", carne1);
        treeMapProductos.put("tree-C2", carne2);
        treeMapProductos.put("tree-C3", carne3);
        treeMapProductos.put("tree-G1", gaseosa1);
        treeMapProductos.put("tree-G2", gaseosa2);
        treeMapProductos.put("tree-G3", gaseosa3);
        treeMapProductos.put("tree-A1", alcohol1);
        treeMapProductos.put("tree-A2", alcohol2);
        treeMapProductos.put("tree-A3", alcohol3);
        treeMapProductos.put("tree-MO1", monitor1);
        treeMapProductos.put("tree-MO2", monitor2);
        treeMapProductos.put("tree-MO3", monitor3);
        treeMapProductos.put("tree-M1", mouse1);
        treeMapProductos.put("tree-M2", mouse2);
        treeMapProductos.put("tree-M3", mouse3);
        treeMapProductos.put("tree-T1", teclado1);
        treeMapProductos.put("tree-T2", teclado2);
        treeMapProductos.put("tree-T3", teclado3);
        treeMapProductos.put("tree-PC1", pc1);
        treeMapProductos.put("tree-PC2", pc2);
        treeMapProductos.put("tree-PC3", pc3);
    }

    public static void main(String[] args) {
        asignarValores();
        UI frame = new UI();
        frame.setVisible(true);

    }

}
