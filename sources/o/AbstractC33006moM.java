package o;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC33006moM extends AbstractC32996moC {
    public ViewTreeObserver.OnPreDrawListener AEQbTJ;
    public ViewTreeObserver.OnWindowAttachListener EZpvd;
    public boolean copydefault;

    public void AhwBna() {
    }

    public void djBIcL() {
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.copydefault = false;
        OLrzqt(view, new java.lang.Runnable() { // from class: o.moK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.copydefault.EZpvd();
            }
        });
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isReenter()) {
            djBIcL();
        }
    }

    public final void EZpvd() {
        if (this.copydefault) {
            return;
        }
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KWHzl();
        this.copydefault = true;
    }

    /* JADX INFO: renamed from: o.moM$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.Runnable OLrzqt;

        public StateListAnimator(android.view.View view, java.lang.Runnable runnable) {
            this.KWHzl = view;
            this.OLrzqt = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.KWHzl.getViewTreeObserver().removeOnPreDrawListener(this);
            this.KWHzl.post(this.OLrzqt);
            return true;
        }
    }

    public final void OLrzqt(android.view.View view, java.lang.Runnable runnable) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.AEQbTJ = new StateListAnimator(view, runnable);
        TaskDescription taskDescription = new TaskDescription(view, this);
        this.EZpvd = taskDescription;
        viewTreeObserver.addOnWindowAttachListener(taskDescription);
        viewTreeObserver.addOnPreDrawListener(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.moM$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnWindowAttachListener {
        public final /* synthetic */ AbstractC33006moM OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowAttached() {
        }

        public TaskDescription(android.view.View view, AbstractC33006moM abstractC33006moM) {
            this.copydefault = view;
            this.OLrzqt = abstractC33006moM;
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowDetached() {
            this.copydefault.getViewTreeObserver().removeOnWindowAttachListener(this);
            this.copydefault.getViewTreeObserver().removeOnPreDrawListener(this.OLrzqt.AEQbTJ);
        }
    }

    private final void KWHzl() {
        android.view.View view;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view2;
        android.view.ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.AEQbTJ;
        if (onPreDrawListener != null && (view2 = getView()) != null && (viewTreeObserver2 = view2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnPreDrawListener(onPreDrawListener);
        }
        ViewTreeObserver.OnWindowAttachListener onWindowAttachListener = this.EZpvd;
        if (onWindowAttachListener == null || (view = getView()) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowAttachListener(onWindowAttachListener);
    }
}
