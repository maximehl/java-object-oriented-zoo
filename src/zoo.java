import java.util.ArrayList;

public class zoo {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tigger); animals.add(pooh); animals.add(rarity); animals.add(gemma); animals.add(stinger);
        zoebot.feedAnimals(animals, "the mysterious vapours of the universe");
    }
}

class Tiger extends Animal {

    public Tiger(String name) {
        super(name, "meat");
    }

}

class Bear extends Animal{

    public Bear(String name){
        super(name, "fish");
    }

    public void sleep() {
        System.out.println(this.name + " hibernates for 4 months");
    }
}

class Animal{
    String name;
    String favoriteFood;
    static int population;

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        Animal.population++;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }else{
            this.sleep();
        }
    }

    public static int populationCount(){
        return population;
    }
}

class Unicorn extends Animal{

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps in a cloud");
    }
}

class Giraffe extends Animal{

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food){
        if(food.equals(this.favoriteFood)){
            super.eat(food);
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }

    public void sleep() {
        System.out.println(this.name + " hibernates for 4 months");
    }
}

class Bee extends Animal{

    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food){
        if(food.equals(this.favoriteFood)){
            super.eat(food);
            this.sleep();
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }

    public void sleep() {
        System.out.println(this.name + " never sleeps");
    }
}

class Zookeeper{
    String name;
    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.println(this.name + " is feeding " + food + " to " + animals.size() + " of " +
                Animal.populationCount() + " total animals");
        for (int n = 0; n<animals.size(); n++) {
            animals.get(n).eat(food);
        }
    }
}