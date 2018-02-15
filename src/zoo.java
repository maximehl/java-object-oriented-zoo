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

class Tiger {
    String name;
    String favoriteFood;

    public Tiger(String name) {
        this.name = name;
        this.favoriteFood = "meat";
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

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }
}

class Bear{
    String name;
    String favoriteFood;

    public Bear(String name){
        this.name = name;
        this.favoriteFood = "fish";
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food == this.favoriteFood){
            System.out.println("YUM! " + this.name + " wants more " + food);
        }else{
            this.sleep();
        }
    }

    public void sleep() {
        System.out.println(this.name + " hibernates for 4 months");
    }
}