package o;

import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ziw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59541ziw {
    public static final C59541ziw AEQbTJ = new C59541ziw();

    private C59541ziw() {
    }

    public static final void EZpvd(@NotNull android.app.Activity activity, @NotNull final LifecycleOwner lifecycleOwner, @NotNull InterfaceC59496ziD interfaceC59496ziD) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(interfaceC59496ziD, "");
        final InterfaceC59495ziC interfaceC59495ziCCopydefault = AEQbTJ.copydefault(activity, interfaceC59496ziD);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleObserver() { // from class: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$setEventListener$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                interfaceC59495ziCCopydefault.copydefault();
            }
        });
    }

    public static final void KWHzl(@NotNull android.app.Activity activity, @NotNull InterfaceC59496ziD interfaceC59496ziD) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(interfaceC59496ziD, "");
        activity.getApplication().registerActivityLifecycleCallbacks(new StateListAnimator(AEQbTJ.copydefault(activity, interfaceC59496ziD), activity, activity));
    }

    /* JADX INFO: renamed from: o.ziw$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59542zix {
        public final /* synthetic */ android.app.Activity KWHzl;
        public final /* synthetic */ InterfaceC59495ziC copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(InterfaceC59495ziC interfaceC59495ziC, android.app.Activity activity, android.app.Activity activity2) {
            super(activity2);
            this.copydefault = interfaceC59495ziC;
            this.KWHzl = activity;
        }

        @Override // o.AbstractC59542zix
        public void copydefault() {
            this.copydefault.copydefault();
        }
    }

    public final InterfaceC59495ziC copydefault(android.app.Activity activity, InterfaceC59496ziD interfaceC59496ziD) {
        if (activity == null) {
            throw new java.lang.NullPointerException("Parameter:activity must not be null");
        }
        android.view.Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        if ((window.getAttributes().softInputMode & 48) == 48) {
            throw new java.lang.IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized".toString());
        }
        if (interfaceC59496ziD == null) {
            throw new java.lang.NullPointerException("Parameter:listener must not be null");
        }
        android.view.View viewOLrzqt = OLrzqt(activity);
        Application application = new Application(activity, interfaceC59496ziD);
        viewOLrzqt.getViewTreeObserver().addOnGlobalLayoutListener(application);
        return new C59494ziB(activity, application);
    }

    /* JADX INFO: renamed from: o.ziw$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.app.Activity EZpvd;
        public final /* synthetic */ InterfaceC59496ziD OLrzqt;
        public boolean copydefault;

        public Application(android.app.Activity activity, InterfaceC59496ziD interfaceC59496ziD) {
            this.EZpvd = activity;
            this.OLrzqt = interfaceC59496ziD;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean zKWHzl = C59541ziw.AEQbTJ.KWHzl(this.EZpvd);
            if (zKWHzl == this.copydefault) {
                return;
            }
            this.copydefault = zKWHzl;
            this.OLrzqt.OLrzqt(zKWHzl);
        }
    }

    public final boolean KWHzl(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View viewOLrzqt = OLrzqt(activity);
        viewOLrzqt.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        copydefault(activity).getLocationOnScreen(iArr);
        android.view.View rootView = viewOLrzqt.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "");
        int height = rootView.getHeight();
        return ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
    }

    public final android.view.View OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.view.View rootView = copydefault(activity).getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "");
        return rootView;
    }

    public final android.view.ViewGroup copydefault(android.app.Activity activity) {
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return (android.view.ViewGroup) viewFindViewById;
    }
}
