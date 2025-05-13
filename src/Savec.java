public class Savec extends Zvire {
    private String typSrsti;

    public Savec(String jmeno,int vek,int hmotnost,String typSrsti) {
        super(jmeno, vek, hmotnost);
        this.typSrsti = typSrsti;

    }
     @Override
    public String predstavSe() {
        System.out.println("Jsem savec a moje srst je "+typSrsti+ predstavSe1());

         return null;
     }

}
