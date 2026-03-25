package o;

import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWH {
    @yCM
    public kWH() {
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeStatePool tradeStatePool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        if (C23313hvq.OLrzqt(str, str2)) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.BALANCE, true, SwapState.INSUFFICIENT_BALANCE, true, false));
        } else {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.BALANCE, true, SwapState.BALANCE_SUCCESS, false, true));
        }
    }
}
