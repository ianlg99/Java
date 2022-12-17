import java.util.Scanner;

public class Pokemon {
    private String nombrePokemon;
    public int vida;
    private int ataque;
    private int defensa;
    public String tipo;
    public Movimiento movimientos[] = new Movimiento[2];

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
		return this.vida;
	}

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setDefensa(int defensa){
        this.defensa = defensa;
    }

    public int getDefensa(){
        return this.defensa;
	}

    public String setTipo(String tipo){
        return tipo;
    }

    public void setMovimientos(){
        if(this.identificarTipo(this.apodo).equals("Agua")){
            this.movimientos[0] = "Tsunami";
            this.movimientos[1] = "Chorro Atomico";
        }else if(this.identificarTipo(this.apodo).equals("Fuego")){
            this.movimientos[0] = "Bolido";
            this.movimientos[1] = "Puño Cohete";
        }else if(this.identificarTipo(this.apodo).equals("Planta")){
            this.movimientos[0] = "Puas Venenosas";
            this.movimientos[1] = "Planta Carnivora";
        }else if(this.identificarTipo(this.apodo).equals("Electrico")){
            this.movimientos[0] = "Trueno Divino";
            this.movimientos[1] = "Descargas de rayo";
        }
    }

    public String getMovimiento(int opcion) {
        if (opcion == 0) {
            return this.movimientos[0];
        } else {
            return this.movimientos[1];   
        }
    }

    public void asignarValores(){
        this.setVida(aleatorio(200,300));
        this.setAtaque(aleatorio(100,150));
        this.setDefensa(aleatorio(50,200));
        this.setMovimientos();
    }

    public String identificarTipo(String apodo) {
        if(apodo.equals("Prinplup")){
            return "Agua";
        }else if(apodo.equals("Blastoise")){
            return "Agua";
        }else if(apodo.equals("Samurott")){
            return "Agua";
        }else if(apodo.equals("Charizard")){
            return "Fuego";
        }else if(apodo.equals("Rapidash")){
            return "Fuego";
        }else if(apodo.equals("Torkoal")){
            return "Fuego";
        }else if (apodo.equals("Tangela")){
            return "Planta";
        }else if (apodo.equals("Venusaur")){
            return "Planta";
        }else if (apodo.equals("Rillaboom")){
            return "Planta";
        }else if (apodo.equals("Raichu")){
            return "Electrico";
        }else if (apodo.equals("Zeraora")){
            return "Electrico";
        }else if (apodo.equals("Zapdos")){
            return "Electrico";
        }
        return "No registrado";
    }

    public double calcularMultiplicadorElemental(Pokemon oponente){
        if (this.tipo.equals("Agua")) {
            if (oponente.getTipo().equals("Fuego")) {
                return 2;
            }else if(oponente.getTipo().equals("Agua")||oponente.getTipo().equals("Planta")){
                return 0.5;
            }else{
                return 1;
            }
        }else if(this.tipo.equals("Fuego")){
            if (oponente.getTipo().equals("Planta")) {
                return 2;
            }else if(oponente.getTipo().equals("Agua")||oponente.getTipo().equals("Fuego")){
                return 0.5;
            }else{
                return 1;
            }            
        }else if(this.tipo.equals("Planta")){
            if (oponente.getTipo().equals("Agua")) {
                return 2;
            }else if(oponente.getTipo().equals("Fuego")||oponente.getTipo().equals("Planta")){
                return 0.5;
            }else{
                return 1;
            }
        }else if(this.tipo.equals("Electrico")){
            if (oponente.getTipo().equals("Agua")) {
                return 2;
            }else if(oponente.getTipo().equals("Planta")||oponente.getTipo().equals("Electrico")){
                return 0.5;
            }else{
                return 1;
            }
        }else{
            return -1;
        }
    }

    public void Informacion() {
    System.out.println("Tipo: "+this.tipo);
    System.out.println("Vida: "+this.vida);
    System.out.println("Ataque: "+this.ataque);
    System.out.println("Defensa: "+this.defensa);
    System.out.println("Ataques: "+this.movimientos[0]);
    System.out.println("         "+this.movimientos[1]);
    System.out.println();
    }

    public int atacar(Jugador oponente, int ataqueElegido){
        int daño;
        if( ataqueElegido == 0 ){
            daño = (int)( ( getAtaque() - oponente.getPeleador().getDefensa() )* calcularMultiplicadorElemental(oponente.getPeleador()) );
            if( getAtaque() - oponente.getPeleador().getDefensa() <= 0 ){
            }else if ( daño >= oponente.getPeleador().getVida() ) {
                oponente.getPeleador().setVida(0);
            }else{
                oponente.getPeleador().setVida( oponente.getPeleador().getVida() - daño );
            }
        }else{
            daño = getAtaque() - oponente.getPeleador().getDefensa();
            if( daño <= 0 ){
            }else if ( ( getAtaque() - oponente.getPeleador().getDefensa() ) >= oponente.getPeleador().getVida() ) {
                oponente.getPeleador().setVida(0);
                oponente.getPeleador().setEstado(false);
            }else{
                oponente.getPeleador().setVida( oponente.getPeleador().getVida() - daño );
            }
        }
        oponente.getPeleador().estaDebilitado();
        oponente.getPeleador().getVida();
        return daño;
    }
}