package es.upm.etsisi.tema1;
import es.upm.etsisi.tema1.Coche;
import es.upm.etsisi.tema1.Game;

import java.util.HashSet;
import java.util.Set;

import static es.upm.etsisi.tema1.Difficulty.HARD;

public class App {
    public static void main(String[] args){
        Game currentGame = new Game("Pandora", HARD);
        Game save1 = currentGame.save();

        System.out.println("Save 1: "+ save1.toString());
        System.out.println("Current game: "+ currentGame.toString());
        System.out.println("Comparison using == : " + (currentGame == save1));
        System.out.println("Comparison using .equals(): " + currentGame.equals(save1));

        currentGame.setLevel(1); currentGame.setPoints(20);
        Game save2 = currentGame.save();
        System.out.println("Save 2: "+ save2.toString());
        System.out.println("Comparison using == : " + (currentGame == save2));
        System.out.println("Comparison using .equals(): " + currentGame.equals(save2));
        System.out.println("Comparison between saves using .equals(): " + save1.equals(save2));

        Set<Game> gameList = new HashSet<>();
        gameList.add(save1); gameList.add(save2); gameList.add(currentGame);
        System.out.println("Size: "+ gameList.size()); //una lista de tipo Set evita duplicados
    }
}
