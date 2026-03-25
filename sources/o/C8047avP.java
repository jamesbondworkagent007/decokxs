package o;

import android.view.View;
import android.view.animation.Animation;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: o.avP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8047avP extends android.widget.FrameLayout implements NestedScrollingParent, NestedScrollingChild {
    public static final int[] AEQbTJ = {android.R.attr.enabled};
    public C8044avM AYXKKw;
    public final android.view.animation.Animation AhwBna;
    public int AkhnZx;
    public boolean AuCTel;
    public Animation.AnimationListener AuCTelauCTel;
    public boolean AubY;
    public android.view.animation.Animation AwvSrB;
    public android.view.animation.Animation AxsJAY;
    public boolean DTwDnp;
    public final android.view.animation.DecelerateInterpolator DbNXlk;
    public android.view.animation.Animation EZpvd;
    public final android.view.animation.Animation KWHzl;
    public int OLrzqt;
    public int ORxRYg;
    public android.view.View OcIXYQ;
    public float QKVWgx;
    public float QOLQEE;
    public android.view.animation.Animation copydefault;
    public Application djBIcL;
    public int ejfBZ;
    public final NestedScrollingChildHelper fARcdN;
    public boolean fIwbmz;
    public SwipeRefreshLayout.OnRefreshListener fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public float gHZMYf;
    public boolean getFieldNames;
    public final int[] getNewProxyInstance;
    public final NestedScrollingParentHelper hDKMBd;
    public float isConnected;
    public final int[] iwGUEr;
    public android.view.animation.Animation sSMYrx;
    public int uzCIH;
    public int valueOf;
    public float values;
    public C8045avN wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public int zuBGHE;

    /* JADX INFO: renamed from: o.avP$Application */
    public interface Application {
        boolean KWHzl(C8047avP c8047avP, @androidx.annotation.Nullable android.view.View view);
    }

    public final boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.gEmmrt;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDistanceToTriggerSync(int i) {
        this.QKVWgx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnChildScrollUpCallback(@androidx.annotation.Nullable Application application) {
        this.djBIcL = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener onRefreshListener) {
        this.fJNWhG = onRefreshListener;
    }

    public void AEQbTJ() {
        this.AYXKKw.clearAnimation();
        this.wlaJM.stop();
        this.AYXKKw.setVisibility(8);
        EZpvd(255);
        if (this.zsXlph) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.uzCIH - this.AkhnZx, true);
        }
        this.AkhnZx = this.AYXKKw.getTop();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        AEQbTJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AEQbTJ();
    }

    private void EZpvd(int i) {
        this.AYXKKw.getBackground().setAlpha(i);
        this.wlaJM.setAlpha(i);
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.zsXlph = z;
        this.uzCIH = i;
        this.zuBGHE = i2;
        this.DTwDnp = true;
        AEQbTJ();
        this.AubY = false;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.zuBGHE = i;
        this.zsXlph = z;
        this.AYXKKw.invalidate();
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.valueOf = (int) (displayMetrics.density * 56.0f);
            } else {
                this.valueOf = (int) (displayMetrics.density * 40.0f);
            }
            this.AYXKKw.setImageDrawable(null);
            this.wlaJM.copydefault(i);
            this.AYXKKw.setImageDrawable(this.wlaJM);
        }
    }

    public C8047avP(android.content.Context context) {
        this(context, null);
    }

    public C8047avP(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AubY = false;
        this.QKVWgx = -1.0f;
        this.iwGUEr = new int[2];
        this.getNewProxyInstance = new int[2];
        this.OLrzqt = -1;
        this.gEmmrt = -1;
        this.AuCTelauCTel = new Animation.AnimationListener() { // from class: o.avP.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                SwipeRefreshLayout.OnRefreshListener onRefreshListener;
                C8047avP c8047avP = C8047avP.this;
                if (c8047avP.AubY) {
                    c8047avP.wlaJM.setAlpha(255);
                    C8047avP.this.wlaJM.start();
                    C8047avP c8047avP2 = C8047avP.this;
                    if (c8047avP2.getFieldNames && (onRefreshListener = c8047avP2.fJNWhG) != null) {
                        onRefreshListener.onRefresh();
                    }
                    C8047avP c8047avP3 = C8047avP.this;
                    c8047avP3.AkhnZx = c8047avP3.AYXKKw.getTop();
                    return;
                }
                c8047avP.AEQbTJ();
            }
        };
        this.KWHzl = new android.view.animation.Animation() { // from class: o.avP.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                int iAbs;
                C8047avP c8047avP = C8047avP.this;
                if (!c8047avP.DTwDnp) {
                    iAbs = c8047avP.zuBGHE - java.lang.Math.abs(c8047avP.uzCIH);
                } else {
                    iAbs = c8047avP.zuBGHE;
                }
                C8047avP c8047avP2 = C8047avP.this;
                C8047avP.this.setTargetOffsetTopAndBottom((c8047avP2.fetchVPNInfo + ((int) ((iAbs - r1) * f))) - c8047avP2.AYXKKw.getTop(), false);
                C8047avP.this.wlaJM.KWHzl(1.0f - f);
            }
        };
        this.AhwBna = new android.view.animation.Animation() { // from class: o.avP.10
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C8047avP.this.KWHzl(f);
            }
        };
        this.ORxRYg = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.ejfBZ = getResources().getInteger(android.R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.DbNXlk = new android.view.animation.DecelerateInterpolator(2.0f);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.valueOf = (int) (displayMetrics.density * 40.0f);
        EZpvd();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.zuBGHE = i;
        this.QKVWgx = i;
        this.hDKMBd = new NestedScrollingParentHelper(this);
        this.fARcdN = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.valueOf;
        this.AkhnZx = i2;
        this.uzCIH = i2;
        KWHzl(1.0f);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AEQbTJ);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void EZpvd() {
        this.AYXKKw = new C8044avM(getContext(), -328966);
        C8045avN c8045avN = new C8045avN(getContext(), this);
        this.wlaJM = c8045avN;
        c8045avN.AEQbTJ(-328966);
        this.AYXKKw.setImageDrawable(this.wlaJM);
        this.AYXKKw.setVisibility(8);
        addView(this.AYXKKw);
    }

    public void setRefreshing(boolean z) {
        if (z && this.AubY != z) {
            this.AubY = z;
            setTargetOffsetTopAndBottom((!this.DTwDnp ? this.zuBGHE + this.uzCIH : this.zuBGHE) - this.AkhnZx, true);
            this.getFieldNames = false;
            KWHzl(this.AuCTelauCTel);
            return;
        }
        setRefreshing(z, false);
    }

    public final void KWHzl(Animation.AnimationListener animationListener) {
        this.AYXKKw.setVisibility(0);
        this.wlaJM.setAlpha(255);
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: o.avP.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C8047avP.this.setAnimationProgress(f);
            }
        };
        this.sSMYrx = animation;
        animation.setDuration(this.ejfBZ);
        if (animationListener != null) {
            this.AYXKKw.setAnimationListener(animationListener);
        }
        this.AYXKKw.clearAnimation();
        this.AYXKKw.startAnimation(this.sSMYrx);
    }

    public void setAnimationProgress(float f) {
        if (KWHzl()) {
            EZpvd((int) (f * 255.0f));
        } else {
            ViewCompat.setScaleX(this.AYXKKw, f);
            ViewCompat.setScaleY(this.AYXKKw, f);
        }
    }

    public final void setRefreshing(boolean z, boolean z2) {
        if (this.AubY != z) {
            this.getFieldNames = z2;
            OLrzqt();
            this.AubY = z;
            if (z) {
                KWHzl(this.AkhnZx, this.AuCTelauCTel);
            } else {
                AEQbTJ(this.AuCTelauCTel);
            }
        }
    }

    public void AEQbTJ(Animation.AnimationListener animationListener) {
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: o.avP.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C8047avP.this.setAnimationProgress(1.0f - f);
            }
        };
        this.AwvSrB = animation;
        animation.setDuration(150L);
        this.AYXKKw.setAnimationListener(animationListener);
        this.AYXKKw.clearAnimation();
        this.AYXKKw.startAnimation(this.AwvSrB);
    }

    public final void AhwBna() {
        this.copydefault = OLrzqt(this.wlaJM.getAlpha(), 76);
    }

    public final void valueOf() {
        this.EZpvd = OLrzqt(this.wlaJM.getAlpha(), 255);
    }

    public final android.view.animation.Animation OLrzqt(final int i, final int i2) {
        if (this.zsXlph && KWHzl()) {
            return null;
        }
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: o.avP.5
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C8047avP.this.wlaJM.setAlpha((int) (i + ((i2 - r0) * f)));
            }
        };
        animation.setDuration(300L);
        this.AYXKKw.setAnimationListener(null);
        this.AYXKKw.clearAnimation();
        this.AYXKKw.startAnimation(animation);
        return animation;
    }

    @java.lang.Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(@androidx.annotation.ColorRes int i) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(@androidx.annotation.ColorInt int i) {
        this.AYXKKw.setBackgroundColor(i);
        this.wlaJM.AEQbTJ(i);
    }

    @java.lang.Deprecated
    public void setColorScheme(@androidx.annotation.ColorInt int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(@androidx.annotation.ColorRes int... iArr) {
        android.content.Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(@androidx.annotation.ColorInt int... iArr) {
        OLrzqt();
        this.wlaJM.KWHzl(iArr);
    }

    public final void OLrzqt() {
        if (this.OcIXYQ == null) {
            for (int i = 0; i < getChildCount(); i++) {
                android.view.View childAt = getChildAt(i);
                if (childAt.getClass().isAssignableFrom(RecyclerView.class)) {
                    this.OcIXYQ = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.OcIXYQ == null) {
            OLrzqt();
        }
        android.view.View view = this.OcIXYQ;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft2 = getPaddingLeft();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - paddingLeft2) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.AYXKKw.getMeasuredWidth();
        int measuredHeight2 = this.AYXKKw.getMeasuredHeight();
        C8044avM c8044avM = this.AYXKKw;
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.AkhnZx;
        c8044avM.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OcIXYQ == null) {
            OLrzqt();
        }
        android.view.View view = this.OcIXYQ;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.AYXKKw.measure(View.MeasureSpec.makeMeasureSpec(this.valueOf, 1073741824), View.MeasureSpec.makeMeasureSpec(this.valueOf, 1073741824));
        this.gEmmrt = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.AYXKKw) {
                this.gEmmrt = i3;
                return;
            }
        }
    }

    public boolean copydefault() {
        Application application = this.djBIcL;
        if (application != null) {
            return application.KWHzl(this, this.OcIXYQ);
        }
        return ViewCompat.canScrollVertically(this.OcIXYQ, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int iFindPointerIndex;
        OLrzqt();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.zLjUOn && actionMasked == 0) {
            this.zLjUOn = false;
        }
        if (!isEnabled() || this.zLjUOn || copydefault() || this.AubY || this.fIwbmz) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.uzCIH - this.AYXKKw.getTop(), true);
            int pointerId = motionEvent.getPointerId(0);
            this.OLrzqt = pointerId;
            this.AuCTel = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.values = motionEvent.getY(iFindPointerIndex2);
        } else if (actionMasked == 1) {
            this.AuCTel = false;
            this.OLrzqt = -1;
        } else if (actionMasked == 2) {
            int i = this.OLrzqt;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                return false;
            }
            EZpvd(motionEvent.getY(iFindPointerIndex));
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                EZpvd(motionEvent);
            }
        }
        return this.AuCTel;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        android.view.View view = this.OcIXYQ;
        if (view == null || ViewCompat.isNestedScrollingEnabled(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        return (!isEnabled() || this.zLjUOn || this.AubY || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        this.hDKMBd.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(i & 2);
        this.QOLQEE = 0.0f;
        this.fIwbmz = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.QOLQEE;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.QOLQEE = 0.0f;
                } else {
                    this.QOLQEE = f - f2;
                    iArr[1] = i2;
                }
                copydefault(this.QOLQEE);
            }
        }
        if (this.DTwDnp && i2 > 0 && this.QOLQEE == 0.0f && java.lang.Math.abs(i2 - iArr[1]) > 0) {
            this.AYXKKw.setVisibility(8);
        }
        int[] iArr2 = this.iwGUEr;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.hDKMBd.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View view) {
        this.hDKMBd.onStopNestedScroll(view);
        this.fIwbmz = false;
        float f = this.QOLQEE;
        if (f > 0.0f) {
            AEQbTJ(f);
            this.QOLQEE = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.getNewProxyInstance);
        if (i4 + this.getNewProxyInstance[1] >= 0 || copydefault()) {
            return;
        }
        float fAbs = this.QOLQEE + java.lang.Math.abs(r11);
        this.QOLQEE = fAbs;
        copydefault(fAbs);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.fARcdN.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.fARcdN.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.fARcdN.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.fARcdN.stopNestedScroll();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.fARcdN.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.fARcdN.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.fARcdN.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.fARcdN.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.fARcdN.dispatchNestedPreFling(f, f2);
    }

    public final boolean KWHzl(android.view.animation.Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void copydefault(float f) {
        this.wlaJM.KWHzl(true);
        float fMin = java.lang.Math.min(1.0f, java.lang.Math.abs(f / this.QKVWgx));
        float fMax = (((float) java.lang.Math.max(((double) fMin) - 0.4d, AudioStats.AUDIO_AMPLITUDE_NONE)) * 5.0f) / 3.0f;
        float fAbs = java.lang.Math.abs(f);
        float f2 = this.QKVWgx;
        float f3 = this.DTwDnp ? this.zuBGHE - this.uzCIH : this.zuBGHE;
        double dMax = java.lang.Math.max(0.0f, java.lang.Math.min(fAbs - f2, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - java.lang.Math.pow(dMax, 2.0d))) * 2.0f;
        int i = this.uzCIH;
        int i2 = (int) ((fMin * f3) + (f3 * fPow * 2.0f));
        if (this.AYXKKw.getVisibility() != 0) {
            this.AYXKKw.setVisibility(0);
        }
        if (!this.zsXlph) {
            ViewCompat.setScaleX(this.AYXKKw, 1.0f);
            ViewCompat.setScaleY(this.AYXKKw, 1.0f);
        }
        if (this.zsXlph) {
            setAnimationProgress(java.lang.Math.min(1.0f, f / this.QKVWgx));
        }
        if (f < this.QKVWgx) {
            if (this.wlaJM.getAlpha() > 76 && !KWHzl(this.copydefault)) {
                AhwBna();
            }
        } else if (this.wlaJM.getAlpha() < 255 && !KWHzl(this.EZpvd)) {
            valueOf();
        }
        this.wlaJM.KWHzl(0.0f, java.lang.Math.min(0.8f, fMax * 0.8f));
        this.wlaJM.KWHzl(java.lang.Math.min(1.0f, fMax));
        this.wlaJM.EZpvd((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom((i + i2) - this.AkhnZx, true);
    }

    public final void AEQbTJ(float f) {
        if (f > this.QKVWgx) {
            setRefreshing(true, true);
            return;
        }
        this.AubY = false;
        this.wlaJM.KWHzl(0.0f, 0.0f);
        OLrzqt(this.AkhnZx, !this.zsXlph ? new Animation.AnimationListener() { // from class: o.avP.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                C8047avP c8047avP = C8047avP.this;
                if (c8047avP.zsXlph) {
                    return;
                }
                c8047avP.AEQbTJ((Animation.AnimationListener) null);
            }
        } : null);
        this.wlaJM.KWHzl(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.zLjUOn && actionMasked == 0) {
            this.zLjUOn = false;
        }
        if (!isEnabled() || this.zLjUOn || copydefault() || this.AubY || this.fIwbmz) {
            return false;
        }
        if (actionMasked == 0) {
            this.OLrzqt = motionEvent.getPointerId(0);
            this.AuCTel = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.OLrzqt);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.AuCTel) {
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.isConnected;
                    this.AuCTel = false;
                    AEQbTJ((y - f) * 0.5f);
                }
                this.OLrzqt = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.OLrzqt);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                EZpvd(y2);
                if (this.AuCTel) {
                    float f2 = (y2 - this.isConnected) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    copydefault(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.OLrzqt = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    EZpvd(motionEvent);
                }
            }
        }
        return true;
    }

    public final void EZpvd(float f) {
        float f2 = this.values;
        float f3 = f - f2;
        float f4 = this.ORxRYg;
        if (f3 <= f4 || this.AuCTel) {
            return;
        }
        this.isConnected = f2 + f4;
        this.AuCTel = true;
        this.wlaJM.setAlpha(76);
    }

    public final void KWHzl(int i, Animation.AnimationListener animationListener) {
        this.fetchVPNInfo = i;
        this.KWHzl.reset();
        this.KWHzl.setDuration(200L);
        this.KWHzl.setInterpolator(this.DbNXlk);
        if (animationListener != null) {
            this.AYXKKw.setAnimationListener(animationListener);
        }
        this.AYXKKw.clearAnimation();
        this.AYXKKw.startAnimation(this.KWHzl);
    }

    public final void OLrzqt(int i, Animation.AnimationListener animationListener) {
        if (this.zsXlph) {
            EZpvd(i, animationListener);
            return;
        }
        this.fetchVPNInfo = i;
        this.AhwBna.reset();
        this.AhwBna.setDuration(200L);
        this.AhwBna.setInterpolator(this.DbNXlk);
        if (animationListener != null) {
            this.AYXKKw.setAnimationListener(animationListener);
        }
        this.AYXKKw.clearAnimation();
        this.AYXKKw.startAnimation(this.AhwBna);
    }

    public void KWHzl(float f) {
        setTargetOffsetTopAndBottom((this.fetchVPNInfo + ((int) ((this.uzCIH - r0) * f))) - this.AYXKKw.getTop(), false);
    }

    public final void EZpvd(int i, Animation.AnimationListener animationListener) {
        this.fetchVPNInfo = i;
        if (KWHzl()) {
            this.gHZMYf = this.wlaJM.getAlpha();
        } else {
            this.gHZMYf = ViewCompat.getScaleX(this.AYXKKw);
        }
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: o.avP.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                C8047avP c8047avP = C8047avP.this;
                float f2 = c8047avP.gHZMYf;
                c8047avP.setAnimationProgress(f2 + ((-f2) * f));
                C8047avP.this.KWHzl(f);
            }
        };
        this.AxsJAY = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.AYXKKw.setAnimationListener(animationListener);
        }
        this.AYXKKw.clearAnimation();
        this.AYXKKw.startAnimation(this.AxsJAY);
    }

    public void setTargetOffsetTopAndBottom(int i, boolean z) {
        this.AYXKKw.bringToFront();
        ViewCompat.offsetTopAndBottom(this.AYXKKw, i);
        this.AkhnZx = this.AYXKKw.getTop();
    }

    public final void EZpvd(android.view.MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (motionEvent.getPointerId(actionIndex) == this.OLrzqt) {
            this.OLrzqt = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
