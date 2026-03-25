package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C53871wtf;
import o.C54282xCq;
import o.C54506xKy;
import o.C56258xzS;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotLeadSuccessPresenter extends AbsPresenter {
    public static final int KWHzl;
    public final TradeLiveData<StrategyPendingListResp> AEQbTJ;
    public final C56258xzS EZpvd;
    public final TradeLiveData<TacticsData> OLrzqt;
    public final C54282xCq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = TradeLiveData.$stable;
        KWHzl = i | C54282xCq.EZpvd | i | C56258xzS.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyPendingListResp> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56258xzS OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TacticsData> copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadSuccessPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56258xzS();
        this.AEQbTJ = new TradeLiveData<>();
        this.copydefault = new C54282xCq();
        this.OLrzqt = new TradeLiveData<>();
    }

    public final void AEQbTJ(String str, String str2) {
        C56258xzS c56258xzS = this.EZpvd;
        StrategyPendingListReq strategyPendingListReq = new StrategyPendingListReq();
        strategyPendingListReq.setAlgoId(str);
        if (str2 == null) {
            str2 = "";
        }
        strategyPendingListReq.setOrdType(str2);
        c56258xzS.KWHzl(strategyPendingListReq);
        c56258xzS.OLrzqt(this.AEQbTJ, new C54506xKy());
        xKK.Activity.execute$default(c56258xzS, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull StrategyPendingListResp strategyPendingListResp) {
        Intrinsics.checkNotNullParameter(strategyPendingListResp, "");
        C54282xCq c54282xCq = this.copydefault;
        TradeLiveData<TacticsData> tradeLiveData = this.OLrzqt;
        C53871wtf c53871wtf = new C53871wtf();
        c53871wtf.KWHzl(strategyPendingListResp);
        Unit unit = Unit.INSTANCE;
        c54282xCq.OLrzqt(tradeLiveData, c53871wtf);
        c54282xCq.AEQbTJ(strategyPendingListResp.getInstId());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.EZpvd, this.copydefault);
    }
}
