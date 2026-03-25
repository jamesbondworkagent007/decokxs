package o;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class PX implements NL<ImageDecoder.Source, android.graphics.Bitmap> {
    public final OG OLrzqt = new OM();

    public boolean cn_(@androidx.annotation.NonNull ImageDecoder.Source source, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, o.NM] */
    /* JADX DEBUG: Return type fixed from 'o.OC' to match base method */
    @Override // o.NL
    public /* synthetic */ OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull ImageDecoder.Source source, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return cm_(PY.co_(source), i, i2, nm);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, o.NM] */
    @Override // o.NL
    public /* synthetic */ boolean copydefault(@androidx.annotation.NonNull ImageDecoder.Source source, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return cn_(PY.co_(source), nm);
    }

    public OC<android.graphics.Bitmap> cm_(@androidx.annotation.NonNull ImageDecoder.Source source, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        android.graphics.Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i, i2, nm));
        if (android.util.Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C5398Qe(bitmapDecodeBitmap, this.OLrzqt);
    }
}
