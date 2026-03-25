package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oJC extends android.text.style.ReplacementSpan {
    public int AEQbTJ;
    public final RectF AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final PointF KWHzl;
    public final boolean OLrzqt;
    public final int copydefault;
    public final int djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 int)
  (r13v0 int)
  (wrap:android.graphics.RectF:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: CONSTRUCTOR (0.0f float), (0.0f float), (0.0f float), (0.0f float) A[MD:(float, float, float, float):void (c), WRAPPED] (LINE:13) call: android.graphics.RectF.<init>(float, float, float, float):void type: CONSTRUCTOR) : (r14v0 android.graphics.RectF))
  (wrap:android.graphics.PointF:?: TERNARY null = ((wrap:int:0x000d: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: CONSTRUCTOR (0.0f float), (0.0f float) A[MD:(float, float):void (c), WRAPPED] (LINE:14) call: android.graphics.PointF.<init>(float, float):void type: CONSTRUCTOR) : (r15v0 android.graphics.PointF))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
 A[MD:(int, int, int, android.graphics.RectF, android.graphics.PointF, int, boolean):void (m)] (LINE:12) call: o.oJC.<init>(int, int, int, android.graphics.RectF, android.graphics.PointF, int, boolean):void type: THIS */
    public /* synthetic */ oJC(int i, int i2, int i3, RectF rectF, PointF pointF, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i5 & 8) != 0 ? new RectF(0.0f, 0.0f, 0.0f, 0.0f) : rectF, (i5 & 16) != 0 ? new PointF(0.0f, 0.0f) : pointF, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? true : z);
    }

    public oJC(int i, int i2, int i3, @NotNull RectF rectF, @NotNull PointF pointF, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(pointF, "");
        this.copydefault = i;
        this.djBIcL = i2;
        this.AhwBna = i3;
        this.AYXKKw = rectF;
        this.KWHzl = pointF;
        this.EZpvd = i4;
        this.OLrzqt = z;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        float fMeasureText = paint.measureText(charSequence, i, i2);
        RectF rectF = this.AYXKKw;
        int i3 = (int) (fMeasureText + rectF.left + rectF.right);
        this.AEQbTJ = i3;
        return i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        int color = paint.getColor();
        Paint.Style style = paint.getStyle();
        paint.setColor(this.copydefault);
        paint.setStyle(this.OLrzqt ? Paint.Style.FILL : Paint.Style.STROKE);
        float fDp$default = this.OLrzqt ? 0.0f : C55298xhM.dp$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null);
        paint.setStrokeWidth(fDp$default);
        paint.setAntiAlias(true);
        PointF pointF = this.KWHzl;
        float f2 = pointF.x;
        float f3 = i4;
        float f4 = pointF.y;
        float fAscent = paint.ascent();
        float f5 = this.AYXKKw.top;
        float f6 = this.EZpvd;
        PointF pointF2 = this.KWHzl;
        float f7 = pointF2.x;
        RectF rectF = new RectF(f + f2, (((f4 + f3) + fAscent) - f5) - f6, ((f + f7) + this.AEQbTJ) - fDp$default, (((pointF2.y + f3) + paint.descent()) + this.AYXKKw.bottom) - this.EZpvd);
        float f8 = this.AhwBna;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        paint.setColor(this.djBIcL);
        paint.setStyle(style);
        if (C33129mqd.OLrzqt(charSequence)) {
            Intrinsics.copydefault(charSequence);
            PointF pointF3 = this.KWHzl;
            canvas.drawText(charSequence, i, i2, f + pointF3.x + this.AYXKKw.left, (f3 + pointF3.y) - this.EZpvd, paint);
        }
        paint.setColor(color);
    }
}
