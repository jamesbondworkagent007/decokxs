package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import o.C35966oKh;

/* JADX INFO: renamed from: o.pyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C39781pyn extends android.view.ViewGroup {
    public int AEQbTJ;
    public java.util.List<java.lang.Integer> AYXKKw;
    public boolean EZpvd;
    public java.util.List<android.view.View> KWHzl;
    public StateListAnimator OLrzqt;
    public java.util.List<java.util.List<android.view.View>> copydefault;
    public int djBIcL;
    public java.util.List<java.lang.Integer> gEmmrt;

    /* JADX INFO: renamed from: o.pyn$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
        void EZpvd(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAddChildViewListener(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxLine(int i) {
        this.djBIcL = i;
    }

    public C39781pyn(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.copydefault = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        this.AYXKKw = new java.util.ArrayList();
        this.KWHzl = new java.util.ArrayList();
        this.djBIcL = 3;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35966oKh.ActionBar.EZpvd);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getInt(C35966oKh.ActionBar.AEQbTJ, -1);
        if (C55296xhK.OLrzqt(context)) {
            if (this.AEQbTJ == -1) {
                this.AEQbTJ = 1;
            } else {
                this.AEQbTJ = -1;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C39781pyn(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C39781pyn(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        this.copydefault.clear();
        this.gEmmrt.clear();
        this.AYXKKw.clear();
        this.KWHzl.clear();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= childCount) {
                i3 = size;
                i4 = size2;
                break;
            }
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                i3 = size;
                i4 = size2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i4 = size2;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i6 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    if (this.djBIcL > 0) {
                        i3 = size;
                        if (this.copydefault.size() + 1 >= this.djBIcL) {
                            this.EZpvd = true;
                            break;
                        }
                    } else {
                        i3 = size;
                    }
                    if (i5 == 0 && iMax == 0 && i6 == 0 && i7 == 0 && iMax2 == 0) {
                        this.KWHzl.add(childAt);
                        iMax2 = measuredHeight;
                        i7 = iMax2;
                        i6 = measuredWidth;
                        iMax = i6;
                    } else {
                        i7 += iMax2;
                        iMax = java.lang.Math.max(iMax, i6);
                    }
                    this.gEmmrt.add(java.lang.Integer.valueOf(iMax2));
                    this.AYXKKw.add(java.lang.Integer.valueOf(i6));
                    this.copydefault.add(this.KWHzl);
                    this.KWHzl = new java.util.ArrayList();
                    if (i5 != 0 || iMax <= 0 || i7 <= 0) {
                        i6 = 0;
                        iMax2 = 0;
                    } else {
                        i6 = 0;
                        iMax2 = 0;
                    }
                } else {
                    i3 = size;
                }
                i6 += measuredWidth;
                iMax2 = java.lang.Math.max(iMax2, measuredHeight);
                this.KWHzl.add(childAt);
            }
            i5++;
            size2 = i4;
            size = i3;
        }
        int iMax3 = java.lang.Math.max(i6, iMax);
        this.gEmmrt.add(java.lang.Integer.valueOf(iMax2));
        this.AYXKKw.add(java.lang.Integer.valueOf(i6));
        this.copydefault.add(this.KWHzl);
        setMeasuredDimension(mode == 1073741824 ? i3 : iMax3 + getPaddingLeft() + getPaddingRight(), mode2 == 1073741824 ? i4 : i7 + iMax2 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.copydefault.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.KWHzl = this.copydefault.get(i5);
            int iIntValue = this.gEmmrt.get(i5).intValue();
            int iIntValue2 = this.AYXKKw.get(i5).intValue();
            int i6 = this.AEQbTJ;
            if (i6 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i6 == 0) {
                paddingLeft = ((width - iIntValue2) / 2) + getPaddingLeft();
            } else if (i6 == 1) {
                paddingLeft = (width - (iIntValue2 + getPaddingLeft())) - getPaddingRight();
                Collections.reverse(this.KWHzl);
            }
            for (int i7 = 0; i7 < this.KWHzl.size(); i7++) {
                android.view.View view = this.KWHzl.get(i7);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i8 = marginLayoutParams.leftMargin + paddingLeft;
                    int i9 = marginLayoutParams.topMargin + paddingTop;
                    view.layout(i8, i9, view.getMeasuredWidth() + i8, view.getMeasuredHeight() + i9);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
            paddingTop += iIntValue;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.EZpvd(this.EZpvd);
        }
    }
}
