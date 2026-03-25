package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46735tcl {
    public static /* synthetic */ android.animation.Animator setCurrentItem$default(ViewPager2 viewPager2, int i, long j, android.animation.TimeInterpolator timeInterpolator, int i2, Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            timeInterpolator = new FastOutSlowInInterpolator();
        }
        android.animation.TimeInterpolator timeInterpolator2 = timeInterpolator;
        if ((i3 & 8) != 0) {
            i2 = viewPager2.getWidth();
        }
        return KWHzl(viewPager2, i, j, timeInterpolator2, i2, function0);
    }

    public static final android.animation.Animator KWHzl(@NotNull final ViewPager2 viewPager2, int i, long j, @NotNull android.animation.TimeInterpolator timeInterpolator, int i2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(timeInterpolator, "");
        Intrinsics.checkNotNullParameter(function0, "");
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null) {
            return null;
        }
        if (i < 0 || i >= adapter.getItemCount()) {
            function0.invoke();
            return null;
        }
        final android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, (i - viewPager2.getCurrentItem()) * i2);
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final WeakReference weakReference = new WeakReference(viewPager2);
        final java.lang.String str = "MarketViewPagerAutoSlideHelper";
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tcm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C46735tcl.AEQbTJ(booleanRef, weakReference, viewPager2, intRef, str, valueAnimatorOfInt, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new ActionBar(weakReference, "MarketViewPagerAutoSlideHelper", valueAnimatorOfInt, booleanRef, function0));
        valueAnimatorOfInt.setInterpolator(timeInterpolator);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.start();
        return valueAnimatorOfInt;
    }

    public static final void AEQbTJ(Ref.BooleanRef booleanRef, WeakReference weakReference, ViewPager2 viewPager2, Ref.IntRef intRef, java.lang.String str, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        if (booleanRef.element) {
            ViewPager2 viewPager22 = (ViewPager2) weakReference.get();
            if (viewPager22 == null) {
                valueAnimator.cancel();
                return;
            }
            try {
                java.lang.Object animatedValue = valueAnimator2.getAnimatedValue();
                Intrinsics.copydefault(animatedValue, "");
                int iIntValue = ((java.lang.Integer) animatedValue).intValue();
                float f = iIntValue - intRef.element;
                if (C55296xhK.AEQbTJ(viewPager22)) {
                    viewPager22.fakeDragBy(f);
                } else {
                    viewPager22.fakeDragBy(-f);
                }
                intRef.element = iIntValue;
            } catch (java.lang.IllegalStateException e) {
                pUU.AEQbTJ(str, "fakeDragBy failed", e);
                valueAnimator.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: o.tcl$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ WeakReference<ViewPager2> AEQbTJ;
        public final /* synthetic */ android.animation.ValueAnimator EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar(WeakReference<ViewPager2> weakReference, java.lang.String str, android.animation.ValueAnimator valueAnimator, Ref.BooleanRef booleanRef, Function0<Unit> function0) {
            this.AEQbTJ = weakReference;
            this.copydefault = str;
            this.EZpvd = valueAnimator;
            this.KWHzl = booleanRef;
            this.OLrzqt = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            ViewPager2 viewPager2 = this.AEQbTJ.get();
            if (viewPager2 == null) {
                this.EZpvd.cancel();
                return;
            }
            try {
                if (viewPager2.isFakeDragging()) {
                    pUU.valueOf(this.copydefault, "Already fake dragging, cancelling");
                    this.EZpvd.cancel();
                } else {
                    viewPager2.beginFakeDrag();
                    this.KWHzl.element = true;
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(this.copydefault, "beginFakeDrag failed", e);
                this.EZpvd.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            try {
                try {
                    ViewPager2 viewPager2 = this.AEQbTJ.get();
                    if (this.KWHzl.element && viewPager2 != null && viewPager2.isFakeDragging()) {
                        viewPager2.endFakeDrag();
                    }
                    this.OLrzqt.invoke();
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ(this.copydefault, "onAnimationEnd error", e);
                }
            } finally {
                this.KWHzl.element = false;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            try {
                try {
                    ViewPager2 viewPager2 = this.AEQbTJ.get();
                    if (this.KWHzl.element && viewPager2 != null && viewPager2.isFakeDragging()) {
                        viewPager2.endFakeDrag();
                    }
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ(this.copydefault, "onAnimationCancel error", e);
                }
            } finally {
                this.KWHzl.element = false;
            }
        }
    }
}
