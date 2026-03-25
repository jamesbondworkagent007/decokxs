package o;

import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5417Qx extends AbstractC5396Qc {
    public static final byte[] EZpvd = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(NH.AEQbTJ);
    public final int copydefault;

    public C5417Qx(int i) {
        SE.copydefault(i > 0, "roundingRadius must be greater than 0.");
        this.copydefault = i;
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        return QB.AEQbTJ(og, bitmap, this.copydefault);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C5417Qx) && this.copydefault == ((C5417Qx) obj).copydefault;
    }

    @Override // o.NH
    public int hashCode() {
        return SI.KWHzl(-569625254, SI.EZpvd(this.copydefault));
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        messageDigest.update(EZpvd);
        messageDigest.update(java.nio.ByteBuffer.allocate(4).putInt(this.copydefault).array());
    }
}
