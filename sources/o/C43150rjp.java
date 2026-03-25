package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.core.view.ViewCompat;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43150rjp extends AbstractC5396Qc {
    public final byte[] AhwBna;
    public final android.text.TextPaint DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int copydefault;
    public android.content.Context djBIcL;
    public final android.graphics.Paint gEmmrt;
    public float isConnected;
    public boolean valueOf;
    public final java.lang.String values;
    public final java.lang.String AYXKKw = "com.okinc.mln_ui.ui.NftBlurTransform";
    public final float OLrzqt = 0.07f;

    public C43150rjp(android.content.Context context, int i, float f, int i2, int i3, boolean z) {
        this.djBIcL = context;
        this.KWHzl = i;
        this.isConnected = f;
        this.EZpvd = i2;
        this.copydefault = i3;
        this.valueOf = z;
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.mln_ui.ui.NftBlurTransform".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.AhwBna = bytes;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textPaint.setShadowLayer(1.0f, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.DbNXlk = textPaint;
        this.gEmmrt = new android.graphics.Paint();
        this.values = pSC.AEQbTJ.KWHzl("pr_nftmarket_items_txt_not_available_yet", new java.lang.Object[0]);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        return obj instanceof C43150rjp;
    }

    @Override // o.NH
    public int hashCode() {
        return this.AYXKKw.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(this.AhwBna);
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            this.EZpvd = java.lang.Math.max((this.EZpvd * i) / 268, C33052mpF.dp2px$default(2.0f, null, 1, null));
            android.graphics.Bitmap bitmapOLrzqt = OLrzqt(og, bitmap, i, i2);
            if (!this.valueOf) {
                return bitmapOLrzqt;
            }
            android.graphics.Bitmap bitmapKWHzl = KWHzl(og, bitmap);
            android.graphics.Bitmap bitmapEZpvd = EZpvd(og, bitmapKWHzl, 0.4f, C56548yJl.valueOf(i, i2));
            android.graphics.Bitmap bitmapCopydefault = copydefault(bitmapEZpvd, bitmapOLrzqt);
            if (bitmapEZpvd != null && !bitmapEZpvd.isRecycled()) {
                og.copydefault(bitmapEZpvd);
            }
            if (bitmapOLrzqt != null && !bitmapOLrzqt.isRecycled()) {
                og.copydefault(bitmapOLrzqt);
            }
            if (bitmapKWHzl != null && !bitmapKWHzl.isRecycled()) {
                og.copydefault(bitmapKWHzl);
            }
            return bitmapCopydefault;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final android.graphics.Bitmap copydefault(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        if (bitmap2 == null) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.gEmmrt);
        canvas.drawBitmap(bitmap, (r0 - bitmap.getWidth()) / 2.0f, (r1 - bitmap.getHeight()) / 2, this.gEmmrt);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public final android.graphics.Bitmap EZpvd(OG og, android.graphics.Bitmap bitmap, float f, int i) {
        float f2 = i;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale((f2 / bitmap.getWidth()) * f, (f2 / bitmap.getHeight()) * f, 0.0f, 0.0f);
        int i2 = (int) (f2 * f);
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(i2, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        new android.graphics.Canvas(bitmapCopydefault).drawBitmap(bitmap, matrix, new android.graphics.Paint());
        return bitmapCopydefault;
    }

    public final android.graphics.Bitmap KWHzl(OG og, android.graphics.Bitmap bitmap) {
        int iValueOf = C56548yJl.valueOf(bitmap.getWidth(), bitmap.getHeight()) - (this.EZpvd / 2);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iValueOf) / 2, (bitmap.getHeight() - iValueOf) / 2, iValueOf, iValueOf);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(iValueOf, iValueOf, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        android.graphics.Paint paint = new android.graphics.Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = iValueOf / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        if (this.EZpvd > 0) {
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setDither(true);
            paint2.setAntiAlias(true);
            paint2.setColor(this.copydefault);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.EZpvd * 1.0f);
            canvas.drawCircle(f, f, f - (this.EZpvd / 2), paint2);
        }
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapCopydefault;
    }

    public final android.graphics.Bitmap OLrzqt(OG og, android.graphics.Bitmap bitmap, int i, int i2) throws java.lang.Throwable {
        android.graphics.Bitmap bitmapCopy;
        android.graphics.Bitmap bitmapOLrzqt;
        android.graphics.Bitmap bitmapOLrzqt2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            float width2 = i / bitmap.getWidth();
            float height2 = i2 / bitmap.getHeight();
            matrix.postScale(width2, height2, 0.0f, 0.0f);
            android.graphics.Bitmap bitmapCopydefault2 = og.copydefault((int) (width * width2), (int) (height * height2), config);
            new android.graphics.Canvas(bitmapCopydefault2).drawBitmap(bitmap, matrix, this.gEmmrt);
            bitmapCopy = bitmapCopydefault2;
        } else {
            bitmapCopy = bitmap.copy(config, false);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
        float f = this.isConnected;
        canvas.scale(f, f, i / 2.0f, i2 / 2.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmapCopy, 0.0f, 0.0f, paint);
        int i3 = this.KWHzl;
        if (i3 <= 25) {
            try {
                bitmapOLrzqt = C56377yDc.AEQbTJ(this.djBIcL, bitmapCopydefault, i3);
            } catch (java.lang.Exception unused) {
                bitmapOLrzqt = C56375yDa.OLrzqt(bitmapCopydefault, this.KWHzl, true);
            }
        } else {
            bitmapOLrzqt = C56375yDa.OLrzqt(bitmapCopydefault, i3, true);
        }
        int i4 = this.KWHzl;
        if (i4 <= 25) {
            try {
                bitmapOLrzqt2 = C56377yDc.AEQbTJ(this.djBIcL, bitmapOLrzqt, i4);
            } catch (java.lang.Exception unused2) {
                bitmapOLrzqt2 = C56375yDa.OLrzqt(bitmapOLrzqt, this.KWHzl, true);
            }
        } else {
            bitmapOLrzqt2 = C56375yDa.OLrzqt(bitmapOLrzqt, i4, true);
        }
        if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
            og.copydefault(bitmapCopy);
        }
        return bitmapOLrzqt2;
    }
}
