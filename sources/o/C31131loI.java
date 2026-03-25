package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31131loI {
    public static final C31131loI OLrzqt = new C31131loI();

    private C31131loI() {
    }

    public final void EZpvd(boolean z) {
        if (z) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.launchUnitdefault), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.component2), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.loI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showBoostInfoDialog$default(C31131loI c31131loI, android.content.Context context, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c31131loI.OLrzqt(context, z, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull final android.content.Context context, boolean z, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        int i = z ? C23274hvD.Fragment.launchdefault : C23274hvD.Fragment.ActivityResultLauncherKt;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistry);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(i));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(context, z ? C23274hvD.Fragment.ActivityResultLauncher : C23274hvD.Fragment.launchUnit, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("link", C24324ibg.Companion.KWHzl(strAYXKKw).OLrzqt(strAYXKKw, strAYXKKw, (60 & 4) != 0 ? C55051xce.OLrzqt.valueOf() : null, (60 & 8) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : 0, (60 & 16) != 0 ? 0 : 0, (60 & 32) != 0, new Function0() { // from class: o.loK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31131loI.OLrzqt(viewOnClickListenerC54939xaY, function0, context);
            }
        }).AEQbTJ()))));
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C23274hvD.Fragment.OcIXYQ), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final Unit OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.content.Context context) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, gKZ.EZpvd.AEQbTJ("miniapp?appid=okluanftactivity&pageurl=/boostRecords&appearance=alternativeweb3&pageanim=push&hideWalletSwitch=1"), null, new Function1() { // from class: o.loJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31131loI.copydefault((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
