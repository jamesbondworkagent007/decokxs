package o;

import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOO implements gOU {
    public final TokenPairRateQuote EZpvd;

    public java.lang.Void KWHzl() {
        return null;
    }

    public java.lang.Void copydefault() {
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public boolean fetchVPNInfo() {
        return false;
    }

    public java.lang.Void gEmmrt() {
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public boolean isConnected() {
        return false;
    }

    public gOO(@NotNull TokenPairRateQuote tokenPairRateQuote) {
        Intrinsics.checkNotNullParameter(tokenPairRateQuote, "");
        this.EZpvd = tokenPairRateQuote;
    }

    @Override // o.InterfaceC19786gPg
    public /* synthetic */ java.lang.String AEQbTJ() {
        return (java.lang.String) copydefault();
    }

    @Override // o.InterfaceC19784gPe
    public /* synthetic */ java.lang.String AhwBna() {
        return (java.lang.String) gEmmrt();
    }

    @Override // o.InterfaceC19786gPg
    public /* synthetic */ java.lang.String EZpvd() {
        return (java.lang.String) KWHzl();
    }

    @Override // o.InterfaceC19784gPe
    public boolean values() {
        java.lang.String changeRate = this.EZpvd.getChangeRate();
        return !(changeRate == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) changeRate));
    }

    @Override // o.InterfaceC19784gPe
    public boolean AkhnZx() {
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken;
        TokenPairRateOrderInfo orderInfo = this.EZpvd.getOrderInfo();
        java.lang.String chainId = null;
        java.lang.String chainId2 = (orderInfo == null || (fromToken = orderInfo.getFromToken()) == null) ? null : fromToken.getChainId();
        TokenPairRateOrderInfo orderInfo2 = this.EZpvd.getOrderInfo();
        if (orderInfo2 != null && (toToken = orderInfo2.getToToken()) != null) {
            chainId = toToken.getChainId();
        }
        return (chainId2 == null || chainId == null || !Intrinsics.EZpvd((java.lang.Object) chainId2, (java.lang.Object) chainId)) ? false : true;
    }

    @Override // o.InterfaceC19784gPe
    public boolean ejfBZ() {
        return Intrinsics.EZpvd(this.EZpvd.getValDiff(), java.lang.Boolean.TRUE);
    }

    @Override // o.InterfaceC19784gPe
    public java.lang.String OLrzqt() {
        TokenPairRateOrderInfo orderInfo = this.EZpvd.getOrderInfo();
        if (orderInfo != null) {
            return orderInfo.getCode();
        }
        return null;
    }

    @Override // o.InterfaceC19788gPi
    public DexMultiTokenInfoBean AYXKKw() {
        TokenPairRateOrderInfo orderInfo = this.EZpvd.getOrderInfo();
        if (orderInfo != null) {
            return orderInfo.getFromToken();
        }
        return null;
    }

    @Override // o.InterfaceC19788gPi
    public DexMultiTokenInfoBean djBIcL() {
        TokenPairRateOrderInfo orderInfo = this.EZpvd.getOrderInfo();
        if (orderInfo != null) {
            return orderInfo.getToToken();
        }
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public java.lang.String DbNXlk() {
        TokenPairRateOrderInfo orderInfo = this.EZpvd.getOrderInfo();
        if (orderInfo != null) {
            return orderInfo.getTradeTaxes();
        }
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public java.lang.String valueOf() {
        return this.EZpvd.getFromTokenPrice();
    }
}
