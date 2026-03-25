package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43149rjo extends AbstractC5396Qc {
    public float AYXKKw;
    public final byte[] AhwBna;
    public android.content.Context EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.lang.String copydefault;
    public final android.graphics.Paint djBIcL;
    public final android.text.TextPaint gEmmrt;
    public float valueOf;

    public C43149rjo(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = context;
        this.copydefault = str;
        this.KWHzl = "com.okinc.mln_ui.ui.NftDefaultImgTransform";
        java.nio.charset.Charset charset = NH.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "com.okinc.mln_ui.ui.NftDefaultImgTransform".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.AhwBna = bytes;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        this.gEmmrt = textPaint;
        this.djBIcL = new android.graphics.Paint();
        this.OLrzqt = C33052mpF.dp2px$default(18.0f, null, 1, null);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        return obj instanceof C43149rjo;
    }

    @Override // o.NH
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        messageDigest.update(this.AhwBna);
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@NotNull OG og, @NotNull android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmapCopydefault;
        Intrinsics.checkNotNullParameter(og, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            float f = i;
            this.gEmmrt.setTextSize(C33052mpF.sp2pxFloat$default((10.0f * f) / C33052mpF.dp2px$default(220.0f, null, 1, null), null, 1, null));
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            android.graphics.Bitmap bitmapCopydefault2 = og.copydefault(i, i2, config);
            Intrinsics.checkNotNullExpressionValue(bitmapCopydefault2, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault2);
            if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                float width2 = f / bitmap.getWidth();
                float height2 = i2 / bitmap.getHeight();
                matrix.postScale(width2, height2, 0.0f, 0.0f);
                bitmapCopydefault = og.copydefault((int) (width * width2), (int) (height * height2), config);
                new android.graphics.Canvas(bitmapCopydefault).drawBitmap(bitmap, matrix, this.djBIcL);
            } else {
                bitmapCopydefault = bitmap.copy(config, false);
            }
            canvas.drawBitmap(bitmapCopydefault, 0.0f, 0.0f, this.djBIcL);
            this.valueOf = i - (this.OLrzqt * 2);
            this.AYXKKw = i2;
            float f2 = 2;
            canvas.drawBitmap(AEQbTJ(), (f - r0.getWidth()) / f2, (this.AYXKKw - r0.getHeight()) / f2, this.djBIcL);
            return bitmapCopydefault2;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final android.graphics.Bitmap AEQbTJ() {
        float fMin = java.lang.Math.min(this.gEmmrt.measureText(this.copydefault), this.valueOf);
        java.lang.String str = this.copydefault;
        android.text.StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str == null ? "" : str, 0, str != null ? str.length() : 0, this.gEmmrt, (int) fMin).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        Intrinsics.copydefault(staticLayoutBuild);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(staticLayoutBuild.getWidth(), java.lang.Math.min(staticLayoutBuild.getHeight(), (int) this.valueOf), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        staticLayoutBuild.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
