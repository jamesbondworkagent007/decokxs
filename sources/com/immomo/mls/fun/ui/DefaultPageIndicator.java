package com.immomo.mls.fun.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.viewpager.widget.ViewPager;
import o.C7460akJ;
import o.C7465akO;
import o.C7823arB;
import o.C7865arr;
import o.InterfaceC7553alx;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultPageIndicator extends View implements InterfaceC7553alx {
    public int AEQbTJ;
    public int AYXKKw;
    public final Paint AhwBna;
    public boolean AkhnZx;
    public float DbNXlk;
    public boolean EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public float djBIcL;
    public boolean ejfBZ;
    public ViewPager fARcdN;
    public int fJNWhG;
    public int fetchVPNInfo;
    public final Paint gEmmrt;
    public float isConnected;
    public final Paint valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRadiusPadding(float f) {
        this.DbNXlk = f - this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScrollable(boolean z) {
        this.ejfBZ = z;
    }

    public DefaultPageIndicator(Context context) {
        this(context, null);
    }

    public DefaultPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.AhwBna = paint;
        Paint paint2 = new Paint(1);
        this.valueOf = paint2;
        Paint paint3 = new Paint(1);
        this.gEmmrt = paint3;
        this.copydefault = -1.0f;
        this.AEQbTJ = -1;
        this.DbNXlk = 0.0f;
        this.ejfBZ = true;
        this.OLrzqt = true;
        this.AYXKKw = 0;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(436207615);
        paint2.setStyle(Paint.Style.STROKE);
        int iCopydefault = C7865arr.copydefault(4.0f);
        paint3.setStyle(style);
        paint3.setColor(-1);
        this.isConnected = iCopydefault;
        this.AkhnZx = true;
        this.fJNWhG = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public void setCentered(boolean z) {
        this.OLrzqt = z;
        invalidate();
    }

    public void setPageColor(int i) {
        this.AhwBna.setColor(i);
        invalidate();
    }

    public int AEQbTJ() {
        return this.AhwBna.getColor();
    }

    public void setFillColor(int i) {
        this.gEmmrt.setColor(i);
        invalidate();
    }

    public int KWHzl() {
        return this.gEmmrt.getColor();
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.AYXKKw = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setStrokeColor(int i) {
        this.valueOf.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.valueOf.setStrokeWidth(f);
        invalidate();
    }

    public void setRadius(float f) {
        this.isConnected = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.AkhnZx = z;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        EZpvd(canvas);
    }

    public void EZpvd(Canvas canvas) {
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        ViewPager viewPager = this.fARcdN;
        if (viewPager == null) {
            return;
        }
        int count = viewPager.getAdapter().getCount();
        C7465akO c7465akO = (C7465akO) this.fARcdN.getAdapter();
        if (c7465akO != null && c7465akO.copydefault()) {
            count = c7465akO.OLrzqt();
        }
        if (count == 0) {
            return;
        }
        if (this.AYXKKw == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float strokeWidth = this.isConnected;
        float f2 = 3.0f * strokeWidth;
        float f3 = paddingLeft + strokeWidth;
        float f4 = paddingTop + strokeWidth;
        if (this.OLrzqt) {
            f4 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f2) / 2.0f);
        }
        float f5 = 0.0f;
        if (this.valueOf.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.valueOf.getStrokeWidth() / 2.0f;
        }
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i = 0; i < count; i++) {
            float f9 = (i * (this.DbNXlk + f2)) + f4;
            if (this.AYXKKw == 0) {
                if (i == 0) {
                    f8 = f9;
                }
                if (i == count - 1) {
                    f = f3;
                    f6 = f9;
                } else {
                    f = f3;
                }
            } else {
                if (i == 0) {
                    f7 = f9;
                }
                if (i == count - 1) {
                    f5 = f9;
                }
                f = f9;
                f9 = f3;
            }
            if (this.AhwBna.getAlpha() > 0) {
                canvas.drawCircle(f9, f, strokeWidth, this.AhwBna);
            }
            float f10 = this.isConnected;
            if (strokeWidth != f10) {
                canvas.drawCircle(f9, f, f10, this.valueOf);
            }
        }
        boolean z = this.AkhnZx;
        float f11 = (z ? this.fetchVPNInfo : this.KWHzl) * (this.DbNXlk + f2);
        if (!z) {
            f11 += this.djBIcL * f2;
        }
        float f12 = f4 + f11;
        if (this.AYXKKw == 0) {
            if (f12 > f6) {
                f12 = f3;
                f3 = f8;
            } else {
                f12 = f3;
                f3 = f12;
            }
        } else if (f12 > f5) {
            f12 = f7;
        }
        canvas.drawCircle(f3, f12, this.isConnected, this.gEmmrt);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7 A[Catch: Exception -> 0x0113, TryCatch #0 {Exception -> 0x0113, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x000d, B:10:0x0017, B:13:0x001d, B:25:0x0035, B:30:0x0046, B:31:0x004c, B:32:0x005a, B:33:0x006c, B:35:0x007e, B:37:0x0089, B:38:0x008b, B:40:0x008f, B:42:0x0099, B:44:0x00a1, B:45:0x00a7, B:47:0x00ab, B:49:0x00c5, B:52:0x00d1, B:54:0x00da, B:56:0x00df, B:59:0x00ea, B:61:0x00f3, B:63:0x0100, B:64:0x0106), top: B:68:0x0001 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.fARcdN;
        if (viewPager != null && viewPager.getAdapter().getCount() != 0 && this.ejfBZ) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.AEQbTJ = MotionEventCompat.getPointerId(motionEvent, 0);
                this.copydefault = motionEvent.getX();
            } else if (action == 1) {
                if (!this.EZpvd) {
                    int count = this.fARcdN.getAdapter().getCount();
                    float width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    if (this.KWHzl > 0 && motionEvent.getX() < f - f2) {
                        if (action != 3) {
                            this.fARcdN.setCurrentItem(this.KWHzl - 1);
                        }
                        return true;
                    }
                    if (this.KWHzl < count - 1 && motionEvent.getX() > f + f2) {
                        if (action != 3) {
                            this.fARcdN.setCurrentItem(this.KWHzl + 1);
                        }
                        return true;
                    }
                }
                this.EZpvd = false;
                this.AEQbTJ = -1;
                if (this.fARcdN.isFakeDragging()) {
                    this.fARcdN.endFakeDrag();
                }
            } else if (action == 2) {
                float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.AEQbTJ));
                float f3 = x - this.copydefault;
                if (!this.EZpvd && Math.abs(f3) > this.fJNWhG) {
                    this.EZpvd = true;
                }
                if (this.EZpvd) {
                    this.copydefault = x;
                    if (this.fARcdN.isFakeDragging() || this.fARcdN.beginFakeDrag()) {
                        this.fARcdN.fakeDragBy(f3);
                    }
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.copydefault = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.AEQbTJ = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.AEQbTJ) {
                        this.AEQbTJ = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                    }
                    this.copydefault = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.AEQbTJ));
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7553alx
    public void setViewPager(ViewPager viewPager) {
        if (this.fARcdN == viewPager) {
            return;
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.fARcdN = viewPager;
        if (viewPager.getHeight() == 0) {
            this.fARcdN.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.immomo.mls.fun.ui.DefaultPageIndicator.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (DefaultPageIndicator.this.fARcdN.getHeight() != 0) {
                        DefaultPageIndicator.this.OLrzqt();
                        DefaultPageIndicator.this.fARcdN.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        } else {
            OLrzqt();
        }
        this.fARcdN.addOnPageChangeListener(this);
        invalidate();
    }

    @Override // o.InterfaceC7553alx
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.fARcdN;
        if (viewPager == null) {
            return;
        }
        viewPager.setCurrentItem(i);
        this.KWHzl = i;
        this.fetchVPNInfo = KWHzl(i);
        invalidate();
    }

    @Override // o.InterfaceC7553alx
    public void EZpvd() {
        ViewPager viewPager = this.fARcdN;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
        }
        if (getParent() instanceof ViewGroup) {
            C7823arB.EZpvd((ViewGroup) getParent(), this);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.KWHzl = KWHzl(i);
        this.djBIcL = f;
        invalidate();
    }

    public final int KWHzl(int i) {
        C7465akO c7465akO = (C7465akO) this.fARcdN.getAdapter();
        return (c7465akO == null || !c7465akO.copydefault() || c7465akO.OLrzqt() == 0) ? i : i % c7465akO.OLrzqt();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.AkhnZx || this.values == 0) {
            int iKWHzl = KWHzl(i);
            this.KWHzl = iKWHzl;
            this.fetchVPNInfo = iKWHzl;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.AYXKKw == 0) {
            setMeasuredDimension(copydefault(i), OLrzqt(i2));
        } else {
            setMeasuredDimension(OLrzqt(i), copydefault(i2));
        }
    }

    public final int copydefault(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.fARcdN) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.isConnected;
        int i2 = (int) (paddingLeft + (count * 2 * f) + ((count - 1) * f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    public final int OLrzqt(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.isConnected * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.EZpvd;
        this.KWHzl = i;
        this.fetchVPNInfo = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.EZpvd = this.KWHzl;
        return savedState;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.immomo.mls.fun.ui.DefaultPageIndicator.SavedState.1
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int EZpvd;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.EZpvd = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.EZpvd);
        }
    }

    public void OLrzqt() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(copydefault());
        } else {
            copydefault((ViewGroup.MarginLayoutParams) layoutParams);
            requestLayout();
        }
    }

    public final ViewGroup.LayoutParams copydefault() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        copydefault(marginLayoutParams);
        return marginLayoutParams;
    }

    private void copydefault(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.fARcdN.getLayoutParams();
        C7460akJ.OLrzqt(marginLayoutParams, marginLayoutParams2.leftMargin, (this.fARcdN.getHeight() - C7865arr.copydefault(20.0f)) + marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        if (this.fARcdN.getMeasuredWidth() > 0) {
            marginLayoutParams.width = this.fARcdN.getMeasuredWidth();
        }
    }
}
