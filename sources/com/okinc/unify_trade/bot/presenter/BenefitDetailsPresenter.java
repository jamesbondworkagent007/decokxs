package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54214xAc;
import o.C55804xqp;
import o.C55890xsV;
import o.C55894xsZ;
import o.C55925xtD;
import o.C55932xtK;
import o.C55952xte;
import o.C55954xtg;
import o.C55964xtq;
import o.C55970xtw;
import o.C55973xtz;
import o.C56220xyh;
import o.InterfaceC54501xKt;
import o.xKE;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BenefitDetailsPresenter extends AbsPresenter {
    public final C54214xAc AEQbTJ;
    public StrategyConfigInfo AhwBna;
    public final TradeLiveData<List<StrategyProfitResponse>> EZpvd;
    public StrategyDetailsResponse KWHzl;
    public List<AutoEarnStakingConfig> OLrzqt;
    public List<AutoEarnStakingConfig> copydefault;
    public final C56220xyh valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyProfitResponse>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<AutoEarnStakingConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull List<AutoEarnStakingConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        this.AhwBna = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.KWHzl = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56220xyh copydefault() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.copydefault = yDY.AhwBna();
        this.OLrzqt = yDY.AhwBna();
        this.AhwBna = new StrategyConfigInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (String) null, (String) null, (LmtOrderNumber) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnConfig) null, (String) null, (List) null, (List) null, (String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.AEQbTJ = new C54214xAc();
        this.valueOf = new C56220xyh();
        this.EZpvd = new TradeLiveData<>();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BenefitDetails copydefault(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        InterfaceC54501xKt c55952xte;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        String algoOrdType = c55804xqp.copydefault().getAlgoOrdType();
        switch (algoOrdType.hashCode()) {
            case -1574173039:
                if (!algoOrdType.equals("infinite_grid")) {
                    c55952xte = new C55952xte();
                } else {
                    C55932xtK c55932xtK = new C55932xtK();
                    c55932xtK.copydefault(this.KWHzl.isHistory());
                    c55952xte = c55932xtK;
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

    public final ArrayList<ItemData> KWHzl(@NotNull BenefitDetails benefitDetails) {
        Intrinsics.checkNotNullParameter(benefitDetails, "");
        C55890xsV c55890xsV = new C55890xsV();
        c55890xsV.EZpvd(this.AhwBna);
        return c55890xsV.KWHzl(benefitDetails);
    }

    public final void EZpvd() {
        String orderType = this.KWHzl.getOrderType();
        int iHashCode = orderType.hashCode();
        if (iHashCode == -591806012 ? orderType.equals("moon_grid") : !(iHashCode == -512749997 ? !orderType.equals("contract_grid") : !(iHashCode == 3181382 && orderType.equals("grid")))) {
            OLrzqt();
        } else {
            djBIcL();
        }
    }

    public final void djBIcL() {
        C54214xAc c54214xAc = this.AEQbTJ;
        c54214xAc.AEQbTJ(this.EZpvd);
        c54214xAc.copydefault(this.KWHzl.getAlgoId());
        xKK.Activity.execute$default(c54214xAc, 0L, 1, null);
    }

    public final void OLrzqt() {
        C56220xyh c56220xyh = this.valueOf;
        c56220xyh.AEQbTJ(this.EZpvd);
        c56220xyh.OLrzqt(this.KWHzl.getAlgoId());
        xKK.Activity.execute$default(c56220xyh, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKE<List<StrategyProfitResponse>>> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.valueOf);
    }
}
