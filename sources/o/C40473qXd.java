package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.watch.usecase.MarketDataToCoinQuoteWithIconUseCase$onExecute$2;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40473qXd extends AbstractC49400uno<kotlin.Pair<? extends Flow<? extends java.util.List<? extends MarketDataSource>>, ? extends java.util.List<? extends TradeCoinInfo>>, Flow<? extends java.util.List<? extends CoinQuote>>> {
    public final C40421qVf AEQbTJ;
    public final qUV OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<? extends Flow<? extends java.util.List<? extends MarketDataSource>>, ? extends java.util.List<TradeCoinInfo>>) obj, (Continuation<? super Flow<? extends java.util.List<CoinQuote>>>) continuation);
    }

    @yCM
    public C40473qXd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40421qVf c40421qVf, @NotNull qUV quv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40421qVf, "");
        Intrinsics.checkNotNullParameter(quv, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c40421qVf;
        this.OLrzqt = quv;
    }

    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends Flow<? extends java.util.List<? extends MarketDataSource>>, ? extends java.util.List<TradeCoinInfo>> pair, @NotNull Continuation<? super Flow<? extends java.util.List<CoinQuote>>> continuation) {
        return FlowKt.flowOn(FlowKt.flowCombine(pair.getFirst(), this.AEQbTJ.KWHzl(), new MarketDataToCoinQuoteWithIconUseCase$onExecute$2(pair, null)), AEQbTJ());
    }
}
