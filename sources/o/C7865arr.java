package o;

import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.arr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7865arr {
    public static float AEQbTJ = -1.0f;
    public static int EZpvd = 0;
    public static float KWHzl = -1.0f;
    public static int OLrzqt;
    public static long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static float AEQbTJ(float f) {
        return f / KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static float KWHzl(float f) {
        return f / AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(float f) {
        return (int) (f * AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(int i) {
        if (i == OLrzqt) {
            return -2;
        }
        if (i == EZpvd) {
            return -1;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int copydefault(double d) {
        return (int) ((d * ((double) KWHzl)) + 0.5d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int copydefault(float f) {
        return (int) (f * KWHzl);
    }

    public static void copydefault(android.content.Context context) {
        KWHzl = C7857arj.OLrzqt(context);
        AEQbTJ = C7857arj.AYXKKw(context);
        float f = KWHzl;
        OLrzqt = (int) (((-2.0f) * f) + 0.5f);
        EZpvd = (int) ((f * (-1.0f)) + 0.5f);
        copydefault = java.lang.System.currentTimeMillis();
    }

    public static void EZpvd(android.content.Context context) {
        if (java.lang.System.currentTimeMillis() - copydefault <= 100) {
            return;
        }
        copydefault(context);
    }

    public static int copydefault(LuaValue luaValue) {
        if (luaValue == null || !luaValue.isNumber()) {
            return 0;
        }
        return (int) ((luaValue.toDouble() * ((double) KWHzl)) + 0.5d);
    }
}
