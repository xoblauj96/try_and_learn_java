
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author Acer
 */
public class PassTranformer {

    private static byte[] key = new byte[]{-95, -29, -62, 25, 25, -83, -18, -85};
//    private static byte[] key = new byte[]{-99, -89, -55, 34, 22, -11, -11, -22};

    private static String algorithm = "DES";

    private static SecretKeySpec keySpec = new SecretKeySpec(key, algorithm);

    private static Cipher encoder;

    private static Cipher decoder;

    static {
        try {
            encoder = Cipher.getInstance(algorithm);
            encoder.init(1, keySpec);
            decoder = Cipher.getInstance(algorithm);
            decoder.init(2, keySpec);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static byte[] _encrypt(byte[] arrByte) throws Exception {
        return encoder.doFinal(arrByte);
    }

    private static byte[] _decrypt(byte[] arrByte) throws Exception {
        return decoder.doFinal(arrByte);
    }

    public static String encrypt(String str) throws Exception {
        return toHexa(_encrypt(str.getBytes()));
    }

    public static String decrypt(String str) throws Exception {
        return new String(_decrypt(stringToBytes(str)));
    }

    public static byte[] stringToBytes(String s) {
        return stringToBytes(s, 0);
    }

    public static byte[] stringToBytes(String s, int minLength) {
        if (s.length() % 2 != 0) {
            s = "0".concat(s);
        }
        int len = s.length() / 2;
        int padLength = len;
        if (padLength < minLength) {
            padLength = minLength;
        }
        int offset = padLength - len;
        byte[] b = new byte[padLength];
        for (int i = 0; i < len; i++) {
            b[i + offset] = (byte) (hexToInt(s.charAt(i * 2)) << 4);
            b[i + offset] = (byte) (b[i + offset] | hexToInt(s.charAt(i * 2 + 1)) & 0xF);
        }
        return b;
    }

    public static int hexToInt(char c) {
        return ascii[c & 0x7F];
    }

    private static final int[] ascii = new int[]{
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
        2, 3, 4, 5, 6, 7, 8, 9, 0, 0,
        0, 0, 0, 0, 0, 10, 11, 12, 13, 14,
        15, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 10, 11, 12,
        13, 14, 15, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0};

    protected static final byte[] Hexhars = new byte[]{
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
        97, 98, 99, 100, 101, 102};

    public static String toHexa(byte[] b) {
        StringBuilder s = new StringBuilder(2 * b.length);
        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xFF;
            s.append((char) Hexhars[v >> 4]);
            s.append((char) Hexhars[v & 0xF]);
        }
        return s.toString();
    }

//    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 1000; i++) {
//            String encryptStr = encrypt("xxx:" + i);
//            System.out.println(encryptStr);
//            System.out.println(decrypt(encryptStr));
//        }
//    }
}