/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica1_carmencastillo;

import java.util.Scanner;

/**
 *
 * @author casti
 */
public class PruebaPractica1_CarmenCastillo {

    static Scanner sc = new Scanner(System.in, "ISO-8859-1"); //ISO-8859-1 para que java pueda identificar palabras con tilde.
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadormenu = 0;
        boolean seguirmenu = true;
        while (seguirmenu) {
            System.out.println(" ");
            contadormenu++;
            System.out.println("-Menu Prinicipal-");
            System.out.println("1. Repetir mi nombre.");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir.");
            System.out.print("Ingrese su opcion: ");
            int opcionmenu = leer.nextInt();
            System.out.println("");

            switch (opcionmenu) {
                case 1:
                    System.out.println("Usted seleccionó la opción 1: [Repetir mi nombre]");
                    System.out.print("Cantidad de veces que se repetirá el texto: ");
                    int repeticion = leer.nextInt();
                    
                    for (int i = 0; i < repeticion; i++) {
                        System.out.println("¡Hola, mi nombre es Carmen Castillo y miren mi prueba!");
                    }
                    
                    break;
                    
                case 2:
                    System.out.println("Usted seleccionó la opción 2: [SubMenu de mensajes]");
                    boolean seguirsubmenu = true;
                    while (seguirsubmenu) {
                        System.out.println(" ");
                        System.out.println("-SubMenu de Mensajes-");
                        System.out.println("1. Bienvenida.");
                        System.out.println("2. Despedida.");
                        System.out.println("3. Salir.");
                        System.out.print("Ingrese su opcion: ");
                        int opcionsub = leer.nextInt();
                        System.out.println("");

                        switch (opcionsub) {
                            case 1:
                                System.out.println("Usted seleccionó la opción 1: [Bienvenida]");
                                System.out.println("¡Hola, bienvenido a la opcion 1 de SubMenu de Mensajes!");
                                break;
                                
                            case 2:
                                System.out.println("Usted seleccionó la opción 2: [Despedida]");
                                System.out.println("Hasta luego, gracias por usar mi programa.");
                                break;
                                
                            default:
                                seguirsubmenu = false;
                                break;
                    
                    
                        }
                        
                    }
                    
                    break;
                    
                default:
                    System.out.println("Usted seleccionó la opción 3: [Salir]");
                    System.out.println("Usted utilizó el Menu Principal " + contadormenu + " veces.");
                    System.out.println("Adiós, está fue mi prueba.");
                    seguirmenu = false;
                    
                    break;
                    
                    
            }

        }

    }

}
