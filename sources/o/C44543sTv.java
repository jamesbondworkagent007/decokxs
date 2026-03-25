package o;

import android.view.View;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import o.sWj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44543sTv {
    public static final C44543sTv copydefault = new C44543sTv();

    private C44543sTv() {
    }

    public final boolean EZpvd() {
        if (C44541sTt.AEQbTJ.copydefault()) {
            return false;
        }
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        if (oKComplianceRestrictionService != null) {
            return oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.LIVE_STREAMING);
        }
        return true;
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.copydefault("NavigationUtil", "live streaming feature is restricted");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(sWj.Activity.AuCTel);
        viewOnClickListenerC54939xaY.copydefault(sWj.Activity.fetchVPNInfo);
        viewOnClickListenerC54939xaY.EZpvd(sWj.Activity.copydefault, new View.OnClickListener() { // from class: o.sTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C44543sTv.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
