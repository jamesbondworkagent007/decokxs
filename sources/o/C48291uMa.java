package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@yCR
public final class C48291uMa {
    public final OKComplianceRestrictionService OLrzqt;
    public final InterfaceC33171mrS copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C48291uMa(@yCL(AEQbTJ = "OKTradingBotServiceScope") @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @yCL(AEQbTJ = "OKTradingBotServiceScope") @NotNull InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.OLrzqt = oKComplianceRestrictionService;
        this.copydefault = interfaceC33171mrS;
        if (!oKComplianceRestrictionService.isInitialized()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: renamed from: o.uMa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uMa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C48291uMa AEQbTJ() {
            C48291uMa c48291uMaCBPFI;
            synchronized (this) {
                c48291uMaCBPFI = ((InterfaceC51009vet) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).cBPFI();
            }
            return c48291uMaCBPFI;
        }
    }

    public final boolean AEQbTJ() {
        return this.copydefault.ejfBZ();
    }

    public final boolean copydefault() {
        return this.copydefault.getFieldNames();
    }

    public final boolean OLrzqt() {
        return AEQbTJ() && AEQbTJ(this.OLrzqt, OKComplianceRestrictionService.Feature.TRADING_BOT);
    }

    public final boolean djBIcL() {
        return AEQbTJ(this.OLrzqt, OKComplianceRestrictionService.Feature.BOTS_LANDING_PAGE);
    }

    public final boolean gEmmrt() {
        return AEQbTJ(this.OLrzqt, OKComplianceRestrictionService.Feature.TRADING_BOT_PRO_LANDING);
    }

    public final boolean valueOf() {
        return AEQbTJ(this.OLrzqt, OKComplianceRestrictionService.Feature.RECOMMENDED_PORTFOLIO);
    }

    public final boolean EZpvd() {
        return OLrzqt() && djBIcL() && !gEmmrt();
    }

    public final boolean KWHzl() {
        return AEQbTJ(this.OLrzqt, OKComplianceRestrictionService.Feature.AI_BOT);
    }

    public final boolean AEQbTJ(OKComplianceRestrictionService oKComplianceRestrictionService, OKComplianceRestrictionService.Feature feature) {
        return !oKComplianceRestrictionService.AEQbTJ(feature);
    }
}
