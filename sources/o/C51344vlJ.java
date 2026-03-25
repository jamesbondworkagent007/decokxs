package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.charts.LineChart;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51344vlJ extends ConstraintLayout {
    public float AEQbTJ;
    public float EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51344vlJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.EZpvd = motionEvent.getX();
            this.AEQbTJ = motionEvent.getY();
        } else {
            boolean z = false;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                float x = motionEvent.getX();
                float f = this.EZpvd;
                float y = motionEvent.getY();
                float f2 = this.AEQbTJ;
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    android.view.View childAt = getChildAt(i);
                    if ((childAt instanceof LineChart) && OLrzqt(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (java.lang.Math.abs(y - f2) / java.lang.Math.abs(x - f) < 0.6f && z) {
                    requestDisallowInterceptTouchEvent(true);
                }
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                requestDisallowInterceptTouchEvent(false);
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final boolean OLrzqt(android.view.View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        float f3 = iArr[1];
        return f3 <= f2 && f2 <= ((float) view.getMeasuredHeight()) + f3 && f >= ((float) i) && f <= ((float) (view.getMeasuredWidth() + i));
    }
}
