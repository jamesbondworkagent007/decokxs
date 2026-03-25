package api;

import go.Seq;

/* JADX INFO: loaded from: classes.dex */
public abstract class Api {
    public static native void _init();

    public static native String dispatch(String str);

    public static native String encodeABI(String str, String str2, String str3);

    public static native String hexStringToString(String str);

    public static native String hexToBase58(String str);

    public static native String hexToBase64(String str);

    public static native String hexToInt(String str);

    public static native String intToHex(String str);

    public static native String shiftValue(String str, long j);

    public static native String stringToHexString(String str);

    public static void touch() {
    }

    static {
        Seq.touch();
        _init();
    }

    private Api() {
    }
}
