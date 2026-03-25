package o;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10545bqV {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.bqU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10545bqV.copydefault();
        }
    });
    public ViewOnClickListenerC54939xaY OLrzqt;

    public static final android.os.Handler copydefault() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final android.os.Handler EZpvd() {
        return (android.os.Handler) this.AEQbTJ.getValue();
    }

    public static final void EZpvd(C10545bqV c10545bqV, android.content.Context context, java.lang.String str) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = c10545bqV.OLrzqt;
        if (viewOnClickListenerC54939xaY == null || !viewOnClickListenerC54939xaY.isShowing()) {
            if (context == null && (context = C54819xWm.KWHzl().AEQbTJ()) == null) {
                return;
            }
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
            }
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY2.EZpvd(str);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendEvent), (View.OnClickListener) null, 2, (java.lang.Object) null);
            c10545bqV.OLrzqt = viewOnClickListenerC54939xaY2;
            viewOnClickListenerC54939xaY2.show();
        }
    }

    public final void AEQbTJ(final android.content.Context context, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            EZpvd(this, context, str);
        } else {
            EZpvd().post(new java.lang.Runnable() { // from class: o.bqX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C10545bqV.OLrzqt(this.OLrzqt, context, str);
                }
            });
        }
    }

    public static final void OLrzqt(C10545bqV c10545bqV, android.content.Context context, java.lang.String str) {
        EZpvd(c10545bqV, context, str);
    }
}
