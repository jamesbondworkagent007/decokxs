package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotSignIntroPresenter extends AbsPresenter {
    public SignalListItem KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalListItem EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(SignalListItem signalListItem) {
        this.KWHzl = signalListItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotSignIntroPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final boolean copydefault() {
        SignalListItem signalListItem = this.KWHzl;
        if (!Intrinsics.EZpvd((Object) (signalListItem != null ? signalListItem.getType() : null), (Object) "created")) {
            SignalListItem signalListItem2 = this.KWHzl;
            if (!Intrinsics.EZpvd((Object) (signalListItem2 != null ? signalListItem2.getSignalSourceType() : null), (Object) "1")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
