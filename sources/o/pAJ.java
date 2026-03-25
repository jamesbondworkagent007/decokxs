package o;

import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pAJ extends AppCompatTextView {
    public int AEQbTJ;
    public float EZpvd;
    public android.graphics.Paint KWHzl;
    public android.graphics.Paint OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pAJ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pAJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        copydefault(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pAJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        copydefault(context, attributeSet);
    }

    private final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.EZpvd = C33129mqd.djBIcL(java.lang.Integer.valueOf(C55298xhM.copydefault(2.0f, context)));
        this.AEQbTJ = C33508mxl.copydefault(context);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.KWHzl = paint;
        Intrinsics.copydefault(paint);
        paint.setColor(this.AEQbTJ);
        android.graphics.Paint paint2 = this.KWHzl;
        Intrinsics.copydefault(paint2);
        paint2.setStrokeWidth(1.0f);
        android.graphics.Paint paint3 = this.KWHzl;
        Intrinsics.copydefault(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.OLrzqt = paint4;
        Intrinsics.copydefault(paint4);
        paint4.setColor(context.getResources().getColor(C52761wXj.Activity.EZpvd));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        setLayerType(1, null);
        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredWidth()));
        float fDjBIcL2 = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight()));
        float f = this.EZpvd;
        android.graphics.Paint paint = this.OLrzqt;
        Intrinsics.copydefault(paint);
        canvas.drawRoundRect(0.0f, 0.0f, fDjBIcL, fDjBIcL2, f, f, paint);
        float fDjBIcL3 = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredWidth()));
        float fDjBIcL4 = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight()));
        float f2 = this.EZpvd;
        android.graphics.Paint paint2 = this.KWHzl;
        Intrinsics.copydefault(paint2);
        canvas.drawRoundRect(0.0f, 0.0f, fDjBIcL3, fDjBIcL4, f2, f2, paint2);
        super.onDraw(canvas);
    }

    public final void AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.AEQbTJ = i;
        android.graphics.Paint paint = this.KWHzl;
        if (paint != null) {
            paint.setColor(i);
        }
        android.graphics.Paint paint2 = this.OLrzqt;
        if (paint2 != null) {
            paint2.setStrokeWidth(1.0f);
        }
        invalidate();
    }
}
