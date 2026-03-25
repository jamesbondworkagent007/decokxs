package o;

import androidx.core.view.KeyEventDispatcher;
import com.okinc.rxutils.SubHelper;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32995moB extends androidx.fragment.app.DialogFragment {
    public static final int $stable = 0;

    public boolean isTranslucent() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
    }

    public final android.animation.Animator getDialogEnterDimAnimator(int i, @NotNull android.view.animation.Interpolator interpolator) {
        android.view.Window window;
        android.animation.Animator animatorKWHzl;
        Intrinsics.checkNotNullParameter(interpolator, "");
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (animatorKWHzl = C33616mzn.KWHzl(window, i, interpolator, 0.0f, window.getAttributes().dimAmount)) == null) {
            return null;
        }
        return animatorKWHzl;
    }

    public final android.animation.Animator getDialogExitDimAnimator(int i, @NotNull android.view.animation.Interpolator interpolator) {
        android.view.Window window;
        android.animation.Animator animatorKWHzl;
        Intrinsics.checkNotNullParameter(interpolator, "");
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (animatorKWHzl = C33616mzn.KWHzl(window, i, interpolator, window.getAttributes().dimAmount, 0.0f)) == null) {
            return null;
        }
        return animatorKWHzl;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C52761wXj.LoaderManager.gEmmrt);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        android.app.Dialog dialog;
        android.view.Window window;
        super.onActivityCreated(bundle);
        if (!isTranslucent() || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.addFlags(67108864);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            super.show(fragmentManager, str);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int show(@NotNull androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentTransaction, "");
        try {
            return super.show(fragmentTransaction, str);
        } catch (java.lang.IllegalStateException unused) {
            return -1;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        SubHelper.AEQbTJ(this);
    }

    public final android.os.Bundle ensureArguments() {
        if (getArguments() == null) {
            setArguments(new android.os.Bundle());
        }
        android.os.Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        return bundleRequireArguments;
    }

    public final void showLoading() {
        try {
            KeyEventDispatcher.Component activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((InterfaceC33075mpc) activity).showLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void showLoadingAtOnce() {
        try {
            KeyEventDispatcher.Component activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((InterfaceC33075mpc) activity).showLoadingAtOnce();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void showLoadingAtOnceCannotCancel() {
        try {
            KeyEventDispatcher.Component activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((InterfaceC33075mpc) activity).showLoadingAtOnceCannotCancel();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void dismissLoading() {
        try {
            KeyEventDispatcher.Component activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((InterfaceC33075mpc) activity).dismissLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void releaseLoading() {
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.copydefault(activity, "");
        ((InterfaceC33075mpc) activity).releaseLoading();
    }
}
