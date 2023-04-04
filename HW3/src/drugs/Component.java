package drugs;

import java.util.Objects;

public class Component {
    private String name;
    private double weight;
    private int power;

    public Component(String name, Double weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("{%s: weight = %f, power = %d}",
                name, weight, power);
    }

    @Override
    public boolean equals(Object obj) {
        // сравнивает текущий экземпляр объекта this с переданным объектом obj.
        // Если это один и тот же объект, то equals() вернёт true.
        if (this == obj) {
            return true;
        }

        // если переданный объект - null, или он другого типа, то equals() вернёт false.
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Если два объекта имеют одинаковые значения полей, то equals() вернёт true.
        // Сравниваем поля начиная с численных (т.к. они проверяются быстрее)
        Component component = (Component) obj;
        return power == component.power &&
                weight == component.weight &&
                name.equals(component.name);
    }

    /**
     * Уникальный идентификатор, который генерируется hashCode(), упрощает процедуру сравнения состояния объектов.
     * Если идентификаторы отличаются, equals() можно не запускать.
     * Если идентификаторы одинаковые, нужно выполнить equals() и проверить свойства объектов.
     * (Когда метод equals() возвращает true, это означает, что объекты равны во всех значениях и атрибутах.
     * В этом случае сравнение хэш-кода также должно быть истинным).
     * В определении хэш-значения должны принимать участие только те поля, которые используются в equals().
     * Кроме того, нужна база — основа для вычисления хэша. Обычно базой делают число 31 (математически это число
     * обеспечивает уменьшение вероятности возникновения коллизии - ситуации, когда у разных объектов будет
     * одинаковый hash)
     * Начиная с Java 7 доступен вспомогательный метод, который производит вычисление хэша:
     * Objects.hash(параметр 1, параметр 2 ....)
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, weight, power);
    }
}
