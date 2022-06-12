public class Inheritance{
    public static void main(String[] args){
    
    Cat cat1 = new Cat();
    cat1.name = "vanshika";
    cat1.eat();
    cat1.walk();

    }
}


class Animal{
    String name;
    int legs;

    public void eat(){
        System.out.println(this.name+" is eating...");
    }
}

class Cat extends Animal{

public void walk(){
    System.out.println(this.name+" is walking...");
}
}