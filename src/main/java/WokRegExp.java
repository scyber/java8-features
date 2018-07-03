import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WokRegExp {

    public static void main(String args[]){
        //System.out.print("JH");

        String st = "decimal(16,17)";
        String st2 = "string";
        String pat2 = "([a-zA-Z]{0,50})";
        String pat = "([a-zA-Z]{0,50})?(\\()?([0-9]{0,10})?(\\,)?([0-9]{0,10})";
        Pattern pattern = Pattern.compile(pat);
        Matcher m = pattern.matcher(st2);
        int c = 0;
        System.out.println(getMetaData(st2, "type"));
        System.out.println(getMetaData(st2, "precision"));
        System.out.println(getMetaData(st2, "scale"));
//        if ( m.find()) {
//            //System.out.println(c++);
//            //c++;
//            //System.out.println("count of finds " + c++);
//
//            //System.out.print("start " + m.start()+ " ");
//            //System.out.print(" end " + m.end() +" ");
//            //System.out.print("group " + 1 + " ");
//             System.out.println("group " + 3 + " "+  m.group(3) );
//            ;
//       }

    }
    public static String getMetaData(String field, String value) {
        String pat = "([a-zA-Z]{0,50})?(\\()?([0-9]{0,10})?(\\,)?([0-9]{0,10})";
        Pattern pattern = Pattern.compile(pat);
        Matcher m = pattern.matcher(field);
        String result = null;
        switch (value){
            case "type":
                if (m.find()) {
                    result = m.group(1);
                }
                return result;
            case "precision":
                if(m.find() && !m.group(3).equals("")) {
                    //System.out.println("m.group(3) " + m.group(3));
                    result = m.group(3);
                } else {
                    result = "0";
                }
                return result;
            case "scale":
                if (m.find() && !m.group(5).equals("") ){
                    //System.out.println("m.group(5) " + m.group(5));
                    result = m.group(5);
                } else {
                    result = "0";
                }
                return result;
            default:
                return null;
        }

    }
}
