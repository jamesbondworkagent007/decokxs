package com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.bot.data.IntroItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartIntroPresenter extends AbsPresenter {
    public IntroItemData EZpvd;
    public SmartPortfolioReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SmartPortfolioReq smartPortfolioReq) {
        Intrinsics.checkNotNullParameter(smartPortfolioReq, "");
        this.KWHzl = smartPortfolioReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull IntroItemData introItemData) {
        Intrinsics.checkNotNullParameter(introItemData, "");
        this.EZpvd = introItemData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartIntroPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final IntroItemData copydefault() {
        IntroItemData introItemData = this.EZpvd;
        if (introItemData != null) {
            return introItemData;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final SmartPortfolioReq AEQbTJ() {
        SmartPortfolioReq smartPortfolioReq = this.KWHzl;
        if (smartPortfolioReq != null) {
            return smartPortfolioReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
