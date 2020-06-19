package Util;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.util.Base64;

/**
 * @ @ClassName Base64
 * @ Descriotion TODO
 * @ Date 2020/6/19 19:25
 **/
public class Base64Util {



    /**
     * BASE64加密解密
     */
    public static void enAndDeCode(String str) throws Exception {
        String data = encryptBASE64(str.getBytes());
        System.out.println("sun.misc.BASE64 加密后：" + data);

        byte[] byteArray = decryptBASE64(data);
        System.out.println("sun.misc.BASE64 解密后：" + new String(byteArray));
    }

    /**
     * BASE64解密
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    /**
     * java 8 base64 加密
     * @param text
     * @return
     * @throws Exception
     */
    public static String encrypt(String text) throws Exception {
        final Base64.Encoder encoder = Base64.getEncoder();
        final byte[] textByte = text.getBytes("UTF-8");
        return encoder.encodeToString(textByte);
    }


    /**
     * java 8 BASE64解密 直接返回解密后的字符串
     * @throws Exception
     */
    public static String decrypt(String key) throws Exception {
        final Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(key), "UTF-8");
    }

}
