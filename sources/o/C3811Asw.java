package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Asw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3811Asw {
    public static final int $stable = 8;
    public C3810Asv EZpvd;
    public C3810Asv KWHzl;
    public C3810Asv OLrzqt;
    public C3810Asv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3811Asw copy$default(C3811Asw c3811Asw, C3810Asv c3810Asv, C3810Asv c3810Asv2, C3810Asv c3810Asv3, C3810Asv c3810Asv4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3810Asv = c3811Asw.EZpvd;
        }
        if ((i & 2) != 0) {
            c3810Asv2 = c3811Asw.KWHzl;
        }
        if ((i & 4) != 0) {
            c3810Asv3 = c3811Asw.OLrzqt;
        }
        if ((i & 8) != 0) {
            c3810Asv4 = c3811Asw.copydefault;
        }
        return c3811Asw.AEQbTJ(c3810Asv, c3810Asv2, c3810Asv3, c3810Asv4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3811Asw AEQbTJ(@NotNull C3810Asv c3810Asv, @NotNull C3810Asv c3810Asv2, @NotNull C3810Asv c3810Asv3, @NotNull C3810Asv c3810Asv4) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(c3810Asv2, "");
        Intrinsics.checkNotNullParameter(c3810Asv3, "");
        Intrinsics.checkNotNullParameter(c3810Asv4, "");
        return new C3811Asw(c3810Asv, c3810Asv2, c3810Asv3, c3810Asv4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3811Asw)) {
            return false;
        }
        C3811Asw c3811Asw = (C3811Asw) obj;
        return Intrinsics.EZpvd(this.EZpvd, c3811Asw.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c3811Asw.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c3811Asw.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c3811Asw.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NativeChannelLimits(minTradeLimit=" + this.EZpvd + ", maxTradeLimit=" + this.KWHzl + ", minChannelLimit=" + this.OLrzqt + ", maxChannelLimit=" + this.copydefault + ")";
    }

    public C3811Asw(@NotNull C3810Asv c3810Asv, @NotNull C3810Asv c3810Asv2, @NotNull C3810Asv c3810Asv3, @NotNull C3810Asv c3810Asv4) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(c3810Asv2, "");
        Intrinsics.checkNotNullParameter(c3810Asv3, "");
        Intrinsics.checkNotNullParameter(c3810Asv4, "");
        this.EZpvd = c3810Asv;
        this.KWHzl = c3810Asv2;
        this.OLrzqt = c3810Asv3;
        this.copydefault = c3810Asv4;
    }
}
