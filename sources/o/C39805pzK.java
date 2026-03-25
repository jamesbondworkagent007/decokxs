package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39805pzK extends android.view.View {
    public android.graphics.Paint AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public android.graphics.Paint EZpvd;
    public android.graphics.Paint KWHzl;
    public android.graphics.Bitmap OLrzqt;
    public float copydefault;
    public float djBIcL;
    public android.graphics.Path valueOf;

    public C39805pzK(android.content.Context context) {
        super(context);
        this.copydefault = 50.0f;
        this.AYXKKw = 2.0f;
        copydefault();
    }

    public C39805pzK(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = 50.0f;
        this.AYXKKw = 2.0f;
        copydefault();
    }

    public C39805pzK(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.copydefault = 50.0f;
        this.AYXKKw = 2.0f;
        copydefault();
    }

    public final void copydefault() {
        int iCopydefault;
        java.lang.String strEZpvd;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.AEQbTJ = paint;
        Intrinsics.copydefault(paint);
        paint.setStyle(Paint.Style.STROKE);
        android.graphics.Paint paint2 = this.AEQbTJ;
        Intrinsics.copydefault(paint2);
        pFN pfn = pFN.OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) pfn.AEQbTJ(), (java.lang.Object) "kline_dark")) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DTwDnp);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QOLQEE);
        }
        paint2.setColor(iCopydefault);
        android.graphics.Paint paint3 = this.AEQbTJ;
        Intrinsics.copydefault(paint3);
        paint3.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        this.EZpvd = new android.graphics.Paint(1);
        if (Intrinsics.EZpvd((java.lang.Object) pfn.AEQbTJ(), (java.lang.Object) "kline_dark")) {
            strEZpvd = EZpvd("#FFFFFF", C33129mqd.djBIcL(C33129mqd.divS$default(50, 255, null, null, null, 14, null)));
        } else {
            strEZpvd = EZpvd("#000000", C33129mqd.djBIcL(C33129mqd.divS$default(50, 255, null, null, null, 14, null)));
        }
        android.graphics.Paint paint4 = this.EZpvd;
        Intrinsics.copydefault(paint4);
        paint4.setShadowLayer(20.0f, 6.0f, 6.0f, Color.parseColor(strEZpvd));
        this.KWHzl = new android.graphics.Paint(1);
        this.valueOf = new android.graphics.Path();
        this.copydefault = C55298xhM.dp2pxFloat$default(50.0f, null, 1, null);
    }

    public final void setBitmapAndPos(@NotNull android.view.View view, double d, double d2) {
        Intrinsics.checkNotNullParameter(view, "");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        this.OLrzqt = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            this.AhwBna = (float) d;
            this.djBIcL = (float) d2;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        int width;
        int height;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.OLrzqt == null) {
            return;
        }
        float f = this.copydefault;
        android.graphics.Paint paint = this.EZpvd;
        Intrinsics.copydefault(paint);
        canvas.drawCircle(f, f, f, paint);
        canvas.save();
        android.graphics.Path path = this.valueOf;
        Intrinsics.copydefault(path);
        path.reset();
        android.graphics.Path path2 = this.valueOf;
        Intrinsics.copydefault(path2);
        float f2 = this.copydefault;
        path2.addCircle(f2, f2, f2, Path.Direction.CW);
        android.graphics.Path path3 = this.valueOf;
        Intrinsics.copydefault(path3);
        canvas.clipPath(path3);
        getBackground().draw(canvas);
        float f3 = 2;
        float f4 = (this.copydefault * f3) / this.AYXKKw;
        float f5 = f4 / f3;
        int iMax = java.lang.Math.max((int) (this.AhwBna - f5), 0);
        Intrinsics.copydefault(this.OLrzqt);
        int iMin = java.lang.Math.min(iMax, C33129mqd.AhwBna(java.lang.Float.valueOf(r4.getWidth() - f4)));
        int iMax2 = java.lang.Math.max((int) (this.djBIcL - f5), 0);
        Intrinsics.copydefault(this.OLrzqt);
        int iMin2 = java.lang.Math.min(iMax2, C33129mqd.AhwBna(java.lang.Float.valueOf(r3.getHeight() - f4)));
        Intrinsics.copydefault(this.OLrzqt);
        if (iMin + f4 > r4.getWidth()) {
            android.graphics.Bitmap bitmap = this.OLrzqt;
            Intrinsics.copydefault(bitmap);
            width = bitmap.getWidth() - iMin;
        } else {
            width = (int) f4;
        }
        Intrinsics.copydefault(this.OLrzqt);
        if (iMin2 + f4 > r5.getHeight()) {
            android.graphics.Bitmap bitmap2 = this.OLrzqt;
            Intrinsics.copydefault(bitmap2);
            height = bitmap2.getHeight() - iMin2;
        } else {
            height = (int) f4;
        }
        android.graphics.Bitmap bitmap3 = this.OLrzqt;
        Intrinsics.copydefault(bitmap3);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap3, iMin, iMin2, width, height);
        this.OLrzqt = bitmapCreateBitmap;
        Intrinsics.copydefault(bitmapCreateBitmap);
        Intrinsics.copydefault(this.OLrzqt);
        int width2 = (int) (r1.getWidth() * this.AYXKKw);
        Intrinsics.copydefault(this.OLrzqt);
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapCreateBitmap, width2, (int) (r2.getHeight() * this.AYXKKw), true);
        this.OLrzqt = bitmapCreateScaledBitmap;
        Intrinsics.copydefault(bitmapCreateScaledBitmap);
        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, this.KWHzl);
        float f6 = this.copydefault;
        android.graphics.Paint paint2 = this.AEQbTJ;
        Intrinsics.copydefault(paint2);
        canvas.drawCircle(f6, f6, f6, paint2);
        canvas.restore();
        android.graphics.Bitmap bitmap4 = this.OLrzqt;
        Intrinsics.copydefault(bitmap4);
        bitmap4.recycle();
        this.OLrzqt = null;
    }

    public final java.lang.String EZpvd(java.lang.String str, float f) {
        int color = Color.parseColor(str);
        int iArgb = Color.argb((int) (f * 255), Color.red(color), Color.green(color), Color.blue(color));
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iArgb)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
