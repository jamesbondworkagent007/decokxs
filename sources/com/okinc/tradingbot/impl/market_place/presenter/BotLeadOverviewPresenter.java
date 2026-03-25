package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BotLeadOverviewModel;
import com.okinc.unify_trade.biz.BotLeadProfitOverviewModel;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C54507xKz;
import o.C56267xzb;
import o.C56269xzd;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadOverviewPresenter extends AbsPresenter {
    public static final int KWHzl;
    public final TradeLiveData<BotLeadProfitOverviewModel> AEQbTJ;
    public final TradeLiveData<BotLeadOverviewModel> EZpvd;
    public final C56269xzd OLrzqt;
    public final C56267xzb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = TradeLiveData.$stable;
        KWHzl = i | C56267xzb.AEQbTJ | i | C56269xzd.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotLeadOverviewModel> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotLeadProfitOverviewModel> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56267xzb copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadOverviewPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56269xzd();
        this.EZpvd = new TradeLiveData<>();
        this.copydefault = new C56267xzb();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56269xzd c56269xzd = this.OLrzqt;
        c56269xzd.EZpvd(str);
        c56269xzd.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56269xzd, 0L, 1, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56267xzb c56267xzb = this.copydefault;
        c56267xzb.EZpvd(str);
        c56267xzb.KWHzl(str2);
        c56267xzb.OLrzqt(this.AEQbTJ, new C54507xKz());
        xKK.Activity.execute$default(c56267xzb, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.OLrzqt, this.copydefault);
    }
}
