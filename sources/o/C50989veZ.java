package o;

import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.veZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50989veZ {
    public static void OLrzqt(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, C52680wUj c52680wUj) {
        futuresGridWithdrawProfitSheet.webSocketManager = c52680wUj;
    }

    public static void OLrzqt(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, C51052vfj c51052vfj) {
        futuresGridWithdrawProfitSheet.fetchPositionMarginBalanceUseCase = c51052vfj;
    }

    public static void OLrzqt(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, C51053vfk c51053vfk) {
        futuresGridWithdrawProfitSheet.adjustPositionMarginBalanceUseCase = c51053vfk;
    }

    public static void EZpvd(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, CoroutineDispatcher coroutineDispatcher) {
        futuresGridWithdrawProfitSheet.defaultDispatcher = coroutineDispatcher;
    }

    public static void AEQbTJ(FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheet, CoroutineDispatcher coroutineDispatcher) {
        futuresGridWithdrawProfitSheet.ioDispatcher = coroutineDispatcher;
    }
}
