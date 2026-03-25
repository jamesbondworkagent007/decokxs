package o;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class NJ<T> {
    public static final Activity<java.lang.Object> KWHzl = new Activity<java.lang.Object>() { // from class: o.NJ.5
        @Override // o.NJ.Activity
        public void EZpvd(@androidx.annotation.NonNull byte[] bArr, @androidx.annotation.NonNull java.lang.Object obj, @androidx.annotation.NonNull MessageDigest messageDigest) {
        }
    };
    public final Activity<T> AEQbTJ;
    public volatile byte[] EZpvd;
    public final T OLrzqt;
    public final java.lang.String copydefault;

    public interface Activity<T> {
        void EZpvd(@androidx.annotation.NonNull byte[] bArr, @androidx.annotation.NonNull T t, @androidx.annotation.NonNull MessageDigest messageDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> Activity<T> AEQbTJ() {
        return (Activity<T>) KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T copydefault() {
        return this.OLrzqt;
    }

    public static <T> NJ<T> OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        return new NJ<>(str, null, AEQbTJ());
    }

    public static <T> NJ<T> OLrzqt(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull T t) {
        return new NJ<>(str, t, AEQbTJ());
    }

    public static <T> NJ<T> KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable T t, @androidx.annotation.NonNull Activity<T> activity) {
        return new NJ<>(str, t, activity);
    }

    public NJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable T t, @androidx.annotation.NonNull Activity<T> activity) {
        this.copydefault = SE.KWHzl(str);
        this.OLrzqt = t;
        this.AEQbTJ = (Activity) SE.OLrzqt(activity);
    }

    public void OLrzqt(@androidx.annotation.NonNull T t, @androidx.annotation.NonNull MessageDigest messageDigest) {
        this.AEQbTJ.EZpvd(EZpvd(), t, messageDigest);
    }

    public final byte[] EZpvd() {
        if (this.EZpvd == null) {
            this.EZpvd = this.copydefault.getBytes(NH.AEQbTJ);
        }
        return this.EZpvd;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof NJ) {
            return this.copydefault.equals(((NJ) obj).copydefault);
        }
        return false;
    }

    public int hashCode() {
        return this.copydefault.hashCode();
    }

    public java.lang.String toString() {
        return "Option{key='" + this.copydefault + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
