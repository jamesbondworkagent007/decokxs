package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41066qjm extends AbstractC49400uno<Triple<? extends C41086qkF, ? extends java.util.Map<java.lang.String, ? extends TickersData>, ? extends java.util.List<? extends C41120qkn>>, java.util.List<? extends C41120qkn>> {
    public final InterfaceC54577xNn AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41066qjm(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = interfaceC54577xNn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Triple<C41086qkF, ? extends java.util.Map<java.lang.String, TickersData>, ? extends java.util.List<C41120qkn>> triple, @NotNull Continuation<? super java.util.List<C41120qkn>> continuation) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn = this.AEQbTJ;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return yDY.AhwBna();
        }
        copydefault(triple.getSecond(), triple.getThird(), triple.getFirst(), interfaceC54581xNrOLrzqt);
        return triple.getThird();
    }

    public final void copydefault(java.util.Map<java.lang.String, TickersData> map, java.util.List<C41120qkn> list, C41086qkF c41086qkF, InterfaceC54581xNr interfaceC54581xNr) {
        for (C41120qkn c41120qkn : list) {
            TickersData tickersData = map.get(c41120qkn.KWHzl());
            java.lang.String last = null;
            java.lang.String last2 = tickersData != null ? tickersData.getLast() : null;
            TickersData tickersData2 = map.get(c41086qkF.AYXKKw());
            if (tickersData2 != null) {
                last = tickersData2.getLast();
            }
            c41120qkn.AEQbTJ(pTF.KWHzl.AEQbTJ(xTM.formatTickerPrice$default(xTM.AEQbTJ, c41120qkn.valueOf(), last, last2, interfaceC54581xNr, false, 16, null)));
        }
    }
}
