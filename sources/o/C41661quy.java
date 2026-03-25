package o;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41661quy extends AbstractC49400uno<Triple<? extends C41615quE, ? extends java.util.Map<java.lang.String, ? extends TickersData>, ? extends java.util.List<? extends RankingHotCryptoVo>>, java.util.List<? extends RankingHotCryptoVo>> {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC54577xNn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Triple<C41615quE, ? extends java.util.Map<java.lang.String, TickersData>, ? extends java.util.List<RankingHotCryptoVo>>) obj, (Continuation<? super java.util.List<RankingHotCryptoVo>>) continuation);
    }

    @yCM
    public C41661quy(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = interfaceC54577xNn;
    }

    public java.lang.Object EZpvd(@NotNull Triple<C41615quE, ? extends java.util.Map<java.lang.String, TickersData>, ? extends java.util.List<RankingHotCryptoVo>> triple, @NotNull Continuation<? super java.util.List<RankingHotCryptoVo>> continuation) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn = this.copydefault;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return yDY.AhwBna();
        }
        EZpvd(triple.getSecond(), triple.getThird(), triple.getFirst(), interfaceC54581xNrOLrzqt);
        return triple.getThird();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xTM.formatTickerPrice$default(o.xTM, java.lang.String, java.lang.String, java.lang.String, o.xNr, boolean, int, java.lang.Object):java.lang.String */
    public final void EZpvd(java.util.Map<java.lang.String, TickersData> map, java.util.List<RankingHotCryptoVo> list, C41615quE c41615quE, InterfaceC54581xNr interfaceC54581xNr) {
        for (RankingHotCryptoVo rankingHotCryptoVo : list) {
            TickersData tickersData = map.get(rankingHotCryptoVo.getCoinName());
            java.lang.String last = tickersData != null ? tickersData.getLast() : null;
            TickersData tickersData2 = map.get(rankingHotCryptoVo.getGroupName());
            java.lang.String last2 = tickersData2 != null ? tickersData2.getLast() : null;
            rankingHotCryptoVo.setQuotePrice(pTF.KWHzl.AEQbTJ(xTM.formatTickerPrice$default(xTM.AEQbTJ, rankingHotCryptoVo.getLastPrice(), last2, last, interfaceC54581xNr, false, 16, null)));
            rankingHotCryptoVo.setIndicate(C33129mqd.OLrzqt((java.lang.CharSequence) rankingHotCryptoVo.getIndicate()) ? C41786qxQ.AEQbTJ(rankingHotCryptoVo.getIndicate(), last2, last, interfaceC54581xNr) : "--");
        }
    }
}
