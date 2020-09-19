package cpen221practice;

class DnDCharacter {
    private int score;//
    private int modifier;

    //every time this is called it will calculate the points for each one
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

    int modifier(int input) {
        //modifier takes constitution
        double constitution = (double) input;
        double remainder = (constitution - 10) % 2;

        double _modifier = (constitution - 10) / 2;

        if (_modifier > 0){
            remainder = -remainder;
        }

        modifier = (int) (_modifier + remainder/2);
        return modifier;
    }

    int getStrength() {
        int strengthScore;
        strengthScore = ability();//every time i call ability it will return that ability's score
        return strengthScore;
    }

    int getDexterity() {
        int dexterityScore;
        dexterityScore = ability();//every time i call ability it will return that ability's score
        return dexterityScore;
    }

    int getConstitution() {
        int constitutionScore;
        constitutionScore = ability();//every time i call ability it will return that ability's score
        return constitutionScore;
    }

    int getIntelligence() {
        int intelligenceScore;
        intelligenceScore = ability();//every time i call ability it will return that ability's score
        return intelligenceScore;
    }

    int getWisdom() {
        int wisdomScore;
        wisdomScore = ability();//every time i call ability it will return that ability's score
        return wisdomScore;
    }

    int getCharisma() {
        int charismaScore;
        charismaScore = ability();//every time i call ability it will return that ability's score
        return charismaScore;
    }

    int getHitpoints() {
        int hitPoints = 10;
        hitPoints = hitPoints + modifier;
        return hitPoints;
    }

}
