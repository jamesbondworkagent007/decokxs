package o;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5367Oz implements NH {
    public static final SD<java.lang.Class<?>, byte[]> OLrzqt = new SD<>(50);
    public final int AYXKKw;
    public final NH AhwBna;
    public final OF EZpvd;
    public final java.lang.Class<?> KWHzl;
    public final int copydefault;
    public final NH djBIcL;
    public final NN<?> gEmmrt;
    public final NM valueOf;

    public C5367Oz(OF of, NH nh, NH nh2, int i, int i2, NN<?> nn, java.lang.Class<?> cls, NM nm) {
        this.EZpvd = of;
        this.djBIcL = nh;
        this.AhwBna = nh2;
        this.AYXKKw = i;
        this.copydefault = i2;
        this.gEmmrt = nn;
        this.KWHzl = cls;
        this.valueOf = nm;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5367Oz) {
            C5367Oz c5367Oz = (C5367Oz) obj;
            if (this.copydefault == c5367Oz.copydefault && this.AYXKKw == c5367Oz.AYXKKw && SI.AEQbTJ(this.gEmmrt, c5367Oz.gEmmrt) && this.KWHzl.equals(c5367Oz.KWHzl) && this.djBIcL.equals(c5367Oz.djBIcL) && this.AhwBna.equals(c5367Oz.AhwBna) && this.valueOf.equals(c5367Oz.valueOf)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        int iHashCode = (((((this.djBIcL.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw) * 31) + this.copydefault;
        NN<?> nn = this.gEmmrt;
        if (nn != null) {
            iHashCode = (iHashCode * 31) + nn.hashCode();
        }
        return (((iHashCode * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.EZpvd.AEQbTJ(8, byte[].class);
        java.nio.ByteBuffer.wrap(bArr).putInt(this.AYXKKw).putInt(this.copydefault).array();
        this.AhwBna.AEQbTJ(messageDigest);
        this.djBIcL.AEQbTJ(messageDigest);
        messageDigest.update(bArr);
        NN<?> nn = this.gEmmrt;
        if (nn != null) {
            nn.AEQbTJ(messageDigest);
        }
        this.valueOf.AEQbTJ(messageDigest);
        messageDigest.update(AEQbTJ());
        this.EZpvd.EZpvd(bArr);
    }

    public final byte[] AEQbTJ() {
        SD<java.lang.Class<?>, byte[]> sd = OLrzqt;
        byte[] bArrAEQbTJ = sd.AEQbTJ(this.KWHzl);
        if (bArrAEQbTJ != null) {
            return bArrAEQbTJ;
        }
        byte[] bytes = this.KWHzl.getName().getBytes(NH.AEQbTJ);
        sd.copydefault(this.KWHzl, bytes);
        return bytes;
    }

    public java.lang.String toString() {
        return "ResourceCacheKey{sourceKey=" + this.djBIcL + ", signature=" + this.AhwBna + ", width=" + this.AYXKKw + ", height=" + this.copydefault + ", decodedResourceClass=" + this.KWHzl + ", transformation='" + this.gEmmrt + "', options=" + this.valueOf + AbstractJsonLexerKt.END_OBJ;
    }
}
