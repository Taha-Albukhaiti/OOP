package game;

import java.text.DecimalFormat;
class PriceUtils {
    static double calculateSum(Buyable price1, Buyable... prices) {
        DecimalFormat df = new DecimalFormat("###.#");
        double result = price1.price();
        for (Buyable price : prices) {
            result += price.price();
        }
        //Double d = Double.parseDouble(df.format(result));
        return result;
    }
    public static boolean hasPrice(Buyable buyable){
        return buyable.price() > 0;
    }

    public static double defaultPrice(Buyable b, double defaultPrice){
        if (b != null && b.price() > 0)
            return b.price();
        return defaultPrice;

    }
}
