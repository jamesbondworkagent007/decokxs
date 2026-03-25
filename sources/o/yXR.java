package o;

import java.util.NoSuchElementException;
import o.yXD;

/* JADX INFO: loaded from: classes13.dex */
public class yXR extends yXD {
    public final byte[] AEQbTJ;
    public int KWHzl = 0;

    @Override // o.yXD
    public int AEQbTJ() {
        return 0;
    }

    @Override // o.yXD
    public boolean AhwBna() {
        return true;
    }

    public int copydefault() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yXD
    public int gEmmrt() {
        return this.KWHzl;
    }

    public yXR(byte[] bArr) {
        this.AEQbTJ = bArr;
    }

    public byte copydefault(int i) {
        return this.AEQbTJ[i];
    }

    @Override // o.yXD
    public int EZpvd() {
        return this.AEQbTJ.length;
    }

    @Override // o.yXD
    public void copydefault(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.AEQbTJ, i, bArr, i2, i3);
    }

    @Override // o.yXD
    public void OLrzqt(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        outputStream.write(this.AEQbTJ, copydefault() + i, i2);
    }

    @Override // o.yXD
    public java.lang.String AEQbTJ(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(this.AEQbTJ, copydefault(), EZpvd(), str);
    }

    @Override // o.yXD
    public boolean djBIcL() {
        int iCopydefault = copydefault();
        return yXZ.EZpvd(this.AEQbTJ, iCopydefault, EZpvd() + iCopydefault);
    }

    @Override // o.yXD
    public int OLrzqt(int i, int i2, int i3) {
        int iCopydefault = copydefault() + i2;
        return yXZ.AEQbTJ(i, this.AEQbTJ, iCopydefault, i3 + iCopydefault);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yXD) || EZpvd() != ((yXD) obj).EZpvd()) {
            return false;
        }
        if (EZpvd() == 0) {
            return true;
        }
        if (obj instanceof yXR) {
            return AEQbTJ((yXR) obj, 0, EZpvd());
        }
        if (obj instanceof yXT) {
            return obj.equals(this);
        }
        java.lang.String strValueOf = java.lang.String.valueOf(obj.getClass());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(strValueOf);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public boolean AEQbTJ(yXR yxr, int i, int i2) {
        if (i2 > yxr.EZpvd()) {
            int iEZpvd = EZpvd();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iEZpvd);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i + i2 > yxr.EZpvd()) {
            int iEZpvd2 = yxr.EZpvd();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iEZpvd2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.AEQbTJ;
        byte[] bArr2 = yxr.AEQbTJ;
        int iCopydefault = copydefault();
        int iCopydefault2 = copydefault();
        int iCopydefault3 = yxr.copydefault() + i;
        while (iCopydefault2 < iCopydefault + i2) {
            if (bArr[iCopydefault2] != bArr2[iCopydefault3]) {
                return false;
            }
            iCopydefault2++;
            iCopydefault3++;
        }
        return true;
    }

    public int hashCode() {
        int iCopydefault = this.KWHzl;
        if (iCopydefault == 0) {
            int iEZpvd = EZpvd();
            iCopydefault = copydefault(iEZpvd, 0, iEZpvd);
            if (iCopydefault == 0) {
                iCopydefault = 1;
            }
            this.KWHzl = iCopydefault;
        }
        return iCopydefault;
    }

    @Override // o.yXD
    public int copydefault(int i, int i2, int i3) {
        return EZpvd(i, this.AEQbTJ, copydefault() + i2, i3);
    }

    public static int EZpvd(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // o.yXD
    public yXG AYXKKw() {
        return yXG.KWHzl(this);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // o.yXD, java.lang.Iterable
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yXD.StateListAnimator iterator() {
        return new Activity();
    }

    public class Activity implements yXD.StateListAnimator {
        public int AEQbTJ;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AEQbTJ < this.copydefault;
        }

        public Activity() {
            this.AEQbTJ = 0;
            this.copydefault = yXR.this.EZpvd();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(copydefault());
        }

        @Override // o.yXD.StateListAnimator
        public byte copydefault() {
            try {
                byte[] bArr = yXR.this.AEQbTJ;
                int i = this.AEQbTJ;
                this.AEQbTJ = i + 1;
                return bArr[i];
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
