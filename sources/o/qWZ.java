package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.watch.usecase.MarketDataToCoinQuoteUseCase$onExecute$2;
import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWZ extends AbstractC49400uno<Flow<? extends java.util.List<? extends MarketDataSource>>, Flow<? extends java.util.List<? extends CoinQuote>>> {
    public final CoroutineDispatcher KWHzl;
    public final C40421qVf OLrzqt;
    public final qUV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Flow<? extends java.util.List<? extends MarketDataSource>>) obj, (Continuation<? super Flow<? extends java.util.List<CoinQuote>>>) continuation);
    }

    @yCM
    public qWZ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40421qVf c40421qVf, @NotNull qUV quv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40421qVf, "");
        Intrinsics.checkNotNullParameter(quv, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c40421qVf;
        this.copydefault = quv;
    }

    public java.lang.Object EZpvd(@NotNull Flow<? extends java.util.List<? extends MarketDataSource>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<CoinQuote>>> continuation) {
        return FlowKt.flowOn(FlowKt.flowCombine(flow, this.OLrzqt.KWHzl(), new MarketDataToCoinQuoteUseCase$onExecute$2(null)), AEQbTJ());
    }
}
