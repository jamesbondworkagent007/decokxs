package o;

import android.graphics.PointF;
import com.github.mikephil.charting.charts.CombinedChart;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34887nkt extends CombinedChart {
    public boolean AEQbTJ;
    public PointF OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34887nkt(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34887nkt(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34887nkt(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new PointF();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.AEQbTJ = false;
            this.OLrzqt.x = motionEvent.getX();
            this.OLrzqt.y = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            if (!this.AEQbTJ) {
                if (java.lang.Math.abs(motionEvent.getY() - this.OLrzqt.y) > java.lang.Math.abs(motionEvent.getX() - this.OLrzqt.x)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    this.AEQbTJ = true;
                }
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }
}
