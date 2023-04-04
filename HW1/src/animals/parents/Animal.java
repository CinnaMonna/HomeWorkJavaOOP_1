package animals.parents;

public class Animal {
    private String name;
    private String color;
    private int pawsCount;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", this.name, this.color);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void speak() {
        System.out.println("I can speak!");
    }

    public void walk() {
        System.out.println("started walking");
    }

    public void fly() {
        System.out.println("flew");
    }

    public void swim() {
        System.out.println("swam");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    private void wakeUp() {
        System.out.println("woke up");
    }

    private void findFood() {
        System.out.println("found food");
    }

    private void eat() {
        System.out.println("ate");
    }
}