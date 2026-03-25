package o;

import android.graphics.BitmapShader;
import android.graphics.Shader;

/* JADX INFO: renamed from: o.umE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49311umE {
    public boolean AEQbTJ;
    public C49314umH AhwBna;
    public android.graphics.Bitmap EZpvd;
    public android.content.Context KWHzl;
    public android.graphics.Bitmap OLrzqt;
    public android.graphics.Bitmap copydefault;
    public C49316umJ djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.Bitmap copydefault() {
        return this.OLrzqt;
    }

    public C49311umE(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, @androidx.annotation.Nullable C49314umH c49314umH, @androidx.annotation.Nullable java.util.List<C49314umH> list, @androidx.annotation.Nullable C49316umJ c49316umJ, @androidx.annotation.Nullable java.util.List<C49316umJ> list2, boolean z) {
        this.KWHzl = context;
        this.AEQbTJ = z;
        this.AhwBna = c49314umH;
        this.copydefault = bitmap;
        this.djBIcL = c49316umJ;
        this.EZpvd = bitmap;
        this.OLrzqt = bitmap;
        EZpvd(c49314umH);
        copydefault(list);
        OLrzqt(this.djBIcL);
        EZpvd(list2);
    }

    public final void EZpvd(C49314umH c49314umH) {
        if (c49314umH == null || this.copydefault == null) {
            return;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAlpha(c49314umH.KWHzl());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(this.copydefault.getWidth(), this.copydefault.getHeight(), this.copydefault.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(this.EZpvd, 0.0f, 0.0f, (android.graphics.Paint) null);
        android.graphics.Bitmap bitmapEZpvd = EZpvd(C49315umI.EZpvd(c49314umH.AEQbTJ(), (float) c49314umH.copydefault(), this.copydefault), (int) c49314umH.OLrzqt().EZpvd());
        if (this.AEQbTJ) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmapEZpvd, tileMode, tileMode));
            canvas.drawRect(canvas.getClipBounds(), paint);
        } else {
            canvas.drawBitmap(bitmapEZpvd, ((float) c49314umH.OLrzqt().copydefault()) * this.copydefault.getWidth(), ((float) c49314umH.OLrzqt().KWHzl()) * this.copydefault.getHeight(), paint);
        }
        this.EZpvd = bitmapCreateBitmap;
        this.OLrzqt = bitmapCreateBitmap;
    }

    public final void copydefault(java.util.List<C49314umH> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                EZpvd(list.get(i));
            }
        }
    }

    public final void OLrzqt(C49316umJ c49316umJ) {
        if (c49316umJ == null || this.copydefault == null) {
            return;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAlpha(c49316umJ.KWHzl());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(this.copydefault.getWidth(), this.copydefault.getHeight(), this.copydefault.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(this.EZpvd, 0.0f, 0.0f, (android.graphics.Paint) null);
        android.graphics.Bitmap bitmapEZpvd = EZpvd(C49315umI.KWHzl(this.KWHzl, c49316umJ, this.AEQbTJ), (int) c49316umJ.AEQbTJ().EZpvd());
        if (this.AEQbTJ) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmapEZpvd, tileMode, tileMode));
            canvas.drawRect(canvas.getClipBounds(), paint);
        } else {
            canvas.drawBitmap(bitmapEZpvd, ((float) c49316umJ.AEQbTJ().copydefault()) * this.copydefault.getWidth(), ((float) c49316umJ.AEQbTJ().KWHzl()) * this.copydefault.getHeight(), paint);
        }
        this.EZpvd = bitmapCreateBitmap;
        this.OLrzqt = bitmapCreateBitmap;
    }

    public final void EZpvd(java.util.List<C49316umJ> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                OLrzqt(list.get(i));
            }
        }
    }

    public final android.graphics.Bitmap EZpvd(android.graphics.Bitmap bitmap, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
