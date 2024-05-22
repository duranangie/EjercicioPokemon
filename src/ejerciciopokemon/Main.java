package ejerciciopokemon;

public class Main {

    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        
        
        charmander.atacarAñarazo();
        squirtle.atacarBurbuja();
        pikachu.atacarAñarazo();
        bulbasaur.atacarParalizar();

    }

}
