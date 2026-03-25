package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.mlnservice.utils.DemoTradingUserManager$navSwitchTradeMode$1;
import com.okinc.mlnservice.utils.DemoTradingUserManager$showHandlingDialog$1$1$1$1;
import com.okinc.okuser.data.Token;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C28102kOz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43173rkL {
    public static final C43173rkL EZpvd = new C43173rkL();

    private C43173rkL() {
    }

    public final InterfaceC47278tmy copydefault() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
    }

    public final boolean EZpvd() {
        return copydefault().fJNWhG();
    }

    public static /* synthetic */ java.lang.Object switchTradeMode$default(C43173rkL c43173rkL, boolean z, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "main/home";
        }
        return c43173rkL.EZpvd(z, str, continuation);
    }

    public final java.lang.Object EZpvd(boolean z, @NotNull java.lang.String str, @NotNull Continuation<? super Token> continuation) {
        return ((InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class)).KWHzl(z, str, continuation);
    }

    public final void AEQbTJ(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DemoTradingUserManager$navSwitchTradeMode$1(z, null), 3, null);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityAEQbTJ);
            viewOnClickListenerC54939xaY.setTitle(C28102kOz.Fragment.copydefault);
            viewOnClickListenerC54939xaY.copydefault(C28102kOz.Fragment.OLrzqt);
            viewOnClickListenerC54939xaY.EZpvd(C28102kOz.Fragment.EZpvd, new View.OnClickListener() { // from class: o.rkP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C43173rkL.KWHzl(viewOnClickListenerC54939xaY, map, str, activityAEQbTJ, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C28102kOz.Fragment.AEQbTJ, new View.OnClickListener() { // from class: o.rkS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C43173rkL.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.util.Map map, java.lang.String str, android.app.Activity activity, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new DemoTradingUserManager$showHandlingDialog$1$1$1$1(map, str, viewOnClickListenerC54939xaY, activity, null), 3, null);
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
