package game;
@FunctionalInterface
public interface Buyable {
    int MAX_PRICE =10000000;

    double price();

    default boolean hasPrice(){
        return price() > 0;
    }
    default boolean hasPriceUeberKlassePriceUtilsPruefung(){
        return PriceUtils.hasPrice(this);}
    default double defaultPrice(double defaultPrice){
        return PriceUtils.defaultPrice(this, defaultPrice);
    }

    static boolean isValidPrice(double price){
        return price >= 0 && price <= MAX_PRICE;
    }

}
