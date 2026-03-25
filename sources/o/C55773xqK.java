package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55773xqK implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends TickersData>>, xMJ.Application> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ xMJ.Application KWHzl(C55804xqp<java.util.List<? extends TickersData>> c55804xqp) {
        return KWHzl2((C55804xqp<java.util.List<TickersData>>) c55804xqp);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public xMJ.Application KWHzl2(@NotNull C55804xqp<java.util.List<TickersData>> c55804xqp) {
        xMJ.Application applicationCopydefault;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(c55804xqp.copydefault());
        return (tickersData == null || (applicationCopydefault = C54793xVn.OLrzqt.copydefault(tickersData)) == null) ? new xMJ.Application() : applicationCopydefault;
    }
}
