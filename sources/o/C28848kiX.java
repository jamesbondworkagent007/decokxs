package o;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kiX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28848kiX extends android.view.ViewGroup {
    public static WeakReference<C28848kiX> copydefault;
    public boolean AYXKKw;
    public float AhwBna;
    public boolean AkhnZx;
    public GestureDetectorCompat AuCTel;
    public int AuCTelauCTel;
    public int AubY;
    public final android.graphics.Rect AwvSrB;
    public final android.graphics.Rect AxsJAY;
    public int DTwDnp;
    public WeakReference<ViewPager2> DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final android.graphics.Rect ORxRYg;
    public Activity OcIXYQ;
    public final android.graphics.Rect QKVWgx;
    public android.view.View QOLQEE;
    public int QUSxYX;
    public boolean QVAiDq;
    public boolean QfsBiF;
    public volatile boolean djBIcL;
    public final GestureDetector.OnGestureListener ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public volatile boolean fJNWhG;
    public ViewDragHelper fetchVPNInfo;
    public int gEmmrt;
    public final android.graphics.Rect gHZMYf;
    public Application getFieldNames;
    public int getNewProxyInstance;
    public int hDKMBd;
    public float isConnected;
    public int iwGUEr;
    public float sSMYrx;
    public android.view.View uzCIH;
    public volatile boolean valueOf;
    public final ViewDragHelper.Callback values;
    public float wlaJM;
    public int zLjUOn;
    public int zsXlph;
    public final android.graphics.Rect zuBGHE;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.kiX$Activity */
    public interface Activity {
        void AEQbTJ(C28848kiX c28848kiX);

        void EZpvd(C28848kiX c28848kiX);

        void copydefault(C28848kiX c28848kiX);

        void copydefault(C28848kiX c28848kiX, float f);
    }

    /* JADX INFO: renamed from: o.kiX$Application */
    public interface Application {
        boolean KWHzl(@NotNull C28848kiX c28848kiX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean zuBGHE() {
        return this.zsXlph == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        int i = this.DTwDnp;
        return i == 4 || i == 3 || i == 1 || i == 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.AuCTelauCTel < 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(float f, float f2) {
        int i = this.EZpvd;
        if (i == 1 || i == 2) {
            boolean z = i != 1 ? false : false;
            int i2 = this.zsXlph;
            if (i2 != 0 || z) {
                return (i2 == 5 && z) ? false : true;
            }
            return false;
        }
        boolean z2 = i != 4 ? false : false;
        int i3 = this.zsXlph;
        if (i3 != 0 || z2) {
            return (i3 == 5 && z2) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.DTwDnp == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.DTwDnp == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullRevealThreshold(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntermediateThreshold(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockDrag(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinFlingVelocity(int i) {
        this.QUSxYX = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLongClickListener(Application application) {
        this.getFieldNames = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwipeListener(Activity activity) {
        this.OcIXYQ = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.DTwDnp == 0;
    }

    public C28848kiX(android.content.Context context) {
        super(context);
        this.gHZMYf = new android.graphics.Rect();
        this.AxsJAY = new android.graphics.Rect();
        this.AwvSrB = new android.graphics.Rect();
        this.QKVWgx = new android.graphics.Rect();
        this.zuBGHE = new android.graphics.Rect();
        this.ORxRYg = new android.graphics.Rect();
        this.AYXKKw = true;
        this.gEmmrt = 36;
        this.KWHzl = 200;
        this.AubY = 72;
        this.QUSxYX = 300;
        this.OLrzqt = 3500;
        this.zLjUOn = 1;
        this.EZpvd = 2;
        this.wlaJM = -1.0f;
        this.sSMYrx = -1.0f;
        this.ejfBZ = new ActionBar();
        this.values = new StateListAnimator();
        copydefault(context, null);
    }

    public C28848kiX(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gHZMYf = new android.graphics.Rect();
        this.AxsJAY = new android.graphics.Rect();
        this.AwvSrB = new android.graphics.Rect();
        this.QKVWgx = new android.graphics.Rect();
        this.zuBGHE = new android.graphics.Rect();
        this.ORxRYg = new android.graphics.Rect();
        this.AYXKKw = true;
        this.gEmmrt = 36;
        this.KWHzl = 200;
        this.AubY = 72;
        this.QUSxYX = 300;
        this.OLrzqt = 3500;
        this.zLjUOn = 1;
        this.EZpvd = 2;
        this.wlaJM = -1.0f;
        this.sSMYrx = -1.0f;
        this.ejfBZ = new ActionBar();
        this.values = new StateListAnimator();
        copydefault(context, attributeSet);
    }

    public C28848kiX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gHZMYf = new android.graphics.Rect();
        this.AxsJAY = new android.graphics.Rect();
        this.AwvSrB = new android.graphics.Rect();
        this.QKVWgx = new android.graphics.Rect();
        this.zuBGHE = new android.graphics.Rect();
        this.ORxRYg = new android.graphics.Rect();
        this.AYXKKw = true;
        this.gEmmrt = 36;
        this.KWHzl = 200;
        this.AubY = 72;
        this.QUSxYX = 300;
        this.OLrzqt = 3500;
        this.zLjUOn = 1;
        this.EZpvd = 2;
        this.wlaJM = -1.0f;
        this.sSMYrx = -1.0f;
        this.ejfBZ = new ActionBar();
        this.values = new StateListAnimator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            fARcdN();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        GestureDetectorCompat gestureDetectorCompat = this.AuCTel;
        if (gestureDetectorCompat != null) {
            gestureDetectorCompat.onTouchEvent(motionEvent);
        }
        ViewDragHelper viewDragHelper = this.fetchVPNInfo;
        if (viewDragHelper == null) {
            return true;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        android.view.View view;
        boolean z;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.djBIcL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = -1;
        boolean z2 = false;
        if (motionEvent.getAction() == 0) {
            this.AkhnZx = false;
            boolean z3 = !valueOf();
            boolean zAYXKKw = AYXKKw();
            this.QVAiDq = z3 || zAYXKKw;
            if (!z3 && zAYXKKw) {
                OLrzqt();
            }
            AEQbTJ();
            android.view.View view2 = this.uzCIH;
            if (view2 == null || this.zsXlph != 0) {
                z = false;
                this.QfsBiF = z;
            } else {
                float x = motionEvent.getX() - view2.getLeft();
                float y = motionEvent.getY() - view2.getTop();
                if (AEQbTJ(view2, 1, x, y) || AEQbTJ(view2, -1, x, y)) {
                    z = true;
                }
                this.QfsBiF = z;
            }
        }
        ViewDragHelper viewDragHelper = this.fetchVPNInfo;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        GestureDetectorCompat gestureDetectorCompat = this.AuCTel;
        if (gestureDetectorCompat != null) {
            gestureDetectorCompat.onTouchEvent(motionEvent);
        }
        AEQbTJ(motionEvent);
        boolean zOLrzqt = OLrzqt(motionEvent);
        ViewDragHelper viewDragHelper2 = this.fetchVPNInfo;
        boolean z4 = viewDragHelper2 != null && viewDragHelper2.getViewDragState() == 2;
        ViewDragHelper viewDragHelper3 = this.fetchVPNInfo;
        boolean z5 = !zOLrzqt && (z4 || (viewDragHelper3 != null && viewDragHelper3.getViewDragState() == 0 && this.fJNWhG) || this.AkhnZx);
        if (!z5 || !this.QfsBiF || this.wlaJM < 0.0f || (view = this.uzCIH) == null) {
            z2 = z5;
        } else {
            float x2 = motionEvent.getX() - this.wlaJM;
            if (x2 < 0.0f) {
                i = 1;
            } else if (x2 <= 0.0f) {
                i = 0;
            }
            float x3 = motionEvent.getX();
            float left = view.getLeft();
            float y2 = motionEvent.getY();
            float top = view.getTop();
            if (i != 0 && AEQbTJ(view, i, x3 - left, y2 - top)) {
                this.AkhnZx = false;
            }
        }
        this.wlaJM = motionEvent.getX();
        this.sSMYrx = motionEvent.getY();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fARcdN();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.QOLQEE = getChildAt(0);
            this.uzCIH = getChildAt(1);
        } else if (getChildCount() == 1) {
            this.uzCIH = getChildAt(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int i5;
        int iMin;
        int iMin2;
        int iMin3;
        double dMin;
        int i6;
        this.valueOf = false;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            int paddingLeft = getPaddingLeft();
            int iMax = (int) java.lang.Math.max((i3 - getPaddingRight()) - i, AudioStats.AUDIO_AMPLITUDE_NONE);
            int paddingTop = getPaddingTop();
            int iMax2 = (int) java.lang.Math.max((i4 - getPaddingBottom()) - i2, AudioStats.AUDIO_AMPLITUDE_NONE);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i8 = layoutParams.height;
                z2 = i8 == -1 || i8 == -1;
                int i9 = layoutParams.width;
                z3 = i9 == -1 || i9 == -1;
                if (z2) {
                    measuredHeight = iMax2 - paddingTop;
                    Intrinsics.copydefault(layoutParams);
                    layoutParams.height = measuredHeight;
                }
                if (z3) {
                    measuredWidth = iMax - paddingLeft;
                    Intrinsics.copydefault(layoutParams);
                    layoutParams.width = measuredWidth;
                }
                i5 = this.EZpvd;
                if (i5 != 1) {
                    double d = iMax;
                    iMin = (int) java.lang.Math.min(getPaddingLeft(), d);
                    double d2 = iMax2;
                    iMin2 = (int) java.lang.Math.min(getPaddingTop(), d2);
                    iMin3 = (int) java.lang.Math.min(measuredWidth + getPaddingLeft(), d);
                    dMin = java.lang.Math.min(measuredHeight + getPaddingTop(), d2);
                } else if (i5 == 2) {
                    double d3 = paddingLeft;
                    iMin = (int) java.lang.Math.max(((i3 - measuredWidth) - getPaddingRight()) - i, d3);
                    double d4 = iMax2;
                    iMin2 = (int) java.lang.Math.min(getPaddingTop(), d4);
                    iMin3 = (int) java.lang.Math.max((i3 - getPaddingRight()) - i, d3);
                    dMin = java.lang.Math.min(measuredHeight + getPaddingTop(), d4);
                } else if (i5 == 4) {
                    double d5 = iMax;
                    iMin = (int) java.lang.Math.min(getPaddingLeft(), d5);
                    double d6 = iMax2;
                    iMin2 = (int) java.lang.Math.min(getPaddingTop(), d6);
                    iMin3 = (int) java.lang.Math.min(measuredWidth + getPaddingLeft(), d5);
                    dMin = java.lang.Math.min(measuredHeight + getPaddingTop(), d6);
                } else if (i5 == 8) {
                    double d7 = iMax;
                    iMin = (int) java.lang.Math.min(getPaddingLeft(), d7);
                    double d8 = paddingTop;
                    iMin2 = (int) java.lang.Math.max(((i4 - measuredHeight) - getPaddingBottom()) - i2, d8);
                    iMin3 = (int) java.lang.Math.min(measuredWidth + getPaddingLeft(), d7);
                    dMin = java.lang.Math.max((i4 - getPaddingBottom()) - i2, d8);
                } else {
                    iMin = 0;
                    iMin2 = 0;
                    iMin3 = 0;
                    i6 = 0;
                    childAt.layout(iMin, iMin2, iMin3, i6);
                }
                i6 = (int) dMin;
                childAt.layout(iMin, iMin2, iMin3, i6);
            } else {
                z2 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            i5 = this.EZpvd;
            if (i5 != 1) {
            }
            i6 = (int) dMin;
            childAt.layout(iMin, iMin2, iMin3, i6);
        }
        if (this.zLjUOn == 1) {
            int i10 = this.EZpvd;
            if (i10 == 1) {
                android.view.View view = this.QOLQEE;
                Intrinsics.copydefault(view);
                android.view.View view2 = this.QOLQEE;
                Intrinsics.copydefault(view2);
                view.offsetLeftAndRight(-view2.getWidth());
            } else if (i10 == 2) {
                android.view.View view3 = this.QOLQEE;
                Intrinsics.copydefault(view3);
                android.view.View view4 = this.QOLQEE;
                Intrinsics.copydefault(view4);
                view3.offsetLeftAndRight(view4.getWidth());
            } else if (i10 == 4) {
                android.view.View view5 = this.QOLQEE;
                Intrinsics.copydefault(view5);
                android.view.View view6 = this.QOLQEE;
                Intrinsics.copydefault(view6);
                view5.offsetTopAndBottom(-view6.getHeight());
            } else if (i10 == 8) {
                android.view.View view7 = this.QOLQEE;
                Intrinsics.copydefault(view7);
                android.view.View view8 = this.QOLQEE;
                Intrinsics.copydefault(view8);
                view7.offsetTopAndBottom(view8.getHeight());
            }
        }
        gEmmrt();
        if (this.fARcdN) {
            KWHzl(false);
        } else {
            EZpvd(false);
        }
        android.view.View view9 = this.uzCIH;
        Intrinsics.copydefault(view9);
        this.hDKMBd = view9.getLeft();
        android.view.View view10 = this.uzCIH;
        Intrinsics.copydefault(view10);
        this.getNewProxyInstance = view10.getTop();
        this.AuCTelauCTel++;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() < 2) {
            throw new java.lang.RuntimeException("Layout must have two children");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            measureChild(getChildAt(i4), i, i2);
            iMax = (int) java.lang.Math.max(r9.getMeasuredWidth(), iMax);
            iMax2 = (int) java.lang.Math.max(r9.getMeasuredHeight(), iMax2);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode2);
        int size = View.MeasureSpec.getSize(iMakeMeasureSpec);
        int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec2);
        int childCount2 = getChildCount();
        while (i3 < childCount2) {
            android.view.View childAt = getChildAt(i3);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height == -1) {
                    childAt.setMinimumHeight(size2);
                }
                if (layoutParams2.width == -1) {
                    childAt.setMinimumWidth(size);
                }
            }
            measureChild(childAt, iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = (int) java.lang.Math.max(childAt.getMeasuredWidth(), iMax);
            iMax2 = (int) java.lang.Math.max(childAt.getMeasuredHeight(), iMax2);
            i3++;
            iMakeMeasureSpec2 = iMakeMeasureSpec2;
        }
        int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
        int paddingTop = iMax2 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            if (layoutParams.width == -1) {
                paddingLeft = size;
            }
            if (mode != Integer.MIN_VALUE || paddingLeft <= size) {
                size = paddingLeft;
            }
        }
        if (mode2 != 1073741824) {
            if (layoutParams.height == -1) {
                paddingTop = size2;
            }
            if (mode2 != Integer.MIN_VALUE || paddingTop <= size2) {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper = this.fetchVPNInfo;
        Intrinsics.copydefault(viewDragHelper);
        if (viewDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void KWHzl(boolean z) {
        android.view.View view;
        if (z || !fIwbmz() || (view = this.uzCIH) == null || view.getLeft() != this.AxsJAY.left) {
            this.fARcdN = true;
            this.valueOf = false;
            if (z) {
                this.DTwDnp = 3;
                getNewProxyInstance();
                ViewDragHelper viewDragHelper = this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper);
                android.view.View view2 = this.uzCIH;
                Intrinsics.copydefault(view2);
                android.graphics.Rect rect = this.AxsJAY;
                viewDragHelper.smoothSlideViewTo(view2, rect.left, rect.top);
            } else {
                this.DTwDnp = 2;
                this.zsXlph = 2;
                getNewProxyInstance();
                ViewDragHelper viewDragHelper2 = this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper2);
                viewDragHelper2.abort();
                android.view.View view3 = this.uzCIH;
                Intrinsics.copydefault(view3);
                android.graphics.Rect rect2 = this.AxsJAY;
                view3.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                android.view.View view4 = this.QOLQEE;
                Intrinsics.copydefault(view4);
                android.graphics.Rect rect3 = this.QKVWgx;
                view4.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void AEQbTJ(boolean z) {
        android.view.View view;
        if (z || !fetchVPNInfo() || (view = this.uzCIH) == null || view.getLeft() != this.zuBGHE.left) {
            this.fARcdN = true;
            this.valueOf = false;
            if (z) {
                this.DTwDnp = 6;
                getNewProxyInstance();
                ViewDragHelper viewDragHelper = this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper);
                android.view.View view2 = this.uzCIH;
                Intrinsics.copydefault(view2);
                android.graphics.Rect rect = this.zuBGHE;
                viewDragHelper.smoothSlideViewTo(view2, rect.left, rect.top);
            } else {
                this.DTwDnp = 5;
                this.zsXlph = 5;
                getNewProxyInstance();
                ViewDragHelper viewDragHelper2 = this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper2);
                viewDragHelper2.abort();
                android.view.View view3 = this.uzCIH;
                Intrinsics.copydefault(view3);
                android.graphics.Rect rect2 = this.zuBGHE;
                view3.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                android.view.View view4 = this.QOLQEE;
                Intrinsics.copydefault(view4);
                android.graphics.Rect rect3 = this.ORxRYg;
                view4.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void EZpvd(boolean z) {
        android.view.View view;
        if (z || !values() || (view = this.uzCIH) == null || view.getLeft() != this.gHZMYf.left) {
            this.fARcdN = false;
            this.valueOf = false;
            if (z) {
                this.DTwDnp = 1;
                ViewDragHelper viewDragHelper = this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper);
                android.view.View view2 = this.uzCIH;
                Intrinsics.copydefault(view2);
                android.graphics.Rect rect = this.gHZMYf;
                viewDragHelper.smoothSlideViewTo(view2, rect.left, rect.top);
            } else {
                this.zsXlph = 0;
                this.DTwDnp = 0;
                uzCIH();
                ViewDragHelper viewDragHelper2 = this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper2);
                viewDragHelper2.abort();
                android.view.View view3 = this.uzCIH;
                Intrinsics.copydefault(view3);
                android.graphics.Rect rect2 = this.gHZMYf;
                view3.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                android.view.View view4 = this.QOLQEE;
                Intrinsics.copydefault(view4);
                android.graphics.Rect rect3 = this.AwvSrB;
                view4.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final boolean valueOf() {
        android.view.View view = this.uzCIH;
        if (view == null) {
            return true;
        }
        int i = this.EZpvd;
        if (i == 1 || i == 2) {
            if (view.getLeft() == this.gHZMYf.left) {
                return true;
            }
        } else if (view.getTop() == this.gHZMYf.top) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0004 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0004 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: android.view.ViewParent */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.view.ViewParent */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: android.view.ViewParent */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: android.view.ViewParent */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: android.view.ViewParent */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        android.view.ViewParent parent = getParent();
        while (parent != 0) {
            parent.requestDisallowInterceptTouchEvent(z);
            parent = parent instanceof android.view.View ? ((android.view.View) parent).getParent() : 0;
        }
    }

    public final void AEQbTJ() {
        java.lang.Object parent = getParent();
        while (parent != null) {
            if (parent instanceof ViewPager2) {
                ViewPager2 viewPager2 = (ViewPager2) parent;
                if (viewPager2.isUserInputEnabled()) {
                    viewPager2.setUserInputEnabled(false);
                    this.DbNXlk = new WeakReference<>(parent);
                    return;
                }
            }
            parent = parent instanceof android.view.View ? ((android.view.View) parent).getParent() : null;
        }
    }

    public final void fARcdN() {
        ViewPager2 viewPager2;
        WeakReference<ViewPager2> weakReference = this.DbNXlk;
        if (weakReference != null && (viewPager2 = weakReference.get()) != null) {
            viewPager2.setUserInputEnabled(true);
        }
        this.DbNXlk = null;
    }

    public final void getNewProxyInstance() {
        copydefault = new WeakReference<>(this);
    }

    public final void uzCIH() {
        WeakReference<C28848kiX> weakReference = copydefault;
        if ((weakReference != null ? weakReference.get() : null) == this) {
            copydefault = null;
        }
    }

    public final boolean AYXKKw() {
        C28848kiX c28848kiX;
        WeakReference<C28848kiX> weakReference = copydefault;
        return (weakReference == null || (c28848kiX = weakReference.get()) == null || c28848kiX == this || c28848kiX.valueOf()) ? false : true;
    }

    public final void OLrzqt() {
        C28848kiX c28848kiX;
        WeakReference<C28848kiX> weakReference = copydefault;
        if (weakReference == null || (c28848kiX = weakReference.get()) == null || c28848kiX == this || c28848kiX.valueOf()) {
            return;
        }
        c28848kiX.EZpvd(true);
    }

    private final int zsXlph() {
        int width;
        if (this.AYXKKw) {
            width = C55298xhM.dpInt$default(this.AubY, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            width = view.getWidth();
        }
        int i = this.EZpvd;
        if (i == 1) {
            return width + this.gHZMYf.left;
        }
        if (i == 2) {
            return this.gHZMYf.left - width;
        }
        if (i == 4 || i == 8) {
            return this.gHZMYf.left;
        }
        return 0;
    }

    private final int AubY() {
        int height;
        if (this.AYXKKw) {
            height = C55298xhM.dpInt$default(this.AubY, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            height = view.getHeight();
        }
        int i = this.EZpvd;
        if (i == 1 || i == 2) {
            return this.gHZMYf.top;
        }
        if (i == 4) {
            return height + this.gHZMYf.top;
        }
        if (i != 8) {
            return 0;
        }
        return this.gHZMYf.top - height;
    }

    private final int hDKMBd() {
        int i = this.EZpvd;
        if (i == 1) {
            int i2 = this.gHZMYf.left;
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            return i2 + view.getWidth();
        }
        if (i != 2) {
            if (i == 4 || i == 8) {
                return this.gHZMYf.left;
            }
            return 0;
        }
        int i3 = this.gHZMYf.left;
        android.view.View view2 = this.QOLQEE;
        Intrinsics.copydefault(view2);
        return i3 - view2.getWidth();
    }

    private final int iwGUEr() {
        int i = this.EZpvd;
        if (i == 1 || i == 2) {
            return this.gHZMYf.top;
        }
        if (i == 4) {
            int i2 = this.gHZMYf.top;
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            return i2 + view.getHeight();
        }
        if (i != 8) {
            return 0;
        }
        int i3 = this.gHZMYf.top;
        android.view.View view2 = this.QOLQEE;
        Intrinsics.copydefault(view2);
        return i3 - view2.getHeight();
    }

    private final int AuCTelauCTel() {
        int i;
        int width;
        if (this.zLjUOn == 0 || (i = this.EZpvd) == 8 || i == 4) {
            return this.AwvSrB.left;
        }
        if (this.AYXKKw) {
            width = C55298xhM.dpInt$default(this.AubY, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            width = view.getWidth();
        }
        if (this.EZpvd == 1) {
            return this.AwvSrB.left + width;
        }
        return this.AwvSrB.left - width;
    }

    private final int sSMYrx() {
        int i;
        int height;
        if (this.zLjUOn == 0 || (i = this.EZpvd) == 1 || i == 2) {
            return this.AwvSrB.top;
        }
        if (this.AYXKKw) {
            height = C55298xhM.dpInt$default(this.AubY, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            height = view.getHeight();
        }
        if (this.EZpvd == 4) {
            return this.AwvSrB.top + height;
        }
        return this.AwvSrB.top - height;
    }

    private final int wlaJM() {
        int i;
        if (this.zLjUOn == 0 || (i = this.EZpvd) == 8 || i == 4) {
            return this.AwvSrB.left;
        }
        if (i == 1) {
            int i2 = this.AwvSrB.left;
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            return i2 + view.getWidth();
        }
        int i3 = this.AwvSrB.left;
        android.view.View view2 = this.QOLQEE;
        Intrinsics.copydefault(view2);
        return i3 - view2.getWidth();
    }

    private final int zLjUOn() {
        int i;
        if (this.zLjUOn == 0 || (i = this.EZpvd) == 1 || i == 2) {
            return this.AwvSrB.top;
        }
        if (i == 4) {
            int i2 = this.AwvSrB.top;
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            return i2 + view.getHeight();
        }
        int i3 = this.AwvSrB.top;
        android.view.View view2 = this.QOLQEE;
        Intrinsics.copydefault(view2);
        return i3 - view2.getHeight();
    }

    public final void gEmmrt() {
        android.view.View view;
        android.view.View view2 = this.uzCIH;
        if (view2 == null || (view = this.QOLQEE) == null) {
            return;
        }
        this.gHZMYf.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
        this.AwvSrB.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        this.AxsJAY.set(zsXlph(), AubY(), zsXlph() + view2.getWidth(), AubY() + view2.getHeight());
        this.QKVWgx.set(AuCTelauCTel(), sSMYrx(), AuCTelauCTel() + view.getWidth(), sSMYrx() + view.getHeight());
        this.zuBGHE.set(hDKMBd(), iwGUEr(), hDKMBd() + view2.getWidth(), iwGUEr() + view2.getHeight());
        this.ORxRYg.set(wlaJM(), zLjUOn(), wlaJM() + view.getWidth(), zLjUOn() + view.getHeight());
    }

    public final boolean OLrzqt(android.view.MotionEvent motionEvent) {
        return KWHzl(motionEvent) && !fJNWhG();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Intrinsics.copydefault(this.uzCIH);
        if (r1.getTop() <= y) {
            android.view.View view = this.uzCIH;
            Intrinsics.copydefault(view);
            z = y <= ((float) view.getBottom());
        }
        Intrinsics.copydefault(this.uzCIH);
        if (r1.getLeft() <= x) {
            android.view.View view2 = this.uzCIH;
            Intrinsics.copydefault(view2);
            z2 = x <= ((float) view2.getRight());
        }
        return z && z2;
    }

    public final boolean fJNWhG() {
        ViewDragHelper viewDragHelper = this.fetchVPNInfo;
        Intrinsics.copydefault(viewDragHelper);
        boolean z = this.isConnected >= ((float) viewDragHelper.getTouchSlop());
        if (z && !this.AkhnZx) {
            this.AkhnZx = true;
        }
        return z;
    }

    public final boolean ejfBZ() {
        boolean zZuBGHE = zuBGHE();
        float f = this.isConnected;
        ViewDragHelper viewDragHelper = this.fetchVPNInfo;
        boolean z = f < (viewDragHelper != null ? C33129mqd.djBIcL(java.lang.Integer.valueOf(viewDragHelper.getTouchSlop())) : 8.0f);
        int i = this.DTwDnp;
        boolean z2 = (i == 3 || i == 1 || i == 6) ? false : true;
        boolean z3 = this.fJNWhG;
        int i2 = this.DTwDnp;
        return zZuBGHE && z && z2 && (z3 ^ true) && (i2 != 2 && i2 != 5);
    }

    public final boolean AEQbTJ(android.view.View view, int i, float f, float f2) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                float scrollX = (viewGroup.getScrollX() + f) - childAt.getLeft();
                float scrollY = (viewGroup.getScrollY() + f2) - childAt.getTop();
                if (scrollX >= 0.0f && scrollX < childAt.getWidth() && scrollY >= 0.0f && scrollY < childAt.getHeight()) {
                    Intrinsics.copydefault(childAt);
                    if (AEQbTJ(childAt, i, scrollX, scrollY)) {
                        return true;
                    }
                }
            }
        }
        return view.canScrollHorizontally(i);
    }

    public final void AEQbTJ(android.view.MotionEvent motionEvent) {
        double dAbs;
        if (motionEvent.getAction() == 0) {
            this.isConnected = 0.0f;
            return;
        }
        int i = this.EZpvd;
        if (i == 1 || i == 2) {
            dAbs = java.lang.Math.abs(motionEvent.getX() - this.wlaJM);
        } else {
            dAbs = java.lang.Math.abs(motionEvent.getY() - this.sSMYrx);
        }
        this.isConnected += (float) dAbs;
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null && context != null) {
            this.EZpvd = getResources().getConfiguration().getLayoutDirection() != 1 ? 2 : 1;
        }
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 1.0f, this.values);
        viewDragHelperCreate.setEdgeTrackingEnabled(15);
        this.fetchVPNInfo = viewDragHelperCreate;
        Intrinsics.copydefault(context);
        this.AuCTel = new GestureDetectorCompat(context, this.ejfBZ);
    }

    /* JADX INFO: renamed from: o.kiX$ActionBar */
    public static final class ActionBar extends GestureDetector.SimpleOnGestureListener {
        public boolean KWHzl;

        public ActionBar() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            C28848kiX.this.fJNWhG = false;
            this.KWHzl = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            super.onShowPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (C28848kiX.this.ejfBZ() && C28848kiX.this.getFieldNames != null) {
                Application application = C28848kiX.this.getFieldNames;
                Intrinsics.copydefault(application);
                if (application.KWHzl(C28848kiX.this)) {
                    C28848kiX.this.performHapticFeedback(0);
                }
            }
            super.onLongPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
            Intrinsics.checkNotNullParameter(motionEvent2, "");
            C28848kiX.this.fJNWhG = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
            Intrinsics.checkNotNullParameter(motionEvent2, "");
            boolean z = true;
            C28848kiX.this.fJNWhG = true;
            if (C28848kiX.this.getParent() != null) {
                if (!C28848kiX.this.QVAiDq && !this.KWHzl) {
                    boolean z2 = C28848kiX.this.EZpvd(f, f2) && C28848kiX.this.getFieldNames() >= C28848kiX.this.iwGUEr;
                    if (z2) {
                        this.KWHzl = true;
                    }
                    z = z2;
                }
                C28848kiX.this.copydefault(z);
                if (!z) {
                    C28848kiX.this.fARcdN();
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFieldNames() {
        double dMin;
        int i = this.EZpvd;
        if (i == 1) {
            int i2 = this.gHZMYf.left;
            android.view.View view = this.QOLQEE;
            Intrinsics.copydefault(view);
            int width = view.getWidth();
            android.view.View view2 = this.uzCIH;
            Intrinsics.copydefault(view2);
            double left = view2.getLeft() - this.gHZMYf.left;
            Intrinsics.copydefault(this.uzCIH);
            dMin = java.lang.Math.min(left, (i2 + width) - r4.getLeft());
        } else if (i == 2) {
            int i3 = this.gHZMYf.right;
            android.view.View view3 = this.QOLQEE;
            Intrinsics.copydefault(view3);
            int width2 = view3.getWidth();
            android.view.View view4 = this.uzCIH;
            Intrinsics.copydefault(view4);
            double right = view4.getRight() - (i3 - width2);
            int i4 = this.gHZMYf.right;
            Intrinsics.copydefault(this.uzCIH);
            dMin = java.lang.Math.min(right, i4 - r3.getRight());
        } else if (i == 4) {
            int i5 = this.gHZMYf.top;
            android.view.View view5 = this.QOLQEE;
            Intrinsics.copydefault(view5);
            int height = i5 + view5.getHeight();
            android.view.View view6 = this.uzCIH;
            Intrinsics.copydefault(view6);
            double bottom = view6.getBottom() - height;
            Intrinsics.copydefault(this.uzCIH);
            dMin = java.lang.Math.min(bottom, height - r3.getTop());
        } else {
            if (i != 8) {
                return 0;
            }
            int i6 = this.gHZMYf.bottom;
            android.view.View view7 = this.QOLQEE;
            Intrinsics.copydefault(view7);
            int height2 = view7.getHeight();
            int i7 = this.gHZMYf.bottom;
            android.view.View view8 = this.uzCIH;
            Intrinsics.copydefault(view8);
            double bottom2 = i7 - view8.getBottom();
            Intrinsics.copydefault(this.uzCIH);
            dMin = java.lang.Math.min(bottom2, r4.getBottom() - (i6 - height2));
        }
        return (int) dMin;
    }

    /* JADX INFO: renamed from: o.kiX$StateListAnimator */
    public static final class StateListAnimator extends ViewDragHelper.Callback {
        public StateListAnimator() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            C28848kiX.this.valueOf = false;
            if (C28848kiX.this.DbNXlk() || C28848kiX.this.QfsBiF) {
                return false;
            }
            ViewDragHelper viewDragHelper = C28848kiX.this.fetchVPNInfo;
            Intrinsics.copydefault(viewDragHelper);
            android.view.View view2 = C28848kiX.this.uzCIH;
            Intrinsics.copydefault(view2);
            viewDragHelper.captureChildView(view2, i);
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            double dMax;
            Intrinsics.checkNotNullParameter(view, "");
            int iKWHzl = C28848kiX.this.KWHzl();
            if (iKWHzl == 4) {
                int i3 = C28848kiX.this.gHZMYf.top;
                Intrinsics.copydefault(C28848kiX.this.QOLQEE);
                dMax = java.lang.Math.max(java.lang.Math.min(i, i3 + r0.getHeight()), C28848kiX.this.gHZMYf.top);
            } else if (iKWHzl == 8) {
                double dMin = java.lang.Math.min(i, C28848kiX.this.gHZMYf.top);
                int i4 = C28848kiX.this.gHZMYf.top;
                Intrinsics.copydefault(C28848kiX.this.QOLQEE);
                dMax = java.lang.Math.max(dMin, i4 - r0.getHeight());
            } else {
                return view.getTop();
            }
            return (int) dMax;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            double dMax;
            Intrinsics.checkNotNullParameter(view, "");
            int iKWHzl = C28848kiX.this.KWHzl();
            if (iKWHzl == 1) {
                int i3 = C28848kiX.this.gHZMYf.left;
                Intrinsics.copydefault(C28848kiX.this.QOLQEE);
                dMax = java.lang.Math.max(java.lang.Math.min(i, i3 + r0.getWidth()), C28848kiX.this.gHZMYf.left);
            } else if (iKWHzl == 2) {
                double dMin = java.lang.Math.min(i, C28848kiX.this.gHZMYf.left);
                int i4 = C28848kiX.this.gHZMYf.left;
                Intrinsics.copydefault(C28848kiX.this.QOLQEE);
                dMax = java.lang.Math.max(dMin, i4 - r0.getWidth());
            } else {
                return view.getLeft();
            }
            return (int) dMax;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            Intrinsics.checkNotNullParameter(view, "");
            int i = (int) f;
            boolean z = C55298xhM.px2dp$default(i, (android.content.Context) null, 1, (java.lang.Object) null) >= C28848kiX.this.AhwBna();
            boolean z2 = C55298xhM.px2dp$default(i, (android.content.Context) null, 1, (java.lang.Object) null) <= (-C28848kiX.this.AhwBna());
            int i2 = (int) f2;
            boolean z3 = C55298xhM.px2dp$default(i2, (android.content.Context) null, 1, (java.lang.Object) null) <= (-C28848kiX.this.AhwBna());
            boolean z4 = C55298xhM.px2dp$default(i2, (android.content.Context) null, 1, (java.lang.Object) null) >= C28848kiX.this.AhwBna();
            boolean z5 = C55298xhM.px2dp$default(i, (android.content.Context) null, 1, (java.lang.Object) null) >= C28848kiX.this.OLrzqt;
            boolean z6 = C55298xhM.px2dp$default(i, (android.content.Context) null, 1, (java.lang.Object) null) <= (-C28848kiX.this.OLrzqt);
            boolean z7 = C55298xhM.px2dp$default(i2, (android.content.Context) null, 1, (java.lang.Object) null) <= (-C28848kiX.this.OLrzqt);
            boolean z8 = C55298xhM.px2dp$default(i2, (android.content.Context) null, 1, (java.lang.Object) null) >= C28848kiX.this.OLrzqt;
            int iKWHzl = C28848kiX.this.KWHzl();
            if (iKWHzl == 1) {
                OLrzqt(z, z2, z5);
                return;
            }
            if (iKWHzl == 2) {
                copydefault(z, z2, z6);
            } else if (iKWHzl == 4) {
                EZpvd(z3, z4, z8);
            } else {
                if (iKWHzl != 8) {
                    return;
                }
                AEQbTJ(z3, z4, z7);
            }
        }

        public final void copydefault(boolean z, boolean z2, boolean z3) {
            int i = C28848kiX.this.gHZMYf.left;
            android.view.View view = C28848kiX.this.uzCIH;
            Intrinsics.copydefault(view);
            int iPx2dp$default = C55298xhM.px2dp$default(i - view.getLeft(), (android.content.Context) null, 1, (java.lang.Object) null);
            if (z || z2) {
                KWHzl(iPx2dp$default, z, z3);
            } else {
                KWHzl(iPx2dp$default);
            }
        }

        public final void OLrzqt(boolean z, boolean z2, boolean z3) {
            android.view.View view = C28848kiX.this.uzCIH;
            Intrinsics.copydefault(view);
            int iPx2dp$default = C55298xhM.px2dp$default(view.getLeft() - C28848kiX.this.gHZMYf.left, (android.content.Context) null, 1, (java.lang.Object) null);
            if (z || z2) {
                KWHzl(iPx2dp$default, z2, z3);
            } else {
                KWHzl(iPx2dp$default);
            }
        }

        public final void EZpvd(boolean z, boolean z2, boolean z3) {
            android.view.View view = C28848kiX.this.uzCIH;
            Intrinsics.copydefault(view);
            int iPx2dp$default = C55298xhM.px2dp$default(view.getTop() - C28848kiX.this.gHZMYf.top, (android.content.Context) null, 1, (java.lang.Object) null);
            if (z || z2) {
                KWHzl(iPx2dp$default, z, z3);
            } else {
                KWHzl(iPx2dp$default);
            }
        }

        public final void AEQbTJ(boolean z, boolean z2, boolean z3) {
            int i = C28848kiX.this.gHZMYf.top;
            android.view.View view = C28848kiX.this.uzCIH;
            Intrinsics.copydefault(view);
            int iPx2dp$default = C55298xhM.px2dp$default(i - view.getTop(), (android.content.Context) null, 1, (java.lang.Object) null);
            if (z || z2) {
                KWHzl(iPx2dp$default, z2, z3);
            } else {
                KWHzl(iPx2dp$default);
            }
        }

        public final void KWHzl(int i, boolean z, boolean z2) {
            if (z) {
                if (C28848kiX.this.isConnected() && i >= C28848kiX.this.EZpvd()) {
                    C28848kiX.this.KWHzl(true);
                    return;
                } else if (i >= C28848kiX.this.djBIcL()) {
                    C28848kiX.this.EZpvd(true);
                    return;
                } else {
                    C28848kiX.this.EZpvd(true);
                    return;
                }
            }
            if (z2 && C28848kiX.this.isConnected()) {
                C28848kiX.this.AEQbTJ(true);
                return;
            }
            if (i < C28848kiX.this.djBIcL()) {
                C28848kiX.this.KWHzl(true);
            } else if (!C28848kiX.this.isConnected() || i < C28848kiX.this.EZpvd()) {
                C28848kiX.this.KWHzl(true);
            } else {
                C28848kiX.this.AEQbTJ(true);
            }
        }

        public final void KWHzl(int i) {
            if (i < C28848kiX.this.djBIcL()) {
                C28848kiX.this.EZpvd(true);
            } else if (!C28848kiX.this.isConnected() || i < C28848kiX.this.EZpvd()) {
                C28848kiX.this.KWHzl(true);
            } else {
                C28848kiX.this.AEQbTJ(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            super.onEdgeDragStarted(i, i2);
            if (C28848kiX.this.DbNXlk()) {
                return;
            }
            boolean z = false;
            boolean z2 = C28848kiX.this.KWHzl() == 2 && i == 1;
            boolean z3 = C28848kiX.this.KWHzl() == 1 && i == 2;
            boolean z4 = C28848kiX.this.KWHzl() == 8 && i == 4;
            if (C28848kiX.this.KWHzl() == 4 && i == 8) {
                z = true;
            }
            if (z2 || z3 || z4 || z) {
                ViewDragHelper viewDragHelper = C28848kiX.this.fetchVPNInfo;
                Intrinsics.copydefault(viewDragHelper);
                android.view.View view = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view);
                viewDragHelper.captureChildView(view, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            float fAbs;
            boolean z;
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewPositionChanged(view, i, i2, i3, i4);
            C28848kiX c28848kiX = C28848kiX.this;
            if (c28848kiX.KWHzl() == 1 || C28848kiX.this.KWHzl() == 2) {
                fAbs = java.lang.Math.abs(i3);
            } else {
                fAbs = java.lang.Math.abs(i4);
            }
            c28848kiX.AhwBna = fAbs;
            if (C28848kiX.this.zLjUOn == 1) {
                if (C28848kiX.this.KWHzl() == 1 || C28848kiX.this.KWHzl() == 2) {
                    android.view.View view2 = C28848kiX.this.QOLQEE;
                    Intrinsics.copydefault(view2);
                    view2.offsetLeftAndRight(i3);
                } else {
                    android.view.View view3 = C28848kiX.this.QOLQEE;
                    Intrinsics.copydefault(view3);
                    view3.offsetTopAndBottom(i4);
                }
            }
            android.view.View view4 = C28848kiX.this.uzCIH;
            Intrinsics.copydefault(view4);
            if (view4.getLeft() == C28848kiX.this.hDKMBd) {
                android.view.View view5 = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view5);
                z = view5.getTop() != C28848kiX.this.getNewProxyInstance;
            }
            if (C28848kiX.this.OcIXYQ != null && z) {
                android.view.View view6 = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view6);
                if (view6.getLeft() == C28848kiX.this.gHZMYf.left) {
                    android.view.View view7 = C28848kiX.this.uzCIH;
                    Intrinsics.copydefault(view7);
                    if (view7.getTop() == C28848kiX.this.gHZMYf.top) {
                        Activity activity = C28848kiX.this.OcIXYQ;
                        Intrinsics.copydefault(activity);
                        activity.copydefault(C28848kiX.this);
                    } else {
                        android.view.View view8 = C28848kiX.this.uzCIH;
                        Intrinsics.copydefault(view8);
                        if (view8.getLeft() == C28848kiX.this.AxsJAY.left) {
                            android.view.View view9 = C28848kiX.this.uzCIH;
                            Intrinsics.copydefault(view9);
                            if (view9.getTop() == C28848kiX.this.AxsJAY.top) {
                                Activity activity2 = C28848kiX.this.OcIXYQ;
                                Intrinsics.copydefault(activity2);
                                activity2.EZpvd(C28848kiX.this);
                            } else {
                                android.view.View view10 = C28848kiX.this.uzCIH;
                                Intrinsics.copydefault(view10);
                                if (view10.getLeft() == C28848kiX.this.zuBGHE.left) {
                                    android.view.View view11 = C28848kiX.this.uzCIH;
                                    Intrinsics.copydefault(view11);
                                    if (view11.getTop() == C28848kiX.this.zuBGHE.top) {
                                        Activity activity3 = C28848kiX.this.OcIXYQ;
                                        Intrinsics.copydefault(activity3);
                                        activity3.AEQbTJ(C28848kiX.this);
                                    } else {
                                        Activity activity4 = C28848kiX.this.OcIXYQ;
                                        Intrinsics.copydefault(activity4);
                                        activity4.copydefault(C28848kiX.this, OLrzqt());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!C28848kiX.this.fIwbmz && OLrzqt() >= 0.005d) {
                C25352ivB.copydefault(100L);
                C28848kiX.this.fIwbmz = true;
            }
            C28848kiX c28848kiX2 = C28848kiX.this;
            android.view.View view12 = c28848kiX2.uzCIH;
            Intrinsics.copydefault(view12);
            c28848kiX2.hDKMBd = view12.getLeft();
            C28848kiX c28848kiX3 = C28848kiX.this;
            android.view.View view13 = c28848kiX3.uzCIH;
            Intrinsics.copydefault(view13);
            c28848kiX3.getNewProxyInstance = view13.getTop();
            ViewCompat.postInvalidateOnAnimation(C28848kiX.this);
        }

        public final float OLrzqt() {
            float left;
            int width;
            int iKWHzl = C28848kiX.this.KWHzl();
            if (iKWHzl == 1) {
                android.view.View view = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view);
                left = view.getLeft() - C28848kiX.this.gHZMYf.left;
                android.view.View view2 = C28848kiX.this.QOLQEE;
                Intrinsics.copydefault(view2);
                width = view2.getWidth();
            } else if (iKWHzl == 2) {
                int i = C28848kiX.this.gHZMYf.left;
                android.view.View view3 = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view3);
                left = i - view3.getLeft();
                android.view.View view4 = C28848kiX.this.QOLQEE;
                Intrinsics.copydefault(view4);
                width = view4.getWidth();
            } else if (iKWHzl == 4) {
                android.view.View view5 = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view5);
                left = view5.getTop() - C28848kiX.this.gHZMYf.top;
                android.view.View view6 = C28848kiX.this.QOLQEE;
                Intrinsics.copydefault(view6);
                width = view6.getHeight();
            } else {
                if (iKWHzl != 8) {
                    return 0.0f;
                }
                int i2 = C28848kiX.this.gHZMYf.top;
                android.view.View view7 = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view7);
                left = i2 - view7.getTop();
                android.view.View view8 = C28848kiX.this.QOLQEE;
                Intrinsics.copydefault(view8);
                width = view8.getHeight();
            }
            return left / width;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            super.onViewDragStateChanged(i);
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                C28848kiX.this.DTwDnp = 4;
                C28848kiX.this.fIwbmz = false;
                return;
            }
            C28848kiX.this.AhwBna = 0.0f;
            C28848kiX.this.fIwbmz = false;
            if (C28848kiX.this.KWHzl() == 1 || C28848kiX.this.KWHzl() == 2) {
                android.view.View view = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view);
                int left = view.getLeft();
                if (left == C28848kiX.this.gHZMYf.left) {
                    C28848kiX.this.DTwDnp = 0;
                } else if (left == C28848kiX.this.AxsJAY.left) {
                    C28848kiX.this.DTwDnp = 2;
                } else if (left == C28848kiX.this.zuBGHE.left) {
                    C28848kiX.this.DTwDnp = 5;
                }
            } else {
                android.view.View view2 = C28848kiX.this.uzCIH;
                Intrinsics.copydefault(view2);
                int top = view2.getTop();
                if (top == C28848kiX.this.gHZMYf.top) {
                    C28848kiX.this.DTwDnp = 0;
                } else if (top == C28848kiX.this.AxsJAY.top) {
                    C28848kiX.this.DTwDnp = 2;
                } else if (top == C28848kiX.this.zuBGHE.top) {
                    C28848kiX.this.DTwDnp = 5;
                }
            }
            C28848kiX c28848kiX = C28848kiX.this;
            c28848kiX.zsXlph = c28848kiX.DTwDnp;
            C28848kiX.this.fJNWhG = false;
            if (C28848kiX.this.DTwDnp == 2 || C28848kiX.this.DTwDnp == 5) {
                C28848kiX.this.getNewProxyInstance();
            } else if (C28848kiX.this.DTwDnp == 0) {
                C28848kiX.this.uzCIH();
            }
        }
    }

    /* JADX INFO: renamed from: o.kiX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kiX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final boolean KWHzl(boolean z) {
            C28848kiX c28848kiX;
            WeakReference weakReference = C28848kiX.copydefault;
            if (weakReference == null || (c28848kiX = (C28848kiX) weakReference.get()) == null || c28848kiX.valueOf()) {
                return false;
            }
            c28848kiX.EZpvd(z);
            return true;
        }
    }
}
