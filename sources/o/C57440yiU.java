package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57440yiU extends android.view.ViewGroup {
    public float AEQbTJ;
    public boolean KWHzl;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57440yiU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57440yiU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPileWidth(float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerticalSpace(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.yiU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57440yiU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57440yiU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.UeEOUB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimension(C57406yhn.Fragment.aKErDB, EZpvd(4.0f));
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(C57406yhn.Fragment.RcXXUw, EZpvd(8.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setShouldStackIcons(boolean z) {
        this.KWHzl = z;
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i7 = iMax;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i8 = i3 + measuredWidth;
                if (i8 - (i4 > 0 ? this.copydefault : 0.0f) > (size - getPaddingStart()) - getPaddingEnd()) {
                    iMax2 = java.lang.Math.max(iMax2, i3);
                    i5 += (int) (i7 + this.AEQbTJ);
                    i3 = measuredWidth;
                    iMax = measuredHeight;
                    i4 = 0;
                } else {
                    if (i4 > 0) {
                        i8 -= (int) this.copydefault;
                    }
                    i3 = i8;
                    iMax = java.lang.Math.max(i7, measuredHeight);
                }
                if (i6 == childCount - 1) {
                    i5 += iMax;
                    iMax2 = java.lang.Math.max(i3, iMax2);
                }
                i4++;
            } else if (i6 == childCount - 1) {
                i5 += iMax;
                iMax2 = java.lang.Math.max(iMax2, i3);
            }
        }
        if (mode != 1073741824) {
            size = iMax2 + getPaddingStart() + getPaddingEnd();
        }
        if (mode2 != 1073741824) {
            size2 = i5 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C55296xhK.AEQbTJ(this)) {
            EZpvd(i, i2, i3, i4);
        } else {
            AEQbTJ(i, i2, i3, i4);
        }
    }

    public final void AEQbTJ(int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int iCopydefault = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (this.KWHzl) {
                childAt.setZ(childCount - i6);
            }
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = marginLayoutParams.getMarginStart() + childAt.getMeasuredWidth() + marginLayoutParams.getMarginEnd();
                if (paddingStart + marginStart + getPaddingEnd() > i3 - i) {
                    paddingStart = getPaddingStart();
                    paddingTop += (int) (iCopydefault + this.AEQbTJ);
                    iCopydefault = 0;
                    i5 = 0;
                }
                childAt.layout(marginLayoutParams.getMarginStart() + paddingStart, marginLayoutParams.topMargin + paddingTop, marginLayoutParams.getMarginStart() + paddingStart + childAt.getMeasuredWidth(), marginLayoutParams.topMargin + paddingTop + childAt.getMeasuredHeight());
                paddingStart += marginStart;
                int i7 = marginLayoutParams.topMargin;
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = marginLayoutParams.bottomMargin;
                if (i5 != childCount - 1) {
                    paddingStart -= (int) this.copydefault;
                }
                iCopydefault = C56548yJl.copydefault(iCopydefault, i7 + measuredHeight + i8);
                i5++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(@NotNull android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(attributeSet, "");
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "");
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final float EZpvd(float f) {
        return android.util.TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final void EZpvd(int i, int i2, int i3, int i4) {
        int paddingStart = (i3 - i) - getPaddingStart();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            android.view.View childAt = getChildAt(i5);
            if (this.KWHzl) {
                childAt.setZ(getChildCount() - i5);
            }
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = marginLayoutParams.getMarginStart();
                int measuredWidth = childAt.getMeasuredWidth();
                int marginEnd = marginLayoutParams.getMarginEnd();
                int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
                childAt.layout(paddingStart - childAt.getMeasuredWidth(), paddingTop, paddingStart, childAt.getMeasuredHeight() + paddingTop);
                paddingStart = (paddingStart - ((marginStart + measuredWidth) + marginEnd)) + ((int) this.copydefault);
            }
        }
    }
}
