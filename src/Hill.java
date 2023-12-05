import java.util.Objects;

public class Hill extends Thing implements Subjects{

    private String description;

    public Hill(String name) {
        super(name);
        this.addDescription("Cторона, где должен быть город. ");
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void addDescription(String string) {
        this.description = string;
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
        if (!(object instanceof Hill)) return false;
        Hill hill = (Hill) object;
        return this.getDescription().equals(hill.getDescription());
    }
}
