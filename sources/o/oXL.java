package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXL<T> {
    public final T EZpvd;
    public final C36343oYg OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oXL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oXL copy$default(oXL oxl, C36343oYg c36343oYg, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            c36343oYg = oxl.OLrzqt;
        }
        if ((i & 2) != 0) {
            obj = oxl.EZpvd;
        }
        return oxl.AEQbTJ(c36343oYg, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXL<T> AEQbTJ(@NotNull C36343oYg c36343oYg, T t) {
        Intrinsics.checkNotNullParameter(c36343oYg, "");
        return new oXL<>(c36343oYg, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36343oYg copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oXL)) {
            return false;
        }
        oXL oxl = (oXL) obj;
        return Intrinsics.EZpvd(this.OLrzqt, oxl.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, oxl.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        T t = this.EZpvd;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DataPoint(point=" + this.OLrzqt + ", y=" + this.EZpvd + ")";
    }

    public oXL(@NotNull C36343oYg c36343oYg, T t) {
        Intrinsics.checkNotNullParameter(c36343oYg, "");
        this.OLrzqt = c36343oYg;
        this.EZpvd = t;
    }
}
