package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qlx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41183qlx extends AbstractC41167qlh implements InterfaceC49363unD {
    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment
    public boolean fetchVPNInfo() {
        return true;
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C41382qpk c41382qpk;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42708rbX c42708rbXValueOf = valueOf();
        if (c42708rbXValueOf == null || (c41382qpk = c42708rbXValueOf.AEQbTJ) == null) {
            return;
        }
        c41382qpk.OLrzqt();
        c41382qpk.setSubTitle(C33070mpX.AYXKKw(qZH.PendingIntent.svY));
    }
}
