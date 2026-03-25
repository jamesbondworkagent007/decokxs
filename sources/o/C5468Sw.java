package o;

import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5468Sw implements NH {
    public final int OLrzqt;
    public final NH copydefault;

    public static NH EZpvd(@androidx.annotation.NonNull android.content.Context context) {
        return new C5468Sw(context.getResources().getConfiguration().uiMode & 48, C5464Ss.EZpvd(context));
    }

    public C5468Sw(int i, NH nh) {
        this.OLrzqt = i;
        this.copydefault = nh;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5468Sw) {
            C5468Sw c5468Sw = (C5468Sw) obj;
            if (this.OLrzqt == c5468Sw.OLrzqt && this.copydefault.equals(c5468Sw.copydefault)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return SI.OLrzqt(this.copydefault, this.OLrzqt);
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        this.copydefault.AEQbTJ(messageDigest);
        messageDigest.update(java.nio.ByteBuffer.allocate(4).putInt(this.OLrzqt).array());
    }
}
