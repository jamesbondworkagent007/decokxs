package o;

import com.okinc.tradingbot.impl.strategy.bean.DefaultTag;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.unify_trade.biz.GridStatistics;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53812wsZ implements InterfaceC54501xKt<java.util.List<? extends GridStatistics>, GuideHeaderCard> {
    public java.lang.Object EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Object obj) {
        this.EZpvd = obj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ GuideHeaderCard KWHzl(java.util.List<? extends GridStatistics> list) {
        return copydefault((java.util.List<GridStatistics>) list);
    }

    public GuideHeaderCard copydefault(@NotNull java.util.List<GridStatistics> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return OLrzqt();
    }

    public final GuideHeaderCard OLrzqt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new DefaultTag(C33070mpX.AYXKKw(C55688xof.Application.onAddQueueItem), null, 2, null));
        arrayList.add(new DefaultTag(C33070mpX.AYXKKw(C55688xof.Application.onPause), null, 2, null));
        return new GuideHeaderCard(C33129mqd.gEmmrt(this.EZpvd), arrayList, null, null, null, null, null, false, 124, null);
    }
}
