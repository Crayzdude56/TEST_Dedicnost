public abstract class Zvire {
    private String jmeno;
    private int vek;
    private int hmotnost;

    public Zvire(String jmeno, int vek, int hmotnost) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.hmotnost = hmotnost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public int getVek() {
        return vek;
    }

    public String predstavSe1() {
        return "Jsem zvire jmenem"+ this.jmeno+ "je mi" + this.vek + "hmotnost " + this.hmotnost;
    }





