package com.okinc.tradeuilib.order.trade.biz.bean;

import com.okinc.rxutils.RxBus;

/* JADX INFO: loaded from: classes24.dex */
public final class SpotLeadSwitchChangeEvent implements RxBus.Application {
    public static final int $stable = 0;
    private final boolean isSelectSpotLead;

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelectSpotLead() {
        return this.isSelectSpotLead;
    }

    public SpotLeadSwitchChangeEvent(boolean z) {
        this.isSelectSpotLead = z;
    }
}
