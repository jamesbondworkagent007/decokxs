package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39823pzc extends AppCompatTextView {
    public int AEQbTJ;
    public boolean EZpvd;
    public android.graphics.Path KWHzl;
    public float[] OLrzqt;
    public android.graphics.Paint copydefault;
    public RectF djBIcL;
    public float gEmmrt;
    public android.graphics.Paint valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        float[] fArr;
        if (this.EZpvd) {
            float f = this.gEmmrt;
            fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        } else {
            float f2 = this.gEmmrt;
            fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
        }
        this.OLrzqt = fArr;
    }

    public final void setLeftCornerRound(boolean z) {
        this.EZpvd = z;
        AEQbTJ();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39823pzc(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = new RectF();
        this.KWHzl = new android.graphics.Path();
        this.OLrzqt = new float[8];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39823pzc(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.djBIcL = new RectF();
        this.KWHzl = new android.graphics.Path();
        this.OLrzqt = new float[8];
        KWHzl(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39823pzc(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.djBIcL = new RectF();
        this.KWHzl = new android.graphics.Path();
        this.OLrzqt = new float[8];
        KWHzl(context, attributeSet);
    }

    public final void KWHzl(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.gEmmrt = C55298xhM.dp2px$default(2.0f, null, 1, null);
        this.AEQbTJ = C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        AEQbTJ();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(this.AEQbTJ);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(this.AEQbTJ);
        paint2.setStyle(Paint.Style.FILL);
        this.valueOf = paint2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        setLayerType(1, null);
        this.djBIcL.set(0.0f, 0.0f, getWidth(), getHeight());
        this.KWHzl.reset();
        this.KWHzl.addRoundRect(this.djBIcL, this.OLrzqt, Path.Direction.CW);
        android.graphics.Path path = this.KWHzl;
        android.graphics.Paint paint = this.valueOf;
        Intrinsics.copydefault(paint);
        canvas.drawPath(path, paint);
        super.onDraw(canvas);
    }
}
