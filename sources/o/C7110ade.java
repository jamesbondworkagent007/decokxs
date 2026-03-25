package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.ade, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7110ade extends C7113adh {
    public static final int[] EZpvd = new int[0];
    public long AYXKKw;
    public long copydefault;
    public long[] djBIcL;
    public byte[] gEmmrt;
    public int OLrzqt = 8208;
    public int[] valueOf = EZpvd;
    public int AEQbTJ = -1;
    public char[] KWHzl = new char[MLKEMEngine.KyberPolyBytes];

    public static int AEQbTJ(int i) {
        return i >> 12;
    }

    public static boolean OLrzqt(int i) {
        return (i & 1536) == 512;
    }

    public static boolean copydefault(int i) {
        return (i & 1792) == 768;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.OLrzqt & 768;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(int i) {
        this.OLrzqt = i | (this.OLrzqt & (-769));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.gEmmrt != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return (this.OLrzqt & 12) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i, boolean z) {
        this.OLrzqt = z ? i | this.OLrzqt : (~i) & this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        int i = this.OLrzqt & (-13);
        if (z) {
            this.OLrzqt = i | 4;
        } else {
            this.OLrzqt = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl(int i) {
        return (i & this.OLrzqt) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return (this.OLrzqt & 1) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL() {
        this.gEmmrt = null;
        this.copydefault = 0L;
        this.djBIcL = null;
        this.valueOf = EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return (this.OLrzqt & WalletImportError.ERROR_CODE_AA_EXIST) >> 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return (this.OLrzqt & 2) != 0;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/adh; */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // o.C7113adh
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C7110ade clone() {
        C7110ade c7110ade = (C7110ade) super.clone();
        c7110ade.KWHzl = (char[]) this.KWHzl.clone();
        return c7110ade;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !C7110ade.class.equals(obj.getClass())) {
            return false;
        }
        C7110ade c7110ade = (C7110ade) obj;
        int i = this.OLrzqt;
        if (i != c7110ade.OLrzqt) {
            return false;
        }
        return ((i & 12) == 0 || this.AYXKKw == c7110ade.AYXKKw) && java.util.Arrays.equals(this.valueOf, c7110ade.valueOf);
    }

    public int hashCode() {
        int i = this.OLrzqt;
        int i2 = i << 8;
        if ((i & 12) != 0) {
            i2 = (int) (((long) i2) ^ this.AYXKKw);
        }
        int length = this.valueOf.length ^ i2;
        int i3 = 0;
        while (true) {
            int[] iArr = this.valueOf;
            if (i3 >= iArr.length) {
                return length;
            }
            length ^= iArr[i3] << i3;
            i3++;
        }
    }

    public void KWHzl(C7048acV c7048acV, int[] iArr, int i, byte[] bArr) {
        int[] iArrCopyOf = i == iArr.length ? iArr : java.util.Arrays.copyOf(iArr, i);
        int length = iArr.length;
        int i2 = length - i;
        if (bArr != null && (i2 != 0 ? !(i2 < 2 || (iArr[i] & 65535) != 0 || (iArr[length - 1] & 65535) == 0) : !AEQbTJ(bArr))) {
            this.gEmmrt = bArr;
            this.valueOf = iArrCopyOf;
            while (i < length && (iArr[i] & 16711680) == 0) {
                i++;
            }
            if (i == length) {
                this.copydefault = 0L;
                this.djBIcL = null;
                return;
            } else {
                this.copydefault = ((long) iArr[length - 1]) & 4294901760L;
                AEQbTJ(iArr, i, length - i);
                return;
            }
        }
        OLrzqt(c7048acV, iArrCopyOf);
    }

    public void OLrzqt(C7048acV c7048acV, int[] iArr) {
        int i;
        int i2;
        if (iArr.length == 0 || (iArr.length == 1 && iArr[0] == 103)) {
            djBIcL();
            return;
        }
        C7114adi c7114adi = new C7114adi();
        c7048acV.EZpvd(iArr, c7114adi);
        int iKWHzl = c7114adi.KWHzl();
        if (iKWHzl == 0) {
            djBIcL();
            return;
        }
        int[] iArrOLrzqt = c7114adi.OLrzqt();
        this.copydefault = ((long) iArrOLrzqt[iKWHzl - 1]) & 4294901760L;
        byte[] bArr = new byte[256];
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < iKWHzl; i5++) {
            int i6 = iArrOLrzqt[i5];
            int i7 = i6 >>> 24;
            while (i4 < i7) {
                bArr[i4] = (byte) (i4 + i6);
                i4++;
            }
            if ((i6 & 16711680) != 0) {
                bArr[i7] = 0;
                if (i3 < 0) {
                    i3 = i5;
                }
                i4 = i7 + 1;
            }
        }
        while (i4 <= 255) {
            bArr[i4] = (byte) i4;
            i4++;
        }
        if (i3 < 0) {
            i = 0;
            i2 = 0;
        } else {
            i = i3;
            i2 = iKWHzl - i3;
        }
        copydefault(iArr, iArrOLrzqt, i, i2, bArr);
    }

    public final void copydefault(int[] iArr, int[] iArr2, int i, int i2, byte[] bArr) {
        if (iArr == null) {
            iArr = EZpvd;
        }
        this.gEmmrt = bArr;
        this.valueOf = iArr;
        AEQbTJ(iArr2, i, i2);
    }

    public final void AEQbTJ(int[] iArr, int i, int i2) {
        if (i2 == 0) {
            this.djBIcL = null;
            return;
        }
        this.djBIcL = new long[i2];
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            this.djBIcL[i3] = ((long) iArr[i]) & BodyPartID.bodyIdMax;
            if (i4 >= i2) {
                return;
            }
            i++;
            i3 = i4;
        }
    }

    public void copydefault(C7110ade c7110ade) {
        if (!c7110ade.AhwBna()) {
            djBIcL();
            return;
        }
        this.copydefault = c7110ade.copydefault;
        this.gEmmrt = c7110ade.gEmmrt;
        this.djBIcL = c7110ade.djBIcL;
        this.valueOf = c7110ade.valueOf;
    }

    public static boolean AEQbTJ(byte[] bArr) {
        for (int i = 1; i < 256; i++) {
            if (bArr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public long copydefault(long j) {
        byte b = this.gEmmrt[((int) j) >>> 24];
        return (b != 0 || j <= 1) ? (j & 16777215) | ((((long) b) & 255) << 24) : KWHzl(j);
    }

    public final long KWHzl(long j) {
        if (j >= this.copydefault) {
            return j;
        }
        int i = 0;
        while (true) {
            long j2 = this.djBIcL[i];
            if ((WebSocketProtocol.PAYLOAD_SHORT_MAX | j) < j2) {
                return j + (((long) ((short) j2)) << 24);
            }
            i++;
        }
    }

    public void valueOf(int i) {
        int i2 = this.OLrzqt;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 15) {
            this.OLrzqt = (i << 12) | (i2 & (-61441));
            return;
        }
        throw new java.lang.IllegalArgumentException("illegal strength value " + i);
    }

    public int AYXKKw() {
        return AEQbTJ(this.OLrzqt);
    }

    public void AEQbTJ(int i, int i2) {
        int i3;
        int i4 = this.OLrzqt & (-113);
        if (i == -1) {
            i3 = i2 & WalletImportError.ERROR_CODE_AA_EXIST;
        } else {
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalArgumentException("illegal maxVariable value " + i);
            }
            i3 = i << 4;
        }
        this.OLrzqt = i3 | i4;
    }

    public static int EZpvd(int i) {
        return OLrzqt(i) ? 65343 : 16191;
    }
}
