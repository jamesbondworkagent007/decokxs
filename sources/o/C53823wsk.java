package o;

import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.wsk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53823wsk {
    public static void EZpvd(SignalCloneBottomSheet signalCloneBottomSheet, CoroutineDispatcher coroutineDispatcher) {
        signalCloneBottomSheet.ioDispatcher = coroutineDispatcher;
    }

    public static void KWHzl(SignalCloneBottomSheet signalCloneBottomSheet, CoroutineDispatcher coroutineDispatcher) {
        signalCloneBottomSheet.defaultDispatcher = coroutineDispatcher;
    }

    public static void copydefault(SignalCloneBottomSheet signalCloneBottomSheet, C48158uHc c48158uHc) {
        signalCloneBottomSheet.fetchBalanceUseCase = c48158uHc;
    }

    public static void copydefault(SignalCloneBottomSheet signalCloneBottomSheet, C52020vxx c52020vxx) {
        signalCloneBottomSheet.fetchMinimumInvestAmountUseCase = c52020vxx;
    }

    public static void OLrzqt(SignalCloneBottomSheet signalCloneBottomSheet, C53735wrB c53735wrB) {
        signalCloneBottomSheet.placeBotOrderUseCase = c53735wrB;
    }

    public static void KWHzl(SignalCloneBottomSheet signalCloneBottomSheet, C53736wrC c53736wrC) {
        signalCloneBottomSheet.fetchCloneAlgoInfoUseCase = c53736wrC;
    }

    public static void AEQbTJ(SignalCloneBottomSheet signalCloneBottomSheet, C53784wry c53784wry) {
        signalCloneBottomSheet.botOrderRequestModelUseCase = c53784wry;
    }
}
