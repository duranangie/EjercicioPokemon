package ejerciciopokemon;



public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAñarazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque añarazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu mi ataque Punio Trueno");
    }

}
