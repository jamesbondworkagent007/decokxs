package com.okinc.business.appupdate.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.TransitionAdapter;
import com.okinc.business.appupdate.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SlideLock {
    public static final int $stable = 8;
    private boolean isUnlock;
    private Function0<Unit> onUnlockListener;
    private final MotionLayout rootView;
    private View slider;
    private View successView;
    private TextView titleView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnUnlockListener() {
        return this.onUnlockListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnUnlockListener(Function0<Unit> function0) {
        this.onUnlockListener = function0;
    }

    public SlideLock(@NotNull MotionLayout motionLayout) {
        Intrinsics.checkNotNullParameter(motionLayout, "");
        this.rootView = motionLayout;
        View viewFindViewById = motionLayout.findViewById(R.id.slider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.slider = viewFindViewById;
        View viewFindViewById2 = motionLayout.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.titleView = (TextView) viewFindViewById2;
        View viewFindViewById3 = motionLayout.findViewById(R.id.success);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.successView = viewFindViewById3;
        motionLayout.addTransitionListener(new TransitionAdapter() { // from class: com.okinc.business.appupdate.ui.SlideLock.1
            @Override // androidx.constraintlayout.motion.widget.TransitionAdapter, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
            public void onTransitionCompleted(MotionLayout motionLayout2, int i) {
                if (i != R.id.end || SlideLock.this.isUnlock) {
                    return;
                }
                SlideLock.this.isUnlock = true;
                AnimatorSet animatorSet = new AnimatorSet();
                final SlideLock slideLock = SlideLock.this;
                animatorSet.playTogether(ObjectAnimator.ofFloat(slideLock.slider, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(slideLock.successView, "alpha", 0.0f, 1.0f));
                animatorSet.setDuration(300L);
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.okinc.business.appupdate.ui.SlideLock$1$onTransitionCompleted$lambda$1$$inlined$addListener$default$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NotNull Animator animator) {
                        Intrinsics.checkNotNullParameter(animator, "");
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NotNull Animator animator) {
                        Intrinsics.checkNotNullParameter(animator, "");
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NotNull Animator animator) {
                        Intrinsics.checkNotNullParameter(animator, "");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animator) {
                        Intrinsics.checkNotNullParameter(animator, "");
                        Function0<Unit> onUnlockListener = slideLock.getOnUnlockListener();
                        if (onUnlockListener != null) {
                            onUnlockListener.invoke();
                        }
                    }
                });
                animatorSet.start();
            }
        });
    }

    public final CharSequence getText() {
        return this.titleView.getText();
    }

    public final void setText(CharSequence charSequence) {
        this.titleView.setText(charSequence);
    }

    public final void reset() {
        this.isUnlock = false;
        this.slider.setAlpha(1.0f);
        this.successView.setAlpha(0.0f);
        this.rootView.transitionToStart();
    }
}
