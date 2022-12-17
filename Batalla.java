public class Batalla(){
    Jugador jugador1 = null;
    Jugador jugador2 = null;

    public Batlla(Jugador jugador1, Jugador jugador2) throws IOException{
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void inicio() throws InterruptedException, IOException{
        System.out.println("\n\t\tEmpieza la batalla");
        int turno = (int)(Math.random() * 2);

        if (turno==0){
            this.reporte.reportarTurnoInicial(jugador1);
        }
        else{
            this.reporte.reportarTurnoInicial(jugador2);
        }
    }

    public void Turno(int jugador) throws InterruptedException, IOException{
        if (jugador == 0){
            this.jugador1.mostrarPokemon();
            Thread.sleep(2000);
        } 
        else{
            this.jugador2.mostrarPokemon();
            Thread.sleep(2000);
        }
        int opcion = menu.mostrarOpcionesTurno();
        ejecutarEleccion(jugador, opcion);
        Thread.sleep(2000);
    }
}