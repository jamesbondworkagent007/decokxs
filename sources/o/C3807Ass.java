package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ass, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3807Ass {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public C3971Avz EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3807Ass copy$default(C3807Ass c3807Ass, boolean z, C3971Avz c3971Avz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3807Ass.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c3971Avz = c3807Ass.EZpvd;
        }
        return c3807Ass.copydefault(z, c3971Avz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3807Ass copydefault(boolean z, @NotNull C3971Avz c3971Avz) {
        Intrinsics.checkNotNullParameter(c3971Avz, "");
        return new C3807Ass(z, c3971Avz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3971Avz copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3807Ass)) {
            return false;
        }
        C3807Ass c3807Ass = (C3807Ass) obj;
        return this.AEQbTJ == c3807Ass.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c3807Ass.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RangeState(enabled=" + this.AEQbTJ + ", range=" + this.EZpvd + ")";
    }

    public C3807Ass(boolean z, @NotNull C3971Avz c3971Avz) {
        Intrinsics.checkNotNullParameter(c3971Avz, "");
        this.AEQbTJ = z;
        this.EZpvd = c3971Avz;
    }
}
