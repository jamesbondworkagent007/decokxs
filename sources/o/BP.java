package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BP<T> {
    public final T AEQbTJ;
    public final DT OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BP copy$default(BP bp, DT dt, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            dt = bp.OLrzqt;
        }
        if ((i & 2) != 0) {
            obj = bp.AEQbTJ;
        }
        return bp.AEQbTJ(dt, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BP<T> AEQbTJ(@NotNull DT dt, T t) {
        Intrinsics.checkNotNullParameter(dt, "");
        return new BP<>(dt, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DT OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BP)) {
            return false;
        }
        BP bp = (BP) obj;
        return Intrinsics.EZpvd(this.OLrzqt, bp.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, bp.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        T t = this.AEQbTJ;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OperationRequest(context=" + this.OLrzqt + ", subject=" + this.AEQbTJ + ')';
    }

    public BP(@NotNull DT dt, T t) {
        Intrinsics.checkNotNullParameter(dt, "");
        this.OLrzqt = dt;
        this.AEQbTJ = t;
    }

    public BP(T t) {
        this(new DT(), t);
    }
}
