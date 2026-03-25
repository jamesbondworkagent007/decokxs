package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12789ctc {
    public static final C12789ctc KWHzl = new C12789ctc();

    private C12789ctc() {
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.endOnGoingFadeAnimation), C33070mpX.AYXKKw(C13754dXa.FragmentManager.isActivityManifestHandlingUiMode), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setElevation), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSessionToken), 2, null)).AEQbTJ(fragmentManager, new Function1() { // from class: o.ctj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12789ctc.EZpvd(function1, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
        } else if (num != null && num.intValue() == 2) {
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.swzYdv), C33070mpX.AYXKKw(C13754dXa.FragmentManager.fBE), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DLWbHP), C33070mpX.AYXKKw(C13754dXa.FragmentManager.zSsVtY), 2, null)).AEQbTJ(fragmentManager, new Function1() { // from class: o.ctl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12789ctc.copydefault(function1, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, java.lang.Integer num) {
        if ((num != null && num.intValue() == 1) || num == null || num.intValue() != 2) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r11v1, types: [o.bCW] */
    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull AbstractC11993ceZ<?> abstractC11993ceZ, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(abstractC11993ceZ, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(abstractC11993ceZ.OcIXYQ(), ((C11990ceW) abstractC11993ceZ.QKudOq()).AEQbTJ()), false, null, null, 7, null);
        java.lang.String strKWHzl = C33069mpW.KWHzl(fragmentActivity, C13754dXa.FragmentManager.setListNavigationCallbacks, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fiatamount", AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC11993ceZ.QKudOq(), strConvertToString$default, false, false, false, 14, null)), C56390yDp.OLrzqt("cryptoamount", AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC11993ceZ.QKudOq(), strConvertToString$default, false, false, false, 14, null))));
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.setSplitBackgroundDrawable);
        viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.setElevation, new View.OnClickListener() { // from class: o.cte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C12789ctc.EZpvd(viewOnClickListenerC54939xaY, function1, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.setHomeActionContentDescription, new View.OnClickListener() { // from class: o.cti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C12789ctc.copydefault(viewOnClickListenerC54939xaY, function1, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function1.invoke(java.lang.Boolean.TRUE);
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function1.invoke(java.lang.Boolean.FALSE);
    }
}
