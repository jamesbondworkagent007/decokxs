package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.dex.trade.widget.jwt.JwtHelper$startAuth$1;
import com.okinc.business.dex.trade.widget.jwt.JwtHelper$startAuthWithFailHandler$1;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22274hcK {
    public static final C22274hcK OLrzqt = new C22274hcK();

    private C22274hcK() {
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.fdt));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.finishInit));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.QiTXOm), new View.OnClickListener() { // from class: o.hcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22274hcK.EZpvd(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.ORxRYg, new View.OnClickListener() { // from class: o.hcH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22274hcK.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final Function0 function0, android.view.View view) {
        OLrzqt.EZpvd(new Function0() { // from class: o.hcJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22274hcK.copydefault(function0);
            }
        });
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        RxBus.AEQbTJ(C22275hcL.copydefault);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault());
        if (interfaceC9738bbJ == null) {
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new JwtHelper$startAuth$1(fragmentActivity, interfaceC9738bbJ, function0, null), 3, null);
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault());
        if (interfaceC9738bbJ == null) {
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new JwtHelper$startAuthWithFailHandler$1(fragmentActivity, interfaceC9738bbJ, function0, function02, null), 3, null);
    }
}
