package ejerciciopokemon;



public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAñarazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Añarazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy bulbasaur mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy bulbasaur mi ataque paralizar");
    }

}
