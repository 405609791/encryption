package Utile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

/**
 * @ @ClassName Base64Utils
 * @ Descriotion TODO
 * @ Date 2020/6/18 21:57
 **/
public class Base64Utils {


//    public static Logger logger = LoggerFactory.getLogger(Base64Utils.class);
    /** */
    /**
     * 文件读取缓冲区大小
     */
    private static final int CACHE_SIZE = 1024;

    /** */
    /**
     * <p>
     * BASE64字符串解码为二进制数据
     * </p>
     *
     * @param base64
     * @return
     * @throws Exception
     */
//    public static  byte[] decode(String base64) throws Exception {
//        return Base64.decodeBase64(base64.getBytes());
//    }

    /** */
    /**
     * <p>
     * 二进制数据编码为BASE64字符串
     * </p>
     *
     * @param bytes
     * @return
     * @throws Exception
     */
//    public static String encode(byte[] bytes) throws Exception {
//        return new String(Base64.encodeBase64(bytes));
//    }

    /** */
    /**
     * <p>
     * 将文件编码为BASE64字符串
     * </p>
     * <p>
     * 大文件慎用，可能会导致内存溢出
     * </p>
     *
     * @param filePath 文件绝对路径
     * @return
     * @throws Exception
     */
//    public static String encodeFile(String filePath) throws Exception {
//        byte[] bytes = fileToByte(filePath);
//        return encode(bytes);
//    }

    /** */
    /**
     * <p>
     * BASE64字符串转回文件
     * </p>
     *
     * @param filePath 文件绝对路径
     * @param base64   编码字符串
     * @throws Exception
     */
//    public static void decodeToFile(String filePath, String base64) throws Exception {
//        byte[] bytes = decode(base64);
//        byteArrayToFile(bytes, filePath);
//    }

    /** */
    /**
     * <p>
     * 文件转换为二进制数组
     * </p>
     *
     * @param filePath 文件路径
     * @return
     * @throws Exception
     */
    public static byte[] fileToByte(String filePath) throws Exception {
        byte[] data = new byte[0];
        File file = new File(filePath);
        if (file.exists()) {
            FileInputStream in = new FileInputStream(file);
            ByteArrayOutputStream out = new ByteArrayOutputStream(2048);
            byte[] cache = new byte[CACHE_SIZE];
            int nRead = 0;
            while ((nRead = in.read(cache)) != -1) {
                out.write(cache, 0, nRead);
                out.flush();
            }
            out.close();
            in.close();
            data = out.toByteArray();
        }
        return data;
    }

    /** */
    /**
     * <p>
     * 二进制数据写文件
     * </p>
     *
     * @param bytes    二进制数据
     * @param filePath 文件生成目录
     */
    public static void byteArrayToFile(byte[] bytes, String filePath) throws Exception {
        InputStream in = new ByteArrayInputStream(bytes);
        File destFile = new File(filePath);
        if (!destFile.getParentFile().exists()) {
            destFile.getParentFile().mkdirs();
        }
        destFile.createNewFile();
        OutputStream out = new FileOutputStream(destFile);
        byte[] cache = new byte[CACHE_SIZE];
        int nRead = 0;
        while ((nRead = in.read(cache)) != -1) {
            out.write(cache, 0, nRead);
            out.flush();
        }
        out.close();
        in.close();
    }

    /**
     * 东疆图片转base64
     *
     * @param imageURL
     * @return
     * @throws Exception
     */
//    public static String imageToBase64(String imageURL) throws Exception {
//        String imgBase64String = "";
//        if(StringUtils.isEmpty(imageURL)) {
//            return imgBase64String;
//        }
//
//        imgBase64String += "data:image/jpg;base64,";
//        InputStream is = null;
//        HttpURLConnection httpUrl = null;
//        URL url = null;
//
//        ByteArrayOutputStream baos = null;
//        try {
//            url = new URL(imageURL);
//            httpUrl = (HttpURLConnection) url.openConnection();
//            httpUrl.connect();
//
//            is = httpUrl.getInputStream();
//
//            baos = new ByteArrayOutputStream();
//
//            byte[] buffer = new byte[CACHE_SIZE];
//
//            // 每次读取的字符串长度，如果为-1，代表全部读取完毕
//            int len = 0;
//
//            // 使用一个输入流从buffer里把数据读取出来
//            while ((len = is.read(buffer)) != -1) {
//                // 用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
//                baos.write(buffer, 0, len);
//            }
//
//            baos.flush();
//
//            BufferedImage srcBufferedImage = ImageIO.read(url);
//
//            // 先按照比例进行压缩
//            if(srcBufferedImage.getHeight() > 400 || srcBufferedImage.getWidth() > 600) {
//                logger.info("图片正在根据宽高进行压缩...");
//                ByteArrayOutputStream smallBaos = new ByteArrayOutputStream();
//                ImageUtil.zoom(srcBufferedImage, smallBaos, 400, 600);
//                baos = smallBaos;
//                logger.info("图片根据宽高压缩结束。");
//            }
//
//            // 如果压缩之后的图片>50kb,将图片按照指定大小和比例进行等比例压缩
//            byte[] b = baos.toByteArray();
//            if(b.length > 50 * 1024) {
//                logger.info("图片正在根据指定大小和比例进行压缩...");
//                baos = ImageUtil.zoom(srcBufferedImage, 0.9, 50);
//                logger.info("图片根据指定大小和比例压缩结束");
//            }
//
//            imgBase64String += encode(baos.toByteArray());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (is != null) {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (baos != null) {
//                try {
//                    baos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (httpUrl != null) {
//                httpUrl.disconnect();
//            }
//        }
//
//        return imgBase64String;
//    }

//    public static void main(String[] args) throws Exception {
//        String imageToBase64 = imageToBase64("http://image.test.xiaoniu56.com:82//upload/2020/02/26/4Qa3rCgASW-6kAGV1-FsqA.png");
//        System.out.println(imageToBase64);
//        System.out.println("2压缩后的图片大小 == " + imageToBase64.getBytes().length);
//    }
}
