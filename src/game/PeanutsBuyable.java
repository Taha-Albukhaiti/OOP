package game;

public interface PeanutsBuyable extends Buyable {
    @Override
    default boolean hasPrice() {
        return Buyable.super.hasPrice() && price() < 50000000;
    }
}
