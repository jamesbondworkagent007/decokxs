package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaStartConditionPresenter extends AbsPresenter {
    public SpotDcaAdvancedParams AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaAdvancedParams KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(SpotDcaAdvancedParams spotDcaAdvancedParams) {
        this.AEQbTJ = spotDcaAdvancedParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaStartConditionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
