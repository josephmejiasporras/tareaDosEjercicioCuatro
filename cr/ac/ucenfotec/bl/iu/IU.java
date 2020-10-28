/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl.iu;

import java.util.Scanner;

public class IU {

    private static final Scanner input = new Scanner(System.in);

    public static int showMainMenu() {

        System.out.println("\n***Menu Principal***\nEliga 1 para estadías\n"
                + "Eliga 2 para citas\n"
                + "Eliga 3 para salir\n");
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex) {
            return 4;
        }
    }

    public static void print(String toPrint) {
        System.out.println(toPrint);
    }

    public static String readString() {
        return input.nextLine();
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    public static int showMenuEstadias() {
        System.out.println("\n***Menu de Estadias***\nEliga 1 para reservaciones\n"
                + "Eliga 2 para entrada\n"
                + "Eliga 3 para salida\n"
                + "Eliga 4 para volver al menu\n"
                + "Eliga 5 para salir\n");
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex) {
            return 6;
        }
    }

}
