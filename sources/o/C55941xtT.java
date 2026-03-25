package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55941xtT implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends TickersData>>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.Integer>> {
    public kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ kotlin.Pair<? extends java.lang.String, ? extends java.lang.Integer> KWHzl(C55804xqp<java.util.List<? extends TickersData>> c55804xqp) {
        return KWHzl2((C55804xqp<java.util.List<TickersData>>) c55804xqp);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl2(@NotNull C55804xqp<java.util.List<TickersData>> c55804xqp) {
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.AuCTelauCTel(c55804xqp.copydefault());
        java.lang.String last = tickersData.getLast();
        kotlin.Pair<java.lang.String, java.lang.Integer> pair = this.KWHzl;
        if (C33129mqd.AEQbTJ(last, pair != null ? pair.getFirst() : null)) {
            pairOLrzqt = C56390yDp.OLrzqt(tickersData.getLast(), java.lang.Integer.valueOf(C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null)));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(tickersData.getLast(), java.lang.Integer.valueOf(C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null)));
        }
        this.KWHzl = pairOLrzqt;
        return pairOLrzqt;
    }
}
