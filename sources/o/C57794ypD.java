package o;

/* JADX INFO: renamed from: o.ypD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57794ypD {
    public static boolean EZpvd() {
        java.lang.String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            try {
                if (new java.io.File(strArr[i] + "su").exists()) {
                    return true;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }
}
