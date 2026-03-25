package o;

import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40871qgC implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String EZpvd;
    public final java.lang.CharSequence KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final UpDownColor djBIcL;
    public final java.lang.String gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40871qgC OLrzqt(int i, @NotNull java.lang.CharSequence charSequence, java.lang.String str, @NotNull java.lang.String str2, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str3, @androidx.annotation.StringRes java.lang.Integer num, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C40871qgC(i, charSequence, str, str2, upDownColor, str3, num, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof C40871qgC)) {
            return false;
        }
        C40871qgC c40871qgC = (C40871qgC) obj;
        return this.valueOf == c40871qgC.valueOf && Intrinsics.EZpvd(this.KWHzl, c40871qgC.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c40871qgC.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c40871qgC.gEmmrt) && this.djBIcL == c40871qgC.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c40871qgC.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, c40871qgC.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c40871qgC.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c40871qgC.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c40871qgC.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c40871qgC.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode2 = this.KWHzl.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.gEmmrt.hashCode();
        int iHashCode5 = this.djBIcL.hashCode();
        int iHashCode6 = this.EZpvd.hashCode();
        java.lang.Integer num = this.AYXKKw;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.AkhnZx.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        int i = this.valueOf;
        java.lang.CharSequence charSequence = this.KWHzl;
        return "TradeRadarViewPagerItemVo(position=" + i + ", currencyName=" + ((java.lang.Object) charSequence) + ", iconUrl=" + this.copydefault + ", profit=" + this.gEmmrt + ", profitColor=" + this.djBIcL + ", content=" + this.EZpvd + ", tagTitleResId=" + this.AYXKKw + ", timeDes=" + this.AkhnZx + ", itemType=" + this.AhwBna + ", instId=" + this.AEQbTJ + ", instType=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public C40871qgC(int i, @NotNull java.lang.CharSequence charSequence, java.lang.String str, @NotNull java.lang.String str2, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str3, @androidx.annotation.StringRes java.lang.Integer num, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.valueOf = i;
        this.KWHzl = charSequence;
        this.copydefault = str;
        this.gEmmrt = str2;
        this.djBIcL = upDownColor;
        this.EZpvd = str3;
        this.AYXKKw = num;
        this.AkhnZx = str4;
        this.AhwBna = str5;
        this.AEQbTJ = str6;
        this.OLrzqt = str7;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40871qgC) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40871qgC) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
