package com.okinc.tradingbot.impl.di;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import o.C43251rlk;
import o.InterfaceC33171mrS;
import o.yCL;
import o.yCR;

/* JADX INFO: loaded from: classes11.dex */
public final class ServiceModule {
    public static final ServiceModule AEQbTJ = new ServiceModule();

    private ServiceModule() {
    }

    @yCL(AEQbTJ = "OKTradingBotServiceScope")
    @yCR
    public final OKComplianceRestrictionService copydefault() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    @yCL(AEQbTJ = "OKTradingBotServiceScope")
    @yCR
    public final InterfaceC33171mrS AEQbTJ() {
        return (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
    }
}
