import java.util.Objects;

public class Bay extends Thing implements Subjects{

    private String description;

    public Bay(String name) {
        super(name);
        this.addDescription(" на берегу которого видно город");
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
        if (!(object instanceof Bay)) return false;
        Bay bay = (Bay) object;
        return this.getDescription().equals(bay.getDescription());
    }
}
