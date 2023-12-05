import java.util.Objects;

public class Shorty extends Thing implements Pesonages{

    private Jacket jacket;
    private String characteristics = this.name;

    public Shorty(String name) {
        super(name);
        this.jacket = new Jacket("Курточка");
    }

    public String getCharacteristics()
    {
        return characteristics;
    }

    @Override
    public void doAction(Action action) {
        if (action == Action.DESCRIBE)
        {
            this.addCharacteristic("коротышка");
            this.addCharacteristic("бережливый");
            this.addCharacteristic("не привыкший расставаться с тем, что попадается в руки");
            System.out.print(this.getCharacteristics() + ". ");
        }
        else if (action == Action.GET_SALT)
        {
            System.out.println(this.name + " натолок соли побольше и набил ею карманы " + jacket.name + ". ");
        }
        else if (action == Action.GET_DRESSED)
        {
            jacket.makeDry();
            System.out.print(this.name + " убедился, что одежда его просохла и оделся. ");
        }
        else throw new Error(action + " нельзя совершить над объектом " + name);
    }

    @Override
    public void doAction(Action action, Object object) {
        if (action == Action.GO_TO_HILL)
        {
            if (!(object instanceof Hill)) throw new Error(action + " нельзя совершить над этим объектом ");
            Hill hill = (Hill) object;
            System.out.println(this.name + " зашагал вдоль холма. " + hill.getDescription());
        } else if (action == Action.CAME_TO_BAY)
        {
            if (!(object instanceof Bay)) throw new Error(action + " нельзя совершить над этим объектом ");
            Bay bay = (Bay) object;
            System.out.println(this.name + " дошел до края холмов. Здесь море образует залив" + bay.getDescription()+ ". ");
        } else if (action == Action.LOOK_AROUND)
        {
            if (!(object instanceof LosPoganos)) throw new Error(action + " нельзя совершить над этим объектом ");
            LosPoganos losPoganos = (LosPoganos) object;
            System.out.println("Отсюда видно город Лос Поганос " + losPoganos.getDescription() + ". ");
        }
        else throw new Error(action + " нельзя совершить над объектом " + name);
    }

    @Override
    public void addCharacteristic(String characteristic) {
        this.characteristics += " " + characteristic;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(characteristics);
    }

    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Shorty)) return false;
        Shorty shorty = (Shorty) object;
        return this.getCharacteristics().equals(shorty.getCharacteristics());
    }
}
