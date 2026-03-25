package o;

/* JADX INFO: loaded from: classes2.dex */
public final class SE {
    private SE() {
    }

    public static void copydefault(boolean z, @androidx.annotation.NonNull java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static <T> T OLrzqt(@androidx.annotation.Nullable T t) {
        return (T) copydefault(t, "Argument must not be null");
    }

    public static <T> T copydefault(@androidx.annotation.Nullable T t, @androidx.annotation.NonNull java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.String KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T extends java.util.Collection<Y>, Y> T KWHzl(@androidx.annotation.NonNull T t) {
        if (t.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must not be empty.");
        }
        return t;
    }
}
