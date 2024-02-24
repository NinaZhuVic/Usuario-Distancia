package com.mycompany.pruebaproyectogit;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class PruebaProyectoGit {

    public static void main(String[] args) 
    {
        //Creación de Array de días según mes del año.
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();
        
        int arrayDias [] = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String nombreMes[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        for (int i=0; i<=arrayDias.length; i++)
        {
            i = num;
            System.out.print("El mes "+nombreMes[i]+" tiene "+arrayDias[i]);
            System.out.print("");
            break;
            
        }
        
        
    }
}
