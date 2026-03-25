package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import o.C13754dXa;

/* JADX INFO: loaded from: classes5.dex */
public class fDY extends android.view.ViewGroup {
    public static fDY AEQbTJ;
    public boolean AYXKKw;
    public android.view.View AhwBna;
    public float AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public android.animation.ValueAnimator djBIcL;
    public int ejfBZ;
    public android.view.VelocityTracker fARcdN;
    public int fIwbmz;
    public fDW fJNWhG;
    public float fetchVPNInfo;
    public boolean gEmmrt;
    public final android.content.Context isConnected;
    public boolean valueOf;
    public android.animation.ValueAnimator values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public fDY OLrzqt(fDW fdw) {
        this.fJNWhG = fdw;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public fDY OLrzqt(boolean z) {
        this.AYXKKw = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public fDY copydefault(boolean z) {
        this.OLrzqt = z;
        return this;
    }

    public fDY(android.content.Context context) {
        this(context, null);
    }

    public fDY(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fDY(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AkhnZx = 0.0f;
        this.fetchVPNInfo = 0.0f;
        this.valueOf = false;
        this.EZpvd = 300;
        this.KWHzl = false;
        this.gEmmrt = true;
        this.AYXKKw = true;
        this.OLrzqt = false;
        this.copydefault = false;
        this.isConnected = context;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.iwGUEr, i, 0);
        this.AYXKKw = typedArrayObtainStyledAttributes.getBoolean(C13754dXa.PendingIntent.wlaJM, true);
        this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C13754dXa.PendingIntent.AubY, false);
        this.gEmmrt = typedArrayObtainStyledAttributes.getBoolean(C13754dXa.PendingIntent.zsXlph, true);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C13754dXa.PendingIntent.getFieldNames, false);
        typedArrayObtainStyledAttributes.recycle();
        EZpvd();
    }

    public final void EZpvd() {
        this.ejfBZ = android.view.ViewConfiguration.get(this.isConnected).getScaledTouchSlop();
        this.AuCTel = android.view.ViewConfiguration.get(this.isConnected).getScaledMaximumFlingVelocity();
        setClickable(true);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.DbNXlk = 0;
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
                    this.AhwBna = childAt;
                } else {
                    layoutParams.height = measuredHeight;
                }
                measureChild(childAt, i, i2);
                if (mode != 1073741824) {
                    iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight());
                }
                if (i3 == 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                    measuredWidth = childAt.getMeasuredWidth();
                } else {
                    this.DbNXlk += childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(measuredWidth, java.lang.Math.max(getMeasuredHeight(), iMax));
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
                } else if (this.OLrzqt) {
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
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fetchVPNInfo = motionEvent.getRawX();
            getParent().requestDisallowInterceptTouchEvent(false);
            this.KWHzl = false;
            fDY fdy = AEQbTJ;
            if (fdy != null) {
                if (fdy != this) {
                    fdy.AEQbTJ();
                    this.KWHzl = this.gEmmrt;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1 || action == 3) {
            this.valueOf = false;
            if (java.lang.Math.abs(getScrollX()) == java.lang.Math.abs(this.DbNXlk) && this.DbNXlk > 0) {
                if ((!this.OLrzqt || motionEvent.getX() >= this.DbNXlk) && (this.OLrzqt || motionEvent.getX() <= getMeasuredWidth() - this.DbNXlk)) {
                    if (java.lang.Math.abs(motionEvent.getRawX() - this.fetchVPNInfo) <= this.ejfBZ) {
                        AEQbTJ();
                        return true;
                    }
                } else if (this.copydefault) {
                    AEQbTJ();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.AYXKKw) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && java.lang.Math.abs(motionEvent.getRawX() - this.fetchVPNInfo) >= this.ejfBZ) {
                EZpvd(false);
                return true;
            }
        } else {
            if (this.valueOf) {
                return true;
            }
            this.valueOf = true;
            this.fIwbmz = motionEvent.getPointerId(0);
            this.AkhnZx = motionEvent.getRawX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.AYXKKw) {
            return super.onTouchEvent(motionEvent);
        }
        KWHzl(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1) {
            this.fARcdN.computeCurrentVelocity(1000, this.AuCTel);
            float xVelocity = this.fARcdN.getXVelocity(this.fIwbmz);
            valueOf();
            if (java.lang.Math.abs(motionEvent.getRawX() - this.fetchVPNInfo) >= this.ejfBZ) {
                if (java.lang.Math.abs(xVelocity) > 1000.0f) {
                    if (xVelocity < -1000.0f) {
                        if (!this.OLrzqt) {
                            KWHzl();
                        } else {
                            AEQbTJ();
                        }
                    } else if (!this.OLrzqt) {
                        AEQbTJ();
                    } else {
                        KWHzl();
                    }
                } else if (java.lang.Math.abs(getScrollX()) > ((double) this.DbNXlk) * 0.4d) {
                    KWHzl();
                } else {
                    AEQbTJ();
                }
                return true;
            }
        } else if (action == 2) {
            float rawX = this.AkhnZx - motionEvent.getRawX();
            scrollBy((int) rawX, 0);
            if (java.lang.Math.abs(rawX) > this.ejfBZ || java.lang.Math.abs(getScrollX()) > this.ejfBZ) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.OLrzqt) {
                int scrollX = getScrollX();
                int i = -this.DbNXlk;
                if (scrollX < i) {
                    scrollTo(i, 0);
                } else if (getScrollX() > 0) {
                    scrollTo(0, 0);
                }
            } else if (getScrollX() < 0) {
                scrollTo(0, 0);
            } else {
                int scrollX2 = getScrollX();
                int i2 = this.DbNXlk;
                if (scrollX2 > i2) {
                    scrollTo(i2, 0);
                }
            }
            this.AkhnZx = motionEvent.getRawX();
        } else if (action == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void KWHzl(android.view.MotionEvent motionEvent) {
        if (this.fARcdN == null) {
            this.fARcdN = android.view.VelocityTracker.obtain();
        }
        this.fARcdN.addMovement(motionEvent);
    }

    public final void valueOf() {
        android.view.VelocityTracker velocityTracker = this.fARcdN;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.fARcdN.recycle();
            this.fARcdN = null;
        }
    }

    public void KWHzl() {
        EZpvd(false);
        copydefault();
        AEQbTJ = this;
        int[] iArr = new int[2];
        iArr[0] = getScrollX();
        iArr[1] = this.OLrzqt ? -this.DbNXlk : this.DbNXlk;
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(iArr);
        this.values = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.fDY.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                fDY.this.scrollTo(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        });
        this.values.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.fDY.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                if (fDY.this.fJNWhG != null) {
                    fDY.this.fJNWhG.OLrzqt(true);
                }
            }
        });
        this.values.setInterpolator(new android.view.animation.OvershootInterpolator());
        this.values.setDuration(this.EZpvd).start();
    }

    public void AEQbTJ() {
        AEQbTJ = null;
        copydefault();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(getScrollX(), 0);
        this.djBIcL = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.fDY.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                fDY.this.scrollTo(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        });
        this.djBIcL.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.fDY.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                fDY.this.EZpvd(true);
                if (fDY.this.fJNWhG != null) {
                    fDY.this.fJNWhG.OLrzqt(false);
                }
            }
        });
        this.djBIcL.setInterpolator(new android.view.animation.AccelerateInterpolator());
        this.djBIcL.setDuration(this.EZpvd).start();
    }

    public final void copydefault() {
        android.animation.ValueAnimator valueAnimator = this.djBIcL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.djBIcL.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.values;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.values.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (getScrollX() != 0) {
            OLrzqt();
            AEQbTJ = null;
        }
        super.onDetachedFromWindow();
    }

    public void OLrzqt() {
        if (getScrollX() != 0) {
            copydefault();
            scrollTo(0, 0);
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
}
