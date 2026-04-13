interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
}

class duck implements Flyable, Swimable{
    public void fly(){
        System.out.println("it flyes");
    }
    public void swim(){
        System.out.println("it swims");
    }
}

public class q7 {
    public static void main(String[] args) {
        duck d1 = new duck();
        d1.fly();
        d1.swim();
    }
    
}
