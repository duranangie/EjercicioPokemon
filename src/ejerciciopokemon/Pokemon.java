package ejerciciopokemon;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();

    protected abstract void atacarAñarazo();

    protected abstract void atacarMordisco();

}
