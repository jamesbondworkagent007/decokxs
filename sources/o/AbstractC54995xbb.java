package o;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: o.xbb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC54995xbb extends android.widget.PopupWindow {
    public android.animation.Animator EZpvd;
    public android.animation.Animator KWHzl;

    public abstract android.animation.Animator AEQbTJ(@androidx.annotation.NonNull android.view.View view);

    public abstract android.animation.Animator KWHzl(@androidx.annotation.NonNull android.view.View view);

    public AbstractC54995xbb(android.content.Context context) {
        super(context);
        EZpvd();
    }

    public AbstractC54995xbb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        EZpvd();
    }

    public AbstractC54995xbb(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EZpvd();
    }

    public final void EZpvd() {
        setAnimationStyle(0);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        KWHzl();
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i, int i2, int i3) {
        KWHzl();
        super.showAtLocation(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        EZpvd(new java.lang.Runnable() { // from class: o.xbb.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractC54995xbb.super.dismiss();
                } catch (java.lang.Exception e) {
                    android.util.Log.getStackTraceString(e);
                }
            }
        });
    }

    public final void KWHzl() {
        final android.view.View contentView = getContentView();
        OLrzqt(contentView, true, new java.lang.Runnable() { // from class: o.xbb.4
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC54995xbb.this.EZpvd != null) {
                    AbstractC54995xbb.this.EZpvd.cancel();
                }
                AbstractC54995xbb abstractC54995xbb = AbstractC54995xbb.this;
                abstractC54995xbb.EZpvd = abstractC54995xbb.KWHzl(contentView);
                if (AbstractC54995xbb.this.EZpvd != null) {
                    AbstractC54995xbb.this.EZpvd.start();
                }
            }
        });
    }

    public final void EZpvd(final java.lang.Runnable runnable) {
        android.animation.Animator animator = this.KWHzl;
        if (animator == null || !animator.isRunning()) {
            android.animation.Animator animator2 = this.EZpvd;
            if (animator2 != null) {
                animator2.cancel();
            }
            android.animation.Animator animatorAEQbTJ = AEQbTJ(getContentView());
            this.KWHzl = animatorAEQbTJ;
            if (animatorAEQbTJ != null) {
                animatorAEQbTJ.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.xbb.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator3) {
                        animator3.removeListener(this);
                        runnable.run();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(android.animation.Animator animator3) {
                        animator3.removeListener(this);
                        runnable.run();
                    }
                });
                this.KWHzl.start();
            } else {
                runnable.run();
            }
        }
    }

    public void OLrzqt(final android.view.View view, final boolean z, final java.lang.Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.xbb.5
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
