public class Car {
    String color;
    int speed;
    float weight;
    Car(String color,int speed, float weight){
        this.color = color;
        this.speed =speed;
        this.weight = weight;
    }
}

class Bmw extends Car implements I1{
    Bmw(String color,int speed, float weight){
        super(color,speed,weight);
        this.color = color;
        this.speed =speed;
        this.weight = weight;

    }
    public void engine(){
        System.out.println("Dviżok rychit");
    }

    public static void main(String[] args) {
        Bmw c1 = new Bmw("red",500, 5432f);
        c1.engine();
    }
}
interface I1{
    void engine();
}