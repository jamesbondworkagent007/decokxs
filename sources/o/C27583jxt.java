package o;

import android.view.View;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27583jxt {
    public final void copydefault(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RZNAhV));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RkASWs));
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.AubY, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C25493ixk.FragmentManager.RgLUBD), new View.OnClickListener() { // from class: o.jxv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27583jxt.KWHzl(viewOnClickListenerC54939xaY, interfaceC9738bbJ, abstractActivityC33041mov, fragmentManager, view);
            }
        });
        if (abstractActivityC33041mov.isFinishing()) {
            return;
        }
        viewOnClickListenerC54939xaY.show();
        abstractActivityC33041mov.dismissLoading();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, InterfaceC9738bbJ interfaceC9738bbJ, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (interfaceC9738bbJ.ORxRYg()) {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).OLrzqt(interfaceC9738bbJ, abstractActivityC33041mov, false, new Function1() { // from class: o.jxu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27583jxt.OLrzqt(((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            if (fragmentManager == null) {
                return;
            }
            ((xWS) C43251rlk.copydefault(xWS.class)).EZpvd(abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, new Function0() { // from class: o.jxs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27583jxt.KWHzl();
                }
            });
        }
    }

    public static final Unit OLrzqt(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }
}
