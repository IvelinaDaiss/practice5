package cpen221practice;

class DnDCharacter {
    private int score;
    private int modifier;
    private int constitution;
    private int[] scoreArray = new int[6];

    /**
     * Constructor calculates value for DnDCharacter's abilities
     */
    public DnDCharacter() {
        for (int i = 0; i < scoreArray.length; i++) {
           scoreArray[i] = ability();
        }
    }

    /**
     * Calculates ability score
     * @return the ability score
     */
    int ability() {
        int max = 5;
        int min = 1;
        int [] rolls = new int[4];
        int range= max - min + 1;
        for (int j = 0; j < 4; j++) {
                int rand = (int) (Math.random() * range) + min;
                rolls[j] = rand;
                System.out.println(rand);
        }
        int temp = rolls[0];
        int sum = rolls[0];
        for (int i = 1;i < rolls.length; i++) {
           if (rolls[i] < temp){
               temp = rolls[i];
           }
           sum = sum + rolls[i];
        }
        score = sum - temp;

        return score;
    }

    /**
     * Calculates constitution modifier for a DnDCharacter
     * @param input the character constitution
     * @return
     */
    int modifier(int input) {
        double constitution = (double) input;
        double remainder = (constitution - 10) % 2;

        double _modifier = (constitution - 10) / 2;

        if (_modifier > 0){
            remainder = -remainder;
        }
        modifier = (int) (_modifier + remainder/2);
        return modifier;
    }

    /**
     * Returns the strength score for a DnDCharacter
     * @return the score
     */
    int getStrength() {
        return scoreArray[0];
    }

    /**
     * Returns the dexterity score for a DnDCharacter
     * @return the score
     */
    int getDexterity() {
        return scoreArray[1];
    }

    /**
     * Returns the constitution score for a DnDCharacter
     * @return the score
     */
    int getConstitution() {
        return scoreArray[2];
    }

    /**
     * Returns the intelligence score for a DnDCharacter
     * @return the score
     */
    int getIntelligence() {
        return scoreArray[3];
    }

    /**
     * Returns the wisdom score for a DnDCharacter
     * @return the score
     */
    int getWisdom() {
        return scoreArray[4];
    }

    /**
     * Returns the charisma score for a DnDCharacter
     * @return the score
     */
    int getCharisma() {
        return scoreArray[5];
    }

    /**
     * Calculateds hit points for a DnDCharacter
     * @return the points
     */
    int getHitpoints() {
        int hitPoints = 10;
        hitPoints = hitPoints + modifier;
        return hitPoints;
    }

}
