package das_debug.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundxExamples {
    public static void main(String args[]){
        //List interface example
        List<?> l = new ArrayList<String>();
        //
        List <? extends Exception> lExetendxException = new ArrayList<RuntimeException>();

        //
        List<? super Exception> suException = new ArrayList<Object>();

        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        //does not compile
        // if we have printList<Object>
        printList(keywords);

        ArrayList<? extends Number> lNumber = new ArrayList<Integer>();

        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);




    }
    public static void addSound(List<? super String> list){
        list.add("quack");
    }
    public static void printList(List<?> list){
        for (Object x: list) System.out.println(x);
    }
    public static long total(List<? extends Number> list){
        long count = 0;
        for (Number number: list)
            count +=number.intValue();
        return count;
    }
}
