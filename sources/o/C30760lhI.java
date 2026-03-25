package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30760lhI {
    public final AdvancedTradeType AEQbTJ;
    public final AdvancedQuoteUiData EZpvd;
    public final DexMultiTokenInfoBean KWHzl;
    public final DexMultiTokenInfoBean OLrzqt;
    public final InterfaceC30595leC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C30760lhI copy$default(C30760lhI c30760lhI, InterfaceC30595leC interfaceC30595leC, AdvancedQuoteUiData advancedQuoteUiData, AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC30595leC = c30760lhI.copydefault;
        }
        if ((i & 2) != 0) {
            advancedQuoteUiData = c30760lhI.EZpvd;
        }
        AdvancedQuoteUiData advancedQuoteUiData2 = advancedQuoteUiData;
        if ((i & 4) != 0) {
            advancedTradeType = c30760lhI.AEQbTJ;
        }
        AdvancedTradeType advancedTradeType2 = advancedTradeType;
        if ((i & 8) != 0) {
            dexMultiTokenInfoBean = c30760lhI.KWHzl;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        if ((i & 16) != 0) {
            dexMultiTokenInfoBean2 = c30760lhI.OLrzqt;
        }
        return c30760lhI.KWHzl(interfaceC30595leC, advancedQuoteUiData2, advancedTradeType2, dexMultiTokenInfoBean3, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC30595leC AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedQuoteUiData KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30760lhI KWHzl(InterfaceC30595leC interfaceC30595leC, AdvancedQuoteUiData advancedQuoteUiData, @NotNull AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        return new C30760lhI(interfaceC30595leC, advancedQuoteUiData, advancedTradeType, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedTradeType copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30760lhI)) {
            return false;
        }
        C30760lhI c30760lhI = (C30760lhI) obj;
        return Intrinsics.EZpvd(this.copydefault, c30760lhI.copydefault) && Intrinsics.EZpvd(this.EZpvd, c30760lhI.EZpvd) && this.AEQbTJ == c30760lhI.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c30760lhI.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c30760lhI.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InterfaceC30595leC interfaceC30595leC = this.copydefault;
        int iHashCode = interfaceC30595leC == null ? 0 : interfaceC30595leC.hashCode();
        AdvancedQuoteUiData advancedQuoteUiData = this.EZpvd;
        int iHashCode2 = advancedQuoteUiData == null ? 0 : advancedQuoteUiData.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.KWHzl;
        int iHashCode4 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ButtonController(error=" + this.copydefault + ", quote=" + this.EZpvd + ", trade=" + this.AEQbTJ + ", fromToken=" + this.KWHzl + ", baseToken=" + this.OLrzqt + ")";
    }

    public C30760lhI(InterfaceC30595leC interfaceC30595leC, AdvancedQuoteUiData advancedQuoteUiData, @NotNull AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        this.copydefault = interfaceC30595leC;
        this.EZpvd = advancedQuoteUiData;
        this.AEQbTJ = advancedTradeType;
        this.KWHzl = dexMultiTokenInfoBean;
        this.OLrzqt = dexMultiTokenInfoBean2;
    }
}
