package ejerciciopokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAñarazo() {
        System.out.println("Hola soy charmander y este es mi ataque añarazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy charmander y este es mi ataque mordisco");

    }

    @Override
    public void atacarPuntoFuego() {
        System.out.println("Hola soy charmander mi ataque punto fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy charmander mi ataque Ascuas");
    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("Hola soy charmander mi ataque lanza LLamas");
    }

}
