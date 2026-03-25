package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroupKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15551eMn extends LinearLayoutCompat {
    public final java.lang.String AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public android.view.View KWHzl;
    public final java.util.List<java.lang.Integer> OLrzqt;
    public android.view.View copydefault;
    public final java.util.List<java.lang.Integer> gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftChild1(android.view.View view) {
        this.KWHzl = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftChild2(android.view.View view) {
        this.copydefault = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftWidth1(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftWidth2(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalWidth(int i) {
        this.AYXKKw = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15551eMn(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        this.AEQbTJ = TtmlNode.LEFT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15551eMn(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        this.AEQbTJ = TtmlNode.LEFT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15551eMn(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        this.AEQbTJ = TtmlNode.LEFT;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        pUU.EZpvd("MyGroup", "widthMeasureSpec " + View.MeasureSpec.getSize(i) + " model " + View.MeasureSpec.getMode(i));
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            this.AYXKKw = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE), i2);
            this.KWHzl = null;
            this.copydefault = null;
            this.OLrzqt.clear();
            int i3 = 0;
            for (android.view.View view : ViewGroupKt.getChildren(this)) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                android.view.View view2 = view;
                if (view2.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
                    Intrinsics.copydefault(layoutParams7, "");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7;
                    this.AYXKKw += view2.getMeasuredWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                    this.OLrzqt.add(java.lang.Integer.valueOf(view2.getMeasuredWidth()));
                } else {
                    this.OLrzqt.add(0);
                }
                if (Intrinsics.EZpvd(view2.getTag(), (java.lang.Object) this.AEQbTJ)) {
                    if (this.KWHzl == null) {
                        this.KWHzl = view2;
                        int measuredWidth = view2.getMeasuredWidth();
                        this.EZpvd = measuredWidth;
                        pUU.EZpvd("MyGroup", "leftWidth1 " + measuredWidth);
                    } else {
                        this.copydefault = view2;
                        int measuredWidth2 = view2.getMeasuredWidth();
                        this.valueOf = measuredWidth2;
                        pUU.EZpvd("MyGroup", "leftWidth2 " + measuredWidth2);
                    }
                }
                pUU.EZpvd("MyGroup", " chid width " + view2.getMeasuredWidth());
                i3++;
            }
        }
        super.onMeasure(i, i2);
        pUU.EZpvd("MyGroup", "after widthMeasureSpec " + getMeasuredWidth() + " model " + View.MeasureSpec.getMode(i));
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            this.gEmmrt.clear();
            int i4 = 0;
            for (android.view.View view3 : ViewGroupKt.getChildren(this)) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                android.view.View view4 = view3;
                if (!Intrinsics.EZpvd(view4.getTag(), (java.lang.Object) this.AEQbTJ) && view4.getVisibility() != 8 && this.OLrzqt.size() > i4 && this.OLrzqt.get(i4).intValue() != view4.getMeasuredWidth()) {
                    pUU.EZpvd("MyGroup", "should resize " + view4 + " " + view4.getMeasuredWidth());
                    this.gEmmrt.add(java.lang.Integer.valueOf(i4));
                }
                pUU.EZpvd("MyGroup", " chid width " + view4.getMeasuredWidth() + " " + this.OLrzqt.get(i4));
                i4++;
            }
        }
        pUU.EZpvd("MyGroup", " totalWidth " + this.AYXKKw + " model " + View.MeasureSpec.getMode(i));
        if (this.AYXKKw > getMeasuredWidth()) {
            int measuredWidth3 = ((this.EZpvd + this.valueOf) - (this.AYXKKw - getMeasuredWidth())) / 2;
            pUU.EZpvd("MyGroup", " left " + measuredWidth3);
            int i5 = this.EZpvd;
            if (measuredWidth3 > i5) {
                pUU.EZpvd("MyGroup", "leftWidth1 " + i5);
                int paddingTop = getPaddingTop();
                int paddingTop2 = getPaddingTop();
                android.view.View view5 = this.copydefault;
                int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop + paddingTop2, (view5 == null || (layoutParams6 = view5.getLayoutParams()) == null) ? 0 : layoutParams6.height);
                android.view.View view6 = this.copydefault;
                if (view6 != null) {
                    view6.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth3 * 2) - this.EZpvd, 1073741824), childMeasureSpec);
                }
                int paddingTop3 = getPaddingTop();
                int paddingTop4 = getPaddingTop();
                android.view.View view7 = this.KWHzl;
                int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop3 + paddingTop4, (view7 == null || (layoutParams5 = view7.getLayoutParams()) == null) ? 0 : layoutParams5.height);
                android.view.View view8 = this.KWHzl;
                if (view8 != null) {
                    view8.measure(View.MeasureSpec.makeMeasureSpec(this.EZpvd, 1073741824), childMeasureSpec2);
                }
            } else {
                int i6 = this.valueOf;
                if (measuredWidth3 > i6) {
                    pUU.EZpvd("MyGroup", "leftWidth2 " + i6);
                    int paddingTop5 = getPaddingTop();
                    int paddingTop6 = getPaddingTop();
                    android.view.View view9 = this.KWHzl;
                    int childMeasureSpec3 = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop5 + paddingTop6, (view9 == null || (layoutParams4 = view9.getLayoutParams()) == null) ? 0 : layoutParams4.height);
                    android.view.View view10 = this.KWHzl;
                    if (view10 != null) {
                        view10.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth3 * 2) - this.valueOf, 1073741824), childMeasureSpec3);
                    }
                    int paddingTop7 = getPaddingTop();
                    int paddingTop8 = getPaddingTop();
                    android.view.View view11 = this.copydefault;
                    int childMeasureSpec4 = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop7 + paddingTop8, (view11 == null || (layoutParams3 = view11.getLayoutParams()) == null) ? 0 : layoutParams3.height);
                    android.view.View view12 = this.copydefault;
                    if (view12 != null) {
                        view12.measure(View.MeasureSpec.makeMeasureSpec(this.valueOf, 1073741824), childMeasureSpec4);
                    }
                } else {
                    pUU.EZpvd("MyGroup", "leftWidth " + measuredWidth3);
                    int paddingTop9 = getPaddingTop();
                    int paddingBottom = getPaddingBottom();
                    android.view.View view13 = this.KWHzl;
                    int childMeasureSpec5 = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop9 + paddingBottom, (view13 == null || (layoutParams2 = view13.getLayoutParams()) == null) ? 0 : layoutParams2.height);
                    android.view.View view14 = this.KWHzl;
                    if (view14 != null) {
                        view14.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, 1073741824), childMeasureSpec5);
                    }
                    int paddingTop10 = getPaddingTop();
                    int paddingBottom2 = getPaddingBottom();
                    android.view.View view15 = this.copydefault;
                    int childMeasureSpec6 = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop10 + paddingBottom2, (view15 == null || (layoutParams = view15.getLayoutParams()) == null) ? 0 : layoutParams.height);
                    android.view.View view16 = this.copydefault;
                    if (view16 != null) {
                        view16.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, 1073741824), childMeasureSpec6);
                    }
                    android.view.View view17 = this.KWHzl;
                    if (view17 != null) {
                        pUU.EZpvd("MyGroup", "width " + view17.getMeasuredWidth());
                    }
                    android.view.View view18 = this.copydefault;
                    if (view18 != null) {
                        pUU.EZpvd("MyGroup", "width " + view18.getMeasuredWidth());
                    }
                }
            }
            pUU.EZpvd("MyGroup", "shouldChangeView size " + this.gEmmrt.size());
            java.util.Iterator<T> it = this.gEmmrt.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Number) it.next()).intValue();
                android.view.View childAt = getChildAt(iIntValue);
                int iIntValue2 = this.OLrzqt.get(iIntValue).intValue();
                int paddingTop11 = getPaddingTop();
                int paddingBottom3 = getPaddingBottom();
                ViewGroup.LayoutParams layoutParams8 = childAt.getLayoutParams();
                int childMeasureSpec7 = android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop11 + paddingBottom3, layoutParams8 != null ? layoutParams8.height : 0);
                pUU.EZpvd("MyGroup", "shouldChangeView child " + childAt + " width " + iIntValue2);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824), childMeasureSpec7);
                pUU.EZpvd("MyGroup", "shouldChangeView after child " + childAt + " width " + childAt.getMeasuredWidth());
            }
        }
    }
}
