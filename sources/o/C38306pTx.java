package o;

import com.ibm.icu.impl.number.CustomSymbolCurrency;
import com.ibm.icu.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38306pTx {
    public static boolean EZpvd = false;
    public static final C38306pTx AEQbTJ = new C38306pTx();
    public static final int copydefault = 8;

    private C38306pTx() {
    }

    public final int AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!KWHzl(str)) {
            return 2;
        }
        Currency currency = Currency.getInstance(str);
        Intrinsics.checkNotNullExpressionValue(currency, "");
        return currency.getDefaultFractionDigits();
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set<Currency> availableCurrencies = Currency.getAvailableCurrencies();
        Intrinsics.checkNotNullExpressionValue(availableCurrencies, "");
        java.util.Set<Currency> set = availableCurrencies;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((Currency) it.next()).getCurrencyCode());
        }
        boolean z = (arrayList.isEmpty() ^ true) && arrayList.contains(str);
        if (!EZpvd || z) {
            return z;
        }
        throw new java.lang.IllegalArgumentException("Currency code " + str + " is not available.");
    }

    public final Currency OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!KWHzl(str)) {
            return new CustomSymbolCurrency(str, str, str);
        }
        Currency currency = Currency.getInstance(str);
        Intrinsics.checkNotNullExpressionValue(currency, "");
        return currency;
    }
}
