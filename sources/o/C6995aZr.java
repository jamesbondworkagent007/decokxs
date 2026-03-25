package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import kotlin.jvm.internal.Intrinsics;
import o.mAQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6995aZr extends android.view.View {
    public double AEQbTJ;
    public android.graphics.Bitmap AYXKKw;
    public android.graphics.Bitmap AhwBna;
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public double OLrzqt;
    public final double copydefault;
    public android.graphics.Matrix djBIcL;
    public android.graphics.Bitmap gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMContentBgBitmap(android.graphics.Bitmap bitmap) {
        this.AhwBna = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMContentBitmap(android.graphics.Bitmap bitmap) {
        this.gEmmrt = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMContentPadding(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMLogoBitmap(android.graphics.Bitmap bitmap) {
        this.AYXKKw = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMMatrix(@NotNull android.graphics.Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "");
        this.djBIcL = matrix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6995aZr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = new android.graphics.Matrix();
        this.valueOf = 12;
        this.copydefault = 43.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6995aZr(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.djBIcL = new android.graphics.Matrix();
        this.valueOf = 12;
        this.copydefault = 43.0d;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mAQ.ActionBar.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.valueOf = (int) typedArrayObtainStyledAttributes.getDimension(mAQ.ActionBar.copydefault, this.valueOf);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6995aZr(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.djBIcL = new android.graphics.Matrix();
        this.valueOf = 12;
        this.copydefault = 43.0d;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.gEmmrt == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        double d = width < height ? width : height;
        double d2 = width;
        double d3 = height;
        android.graphics.Bitmap bitmap = this.AhwBna;
        if (bitmap != null) {
            Intrinsics.copydefault(bitmap);
            double width2 = d / ((double) bitmap.getWidth());
            this.djBIcL.reset();
            float f = (float) width2;
            this.djBIcL.postScale(f, f);
            this.djBIcL.postTranslate((float) ((d2 - d) * 0.5d), (float) ((d3 - d) * 0.5d));
            android.graphics.Bitmap bitmap2 = this.AhwBna;
            Intrinsics.copydefault(bitmap2);
            canvas.drawBitmap(bitmap2, this.djBIcL, null);
        }
        double d4 = d - ((double) (this.valueOf * 2));
        android.graphics.Bitmap bitmap3 = this.gEmmrt;
        Intrinsics.copydefault(bitmap3);
        double width3 = d4 / ((double) bitmap3.getWidth());
        this.djBIcL.reset();
        float f2 = (float) width3;
        this.djBIcL.postScale(f2, f2);
        this.djBIcL.postTranslate((float) ((d2 - d4) * 0.5d), (float) ((d3 - d4) * 0.5d));
        android.graphics.Bitmap bitmap4 = this.gEmmrt;
        Intrinsics.copydefault(bitmap4);
        canvas.drawBitmap(bitmap4, this.djBIcL, null);
        android.graphics.Bitmap bitmap5 = this.AYXKKw;
        if (bitmap5 == null) {
            return;
        }
        double d5 = this.AEQbTJ;
        if (d5 == AudioStats.AUDIO_AMPLITUDE_NONE && this.OLrzqt == AudioStats.AUDIO_AMPLITUDE_NONE) {
            double d6 = d4 * 0.19d;
            Intrinsics.copydefault(bitmap5);
            double width4 = d6 / ((double) bitmap5.getWidth());
            this.djBIcL.reset();
            float f3 = (float) width4;
            this.djBIcL.postScale(f3, f3);
            this.djBIcL.postTranslate((float) ((d2 - d6) * 0.5d), (float) ((d3 - d6) * 0.5d));
        } else {
            Intrinsics.copydefault(bitmap5);
            double width5 = d5 / ((double) bitmap5.getWidth());
            double d7 = this.OLrzqt;
            android.graphics.Bitmap bitmap6 = this.AYXKKw;
            Intrinsics.copydefault(bitmap6);
            double height2 = d7 / ((double) bitmap6.getHeight());
            double d8 = this.AEQbTJ;
            double d9 = this.OLrzqt;
            this.djBIcL.reset();
            this.djBIcL.postScale((float) width5, (float) height2);
            this.djBIcL.postTranslate((float) ((d2 - d8) * 0.5d), (float) ((d3 - d9) * 0.5d));
        }
        android.graphics.Bitmap bitmap7 = this.AYXKKw;
        Intrinsics.copydefault(bitmap7);
        canvas.drawBitmap(bitmap7, this.djBIcL, null);
    }

    public static /* synthetic */ void setContent$default(C6995aZr c6995aZr, java.lang.String str, ErrorCorrectionLevel errorCorrectionLevel, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c6995aZr.setContent(str, errorCorrectionLevel, z);
    }

    public final void setContent(java.lang.String str, @NotNull ErrorCorrectionLevel errorCorrectionLevel, boolean z) {
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "");
        if (str == null) {
            this.EZpvd = null;
            this.gEmmrt = null;
            invalidate();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                return;
            }
            this.EZpvd = str;
            this.gEmmrt = C6993aZp.convert$default(C6993aZp.KWHzl, str, errorCorrectionLevel, z, 0, 8, null);
            invalidate();
        }
    }

    public static /* synthetic */ void setContent$default(C6995aZr c6995aZr, java.lang.String str, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        c6995aZr.setContent(str, z, f);
    }

    public final void setContent(java.lang.String str, boolean z, float f) {
        if (str == null) {
            this.EZpvd = null;
            this.gEmmrt = null;
            invalidate();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                return;
            }
            this.EZpvd = str;
            android.graphics.Bitmap bitmapConvert$default = C6993aZp.convert$default(C6993aZp.KWHzl, str, z, 0, 4, null);
            if (f > 0.0f && bitmapConvert$default != null) {
                bitmapConvert$default = copydefault(bitmapConvert$default, f);
            }
            this.gEmmrt = bitmapConvert$default;
            invalidate();
        }
    }

    public static /* synthetic */ void setContent$default(C6995aZr c6995aZr, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c6995aZr.setContent(str, z, i);
    }

    public final void setContent(java.lang.String str, boolean z, int i) {
        if (str == null) {
            this.EZpvd = null;
            this.gEmmrt = null;
            invalidate();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                return;
            }
            this.EZpvd = str;
            this.gEmmrt = C6993aZp.KWHzl.copydefault(str, z, i);
            invalidate();
        }
    }

    public static /* synthetic */ void setContent$default(C6995aZr c6995aZr, java.lang.String str, boolean z, Bitmap.Config config, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        c6995aZr.setContent(str, z, config, i, i2);
    }

    public final void setContent(java.lang.String str, boolean z, @NotNull Bitmap.Config config, int i, int i2) {
        Intrinsics.checkNotNullParameter(config, "");
        if (str == null) {
            this.EZpvd = null;
            this.gEmmrt = null;
            invalidate();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                return;
            }
            this.EZpvd = str;
            C6993aZp c6993aZp = C6993aZp.KWHzl;
            this.gEmmrt = c6993aZp.KWHzl(str, c6993aZp.OLrzqt(), c6993aZp.OLrzqt(), config, z, i, i2);
            invalidate();
        }
    }

    public final void setLogoRes(int i) {
        if (i == 0) {
            this.AYXKKw = null;
            invalidate();
        } else {
            this.AYXKKw = BitmapFactory.decodeResource(getResources(), i);
            invalidate();
        }
    }

    public final void setLogoBitmap(android.graphics.Bitmap bitmap, double d, double d2) {
        if (bitmap == null) {
            this.AYXKKw = null;
            invalidate();
            return;
        }
        if (d >= d2) {
            this.KWHzl = true;
        }
        if (this.KWHzl) {
            double d3 = this.copydefault;
            if (d >= d3) {
                this.AEQbTJ = d3;
                d2 *= d3 / d;
            }
            this.OLrzqt = d2;
            this.AYXKKw = bitmap;
            invalidate();
        }
        double d4 = this.copydefault;
        if (d2 >= d4) {
            this.OLrzqt = d4;
            this.AEQbTJ = d * (d4 / d2);
            this.AYXKKw = bitmap;
            invalidate();
        }
        this.AEQbTJ = d;
        this.OLrzqt = d2;
        this.AYXKKw = bitmap;
        invalidate();
    }

    public final void setLogoBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            this.AYXKKw = null;
            invalidate();
        } else {
            this.AYXKKw = bitmap;
            invalidate();
        }
    }

    public final void setContentBgRes(int i) {
        if (i == 0) {
            this.AhwBna = null;
            invalidate();
        } else {
            this.AhwBna = BitmapFactory.decodeResource(getResources(), i);
            invalidate();
        }
    }

    public final void setContentPadding(int i) {
        if (i < 0) {
            return;
        }
        this.valueOf = i;
        invalidate();
    }

    public final android.graphics.Bitmap copydefault(android.graphics.Bitmap bitmap, float f) {
        android.graphics.Bitmap bitmapCreateBitmap;
        try {
            try {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            } catch (java.lang.OutOfMemoryError unused) {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
            }
            Intrinsics.copydefault(bitmapCreateBitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setDither(true);
            paint.setAntiAlias(true);
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            canvas.drawRoundRect(new RectF(rect), f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return bitmapCreateBitmap;
        } catch (java.lang.OutOfMemoryError unused2) {
            return null;
        }
    }
}
