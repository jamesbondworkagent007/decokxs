package o;

import java.security.InvalidKeyException;

/* JADX INFO: renamed from: o.ywE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C58166ywE implements InterfaceC58169ywH {
    public int EZpvd;
    public java.lang.String KWHzl;
    public javax.crypto.Mac OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C58166ywE(java.lang.String str) {
        this.KWHzl = str;
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(str);
            this.OLrzqt = mac;
            this.EZpvd = mac.getMacLength();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58169ywH
    public void AEQbTJ(byte[] bArr) {
        try {
            this.OLrzqt.init(new javax.crypto.spec.SecretKeySpec(bArr, this.KWHzl));
        } catch (InvalidKeyException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58169ywH
    public int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58169ywH
    public byte[] OLrzqt(byte[] bArr) {
        return this.OLrzqt.doFinal(bArr);
    }
}
