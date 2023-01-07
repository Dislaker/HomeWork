public class Main {
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(7);
        instruments[1] = new Drum(50);
        instruments[2] = new Tuba(20);

        for (Instrument playingInstuments : instruments) {
            playingInstuments.play();
        }
    }
}
