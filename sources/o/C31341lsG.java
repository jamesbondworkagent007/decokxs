package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31341lsG {
    public final long AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final BigDecimal DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final int valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31341lsG EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7, BigDecimal bigDecimal, long j, java.lang.String str8, java.lang.String str9, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new C31341lsG(str, str2, str3, str4, str5, i, str6, str7, bigDecimal, j, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31341lsG)) {
            return false;
        }
        C31341lsG c31341lsG = (C31341lsG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c31341lsG.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31341lsG.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31341lsG.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31341lsG.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c31341lsG.gEmmrt) && this.valueOf == c31341lsG.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c31341lsG.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31341lsG.AhwBna) && Intrinsics.EZpvd(this.DbNXlk, c31341lsG.DbNXlk) && this.AEQbTJ == c31341lsG.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31341lsG.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31341lsG.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c31341lsG.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.gEmmrt.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode7 = this.AkhnZx.hashCode();
        int iHashCode8 = this.AhwBna.hashCode();
        BigDecimal bigDecimal = this.DbNXlk;
        int iHashCode9 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        int iHashCode10 = java.lang.Long.hashCode(this.AEQbTJ);
        java.lang.String str = this.EZpvd;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PendingClaimOrder(orderId=" + this.AYXKKw + ", from=" + this.copydefault + ", tokenLogo=" + this.djBIcL + ", chainIndex=" + this.OLrzqt + ", tokenAmount=" + this.gEmmrt + ", tokenDecimal=" + this.valueOf + ", tokenSymbol=" + this.AkhnZx + ", tokenAddress=" + this.AhwBna + ", usdAmount=" + this.DbNXlk + ", createTime=" + this.AEQbTJ + ", avatar=" + this.EZpvd + ", comment=" + this.KWHzl + ", uid=" + this.values + ")";
    }

    public C31341lsG(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7, BigDecimal bigDecimal, long j, java.lang.String str8, java.lang.String str9, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.AYXKKw = str;
        this.copydefault = str2;
        this.djBIcL = str3;
        this.OLrzqt = str4;
        this.gEmmrt = str5;
        this.valueOf = i;
        this.AkhnZx = str6;
        this.AhwBna = str7;
        this.DbNXlk = bigDecimal;
        this.AEQbTJ = j;
        this.EZpvd = str8;
        this.KWHzl = str9;
        this.values = str10;
    }
}
