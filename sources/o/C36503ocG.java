package o;

/* JADX INFO: renamed from: o.ocG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C36503ocG {
    public static java.lang.String EZpvd = "";

    public static java.io.File OLrzqt(java.io.File file) {
        return copydefault() ? file : new java.io.File(EZpvd);
    }

    public static boolean copydefault() {
        return android.text.TextUtils.isEmpty(EZpvd);
    }
}
