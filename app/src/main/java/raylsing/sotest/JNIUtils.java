package raylsing.sotest;

/**
 * Created by Administrator on 2016/10/19.
 */

public class JNIUtils {
    static {
        System.loadLibrary("testSo");
    }

    //java调C中的方法都需要用native声明且方法名必须和c的方法名一样
    public native String getString();
}
