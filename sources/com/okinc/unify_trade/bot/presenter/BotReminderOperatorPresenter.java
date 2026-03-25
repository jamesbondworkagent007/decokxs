package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.biz.ToggleReinvestmentReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56111xwe;
import o.C56402yEa;
import o.xAE;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotReminderOperatorPresenter extends AbsPresenter {
    public final C56111xwe<BotModifyResp> AEQbTJ;
    public final xAE KWHzl;
    public TacticsData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TacticsData tacticsData) {
        this.copydefault = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAE KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotModifyResp> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotReminderOperatorPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new xAE();
        this.AEQbTJ = new C56111xwe<>();
    }

    public final void AEQbTJ(@NotNull ToggleReinvestmentReq toggleReinvestmentReq) {
        Intrinsics.checkNotNullParameter(toggleReinvestmentReq, "");
        xAE xae = this.KWHzl;
        xae.OLrzqt(toggleReinvestmentReq);
        xKK.Activity.execute$default(xae, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
