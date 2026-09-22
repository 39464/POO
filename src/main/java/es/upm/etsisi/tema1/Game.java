package es.upm.etsisi.tema1;

import java.util.Objects;

public class Game implements Cloneable{
    private final String player;
    private Integer level;
    private Integer points;
    private Integer hearts;
    private Difficulty difficulty;

    public String getPlayer(){ return this.player; }
    public int getLevel() { return this.level; }
    public int getPoints() { return this.points; }
    public int getHearts() { return this.hearts; }

    //no tengo setJugador porque quiero que cada partida tenga uno solo
    public void setLevel(int level) { this.level = level; }
    public void setPoints(int points) { this.points = points; }
    public void setHearts(int hearts) { this.hearts = hearts; }

    public Game(String myPlayer, Difficulty chosenDifficulty){
        this.player = myPlayer;
        this.level = 0;
        this.points = 0;
        this.hearts = 10; //default values
        this.difficulty = chosenDifficulty;
    }

    public Game save(){
        try {
            return (Game) this.clone(); //cast expression to Game
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return (this.getPlayer()+ ", Level "+ this.getLevel()
                +", "+ this.getPoints()+ " Points, "+this.getHearts()+ " Hearts");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Game compGame = (Game) obj;
        if(!this.getPlayer().equals(compGame.getPlayer())) return false;
        if(this.getLevel() != compGame.getLevel()) return false;
        if(this.getPoints() != compGame.getPoints()) return false;
        return this.getHearts() == compGame.getHearts();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.player, this.level, this.points, this.hearts);
    } //devuelve un código único para cada elemento
}
