import drugs.Component;
import drugs.impl.animalDrugs.CatDrug;
import drugs.impl.components.Adenine;
import drugs.impl.components.Glycerol;
import drugs.impl.components.Lidocaine;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> catComponents1 = List.of(
                new Adenine("Аденин", 3.0, 8),
                new Glycerol("Глицерол", 1.2, 5),
                new Lidocaine("Лидокаин", 5.3, 2));

        List<Component> catComponents2 = List.of(
                new Adenine("Аденин", 3.0, 5),
                new Lidocaine("Лидокаин", 5.3, 4));

        List<Component> catComponents3 = List.of(
                new Adenine("Аденин", 3.0, 5),
                new Glycerol("Глицерол", 1.2, 5));

        List<Component> catComponents4 = List.of(
                new Glycerol("Глицерол", 1.2, 8),
                new Lidocaine("Лидокаин", 5.3, 2));

        List<Component> catComponents5 = List.of(
                new Lidocaine("Лидокаин", 5.3, 6),
                new Glycerol("Глицерол", 1.2, 3),
                new Lidocaine("Лидокаин", 5.3, 6));


        CatDrug catDrug1 = new CatDrug(catComponents1);
        CatDrug catDrug2 = new CatDrug(catComponents2);
        CatDrug catDrug3 = new CatDrug(catComponents3);
        CatDrug catDrug4 = new CatDrug(catComponents4);
        CatDrug catDrug5 = new CatDrug(catComponents5);

        System.out.println("-----------------\nВывод компонентов лекарства (использование интерфейса Iterable):");
        for (Component c : catDrug1) System.out.println(c);
        System.out.println("-----------------");

        List<CatDrug> catDrugs = new ArrayList<>();
        catDrugs.add(catDrug1);
        catDrugs.add(catDrug2);
        catDrugs.add(catDrug3);
        catDrugs.add(catDrug4);
        catDrugs.add(catDrug5);

        Collections.sort(catDrugs);
        System.out.printf("Вывод списка лекарств, отсортированных по их силе,\n" +
                "при равной силе - по названиям первого компонента\n" +
                "(использование интерфейса Comparable и метода sort):\n\n" +
                "%s\n-----------------\n", catDrugs);


        System.out.printf("Список компонентов: \n%s\n-----------------\n",
                catComponents5);

        Set<Component> result = new HashSet<>(catComponents5);
        System.out.printf("Множество компонентов: \n%s\n-----------------\n",
                result);


    }

}

