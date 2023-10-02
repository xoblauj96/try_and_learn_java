package javaapplication1;

import java.util.Random;

/**
 *
 * @author stl_sdd_sor
 */
public class OTPGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String otp = genateOTP();
        System.out.println(otp);
    }
    
    private static final int OPT_LENGTH=6;
    
    public static String genateOTP(){
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < OPT_LENGTH; i++){
                int digit = random.nextInt(10);
                System.out.println("\n digit: "+digit);
                sb.append(digit).toString();
            }
            return sb.toString();
    }
}
