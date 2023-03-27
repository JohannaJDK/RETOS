import java.util.Scanner;
import java.util.Random;
//ciclos

public class reto5 {
    private static int TiroJugador = 0;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        String Player;
        int EdadPlayer;
        int TiroMaquina = random.nextInt(3) + 1;
        
        System.out.println("Creado para jugar piedra, papel o tijera");
        System.out.println(" Digite su nombre ");
        Player =leer.nextLine();
        System.out.println(Player+" Digite su edad: ");
        EdadPlayer = leer.nextInt();

        int i=0;
        int n=3;
        while(i<n){

        if (EdadPlayer >= 18 && EdadPlayer <= 100) {
            System.out.println("A jugar!! \n1.Piedra. \n2.Papel. \n3.Tijera.");
            TiroJugador = leer.nextInt();

            switch (TiroJugador) {
                case 1:
                    if (TiroMaquina == 1) {
                        System.out.println("lanzaste Piedra, yo escogi Piedra empate.");
                    } else if (TiroMaquina == 2) {
                        System.out.println("lanzaste Piedra, yo escogi Papel Gane!!");
                    } else if (TiroMaquina == 3) {
                        System.out.println("lanzaste Piedra, yo escogi Tijera ganaste");
                    }
                    break;
                case 2:
                    if (TiroMaquina == 1) {
                        System.out.println(" Escogiste Papel, yo escogi Piedra.");
                    } else if (TiroMaquina == 2) {
                        System.out.println("Escogiste Papel, yo escogi Papel empate.");
                    } else if (TiroMaquina == 3) {
                        System.out.println("Escogiste Papel, yo escogi Tijera Gane.");
                    }
                    break;
                case 3:
                    if (TiroMaquina == 1) {
                        System.out.println("Lanzaste Tijera, yo escogi Piedra Gane!!");
                    } else if (TiroMaquina == 2) {
                        System.out.println("lanzaste Tijera, yo escogi Papel ganaste!");
                    } else if (TiroMaquina == 3) {
                        System.out.println("lanzaste Tijera, yo escogi Tijera empate!");
                    }
                    break;
            
                default:
                    System.out.println("Invalido");
                    break;
            }
                        
            System.out.println(" mi tiro fue "+TiroMaquina);

        } else {
            System.out.println("No puedes jugar");
        }
        i++;
    }
        leer.close();
    }

    }

