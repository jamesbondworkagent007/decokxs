package o;

/* JADX INFO: renamed from: o.ywD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58165ywD {
    public static <T> T copydefault(T t) {
        t.getClass();
        return t;
    }

    public static <T> T KWHzl(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static <T> T KWHzl(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T OLrzqt(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> void EZpvd(T t, java.lang.Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new java.lang.IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    private C58165ywD() {
    }
}
