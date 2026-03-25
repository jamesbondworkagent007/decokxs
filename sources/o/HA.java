package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HA<T> {
    public final C5173Hn AEQbTJ;
    public final T OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.HA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HA copy$default(HA ha, java.lang.Object obj, C5173Hn c5173Hn, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = ha.OLrzqt;
        }
        if ((i & 2) != 0) {
            c5173Hn = ha.AEQbTJ;
        }
        return ha.copydefault(obj, c5173Hn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HA<T> copydefault(T t, @NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        return new HA<>(t, c5173Hn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HA)) {
            return false;
        }
        HA ha = (HA) obj;
        return Intrinsics.EZpvd(this.OLrzqt, ha.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, ha.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.OLrzqt;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExpiringValue(value=" + this.OLrzqt + ", expiresAt=" + this.AEQbTJ + ')';
    }

    public HA(T t, @NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        this.OLrzqt = t;
        this.AEQbTJ = c5173Hn;
    }
}
