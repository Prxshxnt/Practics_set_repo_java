package OOPs;

abstract class animals {
    abstract void sound();
}

class dog extends animals{
    void sound(){
        System.out.println("Dog: " + "Woof Woof");
    }
}
class cat extends animals{
    void  sound(){
        System.out.println("Cat: " + "Meow Meow");
    }
}
