/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Info de la finca
        System.out.println("Ingrese la informacion de la finca:");
        System.out.print("Nombre: ");
        String nombreFinca = scanner.nextLine();
        System.out.print("Ubicacion: ");
        String ubicacionFinca = scanner.nextLine();
        System.out.print("Nombre del encargado: ");
        String nombreEncargado = scanner.nextLine();
        System.out.print("Cedula del encargado: ");
        String cedulaEncargado = scanner.nextLine();
        System.out.print("Telefono del encargado: ");
        String telefonoEncargado = scanner.nextLine();
        System.out.print("Cantidad de potreros: ");
        int cantidadPotreros = Integer.parseInt(scanner.nextLine());
        System.out.print("Tamano total: ");
        double tamanoTotal = Double.parseDouble(scanner.nextLine());
        System.out.print("Cantidad total de animales: ");
        int cantidadTotalAnimales = Integer.parseInt(scanner.nextLine());

        Finca finca = new Finca(nombreFinca, ubicacionFinca, nombreEncargado, cedulaEncargado,
                telefonoEncargado, cantidadPotreros, tamanoTotal, cantidadTotalAnimales);

        // Info de los potreros
        for (int i = 1; i <= cantidadPotreros; i++) {
            System.out.println("\nIngrese la informacion del potrero " + i + ":");
          
        }

        
        scanner.close();
    }
}