package com.okinc.tradeuilib.order.strategy;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54589xNz;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xOW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class StrategyTradePresenter extends AbsPresenter {
    public Function2<? super String, ? super String, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyTradePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final String AEQbTJ(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -2027980370) {
            return iHashCode != 2558355 ? AEQbTJ(z, str2, str3) : AEQbTJ(z, str2, str3);
        }
        if (str.equals("MARGIN")) {
            return str3;
        }
        return "";
    }

    public final String AEQbTJ(boolean z, String str, String str2) {
        String currentMarginMode$default;
        MarginModeManager marginModeManagerIsConnected;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        xOW newProxyInstance = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.getNewProxyInstance() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) == null) {
            currentMarginMode$default = "";
        }
        if (newProxyInstance != null && newProxyInstance.AhwBna() && Intrinsics.EZpvd((Object) currentMarginMode$default, (Object) "cross")) {
            return "";
        }
        if (Intrinsics.EZpvd((Object) (newProxyInstance != null ? newProxyInstance.AuCTelauCTel() : null), (Object) "long_short_mode") && Intrinsics.EZpvd((Object) currentMarginMode$default, (Object) "isolated") && z) {
            return str;
        }
        if (Intrinsics.EZpvd((Object) (newProxyInstance != null ? newProxyInstance.AuCTelauCTel() : null), (Object) "long_short_mode")) {
            Intrinsics.EZpvd((Object) currentMarginMode$default, (Object) "isolated");
        }
        return str2;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
