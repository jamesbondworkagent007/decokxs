package com.okinc.unify_trade.bot.dcd.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.bot.dcd.presenter.DcdCreatePresenter;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdCreatePresenter extends BaseBotOrderPresenter {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdCreatePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xrr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DcdCreatePresenter.EZpvd();
            }
        });
    }

    public final String AEQbTJ() {
        return (String) this.OLrzqt.getValue();
    }

    public static final String EZpvd() {
        return UUID.randomUUID().toString();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
