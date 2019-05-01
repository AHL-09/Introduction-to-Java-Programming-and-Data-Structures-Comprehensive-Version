abstract class Animal {
    public abstract String howToEat();

    public static void eat(Animal animal){
        System.out.println(animal.howToEat());
    }

    public static void main(String[] args) {
        Animal animal = new Chicken();
        eat(animal);
    }

}


