package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39824pzd extends AppCompatTextView {
    public boolean AEQbTJ;
    public RectF AhwBna;
    public android.graphics.Paint EZpvd;
    public float[] KWHzl;
    public android.graphics.Path OLrzqt;
    public int copydefault;
    public android.graphics.Paint gEmmrt;
    public float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void AEQbTJ() {
        float[] fArr;
        if (this.AEQbTJ) {
            float f = this.valueOf;
            fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        } else {
            float f2 = this.valueOf;
            fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
        }
        this.KWHzl = fArr;
    }

    public final void setLeftCornerRound(boolean z) {
        this.AEQbTJ = z;
        AEQbTJ();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39824pzd(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = new RectF();
        this.OLrzqt = new android.graphics.Path();
        this.KWHzl = new float[8];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39824pzd(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AhwBna = new RectF();
        this.OLrzqt = new android.graphics.Path();
        this.KWHzl = new float[8];
        KWHzl(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39824pzd(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AhwBna = new RectF();
        this.OLrzqt = new android.graphics.Path();
        this.KWHzl = new float[8];
        KWHzl(context, attributeSet);
    }

    private final void KWHzl(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.valueOf = C33129mqd.djBIcL(java.lang.Integer.valueOf(C55298xhM.copydefault(2.0f, context)));
        this.copydefault = C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        AEQbTJ();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.EZpvd = paint;
        Intrinsics.copydefault(paint);
        paint.setColor(this.copydefault);
        android.graphics.Paint paint2 = this.EZpvd;
        Intrinsics.copydefault(paint2);
        paint2.setStrokeWidth(1.0f);
        android.graphics.Paint paint3 = this.EZpvd;
        Intrinsics.copydefault(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.gEmmrt = paint4;
        Intrinsics.copydefault(paint4);
        paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        setLayerType(1, null);
        RectF rectF = this.AhwBna;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredWidth()));
        this.AhwBna.bottom = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight()));
        this.OLrzqt.reset();
        this.OLrzqt.addRoundRect(this.AhwBna, this.KWHzl, Path.Direction.CW);
        android.graphics.Path path = this.OLrzqt;
        android.graphics.Paint paint = this.gEmmrt;
        Intrinsics.copydefault(paint);
        canvas.drawPath(path, paint);
        android.graphics.Path path2 = this.OLrzqt;
        android.graphics.Paint paint2 = this.EZpvd;
        Intrinsics.copydefault(paint2);
        canvas.drawPath(path2, paint2);
        super.onDraw(canvas);
    }

    public final void OLrzqt(@androidx.annotation.ColorInt int i) {
        this.copydefault = i;
        android.graphics.Paint paint = this.EZpvd;
        if (paint != null) {
            paint.setColor(i);
        }
        android.graphics.Paint paint2 = this.gEmmrt;
        if (paint2 != null) {
            paint2.setStrokeWidth(1.0f);
        }
        invalidate();
    }
}
