package o;

/* JADX INFO: renamed from: o.zoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C59825zoO {
    public static void KWHzl(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void copydefault(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static <T> T copydefault(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be null");
    }

    public static <T extends java.lang.CharSequence> T OLrzqt(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (!C59827zoQ.KWHzl(t)) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be empty");
    }

    public static <T extends java.lang.CharSequence> T copydefault(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (!C59827zoQ.copydefault(t)) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be blank");
    }

    public static <T extends java.lang.CharSequence> T AEQbTJ(T t, java.lang.String str) {
        if (t == null) {
            throw new java.lang.IllegalArgumentException(str + " may not be null");
        }
        if (t.length() == 0) {
            throw new java.lang.IllegalArgumentException(str + " may not be empty");
        }
        if (!C59827zoQ.OLrzqt(t)) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str + " may not contain blanks");
    }

    public static int AEQbTJ(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " may not be negative");
    }
}
