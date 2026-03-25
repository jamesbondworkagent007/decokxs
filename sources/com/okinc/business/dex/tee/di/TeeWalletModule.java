package com.okinc.business.dex.tee.di;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o.C35202nqq;
import o.C43251rlk;
import o.C56524yIo;
import o.InterfaceC35203nqr;
import o.InterfaceC9776bbv;
import o.InterfaceC9850bdP;
import o.dTN;
import o.dTQ;
import o.yCR;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeWalletModule {
    public static final TeeWalletModule copydefault = new TeeWalletModule();

    private TeeWalletModule() {
    }

    @yCR
    public final dTN AEQbTJ() {
        return (dTN) C43251rlk.copydefault(dTN.class);
    }

    @yCR
    public final dTQ KWHzl() {
        return (dTQ) C43251rlk.copydefault(dTQ.class);
    }

    @yCR
    public final InterfaceC9776bbv EZpvd() {
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9776bbv.class));
        if (listKWHzl != null) {
            return (InterfaceC9776bbv) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        }
        return null;
    }

    @yCR
    public final InterfaceC9850bdP OLrzqt() {
        return (InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class);
    }

    @yCR
    public final InterfaceC35203nqr copydefault() {
        return C35202nqq.OLrzqt;
    }
}
