package polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Передвигается по дроге.");

    }

    @Override
    public void passenger(int number) {
        System.out.println("Перевозит" + number + " пассажиров");

    }

    @Override
    public int fuel(int gas) {
        int cost = 2;
        return gas * cost;
    }
}
