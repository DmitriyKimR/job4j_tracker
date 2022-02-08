package polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {

    }

    @Override
    public void passenger(int number) {

    }

    @Override
    public int fuel(int gas) {
        int cost = 2;
        return gas * cost;
    }
}
