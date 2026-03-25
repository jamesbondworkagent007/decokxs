package com.okinc.tradingbot.impl.market_place.home.list.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeSignalSortConfig;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeSignalSquarePresenter extends AbsPresenter {
    public static final int OLrzqt = TradeLiveData.$stable;
    public final TradeLiveData<HomeSignalSortConfig> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeSignalSortConfig> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSignalSquarePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new TradeLiveData<>(HomeSignalSortConfig.SMART_SCORE);
    }

    public final void EZpvd(@NotNull HomeSignalSortConfig homeSignalSortConfig) {
        Intrinsics.checkNotNullParameter(homeSignalSortConfig, "");
        this.KWHzl.postValue(homeSignalSortConfig);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
