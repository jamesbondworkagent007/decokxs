package o;

import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.vTf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50568vTf {
    public static void copydefault(BotOrderConfirmFragment botOrderConfirmFragment, CoroutineDispatcher coroutineDispatcher) {
        botOrderConfirmFragment.dispatcherIo = coroutineDispatcher;
    }

    public static void EZpvd(BotOrderConfirmFragment botOrderConfirmFragment, C52671wUa c52671wUa) {
        botOrderConfirmFragment.getGridMarginUsageUseCase = c52671wUa;
    }
}
