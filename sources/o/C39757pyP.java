package o;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39757pyP extends android.widget.HorizontalScrollView {
    public PointF OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownPoint(@NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        this.OLrzqt = pointF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39757pyP(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39757pyP(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39757pyP(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new PointF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.OLrzqt.x = motionEvent.getX();
            this.OLrzqt.y = motionEvent.getY();
            requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2 && java.lang.Math.abs(motionEvent.getY() - this.OLrzqt.y) > java.lang.Math.abs(motionEvent.getX() - this.OLrzqt.x)) {
            requestDisallowInterceptTouchEvent(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
