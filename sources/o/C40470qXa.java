package o;

import com.okinc.market.watch.usecase.InstrumentToMarketUseCase$onExecute$2;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40470qXa extends AbstractC49400uno<kotlin.Pair<? extends Flow<? extends java.util.List<? extends BizInstrument>>, ? extends Flow<? extends java.util.List<? extends TickersData>>>, Flow<? extends java.util.List<? extends MarketDataSource>>> {
    public final qUV KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qUV copydefault() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((kotlin.Pair<? extends Flow<? extends java.util.List<? extends BizInstrument>>, ? extends Flow<? extends java.util.List<TickersData>>>) obj, (Continuation<? super Flow<? extends java.util.List<? extends MarketDataSource>>>) continuation);
    }

    @yCM
    public C40470qXa(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qUV quv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(quv, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = quv;
    }

    public java.lang.Object AEQbTJ(@NotNull kotlin.Pair<? extends Flow<? extends java.util.List<? extends BizInstrument>>, ? extends Flow<? extends java.util.List<TickersData>>> pair, @NotNull Continuation<? super Flow<? extends java.util.List<? extends MarketDataSource>>> continuation) {
        return FlowKt.flowOn(FlowKt.flowCombine(pair.getSecond(), pair.getFirst(), new InstrumentToMarketUseCase$onExecute$2(this, null)), AEQbTJ());
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> KWHzl(TickersData tickersData) {
        return C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), false, 16, null);
    }

    public final java.lang.String EZpvd(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (bizInstrument instanceof SwapInstrument) {
            return ((SwapInstrument) bizInstrument).getCtType();
        }
        if (bizInstrument instanceof FutureInstrument) {
            return ((FutureInstrument) bizInstrument).getCtType();
        }
        return null;
    }

    public final java.lang.String KWHzl(BizInstrument bizInstrument) {
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(bizInstrument.getInstType());
        if (abstractC54531xLwKWHzl != null) {
            abstractC54531xLwKWHzl.valueOf(bizInstrument.getInstId());
        }
        if (!(bizInstrument instanceof SpotInstrument)) {
            return null;
        }
        SpotInstrument spotInstrument = (SpotInstrument) bizInstrument;
        java.lang.String level = spotInstrument.getLevel();
        java.lang.String str = C33129mqd.OLrzqt((java.lang.CharSequence) level) ? level : null;
        return str == null ? spotInstrument.getCoinLever() : str;
    }

    public final java.lang.String EZpvd(BizInstrument bizInstrument) {
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "MARGIN")) {
            return bizInstrument.getQuoteSymbol();
        }
        return null;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String strCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        return (interfaceC54581xNrCopydefault == null || (strCopydefault = interfaceC54581xNrCopydefault.copydefault(str)) == null) ? "" : strCopydefault;
    }

    public final java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        java.lang.String tradeSymbol;
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "COIN")) {
            tradeSymbol = bizInstrument.getInstId();
        } else {
            tradeSymbol = bizInstrument.getTradeSymbol();
        }
        return C55687xoe.AEQbTJ.OLrzqt(tradeSymbol);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0.equals("OPTION") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(BizInstrument bizInstrument) {
        java.lang.String instType = bizInstrument.getInstType();
        int iHashCode = instType.hashCode();
        if (iHashCode != -1956807563) {
            if (iHashCode != 2074257) {
                if (iHashCode == 214415088 && instType.equals("FUTURES")) {
                    return bizInstrument.isNewTag();
                }
            } else if (instType.equals("COIN")) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault != null) {
                    return interfaceC54581xNrCopydefault.EZpvd(bizInstrument.getInstId());
                }
                return false;
            }
            return bizInstrument.isNewTag();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0.equals("OPTION") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(BizInstrument bizInstrument) {
        java.lang.String instType = bizInstrument.getInstType();
        int iHashCode = instType.hashCode();
        if (iHashCode != -1956807563) {
            if (iHashCode != 2074257) {
                if (iHashCode == 214415088 && instType.equals("FUTURES")) {
                    return bizInstrument.isNewLabel();
                }
            } else if (instType.equals("COIN")) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault != null) {
                    return interfaceC54581xNrCopydefault.KWHzl(bizInstrument.getInstId());
                }
                return false;
            }
            return bizInstrument.isNewLabel();
        }
    }
}
