package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Avz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3971Avz {
    public static final int $stable = 8;
    public C3921AvB KWHzl;
    public C3921AvB OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3971Avz copy$default(C3971Avz c3971Avz, C3921AvB c3921AvB, C3921AvB c3921AvB2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3921AvB = c3971Avz.KWHzl;
        }
        if ((i & 2) != 0) {
            c3921AvB2 = c3971Avz.OLrzqt;
        }
        return c3971Avz.OLrzqt(c3921AvB, c3921AvB2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3921AvB AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3971Avz OLrzqt(@NotNull C3921AvB c3921AvB, @NotNull C3921AvB c3921AvB2) {
        Intrinsics.checkNotNullParameter(c3921AvB, "");
        Intrinsics.checkNotNullParameter(c3921AvB2, "");
        return new C3971Avz(c3921AvB, c3921AvB2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3921AvB copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3971Avz)) {
            return false;
        }
        C3971Avz c3971Avz = (C3971Avz) obj;
        return Intrinsics.EZpvd(this.KWHzl, c3971Avz.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c3971Avz.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeLimitRange(min=" + this.KWHzl + ", max=" + this.OLrzqt + ")";
    }

    public C3971Avz(@NotNull C3921AvB c3921AvB, @NotNull C3921AvB c3921AvB2) {
        Intrinsics.checkNotNullParameter(c3921AvB, "");
        Intrinsics.checkNotNullParameter(c3921AvB2, "");
        this.KWHzl = c3921AvB;
        this.OLrzqt = c3921AvB2;
    }
}
