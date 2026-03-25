package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23404hxb extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int fARcdN = 8;
    public boolean ejfBZ;
    public Application fJNWhG;

    /* JADX INFO: renamed from: o.hxb$Application */
    public interface Application {
        void AEQbTJ(@NotNull android.os.Bundle bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.os.Bundle KWHzl(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return bundle;
    }

    /* JADX INFO: renamed from: o.hxb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hxb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void close$default(C23404hxb c23404hxb, boolean z, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        c23404hxb.OLrzqt(z, bundle);
    }

    public final void OLrzqt(boolean z, android.os.Bundle bundle) {
        this.ejfBZ = true;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putBoolean("isBack", z);
        Application application = this.fJNWhG;
        if (application != null) {
            application.AEQbTJ(KWHzl(bundle2));
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Application application;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.ejfBZ || (application = this.fJNWhG) == null) {
            return;
        }
        application.AEQbTJ(KWHzl(new android.os.Bundle()));
    }

    public final void AhwBna() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void gEmmrt() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).dismissLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    private final void EZpvd() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).releaseLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EZpvd();
    }
}
