package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14641dpL extends AbstractC5396Qc {
    public final float AYXKKw;
    public final float EZpvd;
    public final java.lang.String KWHzl = "com.okinc.business.defi.common.utils.GlideRoundedCornersWithBorder";
    public final android.graphics.Paint OLrzqt;
    public final byte[] copydefault;

    public C14641dpL(android.content.Context context, float f, float f2, int i) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.business.defi.common.utils.GlideRoundedCornersWithBorder".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.copydefault = bytes;
        float f3 = (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? android.content.res.Resources.getSystem().getDisplayMetrics().density : displayMetrics.density;
        this.AYXKKw = f * f3;
        float f4 = f3 * f2;
        this.EZpvd = f4;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f4);
        this.OLrzqt = paint;
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        return AEQbTJ(og, bitmap);
    }

    public final android.graphics.Bitmap AEQbTJ(OG og, android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (int) (this.EZpvd * 2);
        int i2 = width - i;
        int i3 = height - i;
        int i4 = i / 2;
        if (i2 > 0 && i3 > 0) {
            bitmap = android.graphics.Bitmap.createBitmap(bitmap, i4, i4, i2, i3);
        }
        Intrinsics.copydefault(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(width, height, config);
        if (bitmapCopydefault == null) {
            bitmapCopydefault = android.graphics.Bitmap.createBitmap(width, height, config);
        }
        Intrinsics.copydefault(bitmapCopydefault);
        bitmapCopydefault.setHasAlpha(true);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        float f = this.EZpvd;
        float f2 = width;
        float f3 = height;
        RectF rectF = new RectF(f, f, f2 - f, f3 - f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), rectF, Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(matrix);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        float f4 = this.AYXKKw;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (this.OLrzqt != null && this.EZpvd > 0.0f) {
            RectF rectF2 = new RectF(0.0f, 0.0f, f2, f3);
            float f5 = this.EZpvd / 2.0f;
            rectF2.inset(f5, f5);
            float f6 = this.AYXKKw;
            canvas.drawRoundRect(rectF2, f6, f6, this.OLrzqt);
        }
        return bitmapCopydefault;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C14641dpL) {
            C14641dpL c14641dpL = (C14641dpL) obj;
            if (c14641dpL.AYXKKw == this.AYXKKw && c14641dpL.EZpvd == this.EZpvd) {
                android.graphics.Paint paint = c14641dpL.OLrzqt;
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
        java.lang.String str = this.KWHzl;
        float f = this.AYXKKw;
        float f2 = this.EZpvd;
        android.graphics.Paint paint = this.OLrzqt;
        return (str + f + f2 + (paint != null ? java.lang.Integer.valueOf(paint.getColor()) : null)).hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(this.copydefault);
    }
}
