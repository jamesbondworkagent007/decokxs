package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54282xCq;
import o.C54301xDi;
import o.C54308xDp;
import o.C55804xqp;
import o.C55888xsT;
import o.C55894xsZ;
import o.C55925xtD;
import o.C55926xtE;
import o.C55932xtK;
import o.C55941xtT;
import o.C55950xtc;
import o.C55952xte;
import o.C55954xtg;
import o.C55964xtq;
import o.C55970xtw;
import o.C55973xtz;
import o.C56033xvF;
import o.C56071xvr;
import o.C56390yDp;
import o.InterfaceC54501xKt;
import o.xCZ;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BotOrderKlinePresenter extends AbsPresenter {
    public final TradeLiveData<List<TickersData>> AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public TacticsData AkhnZx;
    public final C54308xDp DbNXlk;
    public final C54282xCq EZpvd;
    public final TradeLiveData<GridPendingOrderData> KWHzl;
    public StrategyDetailsResponse OLrzqt;
    public final xCZ copydefault;
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> djBIcL;
    public String gEmmrt;
    public final TradeLiveData<Pair<String, Integer>> isConnected;
    public String valueOf;
    public final C54301xDi values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, Integer>> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<GridPendingOrderData> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.OLrzqt = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TacticsData tacticsData) {
        this.AkhnZx = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<TickersData>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData valueOf() {
        return this.AkhnZx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOrderKlinePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.valueOf = "";
        this.gEmmrt = "";
        this.AhwBna = "";
        this.OLrzqt = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        boolean z = false;
        this.values = new C54301xDi(z, 1, null);
        this.djBIcL = new TradeLiveData<>();
        this.DbNXlk = new C54308xDp();
        this.isConnected = new TradeLiveData<>();
        this.copydefault = new xCZ();
        this.KWHzl = new TradeLiveData<>();
        this.EZpvd = new C54282xCq();
        this.AEQbTJ = new TradeLiveData<>();
        this.AYXKKw = "";
    }

    public final void AkhnZx() {
        TacticsData tacticsData = this.AkhnZx;
        if (tacticsData != null) {
            C54282xCq c54282xCq = this.EZpvd;
            c54282xCq.AEQbTJ(this.AEQbTJ);
            c54282xCq.AEQbTJ(tacticsData.getInstId());
            xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
        }
    }

    public final void fetchVPNInfo() {
        TacticsData tacticsData = this.AkhnZx;
        if (tacticsData != null) {
            C54308xDp c54308xDp = this.DbNXlk;
            c54308xDp.OLrzqt(this.isConnected, new C55941xtT());
            c54308xDp.KWHzl(tacticsData.getInstId());
            xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
        }
    }

    public final void AYXKKw() {
        TacticsData tacticsData = this.AkhnZx;
        if (tacticsData != null) {
            C54301xDi c54301xDi = this.values;
            c54301xDi.AEQbTJ(this.djBIcL);
            c54301xDi.AEQbTJ(tacticsData.getAlgoId());
            xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TacticsData tacticsData = this.AkhnZx;
        if (tacticsData != null) {
            xCZ xcz = this.copydefault;
            TradeLiveData<GridPendingOrderData> tradeLiveData = this.KWHzl;
            C55888xsT c55888xsT = new C55888xsT();
            c55888xsT.EZpvd(C56033xvF.copydefault(str, this.gEmmrt, this.valueOf));
            c55888xsT.OLrzqt(this.valueOf);
            c55888xsT.copydefault(this.gEmmrt);
            Unit unit = Unit.INSTANCE;
            xcz.OLrzqt(tradeLiveData, c55888xsT);
            xcz.KWHzl(true);
            xcz.OLrzqt(new StrategyOrderBillDetailsReq(tacticsData.getAlgoId(), "0", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, isConnected(), (String) null, 764, (DefaultConstructorMarker) null));
            xKK.Activity.execute$default(xcz, 0L, 1, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [142=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BenefitDetails OLrzqt(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        InterfaceC54501xKt c55952xte;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        String algoOrdType = c55804xqp.copydefault().getAlgoOrdType();
        switch (algoOrdType.hashCode()) {
            case -1831183611:
                if (!algoOrdType.equals("spot_dca")) {
                    c55952xte = new C55952xte();
                } else {
                    C55926xtE c55926xtE = new C55926xtE();
                    c55926xtE.EZpvd(this.OLrzqt.isHistory());
                    c55952xte = c55926xtE;
                }
                break;
            case -1574173039:
                if (algoOrdType.equals("infinite_grid")) {
                    c55952xte = new C55932xtK();
                    break;
                }
                break;
            case -1402017003:
                if (algoOrdType.equals("contract_dca")) {
                    c55952xte = new C55950xtc();
                    break;
                }
                break;
            case -1216369070:
                if (algoOrdType.equals("smart_portfolio")) {
                    c55952xte = new C55925xtD();
                    break;
                }
                break;
            case -1086683216:
                if (algoOrdType.equals("signal_bot")) {
                    c55952xte = new C55970xtw();
                    break;
                }
                break;
            case -557961837:
                if (algoOrdType.equals("smart_arbitrage")) {
                    c55952xte = new C55973xtz();
                    break;
                }
                break;
            case -512749997:
                if (algoOrdType.equals("contract_grid")) {
                    c55952xte = new C55894xsZ(false, 1, null);
                    break;
                }
                break;
            case 3181382:
                if (!algoOrdType.equals("grid")) {
                }
                break;
            case 1165749981:
                if (algoOrdType.equals("recurring")) {
                    c55952xte = new C55964xtq();
                    break;
                }
                break;
            case 1485620813:
                if (algoOrdType.equals("dcd_bot")) {
                    c55952xte = new C55954xtg();
                    break;
                }
                break;
        }
        return (BenefitDetails) c55952xte.KWHzl(c55804xqp);
    }

    private final String isConnected() {
        TacticsData tacticsData = this.AkhnZx;
        return tacticsData != null ? tacticsData.getOrderType() : "";
    }

    public final Pair<String, Integer> EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Pair<String, Integer> value = this.isConnected.getValue();
        if (C33129mqd.AEQbTJ(str, value != null ? value.getFirst() : null)) {
            return C56390yDp.OLrzqt(str, Integer.valueOf(C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null)));
        }
        return C56390yDp.OLrzqt(str, Integer.valueOf(C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String OLrzqt() {
        TacticsData tacticsData = this.AkhnZx;
        if (tacticsData != null) {
            String orderType = tacticsData.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    if (orderType.equals("spot_dca")) {
                        return "spot_dca";
                    }
                    break;
                case -1402017003:
                    if (orderType.equals("contract_dca")) {
                        return "futures_dca";
                    }
                    break;
                case -512749997:
                    if (orderType.equals("contract_grid")) {
                        return "futures_grid";
                    }
                    break;
                case 3181382:
                    if (orderType.equals("grid")) {
                        return "spot_grid";
                    }
                    break;
            }
        }
        return "";
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.DbNXlk, this.values, this.copydefault, this.EZpvd);
    }
}
