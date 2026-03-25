package o;

import android.view.View;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.djN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14325djN {
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.djN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showBackupTipDialog$default(C14325djN c14325djN, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        c14325djN.AEQbTJ(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, function0);
    }

    public final void AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final AbstractC12782ctV abstractC12782ctV, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onExtraCallback));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IPostMessageServiceStub));
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.getSessionToken, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsGetMultipleContentsCompanion), new View.OnClickListener() { // from class: o.djJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14325djN.KWHzl(viewOnClickListenerC54939xaY, abstractC12782ctV, abstractActivityC33041mov, fragmentManager, function0, view);
            }
        });
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        try {
            viewOnClickListenerC54939xaY.show();
            abstractActivityC33041mov.dismissLoading();
        } catch (java.lang.Exception e) {
            pUU.copydefault("BackupWalletTipDialogHelper", "error message:" + e.getMessage());
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, final Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (abstractC12782ctV.ORxRYg()) {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).OLrzqt(abstractC12782ctV, abstractActivityC33041mov, false, new Function1() { // from class: o.djL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14325djN.copydefault(function0, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            if (fragmentManager == null) {
                return;
            }
            ((xWS) C43251rlk.copydefault(xWS.class)).EZpvd(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, new Function0() { // from class: o.djM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14325djN.AEQbTJ(function0);
                }
            });
        }
    }

    public static final Unit copydefault(Function0 function0, boolean z) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
