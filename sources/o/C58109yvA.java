package o;

/* JADX INFO: renamed from: o.yvA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58109yvA {
    public static boolean copydefault = true;

    public static void KWHzl(java.lang.String str, java.lang.String str2) {
        KWHzl(3, str, str2);
    }

    public static void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        copydefault(3, str, str2, objArr);
    }

    public static void OLrzqt(java.lang.String str, java.lang.String str2) {
        KWHzl(4, str, str2);
    }

    public static void copydefault(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        copydefault(4, str, str2, objArr);
    }

    public static void copydefault(java.lang.String str, java.lang.String str2) {
        KWHzl(5, str, str2);
    }

    public static void KWHzl(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        copydefault(5, str, str2, objArr);
    }

    public static void AEQbTJ(java.lang.String str, java.lang.String str2) {
        KWHzl(6, str, str2);
    }

    public static void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        copydefault(6, str, str2, objArr);
    }

    public static void copydefault(int i, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (copydefault) {
            KWHzl(i, str, java.lang.String.format(str2, objArr));
        }
    }

    public static void KWHzl(int i, java.lang.String str, java.lang.String str2) {
        if (copydefault) {
            if (i == 2) {
                pUU.OLrzqt(str, str2);
                return;
            }
            if (i == 3) {
                pUU.EZpvd(str, str2);
                return;
            }
            if (i == 4) {
                pUU.KWHzl(str, str2);
            } else if (i == 5) {
                pUU.valueOf(str, str2);
            } else {
                if (i != 6) {
                    return;
                }
                pUU.copydefault(str, str2);
            }
        }
    }
}
