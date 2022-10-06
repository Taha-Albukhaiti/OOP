package game;

public class Door extends GameObject{
    int id;
    boolean isOpen;

    protected Door(String name) {
        super(name);
    }

    @Override
    public boolean useOn(GameObject object) {
        return false;
    }
}
