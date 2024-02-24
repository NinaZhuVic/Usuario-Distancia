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
        
        for (int i=0; i<=arrayDias.length; i++)
        {
            if( i == num)
            {
                System.out.print(arrayDias[i+1]);
            }
        }
        
        
    }
}
