package o;

import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.event.ConfigEvent;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33286mtb {
    public final InterfaceC47278tmy AEQbTJ;
    public final InterfaceC33171mrS EZpvd;
    public final OKComplianceRestrictionService KWHzl;
    public final C33293mti OLrzqt;
    public final C33290mtf copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? "unknown" : "pay" : "onChain" : "lite" : "pro";
    }

    @yCM
    public C33286mtb(@NotNull C33293mti c33293mti, @NotNull C33290mtf c33290mtf, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c33293mti, "");
        Intrinsics.checkNotNullParameter(c33290mtf, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = c33293mti;
        this.copydefault = c33290mtf;
        this.EZpvd = interfaceC33171mrS;
        this.KWHzl = oKComplianceRestrictionService;
        this.AEQbTJ = interfaceC47278tmy;
    }

    public final ConfigEvent copydefault(@NotNull Scenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "");
        pUU.KWHzl("ConfigManager", "app mode: " + KWHzl(this.EZpvd.isConnected().getValue().intValue()) + ", compliance data: " + this.KWHzl.fIwbmz());
        return new ConfigEvent(this.OLrzqt.copydefault(scenario), this.copydefault.AEQbTJ(scenario), !this.EZpvd.AuCTel(), C33216msK.KWHzl.OLrzqt());
    }
}
