package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pHH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rDK implements rDG {
    public final java.lang.String AEQbTJ;
    public final InterfaceC47278tmy OLrzqt;

    @yCM
    public rDK(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = interfaceC47278tmy;
        this.AEQbTJ = "RestrictionRepositoryImpl";
    }

    @Override // o.rDG
    public void EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull final OKComplianceRestrictionService.Feature feature, final yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super FeatureRestrictionInfo, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(feature, "");
        pHH.StateListAnimator.fetchLatestFeatureRestrictionStatus$default((pHH) C43251rlk.copydefault(OKComplianceRestrictionService.class), LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, new Function1() { // from class: o.rDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rDK.EZpvd(feature, fragmentActivity, yho, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(OKComplianceRestrictionService.Feature feature, FragmentActivity fragmentActivity, yHO yho, boolean z) {
        FeatureRestrictionInfo featureRestrictionInfoEZpvd = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).EZpvd(feature);
        boolean zOLrzqt = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.DEFI);
        if (featureRestrictionInfoEZpvd != null) {
            java.lang.Boolean restricted = featureRestrictionInfoEZpvd.getRestricted();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(restricted, bool)) {
                if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                    if (yho != null) {
                    }
                } else if (yho != null) {
                }
            } else if (yho != null) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.rDG
    public void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (SPUtils.getBoolean("kisa_permission_consented", false)) {
            pUU.KWHzl(this.AEQbTJ, "checkKisaDialogRequired | Kisa permission consented before -> Not showing permission page");
        } else {
            ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).KWHzl(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), java.lang.Boolean.TRUE, new Function1() { // from class: o.rDH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rDK.AEQbTJ(this.EZpvd, function0, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(rDK rdk, Function0 function0, boolean z) {
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        pUU.KWHzl(rdk.AEQbTJ, "checkKisaDialogRequired | country == " + strZsXlph);
        if (Intrinsics.EZpvd((java.lang.Object) strZsXlph, (java.lang.Object) "KR")) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
