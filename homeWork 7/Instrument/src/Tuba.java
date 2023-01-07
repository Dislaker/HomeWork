public class Tuba implements Instrument {

    private int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Игрет туба с диаметром" + diameter);
    }
}
