package o;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDU {
    public final int KWHzl;
    public final android.view.View copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.content.Context), (r2v0 android.view.View), (r3v0 int) A[MD:(android.content.Context, android.view.View, int):void (m)] call: o.pDU.<init>(android.content.Context, android.view.View, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ pDU(android.content.Context context, android.view.View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view, i);
    }

    public pDU(android.content.Context context, android.view.View view, int i) {
        this.copydefault = view;
        this.KWHzl = i;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pDU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final pDU OLrzqt(@NotNull android.content.Context context, @NotNull android.view.View view, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(view, "");
            return new pDU(context, view, i, null);
        }
    }

    public static /* synthetic */ void toggle$default(pDU pdu, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        pdu.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (this.copydefault.getVisibility() == 0) {
            copydefault(this.copydefault);
        } else {
            OLrzqt(this.copydefault, z);
        }
    }

    public final void OLrzqt(android.view.View view, boolean z) {
        if (z) {
            copydefault(view, 0, this.KWHzl).start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.KWHzl;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void copydefault(android.view.View view) {
        android.animation.ValueAnimator valueAnimatorCopydefault = copydefault(view, view.getHeight(), 0);
        valueAnimatorCopydefault.addListener(new ActionBar(view));
        valueAnimatorCopydefault.start();
    }

    public static final class ActionBar extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.View KWHzl;

        public ActionBar(android.view.View view) {
            this.KWHzl = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.KWHzl.setVisibility(8);
        }
    }

    public final android.animation.ValueAnimator copydefault(final android.view.View view, int i, int i2) {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.pDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                pDU.AEQbTJ(view, valueAnimator);
            }
        });
        Intrinsics.copydefault(valueAnimatorOfInt);
        return valueAnimatorOfInt;
    }

    public static final void AEQbTJ(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = iIntValue;
        view.setLayoutParams(layoutParams);
        if (iIntValue <= 0 || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
    }
}
