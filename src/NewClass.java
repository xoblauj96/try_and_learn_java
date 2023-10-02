
//import com.sleepycat.je.Transaction;
//import com.unitel.database.utils.HibernateUtils;
//import com.unitel.database.utils.PassTranformer;
import java.sql.SQLException;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.hibernate.Session;

public class NewClass {

//    private static final Logger logger = Logger.getLogger(NewClass.class);

    public static void main(String[] args) throws SQLException, Exception {
//        PropertyConfigurator.configure("../etc/log4j.cfg");
//        Session session = HibernateUtils.openSession();
//        Transaction tx = null;
        try {
            String url = PassTranformer.decrypt("39036ae60c13db43ec55ebde022569b6acd0384a5d916d36e0884c76cc257718c942c1bc013e365a897997337db740d5cf567df3b78cbb041f863610da2d59e140bf1ce027e1180e5558b16ec7523d26f37a8ebdb54969bc76ba9ab6d09995976a4ccdfbe42bd8d7a213570872eb772b8a22d896e7389bb25c5d97d2b1c474da2d89985b8c25001b19deaa7b34ba43924bb266b199ee54a0e825610673806ae6af6ca49f5f2594390d046fb2f9609e26dca393fd92a42b4d504729c671a8e774e3fecc90b44628b6dcd089b6c61d66dea86bc89bd2fe8146d05c0fac3451eddc3a518aa932e178543189df7ea8c440ef");
            String user = PassTranformer.decrypt("9826dd41d44731afee27fde638aeda3b");
            String pass = PassTranformer.decrypt("5955c9bcb7b507224687ccba21e07165");
//            String ul = PassTranformer.encrypt("jdbc:oracle:thin:@(DESCRIPTION= (ADDRESS= (PROTOCOL=TCP) (HOST= 10.120.44.118) (PORT= 1521)) (CONNECT_DATA=(SERVICE_NAME= dbtest)))");
//            String u =PassTranformer.encrypt("bonus_im");
//            String p =PassTranformer.encrypt("abcd1234");
//            System.out.println("u:" +u);
//            System.out.println("p:" +p);
            System.out.println(url);
            System.out.println(user);
            System.out.println(pass);
        } catch (Exception e) {
//             logger.error(e.getMessage());
        }finally{
//            HibernateUtils.close(session);
        }
    }
}
