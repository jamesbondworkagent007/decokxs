package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27212jqt extends android.view.ViewGroup {
    public boolean EZpvd;
    public float OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27212jqt(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27212jqt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.jqt.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27212jqt(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27212jqt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C25493ixk.PendingIntent.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(C25493ixk.PendingIntent.fARcdN, copydefault(4.0f));
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimension(C25493ixk.PendingIntent.AuCTel, copydefault(8.0f));
        this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C25493ixk.PendingIntent.fIwbmz, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i7 = i3;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (this.EZpvd) {
                    if ((i7 + measuredWidth) - (i4 > 0 ? this.OLrzqt : 0.0f) > (size - getPaddingStart()) - getPaddingEnd()) {
                        iMax = java.lang.Math.max(iMax, i7);
                        i5 += (int) (iMax2 + this.copydefault);
                        i3 = measuredWidth;
                        iMax2 = measuredHeight;
                        i4 = 0;
                    } else {
                        i3 = i7 + measuredWidth;
                        if (i4 > 0) {
                            i3 -= (int) this.OLrzqt;
                        }
                        iMax2 = java.lang.Math.max(iMax2, measuredHeight);
                    }
                    if (i6 == childCount - 1) {
                        i5 += iMax2;
                        iMax = java.lang.Math.max(i3, iMax);
                    }
                    i4++;
                }
            } else if (i6 == childCount - 1) {
                i5 += iMax2;
                iMax = java.lang.Math.max(iMax, i3);
            }
        }
        if (mode != 1073741824) {
            size = iMax + getPaddingStart() + getPaddingEnd();
        }
        if (mode2 != 1073741824) {
            size2 = i5 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C55296xhK.AEQbTJ(this)) {
            copydefault(i, i3);
        } else {
            OLrzqt(i, i3);
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

    public final float copydefault(float f) {
        return android.util.TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final void OLrzqt(int i, int i2) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int iCopydefault = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = marginLayoutParams.getMarginStart() + childAt.getMeasuredWidth() + marginLayoutParams.getMarginEnd();
                if (paddingStart + marginStart + getPaddingEnd() > i2 - i) {
                    paddingStart = getPaddingStart();
                    paddingTop += (int) (iCopydefault + this.copydefault);
                    iCopydefault = 0;
                    i3 = 0;
                }
                childAt.layout(marginLayoutParams.getMarginStart() + paddingStart, marginLayoutParams.topMargin + paddingTop, marginLayoutParams.getMarginStart() + paddingStart + childAt.getMeasuredWidth(), marginLayoutParams.topMargin + paddingTop + childAt.getMeasuredHeight());
                paddingStart += marginStart;
                int i5 = marginLayoutParams.topMargin;
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.bottomMargin;
                if (i3 != childCount - 1) {
                    paddingStart -= (int) this.OLrzqt;
                }
                iCopydefault = C56548yJl.copydefault(iCopydefault, i5 + measuredHeight + i6);
                i3++;
            }
        }
    }

    public final void copydefault(int i, int i2) {
        int paddingStart = (i2 - i) - getPaddingStart();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = marginLayoutParams.getMarginStart();
                int measuredWidth = childAt.getMeasuredWidth();
                int marginEnd = marginLayoutParams.getMarginEnd();
                int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
                childAt.layout(paddingStart - childAt.getMeasuredWidth(), paddingTop, paddingStart, childAt.getMeasuredHeight() + paddingTop);
                paddingStart = (paddingStart - ((marginStart + measuredWidth) + marginEnd)) + ((int) this.OLrzqt);
            }
        }
    }
}
