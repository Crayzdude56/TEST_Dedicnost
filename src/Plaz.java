public class Plaz extends Zvire{
    private boolean Supiny;
    public Plaz(String jmeno, int vek, int hmotnost, boolean Supiny) {
        super(jmeno, vek, hmotnost);
        this.Supiny = true;
    }

    @Override
    public String predstavSe() {
        System.out.println("Jsem plaz a mam supiny" + predstavSe1());

        return null;
    }

}
