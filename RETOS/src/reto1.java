import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in); 

        double gradosFahrenheit = 0; 
        double gradosKelvin = 0;
        double gradosCentigrados;


        System.out.println("es un programa para ayudar a la abuela a que prepare su torta ");
       
        gradosCentigrados=leer.nextDouble();

        System.out.println(" Grados que se muestran en el horno: Celsius "+gradosCentigrados+".}");
        
    
        gradosFahrenheit = (gradosCentigrados * 1.8) + 32;
        
        gradosKelvin = (gradosFahrenheit + 459.67) * 5/9;

        System.out.println(" Los grados Celsius en Fahrenheit es: "+gradosFahrenheit+" Y de grados Celsius a Kelvin es: "+gradosKelvin);
        
        gradosFahrenheit = gradosFahrenheit + 100;
        gradosKelvin = gradosKelvin + 100;

        System.out.println(" necesitarás estos grados para tu receta :");
        System.out.println(" Farenheit: "+gradosFahrenheit+" y Kelvin: "+gradosKelvin);
        

    leer.close();
 }
}
