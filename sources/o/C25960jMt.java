package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25960jMt extends AbstractC49400uno<java.util.List<? extends PnlDetailVo.PnlListItem>, java.util.List<? extends PnlDetailVo.PnlListItem>> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<PnlDetailVo.PnlListItem>) obj, (Continuation<? super java.util.List<PnlDetailVo.PnlListItem>>) continuation);
    }

    @yCM
    public C25960jMt(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(@NotNull java.util.List<PnlDetailVo.PnlListItem> list, @NotNull Continuation<? super java.util.List<PnlDetailVo.PnlListItem>> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (PnlDetailVo.PnlListItem pnlListItem : list) {
            arrayList.add(pnlListItem.copy((32767 & 1) != 0 ? pnlListItem.name : null, (32767 & 2) != 0 ? pnlListItem.coinUrl : null, (32767 & 4) != 0 ? pnlListItem.balance : null, (32767 & 8) != 0 ? pnlListItem.balanceColor : null, (32767 & 16) != 0 ? pnlListItem.originBalance : null, (32767 & 32) != 0 ? pnlListItem.pnl : null, (32767 & 64) != 0 ? pnlListItem.pnlColor : null, (32767 & 128) != 0 ? pnlListItem.originPnl : null, (32767 & 256) != 0 ? pnlListItem.pnlRate : null, (32767 & 512) != 0 ? pnlListItem.pnlRateColor : null, (32767 & 1024) != 0 ? pnlListItem.originPnlRate : null, (32767 & 2048) != 0 ? pnlListItem.positionMarketValue : null, (32767 & 4096) != 0 ? pnlListItem.positionMarketValueColor : null, (32767 & 8192) != 0 ? pnlListItem.originPositionMarketValue : null, (32767 & 16384) != 0 ? pnlListItem.costPrice : null));
        }
        return arrayList;
    }
}
