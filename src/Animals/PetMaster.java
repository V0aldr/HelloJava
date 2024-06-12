package Animals;

public class PetMaster {
    public static void main (String[] args){
        String petReaction;
        Pet sparrow = new Pet();
        petReaction = sparrow.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        sparrow.eat();
        sparrow.sleep();
        System.out.println("Fish");
        Fish Nemo = new Fish();
        System.out.println(Nemo.say("Бульк"));
    }
}
