package o;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dkC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C14367dkC {
    public final cTA copydefault = new cTA();
    public final C11582cTp AEQbTJ = C11573cTg.KWHzl.copydefault();

    public final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return this.AEQbTJ.KWHzl(context);
    }

    public final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
        } catch (java.lang.Exception e) {
            pUU.copydefault("GoogleDriveBackupManager", "error message :" + e.getMessage());
        }
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public final void OLrzqt(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.AEQbTJ(function1);
    }

    public final void copydefault(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C11573cTg.KWHzl.AEQbTJ(fragmentActivity, new Function1() { // from class: o.dkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14367dkC.OLrzqt(function1, fragmentActivity, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, FragmentActivity fragmentActivity, boolean z) {
        if (z) {
            function1.invoke(java.lang.Boolean.TRUE);
        } else {
            if (fragmentActivity instanceof AbstractActivityC33041mov) {
                AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivity;
                abstractActivityC33041mov.dismissLoading();
                abstractActivityC33041mov.setForceDismiss(true);
            }
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.onKeyShortcut, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault(fragmentActivity, new Function1() { // from class: o.dkL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14367dkC.OLrzqt(this.AEQbTJ, fragmentActivity, function2, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(C14367dkC c14367dkC, FragmentActivity fragmentActivity, final Function2 function2, boolean z) {
        if (z) {
            c14367dkC.copydefault.copydefault(fragmentActivity, new Function1() { // from class: o.dkJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14367dkC.OLrzqt(function2, (java.lang.String) obj);
                }
            });
        } else {
            function2.invoke(java.lang.Boolean.FALSE, "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function2 function2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        function2.invoke(java.lang.Boolean.TRUE, str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.OLrzqt(str);
    }
}
