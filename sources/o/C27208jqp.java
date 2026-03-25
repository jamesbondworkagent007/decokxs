package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewGroupKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27208jqp extends android.view.ViewGroup {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27208jqp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27208jqp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.jqp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27208jqp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27208jqp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        java.lang.Integer num;
        int size = View.MeasureSpec.getSize(i);
        int iValueOf = C27214jqv.valueOf(this);
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(this).iterator();
        int measuredHeight = 0;
        int iAYXKKw = 0;
        while (it.hasNext()) {
            iAYXKKw += C27214jqv.AYXKKw(it.next());
        }
        int i3 = (size - iValueOf) - iAYXKKw;
        java.util.Iterator<android.view.View> it2 = ViewGroupKt.getChildren(this).iterator();
        float f = 0.0f;
        while (it2.hasNext()) {
            float fDjBIcL = C27214jqv.djBIcL(it2.next());
            if (fDjBIcL > 0.0f) {
                f += fDjBIcL;
            }
        }
        int measuredWidth = i3;
        float f2 = 0.0f;
        for (android.view.View view : ViewGroupKt.getChildren(this)) {
            measureChildWithMargins(view, i, 0, i2, 0);
            if (C27214jqv.djBIcL(this) != 0.0f) {
                float fDjBIcL2 = C27214jqv.djBIcL(view);
                float f3 = fDjBIcL2 / f;
                if (fDjBIcL2 < 0.0f || view.getMeasuredWidth() <= i3 * f3) {
                    measuredWidth -= view.getMeasuredWidth();
                } else {
                    f2 += f3;
                }
            }
        }
        if (f2 != 0.0f) {
            for (android.view.View view2 : ViewGroupKt.getChildren(this)) {
                float fDjBIcL3 = C27214jqv.djBIcL(view2);
                if (fDjBIcL3 > 0.0f && view2.getVisibility() != 8) {
                    float f4 = fDjBIcL3 / f;
                    if (fDjBIcL3 >= 0.0f && view2.getMeasuredWidth() > i3 * f4) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec((int) ((measuredWidth * f4) / f2), Integer.MIN_VALUE), android.view.ViewGroup.getChildMeasureSpec(i2, C27214jqv.AhwBna(this) + C27214jqv.gEmmrt(view2), view2.getLayoutParams().height));
                    }
                }
            }
        }
        if (((android.view.View) C59467zhb.zsXlph(ViewGroupKt.getChildren(this))).getVisibility() == 8) {
            java.util.Iterator<android.view.View> it3 = ViewGroupKt.getChildren(this).iterator();
            if (it3.hasNext()) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(it3.next().getMeasuredHeight());
                while (it3.hasNext()) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(it3.next().getMeasuredHeight());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                measuredHeight = num.intValue();
            }
        } else {
            for (android.view.View view3 : ViewGroupKt.getChildren(this)) {
                if (!Intrinsics.EZpvd(view3, C59467zhb.zsXlph(ViewGroupKt.getChildren(this))) && view3.getMeasuredHeight() > measuredHeight) {
                    measuredHeight = view3.getMeasuredHeight();
                }
            }
            measuredHeight += ((android.view.View) C59467zhb.zsXlph(ViewGroupKt.getChildren(this))).getMeasuredHeight();
        }
        setMeasuredDimension(size, C27214jqv.AhwBna(this) + measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight = getMeasuredHeight();
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (C55296xhK.AEQbTJ(this)) {
            int measuredWidth = getMeasuredWidth();
            int paddingStart = getPaddingStart();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int marginEnd = layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams) : 0;
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight2 = (measuredHeight - childAt.getMeasuredHeight()) / 2;
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i5 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            int measuredWidth3 = getMeasuredWidth();
            int paddingStart2 = getPaddingStart();
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            int marginEnd2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams3) : 0;
            int measuredHeight3 = (measuredHeight - childAt.getMeasuredHeight()) / 2;
            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            childAt.layout(((measuredWidth - paddingStart) - marginEnd) - measuredWidth2, measuredHeight2 + i5, (measuredWidth3 - paddingStart2) - marginEnd2, measuredHeight3 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0) + childAt.getMeasuredHeight());
            int paddingEnd = getPaddingEnd();
            int i6 = 0;
            for (int childCount = getChildCount() - 2; childCount > 0; childCount--) {
                android.view.View childAt2 = getChildAt(childCount);
                int measuredHeight4 = childAt2.getMeasuredHeight();
                Intrinsics.copydefault(childAt2);
                ViewGroup.LayoutParams layoutParams5 = childAt2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                if (measuredHeight4 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0) > i6) {
                    int measuredHeight5 = childAt2.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams6 = childAt2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    i6 = measuredHeight5 + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
                }
                ViewGroup.LayoutParams layoutParams7 = childAt2.getLayoutParams();
                int marginEnd3 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams7) : 0;
                int paddingTop = getPaddingTop();
                ViewGroup.LayoutParams layoutParams8 = childAt2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                int i7 = marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0;
                ViewGroup.LayoutParams layoutParams9 = childAt2.getLayoutParams();
                int marginEnd4 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams9) : 0;
                int measuredWidth4 = childAt2.getMeasuredWidth();
                int paddingTop2 = getPaddingTop();
                ViewGroup.LayoutParams layoutParams10 = childAt2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
                childAt2.layout(marginEnd3 + paddingEnd, paddingTop + i7, marginEnd4 + paddingEnd + measuredWidth4, paddingTop2 + (marginLayoutParams7 != null ? marginLayoutParams7.topMargin : 0) + childAt2.getMeasuredHeight());
                ViewGroup.LayoutParams layoutParams11 = childAt2.getLayoutParams();
                int marginStart = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams11) : 0;
                int measuredWidth5 = childAt2.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams12 = childAt2.getLayoutParams();
                paddingEnd += marginStart + measuredWidth5 + (layoutParams12 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams12) : 0);
            }
            android.view.View view = (android.view.View) C59467zhb.zsXlph(ViewGroupKt.getChildren(this));
            if (view.getVisibility() == 0) {
                int paddingEnd2 = getPaddingEnd();
                ViewGroup.LayoutParams layoutParams13 = view.getLayoutParams();
                int marginEnd5 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams13) : 0;
                int paddingTop3 = getPaddingTop();
                ViewGroup.LayoutParams layoutParams14 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams14 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams14 : null;
                int i8 = marginLayoutParams8 != null ? marginLayoutParams8.topMargin : 0;
                int paddingEnd3 = getPaddingEnd();
                ViewGroup.LayoutParams layoutParams15 = view.getLayoutParams();
                int marginEnd6 = layoutParams15 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams15) : 0;
                int measuredWidth6 = view.getMeasuredWidth();
                int paddingTop4 = getPaddingTop();
                ViewGroup.LayoutParams layoutParams16 = view.getLayoutParams();
                marginLayoutParams = layoutParams16 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams16 : null;
                view.layout(paddingEnd2 + marginEnd5, paddingTop3 + i6 + i8, paddingEnd3 + marginEnd6 + measuredWidth6, paddingTop4 + i6 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + view.getMeasuredHeight());
                return;
            }
            return;
        }
        int paddingStart3 = getPaddingStart();
        ViewGroup.LayoutParams layoutParams17 = childAt.getLayoutParams();
        int marginStart2 = layoutParams17 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams17) : 0;
        int measuredHeight6 = (measuredHeight - childAt.getMeasuredHeight()) / 2;
        ViewGroup.LayoutParams layoutParams18 = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams18 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams18 : null;
        int i9 = marginLayoutParams9 != null ? marginLayoutParams9.topMargin : 0;
        int paddingStart4 = getPaddingStart();
        ViewGroup.LayoutParams layoutParams19 = childAt.getLayoutParams();
        int marginStart3 = layoutParams19 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams19) : 0;
        int measuredWidth7 = childAt.getMeasuredWidth();
        int measuredHeight7 = (measuredHeight - childAt.getMeasuredHeight()) / 2;
        ViewGroup.LayoutParams layoutParams20 = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams20 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams20 : null;
        childAt.layout(paddingStart3 + marginStart2, measuredHeight6 + i9, paddingStart4 + marginStart3 + measuredWidth7, measuredHeight7 + (marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0) + childAt.getMeasuredHeight());
        int measuredWidth8 = getMeasuredWidth() - getPaddingEnd();
        int i10 = 0;
        for (int childCount2 = getChildCount() - 2; childCount2 > 0; childCount2--) {
            android.view.View childAt3 = getChildAt(childCount2);
            int measuredHeight8 = childAt3.getMeasuredHeight();
            Intrinsics.copydefault(childAt3);
            ViewGroup.LayoutParams layoutParams21 = childAt3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams21 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams21 : null;
            if (measuredHeight8 + (marginLayoutParams11 != null ? marginLayoutParams11.topMargin : 0) > i10) {
                int measuredHeight9 = childAt3.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams22 = childAt3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams22 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams22 : null;
                i10 = measuredHeight9 + (marginLayoutParams12 != null ? marginLayoutParams12.topMargin : 0);
            }
            ViewGroup.LayoutParams layoutParams23 = childAt3.getLayoutParams();
            int marginEnd7 = layoutParams23 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams23) : 0;
            int measuredWidth9 = childAt3.getMeasuredWidth();
            int paddingTop5 = getPaddingTop();
            ViewGroup.LayoutParams layoutParams24 = childAt3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams24 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams24 : null;
            int i11 = marginLayoutParams13 != null ? marginLayoutParams13.topMargin : 0;
            ViewGroup.LayoutParams layoutParams25 = childAt3.getLayoutParams();
            int marginEnd8 = layoutParams25 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams25) : 0;
            int paddingTop6 = getPaddingTop();
            ViewGroup.LayoutParams layoutParams26 = childAt3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams26 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams26 : null;
            childAt3.layout((measuredWidth8 - marginEnd7) - measuredWidth9, paddingTop5 + i11, measuredWidth8 - marginEnd8, paddingTop6 + (marginLayoutParams14 != null ? marginLayoutParams14.topMargin : 0) + childAt3.getMeasuredHeight());
            ViewGroup.LayoutParams layoutParams27 = childAt3.getLayoutParams();
            int marginEnd9 = layoutParams27 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams27) : 0;
            int measuredWidth10 = childAt3.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams28 = childAt3.getLayoutParams();
            measuredWidth8 -= (marginEnd9 + measuredWidth10) + (layoutParams28 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams28) : 0);
        }
        android.view.View view2 = (android.view.View) C59467zhb.zsXlph(ViewGroupKt.getChildren(this));
        if (view2.getVisibility() == 0) {
            int measuredWidth11 = getMeasuredWidth();
            int paddingRight = getPaddingRight();
            ViewGroup.LayoutParams layoutParams29 = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams29 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams29 : null;
            int i12 = marginLayoutParams15 != null ? marginLayoutParams15.rightMargin : 0;
            int measuredWidth12 = view2.getMeasuredWidth();
            int paddingTop7 = getPaddingTop();
            ViewGroup.LayoutParams layoutParams30 = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams16 = layoutParams30 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams30 : null;
            int i13 = marginLayoutParams16 != null ? marginLayoutParams16.topMargin : 0;
            int measuredWidth13 = getMeasuredWidth();
            int paddingRight2 = getPaddingRight();
            ViewGroup.LayoutParams layoutParams31 = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams17 = layoutParams31 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams31 : null;
            int i14 = marginLayoutParams17 != null ? marginLayoutParams17.rightMargin : 0;
            int paddingTop8 = getPaddingTop();
            ViewGroup.LayoutParams layoutParams32 = view2.getLayoutParams();
            marginLayoutParams = layoutParams32 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams32 : null;
            view2.layout(((measuredWidth11 - paddingRight) - i12) - measuredWidth12, paddingTop7 + i10 + i13, (measuredWidth13 - paddingRight2) - i14, paddingTop8 + i10 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + view2.getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator generateLayoutParams(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new StateListAnimator(context, attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator generateDefaultLayoutParams() {
        return new StateListAnimator(-2, -2);
    }

    /* JADX INFO: renamed from: o.jqp$StateListAnimator */
    public static final class StateListAnimator extends ViewGroup.MarginLayoutParams {
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = -1.0f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C25493ixk.PendingIntent.DbNXlk);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.copydefault = typedArrayObtainStyledAttributes.getFloat(C25493ixk.PendingIntent.fetchVPNInfo, -1.0f);
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
        }

        public StateListAnimator(int i, int i2) {
            super(i, i2);
            this.copydefault = -1.0f;
        }
    }
}
