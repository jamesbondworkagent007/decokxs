package com.okinc.tradingbot.impl.order.strategy.botTradeContainer;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotTradeContainerPresenter extends AbsPresenter {
    public final TradeLiveData<String> AEQbTJ;
    public String KWHzl;
    public String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotTradeContainerPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = "grid";
        this.OLrzqt = "0";
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final List<BotTradeTabType> EZpvd() {
        return yDY.gEmmrt(BotTradeTabType.AI, BotTradeTabType.MANUAL);
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) str, (Object) BotTradeTabType.AI.getType()) ? "0" : "1";
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
