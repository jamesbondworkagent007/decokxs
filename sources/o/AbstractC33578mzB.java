package o;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: o.mzB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@java.lang.Deprecated
public abstract class AbstractC33578mzB extends android.widget.PopupWindow {
    public android.animation.Animator AhwBna;
    public android.animation.Animator EZpvd;

    public abstract android.animation.Animator OLrzqt(@androidx.annotation.NonNull android.view.View view);

    public abstract android.animation.Animator copydefault(@androidx.annotation.NonNull android.view.View view);

    public AbstractC33578mzB(android.content.Context context) {
        super(context);
        AEQbTJ();
    }

    public AbstractC33578mzB(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        AEQbTJ();
    }

    public AbstractC33578mzB(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        setAnimationStyle(0);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        copydefault();
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i, int i2, int i3) {
        copydefault();
        super.showAtLocation(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        EZpvd(new java.lang.Runnable() { // from class: o.mzB.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractC33578mzB.super.dismiss();
                } catch (java.lang.Exception e) {
                    android.util.Log.getStackTraceString(e);
                }
            }
        });
    }

    public final void copydefault() {
        final android.view.View contentView = getContentView();
        OLrzqt(contentView, true, new java.lang.Runnable() { // from class: o.mzB.4
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC33578mzB.this.EZpvd != null) {
                    AbstractC33578mzB.this.EZpvd.cancel();
                }
                AbstractC33578mzB abstractC33578mzB = AbstractC33578mzB.this;
                abstractC33578mzB.EZpvd = abstractC33578mzB.copydefault(contentView);
                if (AbstractC33578mzB.this.EZpvd != null) {
                    AbstractC33578mzB.this.EZpvd.start();
                }
            }
        });
    }

    public final void EZpvd(final java.lang.Runnable runnable) {
        android.animation.Animator animator = this.AhwBna;
        if (animator == null || !animator.isRunning()) {
            android.animation.Animator animatorOLrzqt = OLrzqt(getContentView());
            this.AhwBna = animatorOLrzqt;
            if (animatorOLrzqt != null) {
                animatorOLrzqt.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.mzB.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator2) {
                        animator2.removeListener(this);
                        runnable.run();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(android.animation.Animator animator2) {
                        animator2.removeListener(this);
                        runnable.run();
                    }
                });
                this.AhwBna.start();
            } else {
                runnable.run();
            }
        }
    }

    public void OLrzqt(final android.view.View view, final boolean z, final java.lang.Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.mzB.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                return z;
            }
        });
    }
}
