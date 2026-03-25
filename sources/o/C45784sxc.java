package o;

import com.okinc.okex.lite.onboarding.ui.OKXWelcomeVerificationActivity;
import java.lang.ref.WeakReference;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.sxc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45784sxc {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sxb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45784sxc.copydefault();
        }
    });

    public final swW EZpvd() {
        return (swW) this.AEQbTJ.getValue();
    }

    public static final swW copydefault() {
        return new swW();
    }

    public final void KWHzl(boolean z) {
        android.app.Activity activity;
        WeakReference weakReference = (WeakReference) CollectionsKt___CollectionsKt.wlaJM(C32979mnm.EZpvd.KWHzl());
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        if (swV.OLrzqt.AEQbTJ() || swY.EZpvd.KWHzl()) {
            KWHzl(activity);
        } else {
            AEQbTJ(activity, z);
        }
    }

    public final void AEQbTJ(android.app.Activity activity, boolean z) {
        if (!z || swY.EZpvd.KWHzl()) {
            return;
        }
        activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) OKXWelcomeVerificationActivity.class));
    }

    public final void KWHzl(android.app.Activity activity) {
        EZpvd().EZpvd(activity);
    }
}
