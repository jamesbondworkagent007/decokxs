package o;

/* JADX INFO: renamed from: o.zoR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59828zoR {
    public static int OLrzqt(int i, int i2) {
        return (i * 37) + i2;
    }

    private C59828zoR() {
    }

    public static int AEQbTJ(int i, java.lang.Object obj) {
        return OLrzqt(i, obj != null ? obj.hashCode() : 0);
    }

    public static boolean EZpvd(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean OLrzqt(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!EZpvd(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
