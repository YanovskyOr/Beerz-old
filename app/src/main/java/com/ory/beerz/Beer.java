package com.ory.beerz;

/**
 * Created by OrY on 24/10/2016.
 */

public class Beer {

    String name;
    Integer color;
    int bitternessLevel;
    int alcoholPrecentage;
    int ownScore;
    String lastAmount;
    float lastCost;

    /**
     * Constractor for Beer
     *
     * @param name name of the beer
     * @param color color of the beer, determined by user selection
     * @param bitternessLevel bitterness level of beer, determined by user slider
     * @param alcoholPrecentage alcohol precentage of beer, determinded by user slider
     * @param ownScore users own score for the beer, determined by slider
     * @param lastAmount last amout the user bought, determined by user input
     * @param lastCost last price for beer of last amount bought, determined by user input
     */
    public Beer(String name, Integer color, int bitternessLevel, int alcoholPrecentage,
                int ownScore, String lastAmount, float lastCost) {
        this.name = name;
        this.color = color;
        this.bitternessLevel = bitternessLevel;
        this.alcoholPrecentage = alcoholPrecentage;
        this.ownScore = ownScore;
        this.lastAmount = lastAmount;
        this.lastCost = lastCost;
    }

    @Override
    public int hashCode() {
        int hash = (int)(name.hashCode() + color +  bitternessLevel + alcoholPrecentage + ownScore + lastAmount.hashCode() + lastCost);
        return hash;
    }
}
