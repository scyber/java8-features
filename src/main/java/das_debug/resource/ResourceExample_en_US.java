package das_debug.resource;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class ResourceExample_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            { "hello", "Hello from Russia"},
            {"open", "The zoo is open"}};
        }
     public static void main (String args[]){
        ResourceBundle rb = ResourceBundle.getBundle("das_debug.resource.ResourceExample", Locale.US);

        System.out.println(rb.getObject("hello"));

     }

}
