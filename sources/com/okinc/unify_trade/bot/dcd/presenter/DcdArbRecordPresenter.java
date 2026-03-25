package com.okinc.unify_trade.bot.dcd.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DcdArbRecord;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54233xAv;
import o.C55854xrm;
import o.C56402yEa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdArbRecordPresenter extends AbsPresenter {
    public StrategyDetailsResponse AEQbTJ;
    public final TradeLiveData<List<DcdArbRecord>> KWHzl;
    public final C54233xAv OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.AEQbTJ = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<DcdArbRecord>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdArbRecordPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C54233xAv();
        this.KWHzl = new TradeLiveData<>();
        this.AEQbTJ = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
    }

    public final void EZpvd() {
        C54233xAv c54233xAv = this.OLrzqt;
        c54233xAv.copydefault(this.AEQbTJ.getAlgoId());
        c54233xAv.OLrzqt(this.KWHzl, new C55854xrm(this.AEQbTJ.getInstType(), this.AEQbTJ.getInstId()));
        xKK.Activity.execute$default(c54233xAv, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.OLrzqt);
    }
}
