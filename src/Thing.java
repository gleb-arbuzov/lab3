public abstract class Thing
{
    public final String name;

    public Thing(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

    public abstract void doAction(Action action);
}
