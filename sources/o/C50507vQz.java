package o;

import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.vQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50507vQz {
    public static void KWHzl(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C50544vSi c50544vSi) {
        smartEarnAllocationBottomSheet.smartEarnComputationUseCase = c50544vSi;
    }

    public static void EZpvd(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C50545vSj c50545vSj) {
        smartEarnAllocationBottomSheet.editSmartEarnUseCase = c50545vSj;
    }

    public static void OLrzqt(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, CoroutineDispatcher coroutineDispatcher) {
        smartEarnAllocationBottomSheet.dispatcher = coroutineDispatcher;
    }
}
