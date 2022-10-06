package game;

import java.io.Serializable;

public abstract class GameObject implements Serializable {
    protected String name;

    protected GameObject(String name){
        this.name = name;
    }
    public abstract boolean useOn(GameObject object);
}
