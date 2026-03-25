package o;

import com.okinc.business.featureflag.FeatureFlag;
import com.okinc.components.track.ABTestManager;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C25421iwR extends AbstractC43215rlA implements InterfaceC25414iwK {
    public final yCP<dTQ> EZpvd;
    public final yCP<InterfaceC35203nqr> copydefault;

    @yCM
    public C25421iwR(@NotNull yCP<InterfaceC35203nqr> ycp, @NotNull yCP<dTQ> ycp2) {
        Intrinsics.checkNotNullParameter(ycp, "");
        Intrinsics.checkNotNullParameter(ycp2, "");
        this.copydefault = ycp;
        this.EZpvd = ycp2;
    }

    @Override // o.InterfaceC25414iwK
    public boolean EZpvd(@NotNull FeatureFlag featureFlag) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(featureFlag, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ(featureFlag.getKey(), featureFlag.getAmplitudeName()), (java.lang.Object) featureFlag.getTreatment())));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    @Override // o.InterfaceC25414iwK
    public boolean valueOf() {
        return this.EZpvd.get().copydefault() && this.copydefault.get().AEQbTJ("dex_smart_account_business");
    }

    @Override // o.InterfaceC25414iwK
    public boolean EZpvd() {
        return EZpvd(FeatureFlag.DEX_CORE_TRADE_PRESET_SAVE);
    }

    @Override // o.InterfaceC25414iwK
    public boolean AEQbTJ() {
        return EZpvd(FeatureFlag.DEX_CORE_TRADE_PRESET_RESET);
    }

    @Override // o.InterfaceC25414iwK
    public boolean copydefault() {
        return EZpvd(FeatureFlag.DEX_CORE_TRADE_CHAIN_LIST);
    }

    @Override // o.InterfaceC25414iwK
    public boolean AhwBna() {
        return EZpvd(FeatureFlag.SCANNER_DISABLE_ENTRY_POINT);
    }

    @Override // o.InterfaceC25414iwK
    public boolean AYXKKw() {
        return EZpvd(FeatureFlag.SCANNER_DISABLE_TAB_SWIPE);
    }

    @Override // o.InterfaceC25414iwK
    public boolean OLrzqt() {
        return EZpvd(FeatureFlag.DEX_CORE_TOKEN_LIST);
    }

    @Override // o.InterfaceC25414iwK
    public boolean djBIcL() {
        return EZpvd(FeatureFlag.WEB3_DEX_TRADE_SAVING_SURPLUS);
    }

    @Override // o.InterfaceC25414iwK
    public boolean KWHzl() {
        return EZpvd(FeatureFlag.DEX_MARKET_DATA_RUST);
    }
}
