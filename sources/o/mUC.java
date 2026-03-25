package o;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mUC extends android.widget.HorizontalScrollView {
    public PointF EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mUC(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mUC(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.EZpvd = new PointF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mUC(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.EZpvd = new PointF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.EZpvd.x = motionEvent.getX();
            this.EZpvd.y = motionEvent.getY();
            requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2 && java.lang.Math.abs(motionEvent.getY() - this.EZpvd.y) > java.lang.Math.abs(motionEvent.getX() - this.EZpvd.x)) {
            requestDisallowInterceptTouchEvent(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
