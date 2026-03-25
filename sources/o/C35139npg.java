package o;

import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35139npg extends android.view.View {
    public android.graphics.Paint EZpvd;
    public float KWHzl;
    public double OLrzqt;
    public RectF copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35139npg(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 10.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35139npg(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = 10.0f;
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35139npg(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = 10.0f;
        EZpvd();
    }

    public final void EZpvd() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.EZpvd = paint;
        Intrinsics.copydefault(paint);
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.EZpvd;
        Intrinsics.copydefault(paint2);
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        setLayerType(1, null);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            this.copydefault = new RectF(0.0f, 0.0f, C33129mqd.djBIcL(java.lang.Double.valueOf(((double) getMeasuredWidth()) - (this.OLrzqt * ((double) getMeasuredWidth())))), C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight())));
        } else {
            this.copydefault = new RectF(C33129mqd.djBIcL(java.lang.Double.valueOf(((double) getMeasuredWidth()) - (this.OLrzqt * ((double) getMeasuredWidth())))), 0.0f, C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredWidth())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight())));
        }
        RectF rectF = this.copydefault;
        Intrinsics.copydefault(rectF);
        float f = this.KWHzl;
        android.graphics.Paint paint = this.EZpvd;
        Intrinsics.copydefault(paint);
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    public final void setColorAndPercent(int i, double d) {
        android.graphics.Paint paint = this.EZpvd;
        Intrinsics.copydefault(paint);
        paint.setColor(i);
        this.OLrzqt = d;
        postInvalidate();
    }
}
