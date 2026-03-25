package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewGroupKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57299yfm extends android.view.ViewGroup {
    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57299yfm(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57299yfm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57299yfm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        java.lang.Integer num;
        int iMeasureText;
        android.text.TextPaint paint;
        int size = View.MeasureSpec.getSize(i);
        android.view.View view = (android.view.View) C59467zhb.AubY(ViewGroupKt.getChildren(this));
        android.view.View view2 = (android.view.View) C59467zhb.zsXlph(ViewGroupKt.getChildren(this));
        int iValueOf = C57301yfo.valueOf(this);
        int iAhwBna = 0;
        for (android.view.View view3 : ViewGroupKt.getChildren(this)) {
            iAhwBna += view3.getVisibility() == 0 ? C57301yfo.AhwBna(view3) : 0;
        }
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(this).iterator();
        while (it.hasNext()) {
            measureChildWithMargins(it.next(), i, 0, i2, 0);
        }
        int measuredWidth = ((size - iValueOf) - iAhwBna) - (view2.getVisibility() == 0 ? view2.getMeasuredWidth() : 0);
        float fAYXKKw = C57301yfo.AYXKKw(view);
        while (true) {
            boolean z = view instanceof android.widget.TextView;
            num = null;
            android.widget.TextView textView = z ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextSize(fAYXKKw);
            }
            android.widget.TextView textView2 = z ? (android.widget.TextView) view : null;
            if (textView2 == null || (paint = textView2.getPaint()) == null) {
                iMeasureText = 0;
            } else {
                android.widget.TextView textView3 = z ? (android.widget.TextView) view : null;
                iMeasureText = (int) paint.measureText(java.lang.String.valueOf(textView3 != null ? textView3.getText() : null));
            }
            if (iMeasureText <= measuredWidth || fAYXKKw <= C57301yfo.gEmmrt(view)) {
                break;
            } else {
                fAYXKKw -= 2.0f;
            }
        }
        if (measuredWidth > iMeasureText) {
            measuredWidth = iMeasureText;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), android.view.ViewGroup.getChildMeasureSpec(i2, C57301yfo.fetchVPNInfo(this) + C57301yfo.DbNXlk(view), view.getLayoutParams().height));
        int iFetchVPNInfo = C57301yfo.fetchVPNInfo(this);
        java.util.Iterator<android.view.View> it2 = ViewGroupKt.getChildren(this).iterator();
        if (it2.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(it2.next().getMeasuredHeight());
            loop3: while (true) {
                num = numValueOf;
                while (it2.hasNext()) {
                    numValueOf = java.lang.Integer.valueOf(it2.next().getMeasuredHeight());
                    if (num.compareTo(numValueOf) < 0) {
                        break;
                    }
                }
            }
        }
        setMeasuredDimension(size, iFetchVPNInfo + (num != null ? num.intValue() : 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingStart = getPaddingStart();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0;
        int measuredHeight = (getMeasuredHeight() - childAt.getMeasuredHeight()) / 2;
        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i5 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        int paddingStart2 = getPaddingStart();
        ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
        int marginStart2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams3) : 0;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight2 = (getMeasuredHeight() - childAt.getMeasuredHeight()) / 2;
        ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        childAt.layout(paddingStart + marginStart, measuredHeight + i5, paddingStart2 + marginStart2 + measuredWidth, measuredHeight2 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + childAt.getMeasuredHeight());
        android.view.View view = (android.view.View) C59467zhb.zsXlph(ViewGroupKt.getChildren(this));
        if (view.getVisibility() == 0) {
            int paddingStart3 = getPaddingStart();
            ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
            int marginStart3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams5) : 0;
            int measuredWidth2 = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            int marginStart4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams6) : 0;
            int measuredHeight3 = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            int i6 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
            int paddingStart4 = getPaddingStart();
            ViewGroup.LayoutParams layoutParams8 = childAt.getLayoutParams();
            int marginStart5 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams8) : 0;
            int measuredWidth3 = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            int marginStart6 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams9) : 0;
            int measuredWidth4 = view.getMeasuredWidth();
            int measuredHeight4 = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            view.layout(paddingStart3 + marginStart3 + measuredWidth2 + marginStart4, measuredHeight3 + i6, paddingStart4 + marginStart5 + measuredWidth3 + marginStart6 + measuredWidth4, measuredHeight4 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0) + view.getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity generateLayoutParams(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new Activity(context, attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity generateDefaultLayoutParams() {
        return new Activity(-2, -2);
    }

    /* JADX INFO: renamed from: o.yfm$Activity */
    public static final class Activity extends ViewGroup.MarginLayoutParams {
        public float AEQbTJ;
        public float EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "");
            this.EZpvd = 40.0f;
            this.AEQbTJ = 12.0f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.valueOf);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.EZpvd = C55298xhM.px2dp$default(typedArrayObtainStyledAttributes.getDimension(C13754dXa.PendingIntent.djBIcL, 120.0f), (android.content.Context) null, 1, (java.lang.Object) null);
            this.AEQbTJ = C55298xhM.px2dp$default(typedArrayObtainStyledAttributes.getDimension(C13754dXa.PendingIntent.gEmmrt, 36.0f), (android.content.Context) null, 1, (java.lang.Object) null);
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
        }

        public Activity(int i, int i2) {
            super(i, i2);
            this.EZpvd = 40.0f;
            this.AEQbTJ = 12.0f;
        }
    }
}
