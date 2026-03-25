package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hLw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21775hLw {
    public LimitCalResult AEQbTJ;
    public java.lang.String EZpvd;
    public final C22495hgT KWHzl;
    public LimitPairRateResponse OLrzqt;
    public java.lang.Integer copydefault;

    public final java.lang.Void AEQbTJ() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPairRateResponse AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.OLrzqt = null;
        this.AEQbTJ = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Integer num) {
        this.copydefault = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull LimitCalResult limitCalResult) {
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        this.AEQbTJ = limitCalResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitCalResult copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull LimitPairRateResponse limitPairRateResponse) {
        Intrinsics.checkNotNullParameter(limitPairRateResponse, "");
        this.OLrzqt = limitPairRateResponse;
    }

    public C21775hLw(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.KWHzl = c22495hgT;
    }

    public final java.lang.String OLrzqt() {
        LimitPairRateResponse limitPairRateResponse = this.OLrzqt;
        if (limitPairRateResponse != null) {
            return limitPairRateResponse.getChangeRate();
        }
        return null;
    }

    public static /* synthetic */ java.lang.Boolean needShowLowPriceWarning$default(C21775hLw c21775hLw, java.lang.String str, LimitOrderRateView.ShowType showType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c21775hLw.copydefault(str, showType);
    }

    public final java.lang.Boolean copydefault(@NotNull java.lang.String str, @NotNull LimitOrderRateView.ShowType showType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(showType, "");
        LimitPairRateResponse limitPairRateResponse = this.OLrzqt;
        if (limitPairRateResponse != null) {
            return java.lang.Boolean.valueOf(limitPairRateResponse.isDiffMoreThanNormal(str, showType));
        }
        return null;
    }

    public final boolean gEmmrt() {
        DefiChainInfo newProxyInstance = this.KWHzl.getNewProxyInstance();
        java.lang.String limitOrderTradeMinUSD = newProxyInstance != null ? newProxyInstance.getLimitOrderTradeMinUSD() : null;
        java.lang.String fromTokenPrice = this.KWHzl.djSkpj().getValue().getFromTokenPrice();
        java.lang.String strGHZMYf = this.KWHzl.gHZMYf();
        if (C23313hvq.OLrzqt(limitOrderTradeMinUSD, 0) && C23313hvq.OLrzqt(fromTokenPrice, 0) && C23313hvq.OLrzqt(strGHZMYf, 0)) {
            if (C23313hvq.KWHzl(strGHZMYf != null ? C23313hvq.mulCheckS$default(strGHZMYf, fromTokenPrice, null, null, null, 14, null) : null, limitOrderTradeMinUSD)) {
                return true;
            }
        }
        return false;
    }
}
