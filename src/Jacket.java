import java.util.Objects;

public class Jacket extends Thing implements Subjects{

    private boolean isDry = false;
    private String description;

    public Jacket(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void addDescription(String string) {
        this.description += ", " + string;
    }

    public void makeDry()
    {
        this.isDry = true;
    }
    public boolean isDry()
    {
        return this.isDry;
    }

    @Override
    public void doAction(Action action) {
        throw new Error(action + " нельзя совершить над объектом " + name);
    }

     @Override
    public int hashCode()
    {
        return Objects.hashCode(description);
    }
    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Jacket)) return false;
        Jacket jacket = (Jacket) object;
        return this.getDescription().equals(jacket.getDescription());
    }
}
