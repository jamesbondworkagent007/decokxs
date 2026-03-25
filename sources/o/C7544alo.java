package o;

import android.widget.FrameLayout;
import com.immomo.mls.fun.ud.view.UDViewGroup;

/* JADX INFO: renamed from: o.alo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7544alo extends C7546alq {
    public C7544alo(android.content.Context context, UDViewGroup uDViewGroup) {
        super(context, uDViewGroup);
    }

    @Override // o.C7546alq, o.C7771aqC, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                int iMax3 = java.lang.Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                if (iMax > iMax3) {
                    layoutParams.width = iMax3;
                    z = true;
                } else {
                    z = false;
                }
                iMax2 = java.lang.Math.max(iMax2, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                int iMax4 = java.lang.Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                if (iMax2 > iMax4) {
                    layoutParams.height = iMax4;
                } else if (z) {
                }
                measureChildWithMargins(childAt, i, 0, i2, 0);
            }
        }
    }

    @Override // o.C7546alq, o.C7771aqC, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // o.C7546alq, o.C7812aqr, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
