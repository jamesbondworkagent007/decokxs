package o;

import android.graphics.ImageDecoder;

/* JADX INFO: renamed from: o.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5397Qd implements NL<java.nio.ByteBuffer, android.graphics.Bitmap> {
    public final PX EZpvd = new PX();

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return this.EZpvd.cm_(ImageDecoder.createSource(byteBuffer), i, i2, nm);
    }
}
