package drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;
    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    public int getDrugPower() {
        int power = 0;
        for (Component c : components) {
            power += c.getPower();
        }
        return power;
    }

    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        if (power > o.getDrugPower()) return 1;
        else if (power < o.getDrugPower()) return -1;
        else {
            return components.get(0).getName().compareTo(o.components.get(0).getName());
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return String.format(
                "класс: %s; комп-ты: %s, сила лекарства: %s\n",
                this.getClass().getSimpleName(), components, getDrugPower());
    }
}
