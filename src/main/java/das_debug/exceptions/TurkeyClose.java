package das_debug.exceptions;

public class TurkeyClose implements AutoCloseable {
    public void close (){
        System.out.println("Close gate ");
    }
    public static void main(String args[]){
        try (TurkeyClose turkeyClose = new TurkeyClose()){
            System.out.println("put turkeys in");
        }

    }
}
