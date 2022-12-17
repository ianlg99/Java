public class Jugador{
    public String nombre;
    public Pokemon pokelista[]= new Pokemon[3];

    public Jugador(String nombre, Pokemon pokelista[]){
        this.nombre = nombre;
        this.pokelista = pokelista;
    }

    public void pokemonesEntrenador(){
        System.out.println("\n\nNombre: "+this.nombre);
        System.out.println("Primer Pokemon: "+this.listaPokes[0].apodo);
        System.out.println("Segundo Pokemon: "+this.listaPokes[1].apodo);
        System.out.println("Tercer Pokemon: "+this.listaPokes[2].apodo);
    }
}