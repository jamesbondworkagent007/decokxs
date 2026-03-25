package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47670tuW {
    public final java.lang.Double AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.Double KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Double copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47670tuW copy$default(C47670tuW c47670tuW, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c47670tuW.valueOf;
        }
        if ((i & 2) != 0) {
            str2 = c47670tuW.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c47670tuW.AYXKKw;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            d = c47670tuW.KWHzl;
        }
        java.lang.Double d5 = d;
        if ((i & 16) != 0) {
            d2 = c47670tuW.OLrzqt;
        }
        java.lang.Double d6 = d2;
        if ((i & 32) != 0) {
            d3 = c47670tuW.copydefault;
        }
        java.lang.Double d7 = d3;
        if ((i & 64) != 0) {
            d4 = c47670tuW.AEQbTJ;
        }
        return c47670tuW.AEQbTJ(str, str4, str5, d5, d6, d7, d4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47670tuW AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C47670tuW(str, str2, str3, d, d2, d3, d4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47670tuW)) {
            return false;
        }
        C47670tuW c47670tuW = (C47670tuW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c47670tuW.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47670tuW.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c47670tuW.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, c47670tuW.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c47670tuW.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c47670tuW.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c47670tuW.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        java.lang.Double d = this.KWHzl;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.OLrzqt;
        int iHashCode5 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.copydefault;
        int iHashCode6 = d3 == null ? 0 : d3.hashCode();
        java.lang.Double d4 = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (d4 != null ? d4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CedefiPriceModel(uniqueKey=" + this.valueOf + ", chainId=" + this.EZpvd + ", tokenContractAddress=" + this.AYXKKw + ", last=" + this.KWHzl + ", changeUtc0=" + this.OLrzqt + ", changeUtc8=" + this.copydefault + ", change24h=" + this.AEQbTJ + ")";
    }

    public C47670tuW(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf = str;
        this.EZpvd = str2;
        this.AYXKKw = str3;
        this.KWHzl = d;
        this.OLrzqt = d2;
        this.copydefault = d3;
        this.AEQbTJ = d4;
    }
}
