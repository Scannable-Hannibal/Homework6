import java.sql.SQLOutput;
import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        CultivatedBanana b1 = new CultivatedBanana(0.25, 4, "Cavendish", 0.9);
        CultivatedBanana b2 = new CultivatedBanana(0.15, 5, "Red Banana", 0.95);
        CultivatedBanana b3 = new CultivatedBanana(0.18, 7,"Lady Finger Banana",1.2 );

        WildBanana wb1 = new WildBanana(0.2, 5, "Pisang Raja", 1.5, 45);
        WildBanana wb2 = new WildBanana(0.3, 6, "Gujarat", 2.0, 36);
        WildBanana wb3 = new WildBanana(0.233, 7, "Poovan", 1.7, 30);
        WildBanana wb4 = new WildBanana(0.112, 8, "Rasthali", 1.1, 25);
        WildBanana wb5 = new WildBanana(0.4, 4, "Nendran", 1.4, 40);
        WildBanana wb6 = new WildBanana(0.153, 5, "Pisang Awak", 1.7, 20);
        WildBanana wb7 = new WildBanana(0.254, 3, "Monthan", 1.8, 38);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(wb1);
        System.out.println(wb2);
        System.out.println(wb3);
        System.out.println(wb4);
        System.out.println(wb5);
        System.out.println(wb6);
        System.out.println(wb7);
    }
}
