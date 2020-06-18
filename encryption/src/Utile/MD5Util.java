package Utile;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @ @ClassName MD5Util
 * @ Descriotion TODO
 * @ Date 2020/6/18 21:34
 **/
public class MD5Util {
    /**
     * MD5 32位密文
     *
     * @param plainText
     * @return
     */
    public static String encryption32(String plainText)
    {
        String re_md5 = new String();
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            re_md5 = new BigInteger(1, md.digest()).toString(16);
            re_md5 = fillMD5(re_md5);
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return re_md5.toUpperCase();
    }
    public static String fillMD5(String md5){
        return md5.length()==32?md5:fillMD5("0"+md5);
    }
}
