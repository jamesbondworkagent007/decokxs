package o;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class PZ<DataType> implements NL<DataType, BitmapDrawable> {
    public final NL<DataType, android.graphics.Bitmap> KWHzl;
    public final android.content.res.Resources OLrzqt;

    public PZ(@androidx.annotation.NonNull android.content.res.Resources resources, @androidx.annotation.NonNull NL<DataType, android.graphics.Bitmap> nl) {
        this.OLrzqt = (android.content.res.Resources) SE.OLrzqt(resources);
        this.KWHzl = (NL) SE.OLrzqt(nl);
    }

    @Override // o.NL
    public boolean copydefault(@androidx.annotation.NonNull DataType datatype, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return this.KWHzl.copydefault(datatype, nm);
    }

    @Override // o.NL
    public OC<BitmapDrawable> copydefault(@androidx.annotation.NonNull DataType datatype, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return C5418Qy.copydefault(this.OLrzqt, this.KWHzl.copydefault(datatype, i, i2, nm));
    }
}
