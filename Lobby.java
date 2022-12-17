import java.util.Scanner;

public class Lobby{
    public void menu(){
        System.out.println("\nEs un placer tenerte aqui de nuevo en las Batallas Pokémon. Bienvenido, elige una opcion :D\n");
        System.out.println("\n\t1. Iniciar una batalla");
        System.out.println("\n\t2. Salir");
    }

    public void pokemones(){
        System.out.println("\nTipos de pokemones");

        System.out.println("\n\tTipo agua");
        System.out.println("\n\t\tBlastoise");
        System.out.println("\n\t\tSamurott");
        System.out.println("\n\t\tPrinplup");

        System.out.println("\n\tTipo fuego");
        System.out.println("\n\t\tCharizard");
        System.out.println("\n\t\tRapidash");
        System.out.println("\n\t\tTorkoal");

        System.out.println("\n\tTipo planta");
        System.out.println("\n\t\tTangela");
        System.out.println("\n\t\tVenusaur");
        System.out.println("\n\t\tRillaboom");

        System.out.println("\n\tTipo electrico");
        System.out.println("\n\t\tRaichu");
        System.out.println("\n\t\tZeraora");
        System.out.println("\n\t\tZapdos");
    }

    public int OpcionesJuego(){
		int opcion = 1; 
		try {
			boolean exit = false;
			do{
				System.out.println(" Que deseas hacer?");
				System.out.println("\t1. Atacar.");
				System.out.println("\t2. Cambiar pokemon.");
				System.out.println("\t3. Rendirse.\n");
				System.out.printf("\tElige opcion:  ");
				opcion = scan.nextInt();
				if ( opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5 ) {
					exit = true;
				} else {
					System.out.println("\n\tOpcion no valida");
				}
			}while(!exit);
			return opcion;
		} catch (Exception e) {
			System.out.println("\n\tOpcion no valida, intenta con numeros");
		}
		return opcion;
	}
}