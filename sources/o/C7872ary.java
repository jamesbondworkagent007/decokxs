package o;

/* JADX INFO: renamed from: o.ary, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7872ary {
    private C7872ary() {
    }

    public static boolean gEmmrt(java.lang.String str) {
        return str.startsWith("file://");
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        java.io.File fileKWHzl = C7864arq.KWHzl();
        if (fileKWHzl == null) {
            return null;
        }
        java.lang.String absolutePath = fileKWHzl.getAbsolutePath();
        if (android.text.TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        return new java.io.File(absolutePath, AEQbTJ(str)).getAbsolutePath();
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        java.io.File fileKWHzl;
        if (str == null || !str.startsWith("/") || (fileKWHzl = C7864arq.KWHzl()) == null) {
            return str;
        }
        java.lang.String absolutePath = fileKWHzl.getAbsolutePath();
        if (android.text.TextUtils.isEmpty(absolutePath) || !str.startsWith(absolutePath)) {
            return str;
        }
        return "file://" + str.replace(absolutePath, "").substring(1);
    }

    public static boolean EZpvd(java.lang.String str) {
        return str.startsWith("assets://");
    }

    public static java.lang.String copydefault(java.lang.String str) {
        return str.substring(9);
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        return str.substring(str.indexOf("://") + 3);
    }
}
