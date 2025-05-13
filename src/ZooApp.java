import java.util.ArrayList;

public class ZooApp {
    public static void main(String[] args) {
        ArrayList<Zvire> zoo = new ArrayList<>();

        zoo.add(new Savec("Lev",5,50,"kratka"));
        zoo.add(new Savec("Pes",6,70,"husta"));
        zoo.add(new Plaz("Jesterka",2,1,true));
        zoo.add(new Plaz("Had",1,1,false));

        for (Zvire z : zoo) {
            System.out.println(z.predstavSe());
        }





    }
}