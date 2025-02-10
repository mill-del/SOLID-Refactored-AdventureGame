package items;

public abstract class ItemManager {
    protected String name;

    public ItemManager(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

