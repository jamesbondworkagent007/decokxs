package o;

import android.graphics.ImageDecoder;

/* JADX INFO: renamed from: o.Qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5419Qz implements NL<java.io.InputStream, android.graphics.Bitmap> {
    public final PX AEQbTJ = new PX();

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return this.AEQbTJ.cm_(ImageDecoder.createSource(C5466Su.EZpvd(inputStream)), i, i2, nm);
    }
}
