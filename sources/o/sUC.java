package o;

import com.okinc.oklive.app.data.model.remote.TokenIcon;
import com.okinc.oklive.app.domain.model.PriceChangeDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class sUC {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final float AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<TokenIcon> OLrzqt;
    public final PriceChangeDirection copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TokenIcon> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceChangeDirection EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sUC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, float f, boolean z, @NotNull java.util.List<TokenIcon> list, @NotNull java.lang.String str7, @NotNull PriceChangeDirection priceChangeDirection, @NotNull java.lang.String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(priceChangeDirection, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new sUC(str, str2, str3, str4, str5, str6, f, z, list, str7, priceChangeDirection, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sUC)) {
            return false;
        }
        sUC suc = (sUC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) suc.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) suc.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) suc.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) suc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) suc.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) suc.gEmmrt) && java.lang.Float.compare(this.AhwBna, suc.AhwBna) == 0 && this.valueOf == suc.valueOf && Intrinsics.EZpvd(this.OLrzqt, suc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) suc.AEQbTJ) && this.copydefault == suc.copydefault && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) suc.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AkhnZx.hashCode();
        int iHashCode2 = this.DbNXlk.hashCode();
        java.lang.String str = this.AYXKKw;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Float.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCardViewData(tokenName=" + this.AkhnZx + ", tokenSymbol=" + this.DbNXlk + ", tokenIconUrl=" + this.AYXKKw + ", chainIconUrl=" + this.EZpvd + ", currentPrice=" + this.KWHzl + ", priceChange=" + this.gEmmrt + ", priceChangePercentage=" + this.AhwBna + ", isPinned=" + this.valueOf + ", icons=" + this.OLrzqt + ", instrumentId=" + this.AEQbTJ + ", changeDirection=" + this.copydefault + ", tag=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.AhwBna;
    }

    public sUC(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, float f, boolean z, @NotNull java.util.List<TokenIcon> list, @NotNull java.lang.String str7, @NotNull PriceChangeDirection priceChangeDirection, @NotNull java.lang.String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(priceChangeDirection, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
        this.AYXKKw = str3;
        this.EZpvd = str4;
        this.KWHzl = str5;
        this.gEmmrt = str6;
        this.AhwBna = f;
        this.valueOf = z;
        this.OLrzqt = list;
        this.AEQbTJ = str7;
        this.copydefault = priceChangeDirection;
        this.djBIcL = str8;
    }
}
