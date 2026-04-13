class person{
    String name;
    int age;

    person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age);
    }
}
class employee extends person{
    String employeeID;
    int salary;
    

    employee(String employeeID, String name, int age, int salary){
        super(name,age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void display(){
         System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age); 
        System.out.println("emplayee id = "+this.employeeID);
        System.out.println("Salary = "+this.salary);
    }
    
}

public class q9 {
    public static void main(String[] args) {
        person p1 = new person("kritan", 20);
        person p2 = new person("ram",30);
        employee e1 = new employee("er23", "hari", 32, 3200);
        employee e2 = new employee("hari123","hari" , 43, 5000);
        p1.display();
        p2.display();
        e1.display();
        e2.display();
    }
    
}
