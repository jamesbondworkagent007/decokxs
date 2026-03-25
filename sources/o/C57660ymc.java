package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57660ymc extends AbstractC5396Qc {
    public boolean AYXKKw;
    public float EZpvd;
    public final byte[] KWHzl;
    public android.graphics.Paint OLrzqt;
    public final java.lang.String copydefault;

    public C57660ymc(android.content.Context context, float f, int i, boolean z) {
        this.AYXKKw = true;
        this.copydefault = "com.okinc.widget.dex_input.GlideCircleWithBorder";
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.widget.dex_input.GlideCircleWithBorder".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.KWHzl = bytes;
        this.EZpvd = android.content.res.Resources.getSystem().getDisplayMetrics().density * f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        paint.setDither(true);
        android.graphics.Paint paint2 = this.OLrzqt;
        if (paint2 != null) {
            paint2.setAntiAlias(true);
        }
        android.graphics.Paint paint3 = this.OLrzqt;
        if (paint3 != null) {
            paint3.setColor(i);
        }
        android.graphics.Paint paint4 = this.OLrzqt;
        if (paint4 != null) {
            paint4.setStyle(Paint.Style.STROKE);
        }
        android.graphics.Paint paint5 = this.OLrzqt;
        if (paint5 != null) {
            paint5.setStrokeWidth(this.EZpvd);
        }
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 float)
  (r3v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(android.content.Context, float, int, boolean):void (m)] (LINE:23) call: o.ymc.<init>(android.content.Context, float, int, boolean):void type: THIS */
    public /* synthetic */ C57660ymc(android.content.Context context, float f, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f, i, (i2 & 8) != 0 ? true : z);
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        return AEQbTJ(og, bitmap);
    }

    private final android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap) {
        float f = 2;
        int iMin = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) - (this.EZpvd / f));
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(iMin, iMin, config);
        if (bitmapCopydefault == null) {
            bitmapCopydefault = android.graphics.Bitmap.createBitmap(iMin, iMin, config);
        }
        Intrinsics.copydefault(bitmapCopydefault);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f2 = iMin / 2.0f;
        if (this.AYXKKw) {
            android.graphics.Paint paint2 = this.OLrzqt;
            paint.setColor(paint2 != null ? paint2.getColor() : paint.getColor());
        }
        canvas.drawCircle(f2, f2, f2, paint);
        android.graphics.Paint paint3 = this.OLrzqt;
        if (paint3 != null) {
            float f3 = this.EZpvd / f;
            Intrinsics.copydefault(paint3);
            canvas.drawCircle(f2, f2, f2 - f3, paint3);
        }
        return bitmapCopydefault;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C57660ymc) {
            C57660ymc c57660ymc = (C57660ymc) obj;
            if (c57660ymc.EZpvd == this.EZpvd) {
                android.graphics.Paint paint = c57660ymc.OLrzqt;
                java.lang.Integer numValueOf = paint != null ? java.lang.Integer.valueOf(paint.getColor()) : null;
                android.graphics.Paint paint2 = this.OLrzqt;
                if (Intrinsics.EZpvd(numValueOf, paint2 != null ? java.lang.Integer.valueOf(paint2.getColor()) : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        java.lang.String str = this.copydefault;
        float f = this.EZpvd;
        android.graphics.Paint paint = this.OLrzqt;
        return (str + f + (paint != null ? java.lang.Integer.valueOf(paint.getColor()) : null)).hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(this.KWHzl);
    }
}
