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
    }

    /*
    //not using this code anymore because I now have a Tiger class

    public static void main(String[] args) {
        zoo z = new zoo();
        z.sleep("Tigger");
        z.eat("Tigger", "meat");
        z.eat("Tigger", "bacon");
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }
    String favoriteFood = "bacon";
    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }*/
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

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
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