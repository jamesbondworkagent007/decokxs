package o;

import android.widget.FrameLayout;
import com.immomo.mls.fun.constants.TextAlign;

/* JADX INFO: renamed from: o.atC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7930atC extends android.widget.FrameLayout {
    public static final int[] OLrzqt = {8388659, 49, 8388661, TextAlign.LEFT, TextAlign.RIGHT, 8388691, 81, 8388693};
    public android.view.View copydefault;

    public C7930atC(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
    }

    public C7930atC(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C7930atC(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setCenter(android.view.View view) {
        this.copydefault = view;
        addView(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int length;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            android.view.View childAt = getChildAt(i5);
            if (childAt == this.copydefault) {
                ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity = 17;
            } else {
                if (childAt.getVisibility() != 8) {
                    int[] iArr = OLrzqt;
                    length = i6 % iArr.length;
                    ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity = iArr[length];
                }
                i5++;
                i6 = length + 1;
            }
            length = i6 - 1;
            i5++;
            i6 = length + 1;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
