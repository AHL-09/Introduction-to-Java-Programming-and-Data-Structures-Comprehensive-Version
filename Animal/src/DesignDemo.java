public class DesignDemo {

    interface Edible{
        public String howToEat();
    }
    public static void eat(Edible stuff){
        System.out.println(stuff.howToEat());
    }

    public static void main(String[] args) {
        Edible stuff = new Chicken();
        eat(stuff);

        stuff = new Duck();
        eat(stuff);

        stuff =new Broccoli();
        eat(stuff);
    }

}
