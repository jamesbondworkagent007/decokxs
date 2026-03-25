package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalBotSummaryBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C54506xKy;
import o.C56266xza;
import o.C56402yEa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotLeadPendingSignalBotPresenter extends AbsPresenter {
    public static final int OLrzqt = TradeLiveData.$stable | C56266xza.KWHzl;
    public final TradeLiveData<SignalBotSummaryBean> EZpvd;
    public final C56266xza KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56266xza KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SignalBotSummaryBean> copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadPendingSignalBotPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56266xza();
        this.EZpvd = new TradeLiveData<>();
    }

    public final void OLrzqt() {
        C56266xza c56266xza = this.KWHzl;
        c56266xza.OLrzqt(this.EZpvd, new C54506xKy());
        xKK.Activity.execute$default(c56266xza, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
