package o;

import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31217lpp extends android.widget.PopupWindow {
    public final android.content.Context djBIcL;
    public android.animation.Animator gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context EZpvd() {
        return this.djBIcL;
    }

    public abstract android.animation.Animator copydefault(@NotNull android.view.View view);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31217lpp(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = context;
        setAnimationStyle(0);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(@NotNull android.view.View view, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ();
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i, int i2, int i3) {
        AEQbTJ();
        try {
            Result.Application application = Result.Companion;
            super.showAtLocation(view, i, i2, i3);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void AEQbTJ() {
        final android.view.View contentView = getContentView();
        Intrinsics.copydefault(contentView);
        AEQbTJ(contentView, true, new java.lang.Runnable() { // from class: o.lpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC31217lpp.EZpvd(this.copydefault, contentView);
            }
        });
    }

    public static final void EZpvd(AbstractC31217lpp abstractC31217lpp, android.view.View view) {
        android.animation.Animator animator = abstractC31217lpp.gEmmrt;
        if (animator != null) {
            animator.cancel();
        }
        Intrinsics.copydefault(view);
        android.animation.Animator animatorCopydefault = abstractC31217lpp.copydefault(view);
        abstractC31217lpp.gEmmrt = animatorCopydefault;
        if (animatorCopydefault != null) {
            animatorCopydefault.start();
        }
    }

    /* JADX INFO: renamed from: o.lpp$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ java.lang.Runnable EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        public StateListAnimator(android.view.View view, java.lang.Runnable runnable, boolean z) {
            this.OLrzqt = view;
            this.EZpvd = runnable;
            this.KWHzl = z;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.OLrzqt.getViewTreeObserver().removeOnPreDrawListener(this);
            java.lang.Runnable runnable = this.EZpvd;
            if (runnable != null) {
                runnable.run();
            }
            return this.KWHzl;
        }
    }

    public final void AEQbTJ(android.view.View view, boolean z, java.lang.Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new StateListAnimator(view, runnable, z));
    }
}
