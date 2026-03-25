package com.okinc.core.ok_app.di;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import o.C33269mtK;
import o.C33285mta;
import o.C33305mtu;
import o.InterfaceC33253msv;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Module {
    public static final Module KWHzl = new Module();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public final InterfaceC33253msv AEQbTJ(@NotNull C33285mta c33285mta) {
        Intrinsics.checkNotNullParameter(c33285mta, "");
        return c33285mta;
    }

    private Module() {
    }

    @yCR
    public final C33305mtu EZpvd(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        return new C33305mtu(oKComplianceRestrictionService);
    }

    @yCR
    public final C33269mtK AEQbTJ() {
        return new C33269mtK();
    }
}
