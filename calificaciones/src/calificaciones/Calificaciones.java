package calificaciones;
import java.util.*;
public class Calificaciones {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int cantidadAlumnos;
        int[] calificaciones, rangos = new int[10];
        
        System.out.println("Cantidad de alumnos: ");
        cantidadAlumnos = input.nextInt();
        
        calificaciones = new int[cantidadAlumnos];
        
        
        System.out.println("\n\nCaptura: \n\n");
        
        for(int i=0; i < calificaciones.length; i++)
        {
            System.out.println("Calificaciones del alumno " + (i+1) + ": ");
            calificaciones[i] = input.nextInt();
        }
        
        for(int i = 0; i < calificaciones.length; i++)
        {
            if(calificaciones[i] >= 0 && calificaciones[i] < 10)
            {
                rangos[0]++;
            }
            
            if(calificaciones[i] >= 10 && calificaciones[i] < 20)
            {
                rangos[1]++;
            }
            
            if(calificaciones[i] >= 20 && calificaciones[i] < 30)
            {
                rangos[2]++;
            }
            
            if(calificaciones[i] >= 30 && calificaciones[i] < 40)
            {
                rangos[3]++;
            }
            
            if(calificaciones[i] >= 40 && calificaciones[i] < 50)
            {
                rangos[4]++;
            }
            
            if(calificaciones[i] >= 50 && calificaciones[i] < 60)
            {
                rangos[5]++;
            }
            
            if(calificaciones[i] >= 60 && calificaciones[i] < 70)
            {
                rangos[6]++;
            }
            
            if(calificaciones[i] >= 70 && calificaciones[i] < 80)
            {
                rangos[7]++;
            }
            
            if(calificaciones[i] >= 80 && calificaciones[i] < 90)
            {
                rangos[8]++;
            }
            
            if(calificaciones[i] >= 90 && calificaciones[i] <= 100)
            {
                rangos[9]++;
            }
        }
        
        
        System.out.println("\n\nDistribución:");
        
        
        for(int i=0; i<rangos.length; i++){
            
            for(int j = 0; j < rangos[i]; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
    }
    
}
