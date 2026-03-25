package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: renamed from: o.aqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7773aqE extends android.view.ViewGroup implements InterfaceC7776aqH, InterfaceC7777aqI {
    public android.view.View[] AYXKKw;
    public int AhwBna;
    public int DbNXlk;
    public int djBIcL;
    public int gEmmrt;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public int getMaxHeight() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public int getMaxWidth() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public void setMaxHeight(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public void setMaxWidth(int i) {
        this.gEmmrt = i;
    }

    public C7773aqE(android.content.Context context) {
        super(context);
        this.values = 1;
        this.gEmmrt = Integer.MAX_VALUE;
        this.djBIcL = Integer.MAX_VALUE;
        this.AYXKKw = new android.view.View[10];
        this.AhwBna = 0;
    }

    public void setOrientation(int i) {
        if (this.values != i) {
            this.values = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof StateListAnimator)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        StateListAnimator stateListAnimator = (StateListAnimator) layoutParams;
        stateListAnimator.KWHzl = this.AhwBna;
        OLrzqt(view, stateListAnimator);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        copydefault(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        copydefault(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        copydefault();
        super.removeAllViews();
    }

    @Override // o.InterfaceC7777aqI
    public void AEQbTJ(android.view.View view, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = this.AhwBna;
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (this.AYXKKw[i4] == view) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            throw new java.lang.IllegalStateException("Is the child added in this layout?");
        }
        if (i2 > i) {
            if (i4 == 0) {
                return;
            }
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                android.view.View view2 = this.AYXKKw[i5];
                if (((StateListAnimator) view2.getLayoutParams()).AEQbTJ >= i2) {
                    this.AYXKKw[i5 + 1] = view;
                    return;
                }
                this.AYXKKw[i5 + 1] = view2;
            }
            this.AYXKKw[0] = view;
            return;
        }
        if (i4 == i3 - 1) {
            return;
        }
        while (true) {
            int i6 = i4 + 1;
            int i7 = this.AhwBna;
            if (i6 < i7) {
                android.view.View view3 = this.AYXKKw[i6];
                if (((StateListAnimator) view3.getLayoutParams()).AEQbTJ < i2) {
                    this.AYXKKw[i4] = view;
                    return;
                } else {
                    this.AYXKKw[i4] = view3;
                    i4 = i6;
                }
            } else {
                this.AYXKKw[i7 - 1] = view;
                return;
            }
        }
    }

    public final void OLrzqt(android.view.View view, StateListAnimator stateListAnimator) {
        if (this.AhwBna == this.AYXKKw.length) {
            AEQbTJ();
        }
        int i = stateListAnimator.AEQbTJ;
        int i2 = this.AhwBna - 1;
        while (i2 >= 0 && ((StateListAnimator) this.AYXKKw[i2].getLayoutParams()).AEQbTJ < i) {
            i2--;
        }
        int i3 = i2 + 1;
        android.view.View[] viewArr = this.AYXKKw;
        java.lang.System.arraycopy(viewArr, i3, viewArr, i2 + 2, this.AhwBna - i3);
        this.AYXKKw[i3] = view;
        this.AhwBna++;
    }

    public final void copydefault(android.view.View view) {
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = this.AhwBna;
            if (i < i2) {
                if (!z && this.AYXKKw[i] == view) {
                    z = true;
                } else if (z) {
                    android.view.View[] viewArr = this.AYXKKw;
                    viewArr[i - 1] = viewArr[i];
                }
                i++;
            } else {
                int i3 = i2 - 1;
                this.AYXKKw[i3] = null;
                this.AhwBna = i3;
                return;
            }
        }
    }

    public final void copydefault() {
        for (int i = 0; i < this.AhwBna; i++) {
            this.AYXKKw[i] = null;
        }
        this.AhwBna = 0;
    }

    public final void AEQbTJ() {
        android.view.View[] viewArr = this.AYXKKw;
        int length = viewArr.length;
        android.view.View[] viewArr2 = new android.view.View[((int) (length * 0.75f)) + length];
        java.lang.System.arraycopy(viewArr, 0, viewArr2, 0, length);
        this.AYXKKw = viewArr2;
    }

    public android.view.View KWHzl(int i) {
        if (this.AhwBna > i) {
            return this.AYXKKw[i];
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iOLrzqt = OLrzqt(i, this.gEmmrt);
        int iOLrzqt2 = OLrzqt(i2, this.djBIcL);
        if (this.values == 1) {
            KWHzl(iOLrzqt, iOLrzqt2);
        } else {
            EZpvd(iOLrzqt, iOLrzqt2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    private void KWHzl(int i, int i2) {
        int i3;
        int measuredHeight;
        int i4;
        int i5;
        int i6;
        C7773aqE c7773aqE = this;
        int mode = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i7 = c7773aqE.AhwBna;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z = false;
        while (true) {
            i3 = 8;
            if (i12 >= i7) {
                break;
            }
            android.view.View viewKWHzl = c7773aqE.KWHzl(i12);
            if (viewKWHzl == null || viewKWHzl.getVisibility() == 8) {
                i4 = i12;
                i5 = i7;
                i9 = i9;
                i8 = i8;
                i11 = i11;
                i10 = i10;
            } else {
                StateListAnimator stateListAnimator = (StateListAnimator) viewKWHzl.getLayoutParams();
                int i15 = i8;
                int i16 = i9;
                i5 = i7;
                int i17 = i11;
                i4 = i12;
                OLrzqt(viewKWHzl, i12, i, 0, i2, i17);
                int measuredHeight2 = viewKWHzl.getMeasuredHeight();
                int iMax = java.lang.Math.max(i17, measuredHeight2 + i17 + ((LinearLayout.LayoutParams) stateListAnimator).topMargin + ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin);
                int iMax2 = java.lang.Math.max(i10, viewKWHzl.getMeasuredWidth() + ((LinearLayout.LayoutParams) stateListAnimator).leftMargin + ((LinearLayout.LayoutParams) stateListAnimator).rightMargin);
                int iCombineMeasuredStates = android.view.View.combineMeasuredStates(i16, viewKWHzl.getMeasuredState());
                i14 += ((LinearLayout.LayoutParams) stateListAnimator).topMargin + ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin;
                float f = ((LinearLayout.LayoutParams) stateListAnimator).weight;
                if (f <= 0.0f || ((LinearLayout.LayoutParams) stateListAnimator).height >= 0) {
                    i14 += measuredHeight2;
                    i6 = i15;
                } else {
                    i6 = (int) (i15 + f);
                    i13++;
                }
                i11 = iMax;
                z = z || (mode != 1073741824 && ((LinearLayout.LayoutParams) stateListAnimator).width == -1);
                i8 = i6;
                i10 = iMax2;
                i9 = iCombineMeasuredStates;
            }
            i12 = i4 + 1;
            c7773aqE = this;
            i7 = i5;
        }
        int i18 = i8;
        int i19 = i11;
        int i20 = i7;
        int i21 = i9;
        int iMax3 = i10;
        int iMax4 = java.lang.Math.max(paddingTop + paddingBottom + i19, getSuggestedMinimumHeight());
        int i22 = paddingLeft + paddingRight;
        int iMax5 = java.lang.Math.max(iMax3 + i22, getSuggestedMinimumWidth());
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(iMax4, i2, 0);
        setMeasuredDimension(android.view.View.resolveSizeAndState(iMax5, i, i21), iResolveSizeAndState);
        if (i13 > 0 && (measuredHeight = ((getMeasuredHeight() - i14) - paddingTop) - paddingBottom) > 0) {
            float f2 = measuredHeight / i18;
            int i23 = 0;
            while (i23 < i20) {
                android.view.View viewKWHzl2 = KWHzl(i23);
                if (viewKWHzl2 != 0 && viewKWHzl2.getVisibility() != i3) {
                    StateListAnimator stateListAnimator2 = (StateListAnimator) viewKWHzl2.getLayoutParams();
                    float f3 = ((LinearLayout.LayoutParams) stateListAnimator2).weight;
                    if (f3 > 0.0f && ((LinearLayout.LayoutParams) stateListAnimator2).height < 0) {
                        int iMax6 = java.lang.Math.max((int) (f3 * f2), viewKWHzl2.getMinimumHeight());
                        if (viewKWHzl2 instanceof InterfaceC7776aqH) {
                            iMax6 = java.lang.Math.min(iMax6, ((InterfaceC7776aqH) viewKWHzl2).getMaxHeight());
                        }
                        viewKWHzl2.measure(android.view.ViewGroup.getChildMeasureSpec(i, ((LinearLayout.LayoutParams) stateListAnimator2).leftMargin + i22 + ((LinearLayout.LayoutParams) stateListAnimator2).rightMargin, ((LinearLayout.LayoutParams) stateListAnimator2).width), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        iMax3 = java.lang.Math.max(iMax3, viewKWHzl2.getMeasuredWidth() + ((LinearLayout.LayoutParams) stateListAnimator2).leftMargin + ((LinearLayout.LayoutParams) stateListAnimator2).rightMargin);
                    }
                }
                i23++;
                i3 = 8;
            }
            setMeasuredDimension(android.view.View.resolveSizeAndState(iMax3 + i22, i, 0), iResolveSizeAndState);
        }
        if (z) {
            copydefault(this.AhwBna, i2);
        }
    }

    public final void copydefault(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            android.view.View viewKWHzl = KWHzl(i3);
            if (viewKWHzl != null && viewKWHzl.getVisibility() != 8) {
                StateListAnimator stateListAnimator = (StateListAnimator) viewKWHzl.getLayoutParams();
                if (((LinearLayout.LayoutParams) stateListAnimator).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) stateListAnimator).height;
                    ((LinearLayout.LayoutParams) stateListAnimator).height = viewKWHzl.getMeasuredHeight();
                    measureChildWithMargins(viewKWHzl, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) stateListAnimator).height = i4;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    private void EZpvd(int i, int i2) {
        int i3;
        int measuredWidth;
        int i4;
        int i5;
        this.DbNXlk = 0;
        int mode = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = this.AhwBna;
        int i7 = 0;
        int iCombineMeasuredStates = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z = false;
        while (true) {
            i3 = 8;
            if (i8 >= i6) {
                break;
            }
            android.view.View viewKWHzl = KWHzl(i8);
            if (viewKWHzl == null || viewKWHzl.getVisibility() == 8) {
                i4 = i8;
                i5 = i6;
                iMax = iMax;
                iMax2 = iMax2;
                iCombineMeasuredStates = iCombineMeasuredStates;
                i7 = i7;
            } else {
                StateListAnimator stateListAnimator = (StateListAnimator) viewKWHzl.getLayoutParams();
                int i11 = i7;
                int i12 = iMax;
                i4 = i8;
                i5 = i6;
                OLrzqt(viewKWHzl, i8, i, i12, i2, 0);
                int measuredWidth2 = viewKWHzl.getMeasuredWidth();
                iMax = java.lang.Math.max(i12, measuredWidth2 + i12 + ((LinearLayout.LayoutParams) stateListAnimator).leftMargin + ((LinearLayout.LayoutParams) stateListAnimator).rightMargin);
                iMax2 = java.lang.Math.max(iMax2, viewKWHzl.getMeasuredHeight() + ((LinearLayout.LayoutParams) stateListAnimator).topMargin + ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewKWHzl.getMeasuredState());
                i9 += ((LinearLayout.LayoutParams) stateListAnimator).leftMargin + ((LinearLayout.LayoutParams) stateListAnimator).rightMargin;
                float f = ((LinearLayout.LayoutParams) stateListAnimator).weight;
                if (f <= 0.0f || ((LinearLayout.LayoutParams) stateListAnimator).width >= 0) {
                    i9 += measuredWidth2;
                    i7 = i11;
                } else {
                    i10++;
                    i7 = (int) (i11 + f);
                }
                z = z || (mode != 1073741824 && ((LinearLayout.LayoutParams) stateListAnimator).height == -1);
            }
            i8 = i4 + 1;
            i6 = i5;
        }
        int i13 = iCombineMeasuredStates;
        int iMax3 = iMax2;
        int i14 = i6;
        int i15 = i7;
        int iMax4 = java.lang.Math.max(paddingLeft + paddingRight + iMax, getSuggestedMinimumWidth());
        int i16 = paddingTop + paddingBottom;
        int iMax5 = java.lang.Math.max(iMax3 + i16, getSuggestedMinimumHeight());
        this.DbNXlk += i9 + paddingLeft + paddingRight;
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(iMax4, i, 0);
        setMeasuredDimension(iResolveSizeAndState, android.view.View.resolveSizeAndState(iMax5, i2, i13));
        if (i10 > 0 && (measuredWidth = ((getMeasuredWidth() - i9) - paddingLeft) - paddingRight) > 0) {
            float f2 = measuredWidth / i15;
            int i17 = 0;
            while (i17 < i14) {
                android.view.View viewKWHzl2 = KWHzl(i17);
                if (viewKWHzl2 != 0 && viewKWHzl2.getVisibility() != i3) {
                    StateListAnimator stateListAnimator2 = (StateListAnimator) viewKWHzl2.getLayoutParams();
                    float f3 = ((LinearLayout.LayoutParams) stateListAnimator2).weight;
                    if (f3 > 0.0f && ((LinearLayout.LayoutParams) stateListAnimator2).width < 0) {
                        int iMax6 = java.lang.Math.max((int) (f3 * f2), viewKWHzl2.getMinimumWidth());
                        if (viewKWHzl2 instanceof InterfaceC7776aqH) {
                            iMax6 = java.lang.Math.min(iMax6, ((InterfaceC7776aqH) viewKWHzl2).getMaxWidth());
                        }
                        viewKWHzl2.measure(View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824), android.view.ViewGroup.getChildMeasureSpec(i2, ((LinearLayout.LayoutParams) stateListAnimator2).topMargin + i16 + ((LinearLayout.LayoutParams) stateListAnimator2).bottomMargin, ((LinearLayout.LayoutParams) stateListAnimator2).height));
                        this.DbNXlk += viewKWHzl2.getMeasuredWidth();
                        iMax3 = java.lang.Math.max(iMax3, viewKWHzl2.getMeasuredHeight() + ((LinearLayout.LayoutParams) stateListAnimator2).topMargin + ((LinearLayout.LayoutParams) stateListAnimator2).bottomMargin);
                    }
                }
                i17++;
                i3 = 8;
            }
            setMeasuredDimension(iResolveSizeAndState, android.view.View.resolveSizeAndState(iMax3 + i16, i2, 0));
        }
        if (z) {
            AEQbTJ(this.AhwBna, i);
        }
    }

    public final void AEQbTJ(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            android.view.View viewKWHzl = KWHzl(i3);
            if (viewKWHzl != null && viewKWHzl.getVisibility() != 8) {
                StateListAnimator stateListAnimator = (StateListAnimator) viewKWHzl.getLayoutParams();
                if (((LinearLayout.LayoutParams) stateListAnimator).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) stateListAnimator).width;
                    ((LinearLayout.LayoutParams) stateListAnimator).width = viewKWHzl.getMeasuredWidth();
                    measureChildWithMargins(viewKWHzl, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) stateListAnimator).width = i4;
                }
            }
        }
    }

    public void OLrzqt(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final int OLrzqt(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode != 1073741824 && View.MeasureSpec.getSize(i) > i2) ? View.MeasureSpec.makeMeasureSpec(i2, mode) : i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.values == 1) {
            copydefault(i, i2, i3, i4);
        } else {
            OLrzqt(i, i2, i3, i4);
        }
    }

    public void copydefault(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i9 = i3 - i;
        int i10 = i9 - paddingRight;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                StateListAnimator stateListAnimator = (StateListAnimator) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) stateListAnimator).gravity;
                if (i12 < 0) {
                    i12 = 8388659;
                }
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i12, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((((i9 - paddingLeft) - paddingRight) - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) stateListAnimator).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) stateListAnimator).rightMargin;
                } else {
                    if (absoluteGravity == 3) {
                        i8 = ((LinearLayout.LayoutParams) stateListAnimator).leftMargin;
                    } else if (absoluteGravity == 5 || C55296xhK.AEQbTJ(this)) {
                        i5 = i10 - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) stateListAnimator).rightMargin;
                    } else {
                        i8 = ((LinearLayout.LayoutParams) stateListAnimator).leftMargin;
                    }
                    i7 = i8 + paddingLeft;
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) stateListAnimator).topMargin;
                    setChildFrame(childAt, i7, i13, measuredWidth, measuredHeight);
                    paddingTop = i13 + measuredHeight + ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin;
                }
                i7 = i5 - i6;
                int i132 = paddingTop + ((LinearLayout.LayoutParams) stateListAnimator).topMargin;
                setChildFrame(childAt, i7, i132, measuredWidth, measuredHeight);
                paddingTop = i132 + measuredHeight + ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin;
            }
        }
    }

    public void OLrzqt(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        if (z) {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.DbNXlk;
        } else {
            paddingLeft = getPaddingLeft();
        }
        int i11 = i4 - i2;
        int childCount = getChildCount();
        if (z) {
            i10 = -1;
            i5 = childCount - 1;
        } else {
            i5 = 0;
        }
        int i12 = i10;
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt((i12 * i13) + i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                StateListAnimator stateListAnimator = (StateListAnimator) childAt.getLayoutParams();
                int i14 = ((LinearLayout.LayoutParams) stateListAnimator).gravity;
                if (i14 < 0) {
                    i14 = 8388659;
                }
                int i15 = i14 & WalletImportError.ERROR_CODE_AA_EXIST;
                if (i15 == 16) {
                    i6 = ((((i11 - paddingTop) - paddingBottom) - measuredHeight) / 2) + paddingTop + ((LinearLayout.LayoutParams) stateListAnimator).topMargin;
                    i7 = ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin;
                } else if (i15 == 48) {
                    i8 = ((LinearLayout.LayoutParams) stateListAnimator).topMargin + paddingTop;
                    i9 = i8;
                    int i16 = paddingLeft + ((LinearLayout.LayoutParams) stateListAnimator).leftMargin;
                    setChildFrame(childAt, i16, i9, measuredWidth, measuredHeight);
                    paddingLeft = i16 + measuredWidth + ((LinearLayout.LayoutParams) stateListAnimator).rightMargin;
                } else if (i15 == 80) {
                    i6 = (i11 - paddingBottom) - measuredHeight;
                    i7 = ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin;
                } else {
                    i9 = paddingTop;
                    int i162 = paddingLeft + ((LinearLayout.LayoutParams) stateListAnimator).leftMargin;
                    setChildFrame(childAt, i162, i9, measuredWidth, measuredHeight);
                    paddingLeft = i162 + measuredWidth + ((LinearLayout.LayoutParams) stateListAnimator).rightMargin;
                }
                i8 = i6 - i7;
                i9 = i8;
                int i1622 = paddingLeft + ((LinearLayout.LayoutParams) stateListAnimator).leftMargin;
                setChildFrame(childAt, i1622, i9, measuredWidth, measuredHeight);
                paddingLeft = i1622 + measuredWidth + ((LinearLayout.LayoutParams) stateListAnimator).rightMargin;
            }
        }
    }

    public final void setChildFrame(android.view.View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator generateDefaultLayoutParams() {
        int i = this.values;
        if (i == 0) {
            return new StateListAnimator(-2, -2);
        }
        if (i == 1) {
            return new StateListAnimator(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof StateListAnimator) {
            return new StateListAnimator((StateListAnimator) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new StateListAnimator((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new StateListAnimator(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof StateListAnimator;
    }

    /* JADX INFO: renamed from: o.aqE$StateListAnimator */
    public static class StateListAnimator extends LinearLayoutCompat.LayoutParams {
        public int AEQbTJ;
        public int KWHzl;

        public StateListAnimator(int i, int i2) {
            super(i, i2);
            this.AEQbTJ = 0;
        }

        public StateListAnimator(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.AEQbTJ = 0;
        }

        public StateListAnimator(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.AEQbTJ = 0;
        }

        public StateListAnimator(StateListAnimator stateListAnimator) {
            super((ViewGroup.MarginLayoutParams) stateListAnimator);
            this.AEQbTJ = 0;
            this.AEQbTJ = stateListAnimator.AEQbTJ;
        }
    }
}
