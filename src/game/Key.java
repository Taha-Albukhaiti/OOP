package game;

public class Key extends GameObject{
    int id;

    protected Key(String name) {
        super(name);
    }

    @Override
    public boolean useOn(GameObject object) {
        if (object instanceof Door)
            if (id == ((Door) object).id)
                return ((Door) object).isOpen = true;
        return false;
    }
}
