package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C9678baC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fVE {
    public final android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final InterfaceC56387yDm<fVE> KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fVI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fVE.AEQbTJ();
        }
    });

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fVE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final fVE EZpvd() {
            return (fVE) fVE.KWHzl.getValue();
        }
    }

    public static final fVE AEQbTJ() {
        return new fVE();
    }

    public final void EZpvd() {
        showSuccessNotification$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityNonConfigurationInstances), "", null, null, 12, null);
    }

    public final void copydefault() {
        showSuccessNotification$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityApi19Impl), "", null, null, 12, null);
    }

    public final void EZpvd(@NotNull fWX fwx) {
        Intrinsics.checkNotNullParameter(fwx, "");
        OLrzqt(fwx.copydefault(), fwx.AEQbTJ(), fwx.AYXKKw(), fwx.KWHzl(), fwx.EZpvd());
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, final java.lang.String str3, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.post(new java.lang.Runnable() { // from class: o.fVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fVE.copydefault(z, this, str, str2, str3, function0);
            }
        });
    }

    public static final void copydefault(boolean z, fVE fve, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0) {
        if (z) {
            fve.AEQbTJ(str, str2, str3, function0);
        } else {
            fve.OLrzqt(str, str2, str3, function0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fVE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSuccessNotification$default(fVE fve, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        fve.AEQbTJ(str, str2, str3, function0);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
        android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
        if (activeActivity$default == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activeActivity$default, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setTitle(str);
        c55097xdX.setMessage(str2);
        c55097xdX.setCloseBtnShow(false);
        if (str3 != null && function0 != null) {
            c55097xdX.OLrzqt(str3, function0);
        }
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 0, 0, 0, 30, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fVE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showWarningNotification$default(fVE fve, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        fve.OLrzqt(str, str2, str3, function0);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
        android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
        if (activeActivity$default == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activeActivity$default, null, 0, 4, null);
        c55097xdX.setState(5);
        c55097xdX.setTitle(str);
        c55097xdX.setMessage(str2);
        c55097xdX.setCloseBtnShow(false);
        if (str3 != null && function0 != null) {
            c55097xdX.OLrzqt(str3, function0);
        }
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 0, 0, 0, 30, null);
    }
}
