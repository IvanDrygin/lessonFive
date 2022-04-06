package geekbrains.com;

public class Main {


    public static void main(String[] args) {


        base();

    }

    private static void base() {
        Employee base[] = new Employee[5];
        base [0] = new Employee(24,"Иван", "engeenier", "Support@gmail.ru", 54000);
        base [1] = new Employee(43,"Григорий", "engeenier", "Support@gmail.ru", 64000);
        base [2] = new Employee(20,"Антон", "engeenier", "Support@gmail.ru", 44000);
        base [3] = new Employee(48,"Евгений", "engeenier", "Support@gmail.ru", 34000);
        base [4] = new Employee(34,"Николай", "engeenier", "Support@gmail.ru", 24000);

        for (int i = 0; i < base.length; i++) {
            if (base[i].getAge()>40)
                base[i].print();

            }

        }
    }




