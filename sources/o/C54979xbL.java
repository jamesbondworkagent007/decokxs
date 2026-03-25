package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54979xbL extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public float AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public int EZpvd;
    public android.animation.ValueAnimator KWHzl;
    public android.view.animation.Interpolator OLrzqt;
    public Activity djBIcL;
    public int gEmmrt;

    /* JADX INFO: renamed from: o.xbL$Activity */
    public interface Activity {
        void AEQbTJ(float f, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        int i = this.AYXKKw;
        return i == 2 || i == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterpolator(@NotNull android.view.animation.Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "");
        this.OLrzqt = interpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnExpansionUpdateListener(Activity activity) {
        this.djBIcL = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54979xbL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = 300;
        this.OLrzqt = new FastOutSlowInInterpolator();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fIwbmz);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.EZpvd = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.iwGUEr, 300);
            this.AEQbTJ = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.getNewProxyInstance, false) ? 1.0f : 0.0f;
            this.gEmmrt = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.ejfBZ, 1);
            this.AhwBna = typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.hDKMBd, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.AYXKKw = this.AEQbTJ != 0.0f ? 3 : 0;
            setParallax(this.AhwBna);
        }
    }

    /* JADX INFO: renamed from: o.xbL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54979xbL(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        android.os.Bundle bundle = new android.os.Bundle();
        float f = EZpvd() ? 1.0f : 0.0f;
        this.AEQbTJ = f;
        bundle.putFloat("expansion", f);
        bundle.putParcelable("super_state", parcelableOnSaveInstanceState);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull android.os.Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "");
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        float f = bundle.getFloat("expansion");
        this.AEQbTJ = f;
        this.AYXKKw = f == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.gEmmrt == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.AEQbTJ == 0.0f && i3 == 0) ? 8 : 0);
        int iRound = i3 - java.lang.Math.round(i3 * this.AEQbTJ);
        float f = this.AhwBna;
        if (f > 0.0f) {
            float f2 = iRound * f;
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                android.view.View childAt = getChildAt(i4);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                if (this.gEmmrt == 0) {
                    childAt.setTranslationX((getLayoutDirection() != 1 ? -1 : 1) * f2);
                } else {
                    childAt.setTranslationY(-f2);
                }
            }
        }
        if (this.gEmmrt == 0) {
            setMeasuredDimension(measuredWidth - iRound, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - iRound);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.animation.ValueAnimator valueAnimator = this.KWHzl;
        if (valueAnimator != null) {
            Intrinsics.copydefault(valueAnimator);
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    public static /* synthetic */ void toggle$default(C54979xbL c54979xbL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c54979xbL.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (EZpvd()) {
            OLrzqt(z);
        } else {
            EZpvd(z);
        }
    }

    public static /* synthetic */ void expand$default(C54979xbL c54979xbL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c54979xbL.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        setExpanded(true, z);
    }

    public static /* synthetic */ void collapse$default(C54979xbL c54979xbL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c54979xbL.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        setExpanded(false, z);
    }

    public final void setExpanded(boolean z) {
        setExpanded(z, true);
    }

    public final void setExpanded(boolean z, boolean z2) {
        if (z == EZpvd()) {
            return;
        }
        if (z2) {
            EZpvd(z ? 1 : 0);
        } else {
            setExpansion(z ? 1.0f : 0.0f);
        }
    }

    public final void setExpansion(float f) {
        int i;
        float f2 = this.AEQbTJ;
        if (f2 == f) {
            return;
        }
        float f3 = f - f2;
        if (f == 0.0f) {
            this.AYXKKw = 0;
        } else {
            if (f == 1.0f) {
                i = 3;
            } else if (f3 < 0.0f) {
                i = 1;
            } else if (f3 > 0.0f) {
                i = 2;
            }
            this.AYXKKw = i;
        }
        setVisibility(this.AYXKKw == 0 ? 8 : 0);
        this.AEQbTJ = f;
        requestLayout();
        Activity activity = this.djBIcL;
        if (activity != null) {
            Intrinsics.copydefault(activity);
            activity.AEQbTJ(f, this.AYXKKw);
        }
    }

    public final void setParallax(float f) {
        this.AhwBna = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, f));
    }

    public final void setOrientation(int i) {
        if (i < 0 || i > 1) {
            throw new java.lang.IllegalArgumentException("Orientation must be either 0 (horizontal) or 1 (vertical)".toString());
        }
        this.gEmmrt = i;
    }

    public final void EZpvd(int i) {
        android.animation.ValueAnimator valueAnimator = this.KWHzl;
        if (valueAnimator != null) {
            Intrinsics.copydefault(valueAnimator);
            valueAnimator.cancel();
            this.KWHzl = null;
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.AEQbTJ, i);
        this.KWHzl = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setInterpolator(this.OLrzqt);
        }
        android.animation.ValueAnimator valueAnimator2 = this.KWHzl;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(this.EZpvd);
        }
        android.animation.ValueAnimator valueAnimator3 = this.KWHzl;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xbN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator4) {
                    C54979xbL.copydefault(this.EZpvd, valueAnimator4);
                }
            });
        }
        android.animation.ValueAnimator valueAnimator4 = this.KWHzl;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new Application(i));
        }
        android.animation.ValueAnimator valueAnimator5 = this.KWHzl;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    public static final void copydefault(C54979xbL c54979xbL, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c54979xbL.setExpansion(((java.lang.Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: o.xbL$Application */
    public final class Application implements Animator.AnimatorListener {
        public final int AEQbTJ;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Application(int i) {
            this.AEQbTJ = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C54979xbL.this.AYXKKw = this.AEQbTJ == 0 ? 1 : 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.copydefault) {
                return;
            }
            C54979xbL.this.AYXKKw = this.AEQbTJ == 0 ? 0 : 3;
            C54979xbL.this.setExpansion(this.AEQbTJ);
        }
    }
}
