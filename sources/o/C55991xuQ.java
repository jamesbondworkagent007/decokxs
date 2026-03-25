package o;

import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import com.okinc.unify_trade.bot.storage.BotStorageDatabase;
import com.okinc.unify_trade.bot.storage.CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1;
import com.okinc.unify_trade.bot.storage.CoinMarginedContractProfitDisplayRepository$saveSelectedDisplay$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55991xuQ {
    public static final C55991xuQ KWHzl = new C55991xuQ();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xuT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C55991xuQ.OLrzqt();
        }
    });
    public static final ConcurrentHashMap<java.lang.String, CoinMarginedCcyDisplay> OLrzqt = new ConcurrentHashMap<>();
    public static final int EZpvd = 8;

    private C55991xuQ() {
    }

    public final BotStorageDatabase AEQbTJ() {
        return (BotStorageDatabase) copydefault.getValue();
    }

    public static final BotStorageDatabase OLrzqt() {
        return BotStorageDatabase.Companion.EZpvd(C43246rlf.OLrzqt.valueOf());
    }

    public final InterfaceC55986xuL EZpvd() {
        return AEQbTJ().AEQbTJ();
    }

    public final CoinMarginedCcyDisplay copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return CoinMarginedCcyDisplay.COIN;
        }
        ConcurrentHashMap<java.lang.String, CoinMarginedCcyDisplay> concurrentHashMap = OLrzqt;
        CoinMarginedCcyDisplay coinMarginedCcyDisplay = concurrentHashMap.get(str);
        if (coinMarginedCcyDisplay != null) {
            return coinMarginedCcyDisplay;
        }
        try {
            CoinMarginedCcyDisplay coinMarginedCcyDisplay2 = (CoinMarginedCcyDisplay) BuildersKt__BuildersKt.runBlocking$default(null, new CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1(str, null), 1, null);
            concurrentHashMap.put(str, coinMarginedCcyDisplay2);
            return coinMarginedCcyDisplay2;
        } catch (java.lang.Exception e) {
            pUU.copydefault("CoinMarginedContractProfitDisplayRepository", "getSelectedDisplay failed - " + e);
            return CoinMarginedCcyDisplay.COIN;
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull CoinMarginedCcyDisplay coinMarginedCcyDisplay) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinMarginedCcyDisplay, "");
        if (str.length() == 0) {
            return;
        }
        OLrzqt.put(str, coinMarginedCcyDisplay);
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new CoinMarginedContractProfitDisplayRepository$saveSelectedDisplay$1(str, coinMarginedCcyDisplay, null), 1, null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("CoinMarginedContractProfitDisplayRepository", "saveSelectedDisplay failed - " + e);
            OLrzqt.remove(str);
        }
    }
}
