package o;

import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeLimitStatePool;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitErrorViewHandle;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hfH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22430hfH {
    public final C22495hgT EZpvd;
    public final InterfaceC22433hfK copydefault;

    public C22430hfH(@NotNull C22495hgT c22495hgT, InterfaceC22433hfK interfaceC22433hfK) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.EZpvd = c22495hgT;
        this.copydefault = interfaceC22433hfK;
    }

    public final void OLrzqt() {
        TradeLimitStatePool tradeLimitStatePoolZuWLRA = this.EZpvd.zuWLRA();
        CheckStep checkStep = CheckStep.INPUT;
        SwapState swapState = SwapState.COIN_ERROR;
        tradeLimitStatePoolZuWLRA.refreshStatePool(new TradeStep(checkStep, true, swapState, false, false));
        if (!C22416heu.zLjUOn()) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.FunctionUpgrade, SwapState.FUNCTION_UPGRADE, false, false, 4, null);
            return;
        }
        if (this.EZpvd.RdAHlO().isCurrentWalletStateError()) {
            this.EZpvd.values();
            OLrzqt(swapState, true, true);
            return;
        }
        java.lang.Integer numEZpvd = this.EZpvd.finit().EZpvd();
        if (numEZpvd != null && C31212lpk.copydefault.EZpvd(numEZpvd.intValue())) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.BlackAddress, SwapState.BLACK_ADDRESS, false, false, 4, null);
            return;
        }
        C22495hgT c22495hgT = this.EZpvd;
        Result<DexPresetResultVO> resultOLrzqt = c22495hgT.OLrzqt(c22495hgT.fARcdN());
        if (resultOLrzqt != null && Result.m7383isFailureimpl(resultOLrzqt.m7386unboximpl())) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.SwapConfigFetchFailed, SwapState.SWAP_CONFIG_FETCH_FAILED, false, false, 4, null);
            return;
        }
        java.lang.Integer numEZpvd2 = this.EZpvd.finit().EZpvd();
        if (numEZpvd2 != null && C31212lpk.copydefault.OLrzqt(numEZpvd2.intValue())) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.HoneyPot, swapState, false, false, 12, null);
            return;
        }
        if (this.EZpvd.OxVOHk()) {
            handleErrorState$default(this, this.EZpvd.DAIeex(), swapState, false, false, 12, null);
            return;
        }
        if (this.EZpvd.dxcTrN() == LimitMarketPrice.QuoteState.QuoteFail) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.QuoteFailed, swapState, false, false, 12, null);
            return;
        }
        if (this.EZpvd.dxcTrN() == LimitMarketPrice.QuoteState.NoLiquidityAtTheMoment) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.NoLiquidityAtTheMoment, swapState, false, false, 12, null);
            return;
        }
        if (this.EZpvd.dxcTrN() == LimitMarketPrice.QuoteState.NoLiquidity) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.NoLiquidity, swapState, false, false, 12, null);
        } else if (this.EZpvd.finit().gEmmrt()) {
            handleErrorState$default(this, LimitErrorViewHandle.ErrorType.MinAmount, SwapState.SWAP_AMOUNT_LOW, false, false, 12, null);
        } else {
            EZpvd();
        }
    }

    public final void EZpvd() {
        LimitErrorViewHandle.ErrorType errorType;
        hLI hliQUSxYX;
        LimitPairRateResponse limitPairRateResponseAYXKKw = this.EZpvd.finit().AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) (limitPairRateResponseAYXKKw != null ? limitPairRateResponseAYXKKw.getTokenType() : null), (java.lang.Object) "1") || (hliQUSxYX = this.EZpvd.QUSxYX()) == null || !Intrinsics.EZpvd(hliQUSxYX.copydefault(), java.lang.Boolean.TRUE)) {
            LimitPairRateResponse limitPairRateResponseAYXKKw2 = this.EZpvd.finit().AYXKKw();
            if (limitPairRateResponseAYXKKw2 == null || !limitPairRateResponseAYXKKw2.isHoneypotErrorCode()) {
                LimitPairRateResponse limitPairRateResponseAYXKKw3 = this.EZpvd.finit().AYXKKw();
                errorType = (limitPairRateResponseAYXKKw3 == null || !limitPairRateResponseAYXKKw3.isShowRateFluctuation()) ? LimitErrorViewHandle.ErrorType.NormalCoin : LimitErrorViewHandle.ErrorType.RATE_WARNING;
            } else {
                errorType = LimitErrorViewHandle.ErrorType.HoneyPotWarning;
            }
        } else {
            errorType = LimitErrorViewHandle.ErrorType.SlippageWarning;
        }
        InterfaceC22433hfK interfaceC22433hfK = this.copydefault;
        if (interfaceC22433hfK != null) {
            interfaceC22433hfK.EZpvd(errorType);
        }
        OLrzqt(SwapState.COIN_SUCCESS, true, true);
    }

    public static /* synthetic */ void handleErrorState$default(C22430hfH c22430hfH, LimitErrorViewHandle.ErrorType errorType, SwapState swapState, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        c22430hfH.OLrzqt(errorType, swapState, z, z2);
    }

    public final void OLrzqt(LimitErrorViewHandle.ErrorType errorType, SwapState swapState, boolean z, boolean z2) {
        InterfaceC22433hfK interfaceC22433hfK = this.copydefault;
        if (interfaceC22433hfK != null) {
            interfaceC22433hfK.EZpvd(errorType);
        }
        OLrzqt(swapState, z, z2);
    }

    public final void OLrzqt(SwapState swapState, boolean z, boolean z2) {
        this.EZpvd.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, true, swapState, z, z2));
    }
}
