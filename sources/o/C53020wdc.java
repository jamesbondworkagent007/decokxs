package o;

import android.graphics.PointF;
import com.github.mikephil.charting.charts.LineChart;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53020wdc extends LineChart {
    public boolean EZpvd;
    public PointF KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53020wdc(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53020wdc(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53020wdc(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = new PointF();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.EZpvd = false;
            this.KWHzl.x = motionEvent.getX();
            this.KWHzl.y = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            if (!this.EZpvd) {
                if (java.lang.Math.abs(motionEvent.getY() - this.KWHzl.y) > java.lang.Math.abs(motionEvent.getX() - this.KWHzl.x)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    this.EZpvd = true;
                }
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }
}
