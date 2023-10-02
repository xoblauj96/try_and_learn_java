package javaapplication1;

import java.util.*;
//import java.util.Objects;

/**
 *
 * @author stl_sdd_sor
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String s = new String("sorlor");
//        System.out.println("name: " + s);
//        List<String> lst1  = new ArrayList<String>();
//        lst1.add("1");
//        lst1.add("2");
//        lst1.add("3");
//        lst1.add("4");
//        lst1.add("5");
//        
//        List<String> lst = new ArrayList<String>();
//        lst.add("1");
//        lst.add("2");
//        lst.add("3");
//        lst.add("4");
//        lst.add("5");
//        System.out.println(lst1);
//        System.out.println(lst);
//        if (!lst.contains(lst1)) {
//            lst.add(s);
//        }
//        System.out.println(lst);
//
//        String number = "209678075212345";
//        if(number.startsWith("020")){
//            System.out.println("if");
//        }else{
//            System.out.println("else");
//        }
//        System.out.println(number.substring(0, 2));
//
//        
//        if ((number.length() != 10)) {
//            System.out.println("if "+number.length());
//        }else
//        {
//            System.out.println("else: "+number.length());
//        }
//        System.out.println("date: "+ new Date());


//List number = Arrays.asList(2,3,4,5);
//List squere = number.stream()

//String scan = "7:00,8:00,9:00,10:00,11:00,12:00,13:00,14:00,15:00,16:00,17:00,18:00,19:00,20:00,21:00,22:00,23:00,23:59";
//String[] arrScan = scan.split(",");
//        String[] timeStart =null;
//        for(String s: arrScan){
//          System.out.println(s);
//            timeStart = s.split(":");
//             for(String ss: timeStart){
//            System.out.println(ss);
//        }
//        }
//       
//  Date now = new Date();
//            Date begin = new Date(now.getYear(), now.getMonth(), now.getDate());//,
////                    Integer.parseInt(timeStart[0].trim()), Integer.parseInt(timeStart[1].trim()));
//System.out.println(begin);

 Calendar time = Calendar.getInstance();
        System.out.println(time.get(11));
        ResourceBundle resoure =  ResourceBundle.getBundle("bundle");
        String name = resoure.getString("myName");
        System.out.println("name: "+name);
    }

}


// class Employee {
//    int empId;
//    String empName;
//    String empAddress;
//    public int getEmpId() {
//        return empId;
//    }
//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
//    public String getEmpName() {
//        return empName;
//    }
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//    public Employee(int empId, String empName, String empAddress) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empAddress = empAddress;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return empId == employee.empId &&
//                empName.equals(employee.empName) &&
//                empAddress.equals(employee.empAddress);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(empId, empName, empAddress);
//    }
//}
