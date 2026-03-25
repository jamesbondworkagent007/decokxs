package com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.bot.data.SmartInvestData;
import com.okinc.unify_trade.bot.data.SmartInvestDetail;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartInvestDetailPresenter extends AbsPresenter {
    public SmartInvestDetail AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(SmartInvestDetail smartInvestDetail) {
        this.AEQbTJ = smartInvestDetail;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartInvestDetailPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final String OLrzqt() {
        String totalInvestPx;
        SmartInvestDetail smartInvestDetail = this.AEQbTJ;
        return (smartInvestDetail == null || (totalInvestPx = smartInvestDetail.getTotalInvestPx()) == null) ? "" : totalInvestPx;
    }

    public final List<SmartInvestData> copydefault() {
        List<SmartInvestData> investList;
        SmartInvestDetail smartInvestDetail = this.AEQbTJ;
        return (smartInvestDetail == null || (investList = smartInvestDetail.getInvestList()) == null) ? yDY.AhwBna() : investList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
