package geekbrains.com;

public class Home {

    public int  weight;
    public int height;
    public int length;
    public Door door;

    public Home(){
        weight = 5;
        height =12;
        length = 7;
        door = new Door();
    }

    public Home(int weight, int height, int length){

        this.weight = weight;
        this.height = height;
        this.length = length;
        door = new Door();
    }

}
