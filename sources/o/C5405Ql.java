package o;

import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5405Ql extends AbstractC5396Qc {
    public static final byte[] EZpvd = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(NH.AEQbTJ);

    @Override // o.NH
    public int hashCode() {
        return -599754482;
    }

    @Override // o.AbstractC5396Qc
    public android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        return QB.AEQbTJ(og, bitmap, i, i2);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        return obj instanceof C5405Ql;
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        messageDigest.update(EZpvd);
    }
}
