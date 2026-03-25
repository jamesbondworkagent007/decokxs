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
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.data.HistoryEventCard;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55958xtk;
import o.C55972xty;
import o.C56264xzY;
import o.xDK;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HistoryEventPresenter extends AbsPresenter {
    public final xDK AEQbTJ;
    public final String EZpvd;
    public final C55972xty KWHzl;
    public final TradeLiveData<List<HistoryEventCard>> OLrzqt;
    public StrategyDetailsResponse copydefault;
    public final TradeLiveData<ArrayList<TransDetailsData>> djBIcL;
    public final C56264xzY gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<TransDetailsData>> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<HistoryEventCard>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.copydefault = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56264xzY KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDK copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryEventPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.AEQbTJ = new xDK();
        this.OLrzqt = new TradeLiveData<>();
        this.gEmmrt = new C56264xzY();
        this.djBIcL = new TradeLiveData<>();
        this.KWHzl = new C55972xty();
        this.EZpvd = "20";
    }

    public final void OLrzqt() {
        xDK xdk = this.AEQbTJ;
        xdk.OLrzqt(this.copydefault.getAlgoId(), this.KWHzl.EZpvd(), this.EZpvd);
        xdk.OLrzqt(this.OLrzqt, this.KWHzl);
        xKK.Activity.execute$default(xdk, 0L, 1, null);
    }

    public final void AEQbTJ(String str) {
        C56264xzY c56264xzY = this.gEmmrt;
        String algoId = this.copydefault.getAlgoId();
        if (str == null) {
            str = "";
        }
        c56264xzY.EZpvd(algoId, str);
        c56264xzY.OLrzqt(this.djBIcL, new C55958xtk());
        xKK.Activity.execute$default(c56264xzY, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.gEmmrt);
    }
}
