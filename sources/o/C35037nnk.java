package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.AbstractC55524xla;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35037nnk extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends RankingHotCryptoVo>, ? extends java.util.Map<java.lang.String, ? extends TickersData>>, java.util.List<? extends java.lang.Object>> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<? extends java.util.List<RankingHotCryptoVo>, ? extends java.util.Map<java.lang.String, TickersData>>) obj, (Continuation<? super java.util.List<? extends java.lang.Object>>) continuation);
    }

    @yCM
    public C35037nnk(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<RankingHotCryptoVo>, ? extends java.util.Map<java.lang.String, TickersData>> pair, @NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) {
        java.util.List<RankingHotCryptoVo> listComponent1 = pair.component1();
        java.util.Map<java.lang.String, TickersData> mapComponent2 = pair.component2();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent1, 10));
        java.util.Iterator<T> it = listComponent1.iterator();
        while (true) {
            java.lang.String last = null;
            if (!it.hasNext()) {
                break;
            }
            RankingHotCryptoVo rankingHotCryptoVo = (RankingHotCryptoVo) it.next();
            TickersData tickersDataAEQbTJ = AEQbTJ(mapComponent2, rankingHotCryptoVo.getCoinName());
            java.lang.String last2 = tickersDataAEQbTJ != null ? tickersDataAEQbTJ.getLast() : null;
            TickersData tickersDataAEQbTJ2 = AEQbTJ(mapComponent2, rankingHotCryptoVo.getGroupName());
            if (tickersDataAEQbTJ2 != null) {
                last = tickersDataAEQbTJ2.getLast();
            }
            arrayList.add(rankingHotCryptoVo.copy((LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 1) != 0 ? rankingHotCryptoVo.index : 0, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 2) != 0 ? rankingHotCryptoVo.instId : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 4) != 0 ? rankingHotCryptoVo.instType : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 8) != 0 ? rankingHotCryptoVo.icon : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 16) != 0 ? rankingHotCryptoVo.coinName : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 32) != 0 ? rankingHotCryptoVo.indicate : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 64) != 0 ? rankingHotCryptoVo.lastPrice : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 128) != 0 ? rankingHotCryptoVo.isShowLastPrice : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 256) != 0 ? rankingHotCryptoVo.quotePrice : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 512) != 0 ? rankingHotCryptoVo.isShowQuotePrice : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 1024) != 0 ? rankingHotCryptoVo.changePercent : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 2048) != 0 ? rankingHotCryptoVo.changePercentColor : 0, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 4096) != 0 ? rankingHotCryptoVo.isShowChangePercent : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 8192) != 0 ? rankingHotCryptoVo.isShowUpComing : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 16384) != 0 ? rankingHotCryptoVo.isShowCountDown : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 32768) != 0 ? rankingHotCryptoVo.isShowComingString : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 65536) != 0 ? rankingHotCryptoVo.upComingOrComingSoonString : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 131072) != 0 ? rankingHotCryptoVo.waitOnlineTime : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 262144) != 0 ? rankingHotCryptoVo.isShowGroupName : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 524288) != 0 ? rankingHotCryptoVo.groupName : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 1048576) != 0 ? rankingHotCryptoVo.isNewCoinPremarket : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 2097152) != 0 ? rankingHotCryptoVo.onlineTime : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 4194304) != 0 ? rankingHotCryptoVo.showIndex : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 8388608) != 0 ? rankingHotCryptoVo.changePerDay24h : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 16777216) != 0 ? rankingHotCryptoVo.alias : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? rankingHotCryptoVo.expTime : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 67108864) != 0 ? rankingHotCryptoVo.isWatch : false, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 134217728) != 0 ? rankingHotCryptoVo.timeStamp : 0L, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 268435456) != 0 ? rankingHotCryptoVo.userId : null, (536870912 & LockFreeTaskQueueCore.MAX_CAPACITY_MASK) != 0 ? rankingHotCryptoVo.period : null, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & 1073741824) != 0 ? rankingHotCryptoVo.cupTickerPrice : last2, (LockFreeTaskQueueCore.MAX_CAPACITY_MASK & Integer.MIN_VALUE) != 0 ? rankingHotCryptoVo.quoteCupTickerPrice : last, (7 & 1) != 0 ? rankingHotCryptoVo.volume : null, (7 & 2) != 0 ? rankingHotCryptoVo.ruleType : null, (7 & 4) != 0 ? rankingHotCryptoVo.state : null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        if (arrayList2.size() >= 7) {
            arrayList2.add(new AbstractC55524xla.StateListAnimator(0, 1, null));
        }
        return arrayList2;
    }

    public final TickersData AEQbTJ(java.util.Map<java.lang.String, TickersData> map, java.lang.String str) {
        TickersData tickersData = map.get(str);
        return (tickersData == null && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USD")) ? qTI.Companion.KWHzl() : tickersData;
    }
}
