package o;

import com.okinc.buysell.domain.CacheLegacyCoinsUseCase$cacheCoinPairs$2;
import com.okinc.buysell.domain.CacheLegacyCoinsUseCase$cacheSellCoins$2;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyE {
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public lyE(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(@NotNull CryptoListModel cryptoListModel, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new CacheLegacyCoinsUseCase$cacheCoinPairs$2(cryptoListModel, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<CurrencyToken> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new CacheLegacyCoinsUseCase$cacheSellCoins$2(list, str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
