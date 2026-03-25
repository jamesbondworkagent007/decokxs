package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2498AOb {
    public static final int $stable = 8;
    public boolean EZpvd;
    public float KWHzl;
    public java.util.List<APJ> OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AOb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2498AOb copy$default(C2498AOb c2498AOb, java.util.List list, boolean z, float f, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2498AOb.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c2498AOb.copydefault;
        }
        if ((i & 4) != 0) {
            f = c2498AOb.KWHzl;
        }
        if ((i & 8) != 0) {
            z2 = c2498AOb.EZpvd;
        }
        return c2498AOb.EZpvd(list, z, f, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2498AOb EZpvd(@NotNull java.util.List<APJ> list, boolean z, float f, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2498AOb(list, z, f, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<APJ> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2498AOb)) {
            return false;
        }
        C2498AOb c2498AOb = (C2498AOb) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c2498AOb.OLrzqt) && this.copydefault == c2498AOb.copydefault && java.lang.Float.compare(this.KWHzl, c2498AOb.KWHzl) == 0 && this.EZpvd == c2498AOb.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Float.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MultiShareConfig(configList=" + this.OLrzqt + ", isLoop=" + this.copydefault + ", pageWidthPercent=" + this.KWHzl + ", showIndicator=" + this.EZpvd + ")";
    }

    public C2498AOb(@NotNull java.util.List<APJ> list, boolean z, float f, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.copydefault = z;
        this.KWHzl = f;
        this.EZpvd = z2;
    }
}
