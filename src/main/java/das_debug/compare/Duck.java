package das_debug.compare;

import java.util.*;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight ;
    public Duck(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Duck duck){
        return name.compareTo(duck.name);
    }
    public int getWeight(){return weight;}

    public String getName() {
        return name;
    }

    public static void main(String args[]){
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Paddle"));
        ducks.add(new Duck("Quake"));
        ducks.add(new Duck("Arctic"));
        Collections.sort(ducks);
        System.out.println(ducks);
        Comparator<Duck> byWeight = DuckHelper::compareByWegth;
        Comparator<Duck> byName = (d1,d2)-> DuckHelper.compareByName(d1,d2);

    }

}
