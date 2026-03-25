package o;

import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gQP {
    public final InterfaceC28370kYx AEQbTJ;

    @yCM
    public gQP(@NotNull InterfaceC28370kYx interfaceC28370kYx) {
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        this.AEQbTJ = interfaceC28370kYx;
    }

    public final OrderAndPositionTab AEQbTJ() {
        return OrderAndPositionTab.Companion.KWHzl(this.AEQbTJ.EZpvd());
    }

    public final void KWHzl(@NotNull OrderAndPositionTab orderAndPositionTab) {
        Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
        this.AEQbTJ.AEQbTJ(orderAndPositionTab.getTabName());
    }
}
