package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57478yjF extends android.view.ViewGroup {
    public int AEQbTJ;
    public int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57478yjF(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57478yjF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.yjF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57478yjF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57478yjF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = 1;
    }

    public static /* synthetic */ void configure$default(C57478yjF c57478yjF, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        c57478yjF.copydefault(num, num2, num3);
    }

    public final void copydefault(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        if (num != null) {
            this.KWHzl = num.intValue();
        }
        if (num2 != null) {
            this.copydefault = num2.intValue();
        }
        if (num3 != null) {
            this.AEQbTJ = num3.intValue();
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = getChildAt(i4);
            Intrinsics.copydefault(childAt);
            if (childAt.getVisibility() != 8) {
                childAt.measure(iMakeMeasureSpec, i2);
            }
        }
        int childCount2 = getChildCount();
        int iMax = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount2; i8++) {
            android.view.View childAt2 = getChildAt(i8);
            Intrinsics.copydefault(childAt2);
            if (childAt2.getVisibility() != 8) {
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                if (i5 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    iMax = java.lang.Math.max(iMax, i5);
                    i6 += i7 + this.copydefault;
                    i3 = measuredWidth + this.KWHzl;
                } else {
                    i3 = measuredWidth + this.KWHzl + i5;
                    measuredHeight = java.lang.Math.max(i7, measuredHeight);
                }
                if (i8 == childCount2 - 1) {
                    iMax = java.lang.Math.max(iMax, i3);
                    i6 += measuredHeight;
                }
                i7 = measuredHeight;
                i5 = i3;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (mode != 1073741824) {
            size = iMax + paddingLeft + paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = i6 + paddingTop + paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        java.lang.Integer num;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
        boolean zAEQbTJ = C55296xhK.AEQbTJ(this);
        java.util.ArrayList<java.util.List<java.lang.Integer>> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            Intrinsics.copydefault(childAt);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                if (i5 + measuredWidth > paddingLeft && (!arrayList2.isEmpty())) {
                    arrayList.add(arrayList2);
                    arrayList2 = new java.util.ArrayList();
                    i5 = 0;
                }
                arrayList2.add(java.lang.Integer.valueOf(i6));
                i5 += measuredWidth + this.KWHzl;
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        int paddingTop = getPaddingTop();
        for (java.util.List<java.lang.Integer> list : arrayList) {
            java.util.Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(getChildAt(((java.lang.Number) it.next()).intValue()).getMeasuredHeight());
                while (it.hasNext()) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(getChildAt(((java.lang.Number) it.next()).intValue()).getMeasuredHeight());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            java.util.Iterator<T> it2 = list.iterator();
            int measuredWidth2 = 0;
            while (it2.hasNext()) {
                measuredWidth2 += getChildAt(((java.lang.Number) it2.next()).intValue()).getMeasuredWidth();
            }
            int iKWHzl = KWHzl(paddingLeft, measuredWidth2 + (this.KWHzl * (list.size() - 1)), zAEQbTJ);
            if (zAEQbTJ) {
                copydefault(list, iKWHzl, paddingTop);
            } else {
                AEQbTJ(list, iKWHzl, paddingTop);
            }
            paddingTop += iIntValue + this.copydefault;
        }
    }

    public final int KWHzl(int i, int i2, boolean z) {
        int paddingLeft;
        int paddingLeft2;
        int paddingLeft3;
        int i3 = this.AEQbTJ & 7;
        if (i3 != 3) {
            if (i3 == 5) {
                if (z) {
                    paddingLeft3 = getPaddingLeft();
                    return paddingLeft3 + i;
                }
                paddingLeft2 = getPaddingLeft();
                return (paddingLeft2 + i) - i2;
            }
            if (i3 == 8388611) {
                if (z) {
                    paddingLeft3 = getPaddingLeft();
                    return paddingLeft3 + i;
                }
                return getPaddingLeft();
            }
            if (i3 != 8388613) {
                if (z) {
                    return (getPaddingLeft() + i) - ((i - i2) / 2);
                }
                return getPaddingLeft() + ((i - i2) / 2);
            }
            if (z) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft2 = getPaddingLeft();
                return (paddingLeft2 + i) - i2;
            }
        } else if (z) {
            paddingLeft = getPaddingLeft();
        } else {
            return getPaddingLeft();
        }
        return paddingLeft + i2;
    }

    public final void AEQbTJ(java.util.List<java.lang.Integer> list, int i, int i2) {
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        while (it.hasNext()) {
            android.view.View childAt = getChildAt(it.next().intValue());
            int measuredWidth = childAt.getMeasuredWidth();
            childAt.layout(i, i2, i + measuredWidth, childAt.getMeasuredHeight() + i2);
            i += measuredWidth + this.KWHzl;
        }
    }

    public final void copydefault(java.util.List<java.lang.Integer> list, int i, int i2) {
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        while (it.hasNext()) {
            android.view.View childAt = getChildAt(it.next().intValue());
            int measuredWidth = childAt.getMeasuredWidth();
            childAt.layout(i - measuredWidth, i2, i, childAt.getMeasuredHeight() + i2);
            i -= measuredWidth + this.KWHzl;
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
}
