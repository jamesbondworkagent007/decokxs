package com.okinc.business.dex.trade.component.orderandposition.ordertab.viewmodel;

import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.gQP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderAndPositionTabComponentViewModel extends AbstractC33073mpa {
    public final gQP KWHzl;

    @yCM
    public OrderAndPositionTabComponentViewModel(@NotNull gQP gqp) {
        Intrinsics.checkNotNullParameter(gqp, "");
        this.KWHzl = gqp;
    }

    public final OrderAndPositionTab copydefault() {
        return this.KWHzl.AEQbTJ();
    }

    public final void AEQbTJ(@NotNull OrderAndPositionTab orderAndPositionTab) {
        Intrinsics.checkNotNullParameter(orderAndPositionTab, "");
        this.KWHzl.KWHzl(orderAndPositionTab);
    }
}
