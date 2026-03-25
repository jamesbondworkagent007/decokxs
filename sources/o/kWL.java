package o;

import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWL {
    @yCM
    public kWL() {
    }

    public static /* synthetic */ void checkInput$default(kWL kwl, java.lang.String str, TradeStatePool tradeStatePool, kotlin.Pair pair, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        kwl.OLrzqt(str, tradeStatePool, pair, z);
    }

    public final void OLrzqt(java.lang.String str, @NotNull TradeStatePool tradeStatePool, kotlin.Pair<? extends InterfaceC28268kVc, ? extends InterfaceC28268kVc> pair, boolean z) {
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        if (pair == null) {
            KWHzl(str, tradeStatePool);
            return;
        }
        if ((pair.getFirst().AEQbTJ() || pair.getSecond().AEQbTJ()) && z) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SAFEMOON_COIN, true, false));
        } else if (pair.getFirst().EZpvd() || pair.getSecond().EZpvd()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.STAND_BY_LEVERAGE, true, false));
        } else {
            KWHzl(str, tradeStatePool);
        }
    }

    public final void OLrzqt(java.lang.String str, @NotNull TradeStatePool tradeStatePool, kotlin.Pair<? extends InterfaceC28268kVc, ? extends InterfaceC28268kVc> pair, @NotNull TransactionType transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        if (pair == null) {
            KWHzl(str, tradeStatePool);
            return;
        }
        if (pair.getFirst().EZpvd() || pair.getSecond().EZpvd()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, transactionType == TransactionType.Buy ? SwapState.STAND_BY_LEVERAGE : SwapState.STAND_BY_LEVERAGE_WARNING, true, true));
        } else if (pair.getFirst().KWHzl() || pair.getSecond().KWHzl()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, transactionType == TransactionType.Buy ? SwapState.STAND_BY_DISH : SwapState.STAND_BY_DISH_WARNING, true, true));
        } else if (z) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.PRE_CHECK_FAIL, true, false));
        } else {
            KWHzl(str, tradeStatePool);
        }
    }

    public final void KWHzl(java.lang.String str, TradeStatePool tradeStatePool) {
        if (C23313hvq.copydefault(str, 0)) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.ZERO_FORM_AMOUNT, true, false));
        } else if (C23313hvq.OLrzqt(str, 0)) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_INPUT_SUCCESS, false, true));
        } else {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_INPUT, true, false));
        }
    }
}
