package o;

/* JADX INFO: renamed from: o.ywF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C58167ywF {
    public InterfaceC58169ywH AEQbTJ;
    public C58170ywI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C58167ywF() {
        this.KWHzl = null;
        this.AEQbTJ = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C58167ywF(C58170ywI c58170ywI) {
        this.KWHzl = c58170ywI;
        this.AEQbTJ = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(byte[] bArr) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new C58166ywE(this.KWHzl.KWHzl());
        }
        this.AEQbTJ.AEQbTJ(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt(int i, int i2) {
        return (i / i2) + (i % i2 > 0 ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(byte[] bArr, int i, InterfaceC58169ywH interfaceC58169ywH, byte[] bArr2, int i2, int i3) {
        int iEZpvd = interfaceC58169ywH.EZpvd();
        byte[] bArr3 = new byte[iEZpvd];
        byte[] bArrOLrzqt = new byte[bArr2.length + 4];
        java.lang.System.arraycopy(bArr2, 0, bArrOLrzqt, 0, bArr2.length);
        copydefault(bArrOLrzqt, bArr2.length, i3);
        for (int i4 = 0; i4 < i2; i4++) {
            bArrOLrzqt = interfaceC58169ywH.OLrzqt(bArrOLrzqt);
            AEQbTJ(bArr3, bArrOLrzqt);
        }
        java.lang.System.arraycopy(bArr3, 0, bArr, i, iEZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] OLrzqt(java.lang.String str, int i) {
        java.lang.String strEZpvd = this.KWHzl.EZpvd();
        if (str == null) {
            str = "";
        }
        try {
            KWHzl(strEZpvd == null ? str.getBytes() : str.getBytes(strEZpvd));
            if (i == 0) {
                i = this.AEQbTJ.EZpvd();
            }
            return copydefault(this.AEQbTJ, this.KWHzl.OLrzqt(), this.KWHzl.AEQbTJ(), i);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 / 16777216);
        bArr[i + 1] = (byte) (i2 / 65536);
        bArr[i + 2] = (byte) (i2 / 256);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] copydefault(InterfaceC58169ywH interfaceC58169ywH, byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr == null ? new byte[0] : bArr;
        int iEZpvd = interfaceC58169ywH.EZpvd();
        int iOLrzqt = OLrzqt(i2, iEZpvd);
        byte[] bArr3 = new byte[iOLrzqt * iEZpvd];
        int i3 = 0;
        for (int i4 = 1; i4 <= iOLrzqt; i4++) {
            OLrzqt(bArr3, i3, interfaceC58169ywH, bArr2, i, i4);
            i3 += iEZpvd;
        }
        if (i2 - ((iOLrzqt - 1) * iEZpvd) >= iEZpvd) {
            return bArr3;
        }
        byte[] bArr4 = new byte[i2];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, i2);
        return bArr4;
    }
}
