public class Guitar implements Instrument {

    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.println("Игрет гитара c " + numberOfStrings + " струнами ");
    }

}
