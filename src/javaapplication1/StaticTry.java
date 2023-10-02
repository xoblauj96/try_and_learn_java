package javaapplication1;

/**
 *
 * @author stl_sdd_sor
 */
public class StaticTry {

    /**
     * @param args the command line arguments
     */
    public static String n1;
    public  String n2;
//    public static StaticTry obj = new StaticTry();

    public static void main(String[] args) {
         StaticTry obj = new StaticTry();
         obj.tryMethod();
        obj.tryMethod1();
        System.out.println(obj.n2);
    }

    public  void tryMethod() {
        
        n2 = "num2";
        n1 = "num1";
      
    }
    public void tryMethod1(){
          System.out.println("num2: "+n2);
        System.out.println("num1: "+n1);
    }
}
