import Utile.MD5Util;

/**
 * @ @ClassName Test
 * @ Descriotion TODO
 * @ Date 2020/6/18 21:36
 **/
public class Test {
    public static void main(String[] args) {
        String se = "123abc";
        String s = MD5Util.encryption32(se);
        System.out.println(s);
    }
}
