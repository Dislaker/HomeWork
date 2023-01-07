public class Drum implements Instrument {

    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Игрет барабан с размером" + size);
    }
}
