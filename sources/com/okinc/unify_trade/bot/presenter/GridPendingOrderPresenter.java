package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import o.C33129mqd;
import o.C54282xCq;
import o.C54308xDp;
import o.C55804xqp;
import o.C55941xtT;
import o.C55956xti;
import o.C56033xvF;
import o.C56071xvr;
import o.C56390yDp;
import o.xCZ;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridPendingOrderPresenter extends AbsPresenter {
    public final TradeLiveData<List<TickersData>> AEQbTJ;
    public final C54308xDp AYXKKw;
    public final C55956xti AhwBna;
    public StrategyDetailsResponse EZpvd;
    public final xCZ KWHzl;
    public final SharedFlow<GridPendingOrderData> OLrzqt;
    public final C54282xCq copydefault;
    public final TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> djBIcL;
    public final TradeLiveData<Pair<String, Integer>> gEmmrt;
    public final TradeLiveData<GridPendingOrderData> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<GridPendingOrderData> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<TickersData>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.EZpvd = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<GridPendingOrderData> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54282xCq copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, Integer>> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55956xti gEmmrt() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridPendingOrderPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.AhwBna = new C55956xti();
        this.AYXKKw = new C54308xDp();
        this.gEmmrt = new TradeLiveData<>();
        this.KWHzl = new xCZ();
        TradeLiveData<GridPendingOrderData> tradeLiveData = new TradeLiveData<>();
        this.valueOf = tradeLiveData;
        this.djBIcL = new TradeLiveData<>();
        this.OLrzqt = FlowKt__ShareKt.shareIn$default(FlowLiveDataConversions.asFlow(tradeLiveData), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), 0, 4, null);
        this.copydefault = new C54282xCq();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final void valueOf() {
        C54282xCq c54282xCq = this.copydefault;
        c54282xCq.AEQbTJ(this.AEQbTJ);
        c54282xCq.AEQbTJ(this.EZpvd.getInstId());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    public final void DbNXlk() {
        C54308xDp c54308xDp = this.AYXKKw;
        c54308xDp.OLrzqt(this.gEmmrt, new C55941xtT());
        c54308xDp.KWHzl(this.EZpvd.getInstId());
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        xCZ xcz = this.KWHzl;
        TradeLiveData<GridPendingOrderData> tradeLiveData = this.valueOf;
        C55956xti c55956xti = new C55956xti();
        c55956xti.KWHzl(str);
        Unit unit = Unit.INSTANCE;
        xcz.OLrzqt(tradeLiveData, c55956xti);
        xcz.KWHzl(true);
        xcz.OLrzqt(new StrategyOrderBillDetailsReq(this.EZpvd.getAlgoId(), "0", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.EZpvd.getOrderType(), (String) null, 764, (DefaultConstructorMarker) null));
        xKK.Activity.execute$default(xcz, 0L, 1, null);
    }

    public final void AhwBna() {
        xCZ xcz = this.KWHzl;
        xcz.AEQbTJ(this.djBIcL);
        xcz.KWHzl(true);
        xcz.OLrzqt(new StrategyOrderBillDetailsReq(this.EZpvd.getAlgoId(), "0", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.EZpvd.getOrderType(), (String) null, 764, (DefaultConstructorMarker) null));
        xKK.Activity.execute$default(xcz, 0L, 1, null);
    }

    public final String AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        String singleAmt = strategyDetailsResponse.getSingleAmt();
        if (singleAmt == null || StringsKt__StringsKt.fARcdN((CharSequence) singleAmt)) {
            return "--";
        }
        return C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + C56033xvF.getBotAmountUnit$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getCtVal(), null, 8, null);
    }

    public final Pair<String, Integer> OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Pair<String, Integer> value = this.gEmmrt.getValue();
        if (C33129mqd.AEQbTJ(str, value != null ? value.getFirst() : null)) {
            return C56390yDp.OLrzqt(str, Integer.valueOf(C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null)));
        }
        return C56390yDp.OLrzqt(str, Integer.valueOf(C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null)));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AYXKKw, this.KWHzl, this.copydefault);
    }
}
