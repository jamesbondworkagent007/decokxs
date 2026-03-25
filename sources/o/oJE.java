package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oJE extends android.text.style.ReplacementSpan {
    public final boolean AEQbTJ;
    public final int AYXKKw;
    public int AhwBna;
    public final int EZpvd;
    public final float KWHzl;
    public final android.graphics.drawable.Drawable OLrzqt;
    public final int copydefault;
    public final RectF djBIcL;
    public final int fetchVPNInfo;
    public final PointF gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (r15v0 int)
  (r16v0 int)
  (r17v0 int)
  (wrap:android.graphics.RectF:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: CONSTRUCTOR (0.0f float), (0.0f float), (0.0f float), (0.0f float) A[MD:(float, float, float, float):void (c), WRAPPED] (LINE:14) call: android.graphics.RectF.<init>(float, float, float, float):void type: CONSTRUCTOR) : (r18v0 android.graphics.RectF))
  (wrap:android.graphics.PointF:?: TERNARY null = ((wrap:int:0x0010: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR (0.0f float), (0.0f float) A[MD:(float, float):void (c), WRAPPED] (LINE:15) call: android.graphics.PointF.<init>(float, float):void type: CONSTRUCTOR) : (r19v0 android.graphics.PointF))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x002f: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r22v0 android.graphics.drawable.Drawable))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0038: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (12 int) : (r23v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0042: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: INVOKE 
  (4.0f float)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.xhM.dp$default(float, android.content.Context, int, java.lang.Object):float A[MD:(float, android.content.Context, int, java.lang.Object):float (m), WRAPPED] (LINE:19)) : (r24v0 float))
 A[MD:(int, int, int, android.graphics.RectF, android.graphics.PointF, int, boolean, android.graphics.drawable.Drawable, int, float):void (m)] (LINE:13) call: o.oJE.<init>(int, int, int, android.graphics.RectF, android.graphics.PointF, int, boolean, android.graphics.drawable.Drawable, int, float):void type: THIS */
    public /* synthetic */ oJE(int i, int i2, int i3, RectF rectF, PointF pointF, int i4, boolean z, android.graphics.drawable.Drawable drawable, int i5, float f, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i6 & 8) != 0 ? new RectF(0.0f, 0.0f, 0.0f, 0.0f) : rectF, (i6 & 16) != 0 ? new PointF(0.0f, 0.0f) : pointF, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? true : z, (i6 & 128) != 0 ? null : drawable, (i6 & 256) != 0 ? 12 : i5, (i6 & 512) != 0 ? C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null) : f);
    }

    public oJE(int i, int i2, int i3, @NotNull RectF rectF, @NotNull PointF pointF, int i4, boolean z, android.graphics.drawable.Drawable drawable, int i5, float f) {
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(pointF, "");
        this.copydefault = i;
        this.fetchVPNInfo = i2;
        this.valueOf = i3;
        this.djBIcL = rectF;
        this.gEmmrt = pointF;
        this.AYXKKw = i4;
        this.AEQbTJ = z;
        this.OLrzqt = drawable;
        this.EZpvd = i5;
        this.KWHzl = f;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        float fMeasureText = paint.measureText(charSequence, i, i2);
        float f = this.OLrzqt != null ? this.EZpvd + this.KWHzl : 0.0f;
        float fDp$default = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        RectF rectF = this.djBIcL;
        int i3 = (int) (fMeasureText + rectF.left + rectF.right + f + fDp$default);
        this.AhwBna = i3;
        return i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        int color = paint.getColor();
        Paint.Style style = paint.getStyle();
        paint.setColor(this.copydefault);
        paint.setStyle(this.AEQbTJ ? Paint.Style.FILL : Paint.Style.STROKE);
        float fDp$default = this.AEQbTJ ? 0.0f : C55298xhM.dp$default(1.5f, (android.content.Context) null, 1, (java.lang.Object) null);
        paint.setStrokeWidth(fDp$default);
        paint.setAntiAlias(true);
        PointF pointF = this.gEmmrt;
        float f2 = pointF.x;
        float f3 = i4;
        float f4 = pointF.y;
        float fAscent = paint.ascent();
        float f5 = this.djBIcL.top;
        float f6 = this.AYXKKw;
        PointF pointF2 = this.gEmmrt;
        RectF rectF = new RectF(f + f2, (((f4 + f3) + fAscent) - f5) - f6, ((f + pointF2.x) + this.AhwBna) - fDp$default, (((pointF2.y + f3) + paint.descent()) + this.djBIcL.bottom) - this.AYXKKw);
        float f7 = this.valueOf;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        if (drawable != null) {
            float fAscent2 = ((this.gEmmrt.y + f3) - this.AYXKKw) + ((paint.ascent() + paint.descent()) / 2.0f);
            float fDp$default2 = C55298xhM.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            float f8 = f + this.gEmmrt.x + this.djBIcL.left + fDp$default2;
            float f9 = this.EZpvd;
            float f10 = f9 / 2.0f;
            android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
            Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
            DrawableCompat.setTint(drawableWrap, this.fetchVPNInfo);
            drawableWrap.setBounds((int) f8, (int) ((fAscent2 - f10) + fDp$default2), (int) ((f9 + f8) - (2.0f * fDp$default2)), (int) ((fAscent2 + f10) - fDp$default2));
            drawableWrap.draw(canvas);
        }
        paint.setColor(this.fetchVPNInfo);
        paint.setStyle(style);
        if (C33129mqd.OLrzqt(charSequence)) {
            float f11 = this.gEmmrt.x;
            float f12 = this.djBIcL.left;
            float f13 = this.OLrzqt != null ? this.KWHzl + this.EZpvd : 0.0f;
            Intrinsics.copydefault(charSequence);
            canvas.drawText(charSequence, i, i2, f13 + f + f11 + f12, (f3 + this.gEmmrt.y) - this.AYXKKw, paint);
        }
        paint.setColor(color);
    }
}
