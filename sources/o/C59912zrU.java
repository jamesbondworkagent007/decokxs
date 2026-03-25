package o;

/* JADX INFO: renamed from: o.zrU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C59912zrU {
    private C59912zrU() {
    }

    public static void KWHzl(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Object must not be null");
        }
    }

    public static void EZpvd(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void KWHzl(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException("Must be true");
        }
    }

    public static void copydefault(boolean z) {
        if (z) {
            throw new java.lang.IllegalArgumentException("Must be false");
        }
    }

    public static void EZpvd(boolean z, java.lang.String str) {
        if (z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void copydefault(java.lang.Object[] objArr) {
        KWHzl(objArr, "Array must not contain any null objects");
    }

    public static void KWHzl(java.lang.Object[] objArr, java.lang.String str) {
        for (java.lang.Object obj : objArr) {
            if (obj == null) {
                throw new java.lang.IllegalArgumentException(str);
            }
        }
    }

    public static void copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("String must not be empty");
        }
    }

    public static void KWHzl(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }
}
