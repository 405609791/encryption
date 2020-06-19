import Util.Base64Util;
import Util.MD5Util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @ @ClassName Test
 * @ Descriotion TODO
 * @ Date 2020/6/19 19:27
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        String se = "123abc";
        String s = MD5Util.encryption32(se);
        System.out.println(s);

        String encrypt = Base64Util.encrypt("123456");
        System.out.println("加密=="+encrypt);
        System.out.println(Base64Util.decrypt(encrypt));
    }
}
