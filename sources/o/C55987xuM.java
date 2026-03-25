package o;

import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55987xuM {
    public final int AEQbTJ(@NotNull CoinMarginedCcyDisplay coinMarginedCcyDisplay) {
        Intrinsics.checkNotNullParameter(coinMarginedCcyDisplay, "");
        return coinMarginedCcyDisplay.getIndex();
    }

    public final CoinMarginedCcyDisplay KWHzl(int i) {
        CoinMarginedCcyDisplay coinMarginedCcyDisplay;
        CoinMarginedCcyDisplay[] coinMarginedCcyDisplayArrValues = CoinMarginedCcyDisplay.values();
        int length = coinMarginedCcyDisplayArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                coinMarginedCcyDisplay = null;
                break;
            }
            coinMarginedCcyDisplay = coinMarginedCcyDisplayArrValues[i2];
            if (coinMarginedCcyDisplay.getIndex() == i) {
                break;
            }
            i2++;
        }
        return coinMarginedCcyDisplay == null ? CoinMarginedCcyDisplay.COIN : coinMarginedCcyDisplay;
    }
}
