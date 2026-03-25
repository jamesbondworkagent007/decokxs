package com.okinc.tradingbot.impl.common;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EmptyBotOrderPresenter extends BaseBotOrderPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyBotOrderPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
