package o;

import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yCW implements NN<android.graphics.Bitmap> {
    public abstract android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2);

    public abstract java.lang.String AEQbTJ();

    @Override // o.NN
    public final OC<android.graphics.Bitmap> OLrzqt(android.content.Context context, OC<android.graphics.Bitmap> oc, int i, int i2) {
        if (!SI.OLrzqt(i, i2)) {
            throw new java.lang.IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        OG ogOLrzqt = Glide.OLrzqt(context).OLrzqt();
        android.graphics.Bitmap bitmapAEQbTJ = oc.AEQbTJ();
        if (i == Integer.MIN_VALUE) {
            i = bitmapAEQbTJ.getWidth();
        }
        int i3 = i;
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapAEQbTJ.getHeight();
        }
        android.graphics.Bitmap bitmapAEQbTJ2 = AEQbTJ(context.getApplicationContext(), ogOLrzqt, bitmapAEQbTJ, i3, i2);
        return bitmapAEQbTJ.equals(bitmapAEQbTJ2) ? oc : C5398Qe.copydefault(bitmapAEQbTJ2, ogOLrzqt);
    }

    @Override // o.NH
    public void AEQbTJ(MessageDigest messageDigest) {
        messageDigest.update(AEQbTJ().getBytes());
    }
}
