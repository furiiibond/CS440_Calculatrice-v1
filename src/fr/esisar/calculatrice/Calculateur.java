package fr.esisar.calculatrice;

public class Calculateur {

    //main
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        System.out.println("addition 1+2 = " + calc.ajouter(1, 2));
        System.out.println("soustraction 1-2 = " + calc.soustraire(1, 2));
        System.out.println("multiplication 1*2 = " + calc.multiplier(1, 2));
        System.out.println("division 1/2 = " + calc.diviser(1, 2));
    }

}
