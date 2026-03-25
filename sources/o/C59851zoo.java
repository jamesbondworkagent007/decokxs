package o;

/* JADX INFO: renamed from: o.zoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59851zoo {
    public static void copydefault(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void copydefault(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static <T> T AEQbTJ(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be null");
    }

    public static <T extends java.lang.CharSequence> T OLrzqt(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (!C59853zoq.EZpvd(t)) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be empty");
    }

    public static <T extends java.lang.CharSequence> T copydefault(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (!C59853zoq.OLrzqt(t)) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be blank");
    }

    public static <T extends java.lang.CharSequence> T KWHzl(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (t.length() == 0) {
            throw new java.lang.IllegalArgumentException(str + " may not be empty");
        }
        if (!C59853zoq.KWHzl(t)) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not contain blanks");
    }

    public static <E, T extends java.util.Collection<E>> T copydefault(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (!t.isEmpty()) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be empty");
    }

    public static int EZpvd(int i, java.lang.String str) {
        if (i > 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be negative or zero");
    }

    public static int KWHzl(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be negative");
    }

    public static long KWHzl(long j, java.lang.String str) {
        if (j >= 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be negative");
    }
}
