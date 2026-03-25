package o;

import com.okinc.market.ranking.core.model.po.RankingTabsPo;
import com.okinc.market.ranking.core.model.po.TabsItemVo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41611quA extends AbstractC49400uno<kotlin.Pair<? extends java.util.Map<java.lang.String, ? extends TickersData>, ? extends RankingTabsPo>, RankingTabsPo> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41611quA(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.Map<java.lang.String, TickersData>, RankingTabsPo> pair, @NotNull Continuation<? super RankingTabsPo> continuation) {
        java.util.Map<java.lang.String, TickersData> first = pair.getFirst();
        TabsItemVo marketCapRank = pair.getSecond().getMarketCapRank();
        TickersData tickersData = first.get(marketCapRank != null ? marketCapRank.getCoinName() : null);
        java.lang.String last = tickersData != null ? tickersData.getLast() : null;
        java.util.Map<java.lang.String, TickersData> first2 = pair.getFirst();
        TabsItemVo marketCapRank2 = pair.getSecond().getMarketCapRank();
        TickersData tickersData2 = first2.get(marketCapRank2 != null ? marketCapRank2.getGroupName() : null);
        java.lang.String last2 = tickersData2 != null ? tickersData2.getLast() : null;
        java.util.Map<java.lang.String, TickersData> first3 = pair.getFirst();
        TabsItemVo turnOverRank = pair.getSecond().getTurnOverRank();
        TickersData tickersData3 = first3.get(turnOverRank != null ? turnOverRank.getCoinName() : null);
        java.lang.String last3 = tickersData3 != null ? tickersData3.getLast() : null;
        TabsItemVo marketCapRank3 = pair.getSecond().getMarketCapRank();
        if (marketCapRank3 != null) {
            AEQbTJ(marketCapRank3, last, last2);
        }
        TabsItemVo turnOverRank2 = pair.getSecond().getTurnOverRank();
        if (turnOverRank2 != null) {
            AEQbTJ(turnOverRank2, last3, last2);
        }
        return pair.getSecond();
    }

    public final void AEQbTJ(TabsItemVo tabsItemVo, java.lang.String str, java.lang.String str2) {
        java.lang.String strAEQbTJ;
        java.lang.String str3 = "--";
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            tabsItemVo.setIndicate("--");
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (strAEQbTJ = C41786qxQ.AEQbTJ(tabsItemVo.getIndicate(), str2, str, interfaceC54581xNrOLrzqt)) != null) {
            str3 = strAEQbTJ;
        }
        tabsItemVo.setIndicate(pTF.KWHzl.AEQbTJ(str3));
    }
}
