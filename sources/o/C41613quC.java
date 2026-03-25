package o;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41613quC extends AbstractC49400uno<Triple<? extends C41622quL, ? extends java.util.Map<java.lang.String, ? extends TickersData>, ? extends java.util.List<? extends RankingHotCryptoVo>>, java.util.List<? extends RankingHotCryptoVo>> {
    public final InterfaceC54577xNn KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Triple<C41622quL, ? extends java.util.Map<java.lang.String, TickersData>, ? extends java.util.List<RankingHotCryptoVo>>) obj, (Continuation<? super java.util.List<RankingHotCryptoVo>>) continuation);
    }

    @yCM
    public C41613quC(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = interfaceC54577xNn;
    }

    public java.lang.Object EZpvd(@NotNull Triple<C41622quL, ? extends java.util.Map<java.lang.String, TickersData>, ? extends java.util.List<RankingHotCryptoVo>> triple, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return yDY.AhwBna();
        }
        KWHzl(triple.getSecond(), triple.getThird(), triple.getFirst(), interfaceC54581xNrOLrzqt);
        return triple.getThird();
    }

    public final void KWHzl(java.util.Map<java.lang.String, TickersData> map, java.util.List<RankingHotCryptoVo> list, C41622quL c41622quL, InterfaceC54581xNr interfaceC54581xNr) {
        for (RankingHotCryptoVo rankingHotCryptoVo : list) {
            TickersData tickersData = map.get(rankingHotCryptoVo.getCoinName());
            java.lang.String last = tickersData != null ? tickersData.getLast() : null;
            TickersData tickersData2 = map.get(c41622quL.copydefault());
            java.lang.String last2 = tickersData2 != null ? tickersData2.getLast() : null;
            rankingHotCryptoVo.setQuotePrice(pTF.KWHzl.AEQbTJ(xTM.formatTickerPrice$default(xTM.AEQbTJ, rankingHotCryptoVo.getLastPrice(), last2, last, interfaceC54581xNr, false, 16, null)));
            if (!Intrinsics.EZpvd((java.lang.Object) c41622quL.OLrzqt(), (java.lang.Object) "sellers") && !Intrinsics.EZpvd((java.lang.Object) c41622quL.OLrzqt(), (java.lang.Object) "buyers") && !Intrinsics.EZpvd((java.lang.Object) c41622quL.OLrzqt(), (java.lang.Object) "searches")) {
                rankingHotCryptoVo.setIndicate(C41786qxQ.AEQbTJ(rankingHotCryptoVo.getIndicate(), last2, last, interfaceC54581xNr));
            }
        }
    }
}
