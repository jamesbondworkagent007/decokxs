package o;

import android.view.View;
import com.okinc.okex.util.DetectionDialogManager$init$1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C32549mfg;

/* JADX INFO: renamed from: o.sDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44093sDb {
    public static WeakReference<ViewOnClickListenerC54939xaY> AEQbTJ;
    public static final C44093sDb EZpvd = new C44093sDb();
    public static AtomicBoolean KWHzl = new AtomicBoolean(false);
    public static AtomicInteger valueOf = new AtomicInteger(-1);
    public static AtomicInteger OLrzqt = new AtomicInteger(-1);
    public static final AtomicBoolean AYXKKw = new AtomicBoolean(false);
    public static final int copydefault = 8;

    private C44093sDb() {
    }

    public final void OLrzqt(int i) {
        pUU.KWHzl("DetectionDialogManager", "setIsDeviceIdInWhitelist : " + i);
        OLrzqt.set(i);
    }

    public final void EZpvd(int i) {
        pUU.KWHzl("DetectionDialogManager", "setShouldForceRootWarning : " + i);
        valueOf.set(i);
    }

    public final boolean EZpvd() {
        return KWHzl.get();
    }

    public final void EZpvd(boolean z) {
        pUU.KWHzl("DetectionDialogManager", "setEnableShowRiskDialog : " + z);
        KWHzl.set(z);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new DetectionDialogManager$init$1(null), 3, null);
    }

    public final void KWHzl() {
        InterfaceC44099sDh interfaceC44099sDhAhwBna = InterfaceC32484meU.Companion.KWHzl().AhwBna();
        boolean zOLrzqt = interfaceC44099sDhAhwBna != null ? interfaceC44099sDhAhwBna.OLrzqt() : false;
        pUU.KWHzl("DetectionDialogManager", "DetectionDialogManager rootDetection " + zOLrzqt);
        if (zOLrzqt) {
            EZpvd(1);
        } else {
            EZpvd(0);
        }
        C6774aVi c6774aVi = C6774aVi.AEQbTJ;
        pUU.KWHzl("DetectionDialogManager", "rootDetection isDeviceRooted：" + c6774aVi.copydefault().isDeviceRooted + "  shouldForceRootWarning:" + valueOf.get() + " isDeviceIdInWhitelist:" + OLrzqt.get() + " enableShowRiskDialog:" + KWHzl.get());
        if (!c6774aVi.copydefault().isDeviceRooted || valueOf.get() == -1 || OLrzqt.get() == -1) {
            return;
        }
        if (OLrzqt.get() == 1) {
            copydefault(KWHzl.get(), false);
            return;
        }
        int i = valueOf.get();
        if (i == 0) {
            copydefault(KWHzl.get(), false);
        } else {
            if (i != 1) {
                return;
            }
            copydefault(KWHzl.get(), true);
        }
    }

    public final void copydefault(boolean z, final boolean z2) {
        android.view.View decorView;
        pUU.KWHzl("DetectionDialogManager", "DetectionReport param=> enableShowRiskDialog:" + z + "  force:" + z2);
        if (!z && !z2) {
            pUU.KWHzl("DetectionDialogManager", "No need to show dialog");
            return;
        }
        final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            pUU.KWHzl("DetectionDialogManager", "Activity=> " + activityAEQbTJ.getClass().getName());
            if (activityAEQbTJ.isDestroyed() || activityAEQbTJ.isFinishing()) {
                return;
            }
            android.view.Window window = activityAEQbTJ.getWindow();
            pUU.KWHzl("DetectionDialogManager", java.lang.String.valueOf(window != null ? window.getDecorView() : null));
            android.view.Window window2 = activityAEQbTJ.getWindow();
            if (window2 == null || (decorView = window2.getDecorView()) == null) {
                return;
            }
            decorView.post(new java.lang.Runnable() { // from class: o.sDg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C44093sDb.OLrzqt(z2, activityAEQbTJ);
                }
            });
            pUU.KWHzl("DetectionDialogManager", "showForceRiskDialog end");
        }
    }

    public static final void OLrzqt(boolean z, android.app.Activity activity) {
        pUU.KWHzl("DetectionDialogManager", "showForceRiskDialog force:" + z);
        if (z) {
            EZpvd.copydefault(activity, C33070mpX.AYXKKw(C32549mfg.StateListAnimator.AhwBna), new Function1() { // from class: o.sCZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44093sDb.AEQbTJ((ViewOnClickListenerC54939xaY) obj);
                }
            });
            return;
        }
        AtomicBoolean atomicBoolean = AYXKKw;
        pUU.KWHzl("DetectionDialogManager", "showForceRiskDialog start " + atomicBoolean.get());
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.getAndSet(true);
        EZpvd.copydefault(activity, C33070mpX.AYXKKw(C32549mfg.StateListAnimator.dNCPSb), new Function1() { // from class: o.sDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44093sDb.EZpvd((ViewOnClickListenerC54939xaY) obj);
            }
        });
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        C33551myb.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        C44103sDl.Companion.OLrzqt(false);
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public final void copydefault(android.app.Activity activity, java.lang.String str, final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1) {
        if (activity != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C32549mfg.StateListAnimator.djSkpj));
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.EZpvd(C32549mfg.StateListAnimator.AYXKKw, new View.OnClickListener() { // from class: o.sDf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44093sDb.OLrzqt(function1, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            pUU.copydefault("DetectionDialogManager", "showForceRiskDialog show");
            AEQbTJ = new WeakReference<>(viewOnClickListenerC54939xaY);
        }
    }

    public static final void OLrzqt(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }
}
