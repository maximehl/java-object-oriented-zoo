public class zoo {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

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
        if(food == this.favoriteFood){
            System.out.println("YUM! " + this.name + " wants more " + food);
        }else{
            this.sleep();
        }
    }
}