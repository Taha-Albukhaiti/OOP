package game;

import java.util.Arrays;

public class MainDemo {
    public static void main(String[] args) {

        Magazine spiegel = new Magazine("Spieefle", 3500000);
        Magazine madMag = new Magazine("Mad Magazine", 2.50);
        Magazine maxim = new Magazine("Maxim", 3.00);
        Magazine neon = new Magazine("Neon", 3.00);
        Magazine ct = new Magazine("c't", 3.30);
        System.out.printf("%.2f", PriceUtils.calculateSum(spiegel, madMag, ct));
        System.out.println();
        System.out.println(spiegel.compareTo(ct));
        System.out.println(ct.compareTo(spiegel));
        System.out.println(maxim.compareTo(neon));

        Magazine[] magazines = {spiegel, madMag,maxim,neon,ct};
        Arrays.sort(magazines);
        System.out.println(Arrays.toString(magazines));
        System.out.println();
        System.out.println(Buyable.isValidPrice(spiegel.price()));


    }
}
