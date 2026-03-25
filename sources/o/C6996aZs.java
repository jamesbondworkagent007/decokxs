package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6996aZs {
    public static final C6996aZs OLrzqt = new C6996aZs();

    private C6996aZs() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Bitmap KWHzl(java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2, @NotNull Bitmap.Config config, float f3, @NotNull ErrorCorrectionLevel errorCorrectionLevel, @NotNull android.graphics.Bitmap bitmap, int i8, int i9, float f4, float f5, float f6) throws java.lang.Exception {
        ByteMatrix byteMatrix;
        android.graphics.Bitmap bitmap2;
        int i10;
        int i11;
        android.graphics.Canvas canvas;
        android.graphics.Paint paint;
        float f7;
        double d;
        int i12;
        int i13;
        int i14;
        double d2;
        double d3;
        android.graphics.Paint paint2;
        float f8;
        int i15;
        int i16;
        int i17;
        double d4;
        double d5;
        android.graphics.Canvas canvas2;
        int i18;
        float f9;
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        ByteMatrix matrix = Encoder.encode(str, errorCorrectionLevel, C56424yEw.gEmmrt(C56390yDp.OLrzqt(EncodeHintType.CHARACTER_SET, "utf-8"), C56390yDp.OLrzqt(EncodeHintType.MARGIN, 0))).getMatrix();
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int iCopydefault = C56548yJl.copydefault(width, i);
        int iCopydefault2 = C56548yJl.copydefault(height, i2);
        double d6 = iCopydefault;
        double d7 = width;
        double d8 = iCopydefault2;
        double d9 = height;
        double dKWHzl = C56548yJl.KWHzl(i5, C56548yJl.gEmmrt(d6 / (d7 + 2.0d), d8 / (d9 + 2.0d))) * 2.0d;
        double dGEmmrt = C56548yJl.gEmmrt((d6 - dKWHzl) / d7, (d8 - dKWHzl) / d9);
        double d10 = (d6 - (d7 * dGEmmrt)) / 2.0d;
        double d11 = (d8 - (d9 * dGEmmrt)) / 2.0d;
        double d12 = 2;
        float f10 = (float) ((1.0d * dGEmmrt) / d12);
        double d13 = ((double) f3) * 0.25d;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(i3);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        if (i3 == 0) {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iCopydefault, iCopydefault2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        bitmapCreateBitmap.eraseColor(i4);
        android.graphics.Canvas canvas3 = new android.graphics.Canvas(bitmapCreateBitmap);
        BitMatrix bitMatrix = new BitMatrix(width, height);
        if (i6 == 2) {
            i10 = iCopydefault2;
            canvas = canvas3;
            bitmap2 = bitmapCreateBitmap;
            paint = paint3;
            f7 = f10;
            d = d12;
            i11 = iCopydefault;
            i12 = 2;
            i13 = width;
            d2 = dGEmmrt;
            d3 = d11;
            byteMatrix = matrix;
            i14 = height;
            EZpvd(iCopydefault, i10, width, height, f10, paint, canvas, i3, bitMatrix, f);
        } else {
            byteMatrix = matrix;
            bitmap2 = bitmapCreateBitmap;
            i10 = iCopydefault2;
            i11 = iCopydefault;
            canvas = canvas3;
            paint = paint3;
            f7 = f10;
            d = d12;
            i12 = 2;
            i13 = width;
            i14 = height;
            d2 = dGEmmrt;
            d3 = d11;
        }
        if (i6 == 0) {
            copydefault(i11, i10, i13, i14, f7, paint, canvas, i3, bitMatrix, f, f6);
        }
        double d14 = d2 / ((double) 4);
        float f11 = i8 / (((float) d2) * i12);
        int i19 = i14;
        int i20 = 0;
        while (i20 < i19) {
            int i21 = i13;
            int i22 = 0;
            while (i22 < i21) {
                float f12 = i22;
                float f13 = i21 / 2;
                if (f12 <= f13 + f11) {
                    float f14 = i20;
                    float f15 = i19 / 2;
                    if (f14 > f15 + f11 || f12 <= f13 - f11 || f14 <= f15 - f11) {
                        ByteMatrix byteMatrix2 = byteMatrix;
                        if (byteMatrix2.get(i22, i20) != 1) {
                            paint2 = paint;
                            f8 = f11;
                            i15 = i19;
                            i16 = i20;
                            i17 = i21;
                            byteMatrix = byteMatrix2;
                            d4 = d14;
                            d5 = d2;
                            canvas2 = canvas;
                            i18 = i22;
                            f9 = f7;
                        } else if ((((i22 >= 7 || i20 >= 7) && i22 < i21 - 7) || i20 >= 7) && (i22 >= 7 || i20 < i19 - 7)) {
                            int i23 = i7;
                            if (i23 == 0) {
                                paint2 = paint;
                                f8 = f11;
                                i15 = i19;
                                i16 = i20;
                                i17 = i21;
                                i18 = i22;
                                byteMatrix = byteMatrix2;
                                d4 = d14;
                                d5 = d2;
                                canvas2 = canvas;
                                f9 = f7;
                                double d15 = (((double) (1.0f - f2)) * d5) / d;
                                double d16 = d3 + (((double) i16) * d5) + d15;
                                double d17 = d10 + (((double) i18) * d5) + d15;
                                double d18 = ((double) f2) * d5;
                                canvas2.drawRoundRect(((float) d17) + f4, ((float) d16) + f4, ((float) (d17 + d18)) - f4, ((float) (d16 + d18)) - f4, f5, f5, paint2);
                            } else if (i23 == 1) {
                                paint2 = paint;
                                f8 = f11;
                                i15 = i19;
                                i16 = i20;
                                i17 = i21;
                                int i24 = i22;
                                byteMatrix = byteMatrix2;
                                d4 = d14;
                                d5 = d2;
                                canvas2 = canvas;
                                f9 = f7;
                                double d19 = f9;
                                i18 = i24;
                                canvas2.drawCircle((float) (d10 + (((double) i18) * d5) + d19), (float) (d3 + (((double) i16) * d5) + d19), d13 == AudioStats.AUDIO_AMPLITUDE_NONE ? f9 * f2 : ((int) ((((double) 1) + ((java.lang.Math.random() - 0.5d) * d13 * d)) * d19)) * f2, paint2);
                            } else {
                                f8 = f11;
                                double d20 = (((double) (1.0f - f2)) * d2) / d;
                                double d21 = d3 + (((double) i20) * d2) + d20;
                                byteMatrix = byteMatrix2;
                                double d22 = i22;
                                i17 = i21;
                                int i25 = i22;
                                double d23 = 6.283185307179586d / ((double) i23);
                                android.graphics.Path path = new android.graphics.Path();
                                double d24 = d23 / d;
                                double d25 = d24 - 1.5707963267948966d;
                                f9 = f7;
                                i15 = i19;
                                int i26 = i20;
                                double d26 = f9;
                                double d27 = d10 + (d22 * d2) + d20 + d26;
                                path.moveTo((float) d27, (float) d21);
                                double d28 = d21 + d26;
                                d5 = d2;
                                path.lineTo((float) ((java.lang.Math.cos(d25) * d14) + d27), (float) (d28 + (java.lang.Math.sin(d25) * d14)));
                                int i27 = 1;
                                while (i27 < i23) {
                                    double d29 = ((double) i27) * d23;
                                    double d30 = d29 - 1.5707963267948966d;
                                    int i28 = i27;
                                    double d31 = f2;
                                    double d32 = d14;
                                    path.lineTo((float) (d27 + (java.lang.Math.cos(d30) * d26 * d31)), (float) ((java.lang.Math.sin(d30) * d26 * d31) + d28));
                                    double d33 = (d29 + d24) - 1.5707963267948966d;
                                    path.lineTo((float) ((java.lang.Math.cos(d33) * d32) + d27), (float) ((java.lang.Math.sin(d33) * d32) + d28));
                                    i27 = i28 + 1;
                                    i23 = i7;
                                    d14 = d32;
                                }
                                d4 = d14;
                                path.close();
                                canvas2 = canvas;
                                paint2 = paint;
                                canvas2.drawPath(path, paint2);
                                i18 = i25;
                                i16 = i26;
                            }
                        } else {
                            paint2 = paint;
                            f8 = f11;
                            i15 = i19;
                            i16 = i20;
                            i17 = i21;
                            i18 = i22;
                            byteMatrix = byteMatrix2;
                        }
                    } else {
                        paint2 = paint;
                        f8 = f11;
                        i15 = i19;
                        i16 = i20;
                        i17 = i21;
                        i18 = i22;
                    }
                    d4 = d14;
                    d5 = d2;
                    canvas2 = canvas;
                    f9 = f7;
                }
                i21 = i17;
                paint = paint2;
                canvas = canvas2;
                f7 = f9;
                d2 = d5;
                d14 = d4;
                f11 = f8;
                i22 = i18 + 1;
                i20 = i16;
                i19 = i15;
            }
            i13 = i21;
            i20++;
            i19 = i19;
            d2 = d2;
            f11 = f11;
        }
        OLrzqt(canvas, bitmap, i11, i10, i8, i9);
        return bitmap2;
    }

    public final void OLrzqt(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, int i, int i2, int i3, int i4) {
        try {
            int iSave = canvas.save();
            float f = i;
            float f2 = i2;
            float f3 = 2;
            canvas.scale(i3 / f, i4 / f2, f / f3, f2 / f3);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, new RectF(0.0f, 0.0f, f, f2), (android.graphics.Paint) null);
            canvas.restoreToCount(iSave);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void copydefault(int i, int i2, int i3, int i4, float f, android.graphics.Paint paint, android.graphics.Canvas canvas, int i5, BitMatrix bitMatrix, float f2, float f3) {
        float f4 = 2;
        float f5 = f * f4;
        float f6 = i3 * f5;
        float f7 = i4 * f5;
        float f8 = (i - f6) / f4;
        float f9 = (i2 - f7) / f4;
        float f10 = f6 + f8;
        float f11 = f7 + f9;
        float f12 = 7 * f;
        float f13 = 3;
        float f14 = f13 * f * f2;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(i5);
        paint2.setXfermode(paint.getXfermode());
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(f5 * f2);
        float f15 = f + f13;
        float f16 = f / 4;
        float f17 = f8 + f14 + f15 + f16;
        float f18 = f9 + f14 + f15 + f16;
        float f19 = f8 + f12;
        float f20 = (f19 + f14) - f16;
        float f21 = f9 + f12;
        float f22 = (f21 + f14) - f16;
        canvas.drawRoundRect(f17, f18, f20, f22, f3, f3, paint);
        float f23 = f10 - f12;
        canvas.drawRoundRect((f23 - f14) + f16, f18, ((f10 - f14) - f15) - f16, f22, f3, f3, paint);
        float f24 = f11 - f12;
        canvas.drawRoundRect(f17, (f24 - f14) + f16, f20, ((f11 - f14) - f15) - f16, f3, f3, paint);
        float f25 = 6 * f;
        float f26 = f8 + f15;
        float f27 = f9 + f15;
        float f28 = f19 + f25;
        float f29 = f21 + f25;
        canvas.drawRoundRect(f26, f27, f28, f29, f3, f3, paint2);
        canvas.drawRoundRect(f10 - f15, f27, f23 - f25, f29, f3, f3, paint2);
        canvas.drawRoundRect(f26, f24 - f25, f28, f11 - f15, f3, f3, paint2);
        bitMatrix.setRegion(0, 0, 7, 7);
        bitMatrix.setRegion(i3 - 7, 0, 7, 7);
        bitMatrix.setRegion(0, i4 - 7, 7, 7);
    }

    public final void EZpvd(int i, int i2, int i3, int i4, float f, android.graphics.Paint paint, android.graphics.Canvas canvas, int i5, BitMatrix bitMatrix, float f2) {
        float f3 = 2;
        float f4 = f * f3;
        float f5 = i3 * f4;
        float f6 = i4 * f4;
        float f7 = (i - f5) / f3;
        float f8 = (i2 - f6) / f3;
        float f9 = 7 * f;
        float f10 = 3 * f * f2;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(i5);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(f4 * f2);
        float f11 = f7 + f9;
        float f12 = f8 + f9;
        canvas.drawCircle(f11, f12, f10, paint);
        float f13 = (f5 + f7) - f9;
        canvas.drawCircle(f13, f12, f10, paint);
        float f14 = (f6 + f8) - f9;
        canvas.drawCircle(f11, f14, f10, paint);
        float f15 = 6 * f;
        canvas.drawCircle(f11, f12, f15, paint2);
        canvas.drawCircle(f13, f12, f15, paint2);
        canvas.drawCircle(f11, f14, f15, paint2);
        bitMatrix.setRegion(0, 0, 7, 7);
        bitMatrix.setRegion(i3 - 7, 0, 7, 7);
        bitMatrix.setRegion(0, i4 - 7, 7, 7);
    }
}
