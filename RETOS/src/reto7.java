import java.util.Scanner;
//ciclo
public class reto7 {
    public static void main(String[] args) {

    Scanner leer=new Scanner(System.in);

    int personas;
    int edad;
    int telefono;
    int  n;
    String nombre;
    String direccion;
    String correo;
    String eps;

    

    System.out.println("Cuantas pesonas que seran registradas");
    n=leer.nextInt();


    int i=1;
    while(i<n){
    
    System.out.println("número personas"+i);

    System.out.println("Nombres y apellidos");
    nombre=leer.next();

    System.out.println("Edad");
    edad=leer.nextInt();

    System.out.println("Correo");
    correo=leer.next();

    System.out.println("Telefono");
    telefono=leer.nextInt();

    System.out.println("Dirección");
    direccion=leer.next();

    System.out.println("Eps");
    eps=leer.next();

    System.out.println("ENVIAR");

    i++;
    }

    leer.close();
    }
}