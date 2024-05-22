package ejerciciopokemon;



public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");

    }

    @Override
    protected void atacarAñarazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque añarazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle mi ataque Hidrobomba");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("Hola soy Squirtle mi ataque pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle mi ataque Burbuja");
    }

}
