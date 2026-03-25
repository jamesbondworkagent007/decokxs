package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55109xdj extends android.view.ViewGroup {
    public static C55109xdj AEQbTJ;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean AYXKKw;
    public android.animation.ValueAnimator AhwBna;
    public final android.content.Context AkhnZx;
    public TaskDescription AuCTel;
    public android.animation.ValueAnimator DbNXlk;
    public final int EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public float fetchVPNInfo;
    public boolean gEmmrt;
    public android.view.VelocityTracker getNewProxyInstance;
    public android.view.View isConnected;
    public boolean valueOf;
    public float values;

    /* JADX INFO: renamed from: o.xdj$TaskDescription */
    public interface TaskDescription {
        void copydefault(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55109xdj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55109xdj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55109xdj AEQbTJ(boolean z) {
        this.valueOf = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55109xdj KWHzl(boolean z) {
        this.djBIcL = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55109xdj copydefault(boolean z) {
        this.KWHzl = z;
        return this;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.xdj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55109xdj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55109xdj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = context;
        this.EZpvd = 300;
        this.gEmmrt = true;
        this.valueOf = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.warmup, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.valueOf = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.IPostMessageServiceDefault, true);
        this.djBIcL = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.onExtraCallback, false);
        this.gEmmrt = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.ITrustedWebActivityCallback, true);
        this.KWHzl = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.IPostMessageService, false);
        typedArrayObtainStyledAttributes.recycle();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        this.fIwbmz = android.view.ViewConfiguration.get(this.AkhnZx).getScaledTouchSlop();
        this.ejfBZ = android.view.ViewConfiguration.get(this.AkhnZx).getScaledMaximumFlingVelocity();
        setClickable(true);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.fARcdN = 0;
        int childCount = getChildCount();
        int iMax = 0;
        int measuredWidth = 0;
        int measuredHeight = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (i3 == 0) {
                    layoutParams.width = getMeasuredWidth();
                    this.isConnected = childAt;
                } else {
                    layoutParams.height = measuredHeight;
                }
                measureChild(childAt, i, i2);
                childAt.getMeasuredWidth();
                childAt.getMeasuredHeight();
                if (mode != 1073741824) {
                    iMax = (int) java.lang.Math.max(iMax, childAt.getMeasuredHeight());
                }
                if (i3 == 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                    measuredWidth = childAt.getMeasuredWidth();
                } else {
                    this.fARcdN += childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(measuredWidth, (int) java.lang.Math.max(getMeasuredHeight(), iMax));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = 0;
        int measuredWidth2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (i6 == 0) {
                    childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                    measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                } else if (this.djBIcL) {
                    childAt.layout(measuredWidth2 - childAt.getMeasuredWidth(), paddingTop, measuredWidth2, childAt.getMeasuredHeight() + paddingTop);
                    measuredWidth2 -= childAt.getMeasuredWidth();
                } else {
                    childAt.layout(i5, paddingTop, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + paddingTop);
                    measuredWidth = childAt.getMeasuredWidth();
                }
                i5 += measuredWidth;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fetchVPNInfo = motionEvent.getRawX();
            getParent().requestDisallowInterceptTouchEvent(false);
            this.OLrzqt = false;
            ActionBar actionBar = Companion;
            if (actionBar.EZpvd() != null) {
                if (!Intrinsics.EZpvd(actionBar.EZpvd(), this)) {
                    C55109xdj c55109xdjEZpvd = actionBar.EZpvd();
                    Intrinsics.copydefault(c55109xdjEZpvd);
                    c55109xdjEZpvd.OLrzqt();
                    this.OLrzqt = this.gEmmrt;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1 || action == 3) {
            this.AYXKKw = false;
            if (java.lang.Math.abs(getScrollX()) == java.lang.Math.abs(this.fARcdN) && this.fARcdN > 0) {
                if ((this.djBIcL && motionEvent.getX() < this.fARcdN) || (!this.djBIcL && motionEvent.getX() > getMeasuredWidth() - this.fARcdN)) {
                    if (this.KWHzl) {
                        OLrzqt();
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (java.lang.Math.abs(motionEvent.getRawX() - this.fetchVPNInfo) <= this.fIwbmz) {
                    OLrzqt();
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!this.valueOf) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && java.lang.Math.abs(motionEvent.getRawX() - this.fetchVPNInfo) >= this.fIwbmz) {
                EZpvd(false);
                return true;
            }
        } else {
            if (this.AYXKKw) {
                return true;
            }
            this.AYXKKw = true;
            this.fJNWhG = motionEvent.getPointerId(0);
            this.values = motionEvent.getRawX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!this.valueOf) {
            return super.onTouchEvent(motionEvent);
        }
        copydefault(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1) {
            android.view.VelocityTracker velocityTracker = this.getNewProxyInstance;
            Intrinsics.copydefault(velocityTracker);
            velocityTracker.computeCurrentVelocity(1000, this.ejfBZ);
            android.view.VelocityTracker velocityTracker2 = this.getNewProxyInstance;
            Intrinsics.copydefault(velocityTracker2);
            float xVelocity = velocityTracker2.getXVelocity(this.fJNWhG);
            gEmmrt();
            if (java.lang.Math.abs(motionEvent.getRawX() - this.fetchVPNInfo) >= this.fIwbmz) {
                if (java.lang.Math.abs(xVelocity) > 1000.0d) {
                    if (xVelocity < -1000.0f) {
                        if (!this.djBIcL) {
                            copydefault();
                        } else {
                            OLrzqt();
                        }
                    } else if (!this.djBIcL) {
                        OLrzqt();
                    } else {
                        copydefault();
                    }
                } else if (java.lang.Math.abs(getScrollX()) > ((double) this.fARcdN) * 0.4d) {
                    copydefault();
                } else {
                    OLrzqt();
                }
                return true;
            }
        } else if (action == 2) {
            float rawX = this.values - motionEvent.getRawX();
            scrollBy((int) rawX, 0);
            if (java.lang.Math.abs(rawX) > this.fIwbmz || java.lang.Math.abs(getScrollX()) > this.fIwbmz) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.djBIcL) {
                int scrollX = getScrollX();
                int i = -this.fARcdN;
                if (scrollX < i) {
                    scrollTo(i, 0);
                } else if (getScrollX() > 0) {
                    scrollTo(0, 0);
                }
            } else if (getScrollX() < 0) {
                scrollTo(0, 0);
            } else {
                int scrollX2 = getScrollX();
                int i2 = this.fARcdN;
                if (scrollX2 > i2) {
                    scrollTo(i2, 0);
                }
            }
            this.values = motionEvent.getRawX();
        } else if (action == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void copydefault(android.view.MotionEvent motionEvent) {
        if (this.getNewProxyInstance == null) {
            this.getNewProxyInstance = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.getNewProxyInstance;
        Intrinsics.copydefault(velocityTracker);
        velocityTracker.addMovement(motionEvent);
    }

    public final void gEmmrt() {
        android.view.VelocityTracker velocityTracker = this.getNewProxyInstance;
        if (velocityTracker != null) {
            Intrinsics.copydefault(velocityTracker);
            velocityTracker.clear();
            android.view.VelocityTracker velocityTracker2 = this.getNewProxyInstance;
            Intrinsics.copydefault(velocityTracker2);
            velocityTracker2.recycle();
            this.getNewProxyInstance = null;
        }
    }

    public final void copydefault() {
        EZpvd(false);
        KWHzl();
        AEQbTJ = this;
        int[] iArr = new int[2];
        iArr[0] = getScrollX();
        iArr[1] = this.djBIcL ? -this.fARcdN : this.fARcdN;
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xdg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C55109xdj.KWHzl(this.AEQbTJ, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Application());
        valueAnimatorOfInt.setInterpolator(new android.view.animation.OvershootInterpolator());
        valueAnimatorOfInt.setDuration(this.EZpvd).start();
        this.DbNXlk = valueAnimatorOfInt;
    }

    public static final void KWHzl(C55109xdj c55109xdj, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c55109xdj.scrollTo(((java.lang.Integer) animatedValue).intValue(), 0);
    }

    /* JADX INFO: renamed from: o.xdj$Application */
    public static final class Application extends android.animation.AnimatorListenerAdapter {
        public Application() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            if (C55109xdj.this.AuCTel != null) {
                TaskDescription taskDescription = C55109xdj.this.AuCTel;
                Intrinsics.copydefault(taskDescription);
                taskDescription.copydefault(true);
            }
        }
    }

    public final void OLrzqt() {
        AEQbTJ = null;
        KWHzl();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(getScrollX(), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xdi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C55109xdj.AEQbTJ(this.AEQbTJ, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Activity());
        valueAnimatorOfInt.setInterpolator(new android.view.animation.AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(this.EZpvd).start();
        this.AhwBna = valueAnimatorOfInt;
    }

    public static final void AEQbTJ(C55109xdj c55109xdj, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c55109xdj.scrollTo(((java.lang.Integer) animatedValue).intValue(), 0);
    }

    /* JADX INFO: renamed from: o.xdj$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public Activity() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            C55109xdj.this.EZpvd(true);
            if (C55109xdj.this.AuCTel != null) {
                TaskDescription taskDescription = C55109xdj.this.AuCTel;
                Intrinsics.copydefault(taskDescription);
                taskDescription.copydefault(false);
            }
        }
    }

    public final void KWHzl() {
        android.animation.ValueAnimator valueAnimator = this.AhwBna;
        if (valueAnimator != null) {
            Intrinsics.copydefault(valueAnimator);
            if (valueAnimator.isRunning()) {
                android.animation.ValueAnimator valueAnimator2 = this.AhwBna;
                Intrinsics.copydefault(valueAnimator2);
                valueAnimator2.cancel();
            }
        }
        android.animation.ValueAnimator valueAnimator3 = this.DbNXlk;
        if (valueAnimator3 != null) {
            Intrinsics.copydefault(valueAnimator3);
            if (valueAnimator3.isRunning()) {
                android.animation.ValueAnimator valueAnimator4 = this.DbNXlk;
                Intrinsics.copydefault(valueAnimator4);
                valueAnimator4.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (getScrollX() != 0) {
            AYXKKw();
            AEQbTJ = null;
        }
        super.onDetachedFromWindow();
    }

    public final void AYXKKw() {
        if (getScrollX() != 0) {
            KWHzl();
            scrollTo(0, 0);
            AEQbTJ = null;
        }
    }

    public final void djBIcL() {
        if (getScrollX() == 0) {
            KWHzl();
            scrollTo(this.djBIcL ? -this.fARcdN : this.fARcdN, 0);
            AEQbTJ = null;
        }
    }

    public final void EZpvd(boolean z) {
        setLongClickable(z);
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (getScrollX() != 0) {
            return true;
        }
        return super.performLongClick();
    }

    /* JADX INFO: renamed from: o.xdj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xdj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C55109xdj EZpvd() {
            return C55109xdj.AEQbTJ;
        }
    }
}
