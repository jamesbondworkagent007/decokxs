package com.okinc.unified.di;

import com.okinc.market.common.service.KlineBizMarketService;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C37943pGl;
import o.C43251rlk;
import o.C43417ror;
import o.C56524yIo;
import o.InterfaceC40387qTz;
import o.qTB;
import o.yCR;

/* JADX INFO: loaded from: classes11.dex */
public final class KlineDiModule {
    public static final KlineDiModule EZpvd = new KlineDiModule();

    private KlineDiModule() {
    }

    @yCR
    public final CoroutineDispatcher copydefault() {
        return C37943pGl.OLrzqt.OLrzqt();
    }

    @yCR
    public final InterfaceC40387qTz OLrzqt() {
        return ((qTB) C43251rlk.copydefault(qTB.class)).copydefault();
    }

    @yCR
    public final KlineBizMarketService AEQbTJ() {
        return (KlineBizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(KlineBizMarketService.class));
    }
}
