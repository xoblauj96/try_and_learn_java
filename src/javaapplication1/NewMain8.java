package javaapplication1;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain8 {

    /**
     * @param args the command line arguments
     */
    public static String nam1;
    public String nam2;

    public static void main(String[] args) {
        display();
        NewMain8 ob = new NewMain8();
        System.out.println("nam1: " + nam1);
        System.out.println("nam: " + ob.nam2);

    }

    public static void display() {
        ObjectTrys obj = new ObjectTrys();
        ObjectTrys.name1 = "xob1";
        obj.name2 = "xob2";
        
        NewMain8 ob = new NewMain8();
        nam1 = ObjectTrys.name1;
        ob.nam2 = obj.name2;
    }
//static void display2(){
//    System.out.println("nam2d2: "+nam2);
//}
}
