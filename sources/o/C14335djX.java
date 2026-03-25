package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.djX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14335djX implements InterfaceC14334djW {
    public final C14367dkC KWHzl = new C14367dkC();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC14334djW
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        java.lang.String strKWHzl = C11573cTg.KWHzl.KWHzl();
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.launchUnit, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl))));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.parseResult, C56423yEv.EZpvd(C56390yDp.OLrzqt("cloud", strKWHzl))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getHideOffset), new View.OnClickListener() { // from class: o.dka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14335djX.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        try {
            viewOnClickListenerC54939xaY.show();
            abstractActivityC33041mov.dismissLoading();
        } catch (java.lang.Exception e) {
            pUU.copydefault("GoogleDriveStatusDialogHelper", "error message:" + e.getMessage());
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ViewTreeFullyDrawnReporterOwner));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner1));
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.AlertControllerAlertParams4, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertControllerRecycleListView), new View.OnClickListener() { // from class: o.djT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14335djX.AEQbTJ(viewOnClickListenerC54939xaY, abstractActivityC33041mov, view);
            }
        });
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        try {
            viewOnClickListenerC54939xaY.show();
            abstractActivityC33041mov.dismissLoading();
        } catch (java.lang.Exception e) {
            pUU.copydefault("GoogleDriveStatusDialogHelper", "error message:" + e.getMessage());
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractActivityC33041mov abstractActivityC33041mov, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractActivityC33041mov.startActivity(new android.content.Intent("android.settings.SETTINGS"));
    }

    public final void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        java.lang.String strKWHzl = C11573cTg.KWHzl.KWHzl();
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertDialog));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.AlertControllerAlertParamsOnPrepareListViewListener, C56423yEv.EZpvd(C56390yDp.OLrzqt("cloud", strKWHzl))));
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.isShuffleModeEnabledRemoved, (View.OnClickListener) null, 2, (java.lang.Object) null);
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        try {
            viewOnClickListenerC54939xaY.show();
            abstractActivityC33041mov.dismissLoading();
        } catch (java.lang.Exception e) {
            pUU.copydefault("GoogleDriveStatusDialogHelper", "error message:" + e.getMessage());
        }
    }

    public final void AYXKKw(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.NavigationRes));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.NonUiContext), new View.OnClickListener() { // from class: o.djZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14335djX.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        try {
            viewOnClickListenerC54939xaY.show();
            abstractActivityC33041mov.dismissLoading();
        } catch (java.lang.Exception e) {
            pUU.copydefault("GoogleDriveStatusDialogHelper", "error message:" + e.getMessage());
        }
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.InterfaceC14334djW
    public void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        java.lang.String strKWHzl = C11573cTg.KWHzl.KWHzl();
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.playFromUri));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.play, C56424yEw.gEmmrt(C56390yDp.OLrzqt("cloud", strKWHzl), C56390yDp.OLrzqt("CloudName", strKWHzl))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.isShuffleModeEnabledRemoved), new View.OnClickListener() { // from class: o.djU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14335djX.djBIcL(viewOnClickListenerC54939xaY, view);
            }
        });
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        try {
            viewOnClickListenerC54939xaY.show();
            abstractActivityC33041mov.dismissLoading();
        } catch (java.lang.Exception e) {
            pUU.copydefault("GoogleDriveStatusDialogHelper", "error message:" + e.getMessage());
        }
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.InterfaceC14334djW
    public void KWHzl(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final int i, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!this.KWHzl.copydefault(abstractActivityC33041mov)) {
            AYXKKw(abstractActivityC33041mov);
            return;
        }
        abstractActivityC33041mov.setForceDismiss(false);
        abstractActivityC33041mov.showLoadingAtOnceCannotCancel();
        this.KWHzl.OLrzqt(new Function1() { // from class: o.djY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14335djX.KWHzl(this.EZpvd, abstractActivityC33041mov, i, function0, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(C14335djX c14335djX, AbstractActivityC33041mov abstractActivityC33041mov, int i, final Function0 function0, boolean z) {
        if (z) {
            if (c14335djX.KWHzl.AEQbTJ(abstractActivityC33041mov)) {
                c14335djX.KWHzl.copydefault(abstractActivityC33041mov, new Function1() { // from class: o.dkc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14335djX.copydefault(function0, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            } else if (i == 1) {
                c14335djX.OLrzqt(abstractActivityC33041mov);
            } else {
                c14335djX.AEQbTJ(abstractActivityC33041mov);
            }
        } else {
            c14335djX.EZpvd(abstractActivityC33041mov);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0, boolean z) {
        if (z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
