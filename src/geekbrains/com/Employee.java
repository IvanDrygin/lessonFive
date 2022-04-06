package geekbrains.com;

public class Employee {

    private int age;
    private String fullName;
    private String position;
    private String mail;
    private int salary;


    public Employee (int age,String fullName,String position,String mail,int salary){
        this.age = age;
        this.fullName = fullName;
        this.position = position;
        this.mail = mail;
        this.salary = salary;




    }
    public int getAge() {
        return age;
    }
    public void print(){
        System.out.println("age:" + this.age);
        System.out.println("fullName:" +this.fullName);
        System.out.println("position:" +this.position);
        System.out.println("mail:" +this.mail);
        System.out.println("salary:" +this.salary);
        System.out.println();
        //Криво но должно работать
    }

    }





