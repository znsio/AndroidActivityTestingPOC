package android.util;

/**
 * This is a workaround to enable the unit tests to run.
 * Solution thanks to https://medium.com/@gal_41749/android-unitests-and-log-class-9546b6480006
 */

public class Log {
    public static int d(String tag, String msg) {
        System.out.println("DEBUG: " + tag + ": " + msg);
        return 0;
    }

    public static int i(String tag, String msg) {
        System.out.println("INFO: " + tag + ": " + msg);
        return 0;
    }

    public static int w(String tag, String msg) {
        System.out.println("WARN: " + tag + ": " + msg);
        return 0;
    }

    public static int e(String tag, String msg) {
        System.out.println("ERROR: " + tag + ": " + msg);
        return 0;
    }

    public static int e(String tag, String msg, Throwable thowable) {
        System.out.println("ERROR: " + tag + ": " + msg + ": " + thowable.getLocalizedMessage());
        return 0;
    }

}