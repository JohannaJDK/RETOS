import java.util.Scanner;
 import java.util.Random;

 //(CICLOS)
public class reto6 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Random azar = new Random();

        int num;
        int respuesta;
        int n;


        System.out.println("Cuantas palabras quieres adivinar, maximo 5");
        n=leer.nextInt();

    
        int i=0;
        while(i<n){

    
        num = azar.nextInt(5) + 1; //número aleatorio del 1 al 5

        if(num==1){

            System.out.println("Es blanco,tiene un manurio, y se utiliza en el mar, que es? ");
            System.out.println("1.Barco /n 2.Cine /n 3.Cuaderno /n 4.Ventana /n 5.plancha ");
            respuesta=leer.nextInt();
            if(respuesta==1){
                System.out.println("Correcto el objeto es un barco");
            }
            if(respuesta!=1){
                System.out.println("Respuesta incorrecta");
            }

        }
        else if(num==2){
            System.out.println("tiene una pantalla, tine sillas, el lugar es grande, que es?");
            System.out.println("1.Barco /n 2.Cine /n 3.Cuaderno /n 4.Ventana /n 5.plancha ");
            respuesta=leer.nextInt();
            if(respuesta==2){
                System.out.println("Correcto el objeto es Cine");
            }
            if(respuesta!=2){
                System.out.println("Respuesta incorrecta");
            }
        }
        else if(num==3){
            System.out.println("Es para escribir, Tiene hojas , lo usan los estudiantes, que es?");
            System.out.println("1.Cicla /n 2.Computador /n 3.Cuaderno /n 4.Ventana /n 5.plancha ");
            respuesta=leer.nextInt();
            if(respuesta==3){
                System.out.println("Correcto el objeto es un Cuaderno");
            }
            if(respuesta!=3){
                System.out.println("Respuesta incorrecta");
            }
        }

        else if(num==4){
            System.out.println("tiene vidrio, se pone en la pared, es de hierro, se abre y se cierra, que es?");
            System.out.println("1.Barco /n 2.Cine /n 3.cuaderno /n 4.ventana /n 5.plancha");
            respuesta=leer.nextInt();
            if(respuesta==4){
                System.out.println("Correcto el objeto es una ventana ");
            }
            if(respuesta!=4){
                System.out.println("Respuesta incorrecta");
            }
        }
        else if(num==5){
            System.out.println("Se conecta, es caliente, se puede poner temperatura, se usa para el cabello,que es? ");
            System.out.println("1.Banco /n 2.Cine /n 3.Cuaderno /n 4.Ventana /n 5.plancha ");
            respuesta=leer.nextInt();
            if(respuesta==5){
                System.out.println("Correcto el objeto es una plancha");
            }
            if(respuesta!=5){
                System.out.println("Respuesta incorrecta");
            }
        }
        i++;
    }
    
    leer.close();
    }
   
}
