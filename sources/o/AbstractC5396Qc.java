package o;

import com.bumptech.glide.Glide;

/* JADX INFO: renamed from: o.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5396Qc implements NN<android.graphics.Bitmap> {
    public abstract android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2);

    @Override // o.NN
    public final OC<android.graphics.Bitmap> OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OC<android.graphics.Bitmap> oc, int i, int i2) {
        if (!SI.OLrzqt(i, i2)) {
            throw new java.lang.IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        OG ogOLrzqt = Glide.OLrzqt(context).OLrzqt();
        android.graphics.Bitmap bitmapAEQbTJ = oc.AEQbTJ();
        if (i == Integer.MIN_VALUE) {
            i = bitmapAEQbTJ.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapAEQbTJ.getHeight();
        }
        android.graphics.Bitmap bitmapAEQbTJ2 = AEQbTJ(ogOLrzqt, bitmapAEQbTJ, i, i2);
        return bitmapAEQbTJ.equals(bitmapAEQbTJ2) ? oc : C5398Qe.copydefault(bitmapAEQbTJ2, ogOLrzqt);
    }
}
