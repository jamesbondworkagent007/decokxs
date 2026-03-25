package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rCG {
    public static final rCG AEQbTJ = new rCG();

    private rCG() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rCG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showForbiddenDialog$default(rCG rcg, FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, java.lang.Boolean bool, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        rcg.KWHzl(fragmentActivity, featureRestrictionInfo, bool, function0);
    }

    public final void KWHzl(@NotNull final FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, java.lang.Boolean bool, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        java.lang.String province = featureRestrictionInfo != null ? featureRestrictionInfo.getProvince() : null;
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.uzCIH), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.fIwbmz), C56423yEv.EZpvd(C56390yDp.OLrzqt("Province", province != null ? province : ""))));
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.fARcdN), new View.OnClickListener() { // from class: o.rCL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rCG.AEQbTJ(viewOnClickListenerC54939xaY, fragmentActivity, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.AuCTel), new View.OnClickListener() { // from class: o.rCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rCG.KWHzl(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, FragmentActivity fragmentActivity, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        AEQbTJ.AEQbTJ(fragmentActivity);
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function0 != null) {
        }
    }

    public final void AEQbTJ(FragmentActivity fragmentActivity) {
        InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), fragmentActivity, 3, true, 0, null, null, 48, null);
    }
}
