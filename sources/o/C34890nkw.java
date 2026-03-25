package o;

import android.graphics.PointF;
import com.github.mikephil.charting.charts.BarChart;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34890nkw extends BarChart {
    public PointF OLrzqt;
    public boolean copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34890nkw(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34890nkw(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34890nkw(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new PointF();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.copydefault = false;
            this.OLrzqt.x = motionEvent.getX();
            this.OLrzqt.y = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            if (!this.copydefault) {
                if (java.lang.Math.abs(motionEvent.getY() - this.OLrzqt.y) > java.lang.Math.abs(motionEvent.getX() - this.OLrzqt.x)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    this.copydefault = true;
                }
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }
}
