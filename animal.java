class Animal
{
    void eat()
    {
        System.out.println("Animal can eat");
    }
    void sleep()
    {
        System.out.println("Animal can sleep");
    }
}
class Bird extends Animal
{
    void eat()
    {
        System.out.println("Bird can eat");
    }
    void sleep()
    {
        System.out.println("Bird can sleep");
    }
    void fly()
    {
        System.out.println("Bird can fly");
    }
}
public class Main
{
    public static void main(String args[])
    {
        Animal a=new Animal();
        Bird b=new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}