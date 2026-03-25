package o;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: o.Ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5428Ri implements InterfaceC5429Rj<android.graphics.Bitmap, byte[]> {
    public final int AEQbTJ;
    public final Bitmap.CompressFormat OLrzqt;

    public C5428Ri() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C5428Ri(@androidx.annotation.NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.OLrzqt = compressFormat;
        this.AEQbTJ = i;
    }

    @Override // o.InterfaceC5429Rj
    public OC<byte[]> KWHzl(@androidx.annotation.NonNull OC<android.graphics.Bitmap> oc, @androidx.annotation.NonNull NM nm) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        oc.AEQbTJ().compress(this.OLrzqt, this.AEQbTJ, byteArrayOutputStream);
        oc.djBIcL();
        return new QG(byteArrayOutputStream.toByteArray());
    }
}
