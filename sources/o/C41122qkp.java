package o;

import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41122qkp implements InterfaceC40516qYt {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final UpDownColor AhwBna;
    public final java.lang.Boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<java.lang.String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41122qkp EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull UpDownColor upDownColor, @NotNull java.util.List<java.lang.String> list, java.lang.String str4, @NotNull java.util.List<java.lang.String> list2, java.lang.Boolean bool, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C41122qkp(str, str2, str3, upDownColor, list, str4, list2, bool, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41122qkp)) {
            return false;
        }
        C41122qkp c41122qkp = (C41122qkp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c41122qkp.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c41122qkp.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41122qkp.OLrzqt) && this.AhwBna == c41122qkp.AhwBna && Intrinsics.EZpvd(this.valueOf, c41122qkp.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c41122qkp.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, c41122qkp.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c41122qkp.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c41122qkp.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41122qkp.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        int iHashCode5 = this.valueOf.hashCode();
        java.lang.String str2 = this.gEmmrt;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = this.AEQbTJ.hashCode();
        java.lang.Boolean bool = this.EZpvd;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.KWHzl;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrendingCategoriesVo(title=" + this.AYXKKw + ", profit=" + this.djBIcL + ", originProfit=" + this.OLrzqt + ", profitColor=" + this.AhwBna + ", showIconList=" + this.valueOf + ", showNum=" + this.gEmmrt + ", chartDataList=" + this.AEQbTJ + ", isProfitFall=" + this.EZpvd + ", categoryId=" + this.copydefault + ", categoryName=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor valueOf() {
        return this.AhwBna;
    }

    public C41122qkp(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull UpDownColor upDownColor, @NotNull java.util.List<java.lang.String> list, java.lang.String str4, @NotNull java.util.List<java.lang.String> list2, java.lang.Boolean bool, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AYXKKw = str;
        this.djBIcL = str2;
        this.OLrzqt = str3;
        this.AhwBna = upDownColor;
        this.valueOf = list;
        this.gEmmrt = str4;
        this.AEQbTJ = list2;
        this.EZpvd = bool;
        this.copydefault = str5;
        this.KWHzl = str6;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41122qkp) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41122qkp) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
