import java.util.Objects;

public class LosPoganos extends Thing implements Subjects{

    private String description;

    public LosPoganos(String name) {
        super(name);
        this.addDescription("куда съезжались богачи из всех других городов, так как здесь был отличнейший климат и можно было прекрасно повеселиться");
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
        if (!(object instanceof LosPoganos)) return false;
        LosPoganos losPoganos = (LosPoganos) object;
        return this.getDescription().equals(losPoganos.getDescription());
    }
}
