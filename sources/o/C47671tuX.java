package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47671tuX {
    public final java.lang.String AEQbTJ;
    public final java.lang.Double EZpvd;
    public final java.lang.Double KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47671tuX copy$default(C47671tuX c47671tuX, java.lang.String str, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c47671tuX.AEQbTJ;
        }
        if ((i & 2) != 0) {
            d = c47671tuX.OLrzqt;
        }
        java.lang.Double d5 = d;
        if ((i & 4) != 0) {
            d2 = c47671tuX.KWHzl;
        }
        java.lang.Double d6 = d2;
        if ((i & 8) != 0) {
            d3 = c47671tuX.EZpvd;
        }
        java.lang.Double d7 = d3;
        if ((i & 16) != 0) {
            d4 = c47671tuX.copydefault;
        }
        return c47671tuX.copydefault(str, d5, d6, d7, d4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47671tuX copydefault(@NotNull java.lang.String str, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C47671tuX(str, d, d2, d3, d4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47671tuX)) {
            return false;
        }
        C47671tuX c47671tuX = (C47671tuX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c47671tuX.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c47671tuX.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c47671tuX.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c47671tuX.EZpvd) && Intrinsics.EZpvd(this.copydefault, c47671tuX.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.Double d = this.OLrzqt;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.KWHzl;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.EZpvd;
        int iHashCode4 = d3 == null ? 0 : d3.hashCode();
        java.lang.Double d4 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (d4 != null ? d4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CefiPriceModel(instId=" + this.AEQbTJ + ", last=" + this.OLrzqt + ", open24h=" + this.KWHzl + ", sodUtc0=" + this.EZpvd + ", sodUtc8=" + this.copydefault + ")";
    }

    public C47671tuX(@NotNull java.lang.String str, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.OLrzqt = d;
        this.KWHzl = d2;
        this.EZpvd = d3;
        this.copydefault = d4;
    }
}
