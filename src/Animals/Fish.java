package Animals;

public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth += howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " +
                    " и не могу плавать глубже 100 метров");
            currentDepth -= howDeep;
        } else {
            System.out.println("Погружаюсь ещё на " + howDeep +
                    " метров");
            System.out.println("Я на глубине " + currentDepth +
                    " метров");
        }
        return currentDepth;
    }
    public String say (String sayTo){
        return "Ты чё не знаешь, что рыбы не разговаривают?";

    }
}

