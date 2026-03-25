package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kTG {
    public final C28222kTk AEQbTJ;
    public final DexMultiTokenInfoBean AYXKKw;
    public final AdvancedLimitBy AhwBna;
    public final java.util.List<java.lang.String> EZpvd;
    public final DexMultiTokenInfoBean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final AdvancedTradeType djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedLimitBy AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28222kTk EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kTG OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.util.List<java.lang.String> list, @NotNull AdvancedLimitBy advancedLimitBy, @NotNull C28222kTk c28222kTk, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        Intrinsics.checkNotNullParameter(c28222kTk, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        return new kTG(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str, list, advancedLimitBy, c28222kTk, str2, str3, advancedTradeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kTG)) {
            return false;
        }
        kTG ktg = (kTG) obj;
        return Intrinsics.EZpvd(this.KWHzl, ktg.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, ktg.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) ktg.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, ktg.EZpvd) && this.AhwBna == ktg.AhwBna && Intrinsics.EZpvd(this.AEQbTJ, ktg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ktg.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ktg.copydefault) && this.djBIcL == ktg.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedTradeType gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.KWHzl;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.AYXKKw;
        int iHashCode2 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.util.List<java.lang.String> list = this.EZpvd;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LimitQuoteContext(fromToken=" + this.KWHzl + ", toToken=" + this.AYXKKw + ", tradeAmount=" + this.gEmmrt + ", dexIds=" + this.EZpvd + ", limitOrderBy=" + this.AhwBna + ", baseMarketInfo=" + this.AEQbTJ + ", baseTokenSymbol=" + this.OLrzqt + ", limitInput=" + this.copydefault + ", tradeType=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public kTG(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.util.List<java.lang.String> list, @NotNull AdvancedLimitBy advancedLimitBy, @NotNull C28222kTk c28222kTk, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        Intrinsics.checkNotNullParameter(c28222kTk, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        this.KWHzl = dexMultiTokenInfoBean;
        this.AYXKKw = dexMultiTokenInfoBean2;
        this.gEmmrt = str;
        this.EZpvd = list;
        this.AhwBna = advancedLimitBy;
        this.AEQbTJ = c28222kTk;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.djBIcL = advancedTradeType;
    }
}
