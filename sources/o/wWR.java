package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wWR<T> {
    public final java.lang.String AEQbTJ;
    public final T EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wWR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ wWR copy$default(wWR wwr, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = wwr.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = wwr.AEQbTJ;
        }
        if ((i & 4) != 0) {
            obj = wwr.EZpvd;
        }
        return wwr.copydefault(str, str2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wWR<T> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new wWR<>(str, str2, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wWR)) {
            return false;
        }
        wWR wwr = (wWR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) wwr.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) wwr.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, wwr.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        T t = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SelectionChipItem(id=" + this.KWHzl + ", text=" + this.AEQbTJ + ", data=" + this.EZpvd + ")";
    }

    public wWR(@NotNull java.lang.String str, @NotNull java.lang.String str2, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.EZpvd = t;
    }
}
