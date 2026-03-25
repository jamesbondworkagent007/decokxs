package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23953iPl {
    public final boolean AEQbTJ;
    public final int AYXKKw;
    public boolean AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.Boolean djBIcL;
    public java.lang.String gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23953iPl EZpvd(int i, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, int i2, @NotNull java.lang.String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new C23953iPl(i, z, str, str2, str3, str4, bool, i2, str5, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23953iPl)) {
            return false;
        }
        C23953iPl c23953iPl = (C23953iPl) obj;
        return this.AYXKKw == c23953iPl.AYXKKw && this.AEQbTJ == c23953iPl.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23953iPl.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23953iPl.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c23953iPl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23953iPl.copydefault) && Intrinsics.EZpvd(this.djBIcL, c23953iPl.djBIcL) && this.valueOf == c23953iPl.valueOf && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c23953iPl.gEmmrt) && this.AhwBna == c23953iPl.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AYXKKw);
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str = this.EZpvd;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.copydefault;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.Boolean bool = this.djBIcL;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3AdvancePanelUIBean(state=" + this.AYXKKw + ", isShow=" + this.AEQbTJ + ", network=" + this.EZpvd + ", Logo=" + this.KWHzl + ", networkFee=" + this.OLrzqt + ", slippage=" + this.copydefault + ", supportSwitchGear=" + this.djBIcL + ", slippageState=" + this.valueOf + ", slippageTips=" + this.gEmmrt + ", slippageWarn=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AhwBna;
    }

    public C23953iPl(int i, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, int i2, @NotNull java.lang.String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.AYXKKw = i;
        this.AEQbTJ = z;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.copydefault = str4;
        this.djBIcL = bool;
        this.valueOf = i2;
        this.gEmmrt = str5;
        this.AhwBna = z2;
    }
}
