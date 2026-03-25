package com.okinc.tradingbot.impl.strategy.social;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetails;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56204xyR;
import o.C56402yEa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadProfitSharePresenter extends AbsPresenter {
    public final TradeLiveData<List<BotLeadProfitProfitDetails>> KWHzl;
    public final C56204xyR copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = TradeLiveData.$stable | C56204xyR.copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotLeadProfitProfitDetails>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56204xyR OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadProfitSharePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56204xyR();
        this.KWHzl = new TradeLiveData<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.social.BotLeadProfitSharePresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56204xyR c56204xyR = this.copydefault;
        c56204xyR.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c56204xyR.EZpvd(str, "1", "50"), 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }
}
