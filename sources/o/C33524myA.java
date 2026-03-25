package o;

import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33524myA extends android.view.View {
    public boolean AEQbTJ;
    public final float AYXKKw;
    public boolean AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public final float DbNXlk;
    public final float EZpvd;
    public int KWHzl;
    public android.graphics.Bitmap OLrzqt;
    public final float copydefault;
    public android.graphics.Paint djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public final int fIwbmz;
    public final float fetchVPNInfo;
    public float gEmmrt;
    public final int isConnected;
    public final float valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(boolean z) {
        this.AEQbTJ = z;
    }

    public final void setPauseAnimation(boolean z) {
        this.AhwBna = z;
        invalidate();
    }

    public C33524myA(android.content.Context context) {
        super(context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.fIwbmz = C55298xhM.KWHzl(8.0f, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.isConnected = C55298xhM.KWHzl(1.0f, context3);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.copydefault = C55298xhM.OLrzqt(2.0f, context4);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.AYXKKw = C55298xhM.OLrzqt(16.0f, context5);
        android.content.Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        this.EZpvd = C55298xhM.OLrzqt(12.0f, context6);
        android.content.Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        this.fetchVPNInfo = C55298xhM.OLrzqt(4.0f, context7);
        android.content.Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        this.valueOf = C55298xhM.OLrzqt(48.0f, context8);
        android.content.Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        this.DbNXlk = C55298xhM.OLrzqt(4.0f, context9);
        this.KWHzl = ColorUtils.setAlphaComponent(ContextCompat.getColor(getContext(), C52761wXj.Activity.gEmmrt), 127);
        this.values = ContextCompat.getColor(getContext(), C52761wXj.Activity.DTwDnp);
    }

    public C33524myA(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.fIwbmz = C55298xhM.KWHzl(8.0f, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.isConnected = C55298xhM.KWHzl(1.0f, context3);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.copydefault = C55298xhM.OLrzqt(2.0f, context4);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.AYXKKw = C55298xhM.OLrzqt(16.0f, context5);
        android.content.Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        this.EZpvd = C55298xhM.OLrzqt(12.0f, context6);
        android.content.Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        this.fetchVPNInfo = C55298xhM.OLrzqt(4.0f, context7);
        android.content.Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        this.valueOf = C55298xhM.OLrzqt(48.0f, context8);
        android.content.Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        this.DbNXlk = C55298xhM.OLrzqt(4.0f, context9);
        this.KWHzl = ColorUtils.setAlphaComponent(ContextCompat.getColor(getContext(), C52761wXj.Activity.gEmmrt), 127);
        this.values = ContextCompat.getColor(getContext(), C52761wXj.Activity.DTwDnp);
    }

    public final void setTargetPosition(int i, int i2, int i3, int i4) {
        this.fARcdN = i;
        this.ejfBZ = i2;
        this.AuCTel = i3;
        this.AkhnZx = i4;
        this.gEmmrt = i2 + this.AYXKKw;
        requestLayout();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AEQbTJ(i3 - i, i4 - i2);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.OLrzqt;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        copydefault(canvas);
    }

    public final void AEQbTJ(int i, int i2) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        this.djBIcL = new android.graphics.Paint(1);
        copydefault(i, i2, canvas);
        AEQbTJ(canvas);
        this.OLrzqt = bitmapCreateBitmap;
    }

    public final void copydefault(int i, int i2, android.graphics.Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        android.graphics.Paint paint = this.djBIcL;
        android.graphics.Paint paint2 = null;
        if (paint == null) {
            Intrinsics.gEmmrt("");
            paint = null;
        }
        paint.setColor(this.KWHzl);
        android.graphics.Paint paint3 = this.djBIcL;
        if (paint3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            paint2 = paint3;
        }
        canvas.drawRect(rectF, paint2);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.djBIcL;
        android.graphics.Paint paint2 = null;
        if (paint == null) {
            Intrinsics.gEmmrt("");
            paint = null;
        }
        paint.setColor(0);
        android.graphics.Paint paint3 = this.djBIcL;
        if (paint3 == null) {
            Intrinsics.gEmmrt("");
            paint3 = null;
        }
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        RectF rectF = new RectF(this.fARcdN, this.ejfBZ, this.AuCTel, this.AkhnZx);
        float f = this.fIwbmz;
        android.graphics.Paint paint4 = this.djBIcL;
        if (paint4 == null) {
            Intrinsics.gEmmrt("");
            paint4 = null;
        }
        canvas.drawRoundRect(rectF, f, f, paint4);
        android.graphics.Paint paint5 = this.djBIcL;
        if (paint5 == null) {
            Intrinsics.gEmmrt("");
            paint5 = null;
        }
        paint5.setXfermode(null);
        android.graphics.Paint paint6 = this.djBIcL;
        if (paint6 == null) {
            Intrinsics.gEmmrt("");
            paint6 = null;
        }
        paint6.setColor(this.values);
        android.graphics.Paint paint7 = this.djBIcL;
        if (paint7 == null) {
            Intrinsics.gEmmrt("");
            paint7 = null;
        }
        paint7.setStyle(Paint.Style.STROKE);
        android.graphics.Paint paint8 = this.djBIcL;
        if (paint8 == null) {
            Intrinsics.gEmmrt("");
            paint8 = null;
        }
        paint8.setStrokeWidth(this.isConnected);
        float f2 = this.fIwbmz;
        android.graphics.Paint paint9 = this.djBIcL;
        if (paint9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            paint2 = paint9;
        }
        canvas.drawRoundRect(rectF, f2, f2, paint2);
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        float f = this.fARcdN;
        float f2 = this.fetchVPNInfo;
        float f3 = f - f2;
        float f4 = this.ejfBZ - f2;
        float f5 = this.AuCTel + f2;
        float f6 = this.AkhnZx + f2;
        android.graphics.Paint paint2 = this.djBIcL;
        if (paint2 == null) {
            Intrinsics.gEmmrt("");
            paint2 = null;
        }
        paint2.setStrokeCap(Paint.Cap.ROUND);
        android.graphics.Paint paint3 = this.djBIcL;
        if (paint3 == null) {
            Intrinsics.gEmmrt("");
            paint3 = null;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        android.graphics.Paint paint4 = this.djBIcL;
        if (paint4 == null) {
            Intrinsics.gEmmrt("");
            paint4 = null;
        }
        paint4.setColor(copydefault());
        android.graphics.Paint paint5 = this.djBIcL;
        if (paint5 == null) {
            Intrinsics.gEmmrt("");
            paint5 = null;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint5.setStrokeWidth(C55298xhM.OLrzqt(1.5f, context));
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f3, this.valueOf + f4);
        path.lineTo(f3, this.EZpvd + f4);
        float f7 = 2;
        float f8 = this.EZpvd * f7;
        path.arcTo(new RectF(f3, f4, f8 + f3, f8 + f4), 180.0f, 90.0f, true);
        path.lineTo(this.valueOf + f3, f4);
        android.graphics.Paint paint6 = this.djBIcL;
        if (paint6 == null) {
            Intrinsics.gEmmrt("");
            paint6 = null;
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fOLrzqt = C55298xhM.OLrzqt(16.0f, context2);
        float f9 = -this.DbNXlk;
        paint6.setShadowLayer(fOLrzqt, f9, f9, copydefault());
        android.graphics.Paint paint7 = this.djBIcL;
        if (paint7 == null) {
            Intrinsics.gEmmrt("");
            paint7 = null;
        }
        canvas.drawPath(path, paint7);
        path.reset();
        path.moveTo(f5 - this.valueOf, f4);
        path.lineTo(f5 - this.EZpvd, f4);
        float f10 = this.EZpvd * f7;
        path.arcTo(new RectF(f5 - f10, f4, f5, f10 + f4), 270.0f, 90.0f, true);
        path.lineTo(f5, f4 + this.valueOf);
        android.graphics.Paint paint8 = this.djBIcL;
        if (paint8 == null) {
            Intrinsics.gEmmrt("");
            paint8 = null;
        }
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        float fOLrzqt2 = C55298xhM.OLrzqt(16.0f, context3);
        float f11 = this.DbNXlk;
        paint8.setShadowLayer(fOLrzqt2, f11, -f11, copydefault());
        android.graphics.Paint paint9 = this.djBIcL;
        if (paint9 == null) {
            Intrinsics.gEmmrt("");
            paint9 = null;
        }
        canvas.drawPath(path, paint9);
        path.reset();
        path.moveTo(f5, f6 - this.valueOf);
        path.lineTo(f5, f6 - this.EZpvd);
        float f12 = this.EZpvd * f7;
        path.arcTo(new RectF(f5 - f12, f6 - f12, f5, f6), 0.0f, 90.0f, true);
        path.lineTo(f5 - this.valueOf, f6);
        android.graphics.Paint paint10 = this.djBIcL;
        if (paint10 == null) {
            Intrinsics.gEmmrt("");
            paint10 = null;
        }
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        float fOLrzqt3 = C55298xhM.OLrzqt(16.0f, context4);
        float f13 = this.DbNXlk;
        paint10.setShadowLayer(fOLrzqt3, f13, f13, copydefault());
        android.graphics.Paint paint11 = this.djBIcL;
        if (paint11 == null) {
            Intrinsics.gEmmrt("");
            paint11 = null;
        }
        canvas.drawPath(path, paint11);
        path.reset();
        path.moveTo(this.valueOf + f3, f6);
        path.lineTo(this.EZpvd + f3, f6);
        float f14 = this.EZpvd * f7;
        path.arcTo(new RectF(f3, f6 - f14, f14 + f3, f6), 90.0f, 90.0f, true);
        path.lineTo(f3, f6 - this.valueOf);
        android.graphics.Paint paint12 = this.djBIcL;
        if (paint12 == null) {
            Intrinsics.gEmmrt("");
            paint12 = null;
        }
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        float fOLrzqt4 = C55298xhM.OLrzqt(16.0f, context5);
        float f15 = this.DbNXlk;
        paint12.setShadowLayer(fOLrzqt4, -f15, f15, copydefault());
        android.graphics.Paint paint13 = this.djBIcL;
        if (paint13 == null) {
            Intrinsics.gEmmrt("");
            paint13 = null;
        }
        canvas.drawPath(path, paint13);
        float f16 = (f5 - f3) - (this.fetchVPNInfo * f7);
        float f17 = ((this.fARcdN + this.AuCTel) / 2.0f) - (f16 / 2.0f);
        android.graphics.Paint paint14 = this.djBIcL;
        if (paint14 == null) {
            Intrinsics.gEmmrt("");
            paint14 = null;
        }
        int alphaComponent = ColorUtils.setAlphaComponent(paint14.getColor(), 0);
        android.graphics.Paint paint15 = this.djBIcL;
        if (paint15 == null) {
            Intrinsics.gEmmrt("");
            paint15 = null;
        }
        float f18 = f16 / f7;
        int[] iArr = new int[2];
        iArr[0] = alphaComponent;
        android.graphics.Paint paint16 = this.djBIcL;
        if (paint16 == null) {
            Intrinsics.gEmmrt("");
            paint16 = null;
        }
        iArr[1] = paint16.getColor();
        paint15.setShader(new LinearGradient(f17, 0.0f, f17 + f18, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR));
        float f19 = this.gEmmrt;
        android.graphics.Paint paint17 = this.djBIcL;
        if (paint17 == null) {
            Intrinsics.gEmmrt("");
            paint = null;
        } else {
            paint = paint17;
        }
        canvas.drawLine(f17, f19, f17 + f16, f19, paint);
        android.graphics.Paint paint18 = this.djBIcL;
        if (paint18 == null) {
            Intrinsics.gEmmrt("");
            paint18 = null;
        }
        paint18.setShader(null);
        if (!this.AEQbTJ) {
            android.graphics.Paint paint19 = this.djBIcL;
            if (paint19 == null) {
                Intrinsics.gEmmrt("");
                paint19 = null;
            }
            paint19.setColor(0);
            android.graphics.Paint paint20 = this.djBIcL;
            if (paint20 == null) {
                Intrinsics.gEmmrt("");
                paint20 = null;
            }
            paint20.setStyle(style);
            android.graphics.Paint paint21 = this.djBIcL;
            if (paint21 == null) {
                Intrinsics.gEmmrt("");
                paint21 = null;
            }
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            paint21.setShadowLayer(C55298xhM.OLrzqt(16.0f, context6), 0.0f, 0.0f, ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChPfrwjPh));
            float f20 = 4;
            float f21 = f16 / f20;
            float f22 = this.gEmmrt;
            android.content.Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            float fOLrzqt5 = C55298xhM.OLrzqt(3.0f, context7);
            float f23 = (3 * f16) / f20;
            float f24 = this.gEmmrt;
            android.content.Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            float fOLrzqt6 = C55298xhM.OLrzqt(3.0f, context8);
            android.graphics.Paint paint22 = this.djBIcL;
            if (paint22 == null) {
                Intrinsics.gEmmrt("");
                paint22 = null;
            }
            canvas.drawOval(f21 + f17, f22 - fOLrzqt5, f23 + f17, fOLrzqt6 + f24, paint22);
        }
        if (this.AhwBna) {
            return;
        }
        float f25 = this.gEmmrt + this.copydefault;
        this.gEmmrt = f25;
        int i = this.AkhnZx;
        float f26 = this.AYXKKw;
        if (f25 > i - f26) {
            this.gEmmrt = this.ejfBZ + f26;
        }
        postInvalidateDelayed(4L, this.fARcdN, this.ejfBZ, this.AuCTel, i);
    }

    private final int copydefault() {
        return ContextCompat.getColor(getContext(), this.AEQbTJ ? C52761wXj.Activity.ihnvzI : C52761wXj.Activity.DLGVGj);
    }
}
