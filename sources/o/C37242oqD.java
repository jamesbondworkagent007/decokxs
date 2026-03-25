package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37242oqD {
    public static final C37242oqD EZpvd = new C37242oqD();
    public static final java.lang.String[] AEQbTJ = C37724ozI.EZpvd.EZpvd();
    public static final int copydefault = 8;

    private C37242oqD() {
    }

    public final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (AEQbTJ(contextRequireContext)) {
            if (function0 != null) {
                function0.invoke();
            }
            pUU.KWHzl("PhoneRelationPermissionHelper", "requestRelationPermissionWithActivity: permission granted");
            return;
        }
        java.lang.String[] strArr = AEQbTJ;
        if (fragment.shouldShowRequestPermissionRationale((java.lang.String) yDV.AuCTelauCTel(strArr))) {
            KWHzl(fragment);
            pUU.KWHzl("PhoneRelationPermissionHelper", "requestRelationPermissionWithActivity: permission denied, show request permission rationale");
        } else {
            C60121zwJ.AEQbTJ(fragment, C33070mpX.AYXKKw(C35399nuc.LoaderManager.stopBehavioSecDataCollection), 101, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
            pUU.KWHzl("PhoneRelationPermissionHelper", "Contact permissions requested");
        }
    }

    public final void KWHzl(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKRKUgwx));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.stopBehavioSecDataCollection));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKfNLfdT), new View.OnClickListener() { // from class: o.oqB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37242oqD.OLrzqt(fragment, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DrqXHJ), new View.OnClickListener() { // from class: o.oqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37242oqD.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(androidx.fragment.app.Fragment fragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C33625mzw.OLrzqt().KWHzl(fragment.requireActivity());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return C60121zwJ.KWHzl(fragment, (java.util.List<java.lang.String>) yDV.AwvSrB(AEQbTJ));
    }

    public final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String[] strArr = AEQbTJ;
        return C60121zwJ.KWHzl(context, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }
}
