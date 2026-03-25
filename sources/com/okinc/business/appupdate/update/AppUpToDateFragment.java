package com.okinc.business.appupdate.update;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.appupdate.R;
import com.okinc.business.appupdate.databinding.FragmentAppGoneUpdateBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32995moB;
import o.C33070mpX;
import o.C34703nhO;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpToDateFragment extends C32995moB {
    private static final long DIALOG_SHOW_TIME = 2000;
    private final Function0<Unit> dismissRunnable = new Function0() { // from class: com.okinc.business.appupdate.update.AppUpToDateFragment$$ExternalSyntheticLambda2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUpToDateFragment.dismissRunnable$lambda$0(this.f$0);
        }
    };
    private final Handler handler = new Handler(Looper.getMainLooper());
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissRunnable$lambda$0(AppUpToDateFragment appUpToDateFragment) {
        if (appUpToDateFragment.isAdded()) {
            appUpToDateFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(R.layout.fragment_app_gone_update, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        setupDialogWindow();
        FragmentAppGoneUpdateBinding fragmentAppGoneUpdateBinding = (FragmentAppGoneUpdateBinding) DataBindingUtil.bind(view);
        if (fragmentAppGoneUpdateBinding != null) {
            fragmentAppGoneUpdateBinding.setVersion(C33070mpX.AYXKKw(R.string.pr_appupdate_alert_version) + " " + C34703nhO.valueOf(getActivity()));
        }
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Handler handler = this.handler;
        final Function0<Unit> function0 = this.dismissRunnable;
        handler.postDelayed(new Runnable() { // from class: com.okinc.business.appupdate.update.AppUpToDateFragment$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        }, DIALOG_SHOW_TIME);
    }

    private final void setupDialogWindow() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(C52761wXj.LoaderManager.copydefault);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Handler handler = this.handler;
        final Function0<Unit> function0 = this.dismissRunnable;
        handler.removeCallbacks(new Runnable() { // from class: com.okinc.business.appupdate.update.AppUpToDateFragment$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpToDateFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppUpToDateFragment newInstance() {
            return new AppUpToDateFragment();
        }
    }
}
