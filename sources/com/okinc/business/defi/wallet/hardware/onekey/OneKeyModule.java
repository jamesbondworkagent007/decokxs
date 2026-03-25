package com.okinc.business.defi.wallet.hardware.onekey;

import o.C10854bwM;
import o.C43251rlk;
import o.InterfaceC57001yaF;
import o.InterfaceC57039yar;
import o.yCR;

/* JADX INFO: loaded from: classes5.dex */
public final class OneKeyModule {
    public static final OneKeyModule OLrzqt = new OneKeyModule();

    private OneKeyModule() {
    }

    @yCR
    public final InterfaceC57039yar EZpvd() {
        return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).OLrzqt();
    }

    public final boolean AEQbTJ(C10854bwM c10854bwM) {
        C10854bwM c10854bwMKWHzl;
        if (c10854bwM != null && c10854bwM.AuCTel()) {
            return c10854bwM.ejfBZ() || c10854bwM.AxsJAYaxsJAY();
        }
        if (c10854bwM == null || (c10854bwMKWHzl = c10854bwM.KWHzl()) == null) {
            return false;
        }
        return OLrzqt.AEQbTJ(c10854bwMKWHzl);
    }
}
