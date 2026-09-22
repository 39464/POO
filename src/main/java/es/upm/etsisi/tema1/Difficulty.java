package es.upm.etsisi.tema1;

public enum Difficulty {
    EASY(10), MEDIUM(100), HARD(200);
    private Integer multiplier;

    Difficulty(Integer multiplier){
        this.multiplier = multiplier;
    }

    //permite lógica añadida por categoría
}
