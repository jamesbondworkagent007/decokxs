package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mAD extends android.text.style.ReplacementSpan {
    public int AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final RectF EZpvd;
    public final PointF KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final int djBIcL;
    public final float valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r13v0 float)
  (r14v0 int)
  (r15v0 int)
  (r16v0 int)
  (wrap:android.graphics.RectF:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: CONSTRUCTOR (0.0f float), (0.0f float), (0.0f float), (0.0f float) A[MD:(float, float, float, float):void (c), WRAPPED] (LINE:11) call: android.graphics.RectF.<init>(float, float, float, float):void type: CONSTRUCTOR) : (r17v0 android.graphics.RectF))
  (wrap:android.graphics.PointF:?: TERNARY null = ((wrap:int:0x0010: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR (0.0f float), (0.0f float) A[MD:(float, float):void (c), WRAPPED] (LINE:12) call: android.graphics.PointF.<init>(float, float):void type: CONSTRUCTOR) : (r18v0 android.graphics.PointF))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
 A[MD:(float, int, int, int, android.graphics.RectF, android.graphics.PointF, int, int):void (m)] (LINE:10) call: o.mAD.<init>(float, int, int, int, android.graphics.RectF, android.graphics.PointF, int, int):void type: THIS */
    public /* synthetic */ mAD(float f, int i, int i2, int i3, RectF rectF, PointF pointF, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2, i3, (i6 & 16) != 0 ? new RectF(0.0f, 0.0f, 0.0f, 0.0f) : rectF, (i6 & 32) != 0 ? new PointF(0.0f, 0.0f) : pointF, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5);
    }

    public mAD(float f, int i, int i2, int i3, @NotNull RectF rectF, @NotNull PointF pointF, int i4, int i5) {
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(pointF, "");
        this.valueOf = f;
        this.AhwBna = i;
        this.djBIcL = i2;
        this.AYXKKw = i3;
        this.EZpvd = rectF;
        this.KWHzl = pointF;
        this.OLrzqt = i4;
        this.copydefault = i5;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        float fMeasureText = paint.measureText(charSequence, i, i2);
        RectF rectF = this.EZpvd;
        int i3 = (int) (fMeasureText + rectF.left + rectF.right + (this.valueOf * 2));
        this.AEQbTJ = i3;
        return i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        paint.setColor(this.copydefault);
        paint.setStyle(Paint.Style.FILL);
        PointF pointF = this.KWHzl;
        float f2 = pointF.x;
        float f3 = i4;
        float f4 = pointF.y;
        float fAscent = paint.ascent();
        float f5 = this.EZpvd.top;
        float f6 = this.OLrzqt;
        PointF pointF2 = this.KWHzl;
        float f7 = pointF2.x;
        float f8 = this.AEQbTJ;
        float f9 = 2;
        float f10 = pointF2.y;
        RectF rectF = new RectF(f + f2, (((f4 + f3) + fAscent) - f5) - f6, ((f + f7) + f8) - f9, (((f10 + f3) + paint.descent()) + this.EZpvd.bottom) - this.OLrzqt);
        float f11 = this.AYXKKw;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        int color = paint.getColor();
        Paint.Style style = paint.getStyle();
        paint.setColor(this.AhwBna);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.valueOf);
        paint.setAntiAlias(true);
        PointF pointF3 = this.KWHzl;
        float f12 = pointF3.x;
        float f13 = pointF3.y;
        float fAscent2 = paint.ascent();
        float f14 = this.EZpvd.top;
        float f15 = this.OLrzqt;
        PointF pointF4 = this.KWHzl;
        float f16 = pointF4.x;
        float f17 = this.AEQbTJ;
        float f18 = pointF4.y;
        RectF rectF2 = new RectF(f + f12, (((f13 + f3) + fAscent2) - f14) - f15, ((f + f16) + f17) - f9, (((f18 + f3) + paint.descent()) + this.EZpvd.bottom) - this.OLrzqt);
        float f19 = this.AYXKKw;
        canvas.drawRoundRect(rectF2, f19, f19, paint);
        paint.setColor(this.djBIcL);
        paint.setStyle(style);
        if (C33129mqd.OLrzqt(charSequence)) {
            Intrinsics.copydefault(charSequence);
            PointF pointF5 = this.KWHzl;
            canvas.drawText(charSequence, i, i2, this.EZpvd.left + f + pointF5.x, (f3 + pointF5.y) - this.OLrzqt, paint);
        }
        paint.setColor(color);
    }
}
