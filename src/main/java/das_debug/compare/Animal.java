package das_debug.compare;

public class Animal implements Comparable<Animal> {
    private int id;
    public int compareTo(Animal animal){
        return id - animal.id;
    }
    public static void main(String args[]){
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.id = 2;
        a2.id = 5;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));

    }

}
