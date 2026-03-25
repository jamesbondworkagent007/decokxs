package o;

import org.bouncycastle.jcajce.provider.digest.Keccak;

/* JADX INFO: renamed from: o.zvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60086zvI {
    private C60086zvI() {
    }

    public static java.lang.String copydefault(java.lang.String str) {
        return C60088zvK.KWHzl(AEQbTJ(C60088zvK.copydefault(str)));
    }

    public static byte[] KWHzl(byte[] bArr, int i, int i2) {
        Keccak.Digest256 digest256 = new Keccak.Digest256();
        digest256.update(bArr, i, i2);
        return digest256.digest();
    }

    public static byte[] AEQbTJ(byte[] bArr) {
        return KWHzl(bArr, 0, bArr.length);
    }
}
