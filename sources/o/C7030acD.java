package o;

import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.impl.Trie2;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUUncheckedIOException;
import o.C7024abY;

/* JADX INFO: renamed from: o.acD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7030acD {
    public static final C7030acD KWHzl;
    public byte[] AEQbTJ;
    public int[] EZpvd;
    public byte[] OLrzqt;
    public int[] copydefault;
    public C7032acF gEmmrt;

    public static final boolean AEQbTJ(int i, int i2) {
        return ((i >> i2) & 1) != 0;
    }

    public static final int EZpvd(int i) {
        return i & 31;
    }

    public static final int KWHzl(int i) {
        return i & 2097151;
    }

    public static final int OLrzqt(int i) {
        return i >>> 21;
    }

    public static final int copydefault(int i) {
        return ((short) i) >> 13;
    }

    private C7030acD() throws java.io.IOException {
        AEQbTJ(C7024abY.OLrzqt("ubidi.icu"));
    }

    public final void AEQbTJ(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        C7024abY.OLrzqt(byteBuffer, 1114195049, new Application());
        int i = byteBuffer.getInt();
        if (i < 16) {
            throw new java.io.IOException("indexes[0] too small in ubidi.icu");
        }
        int[] iArr = new int[i];
        this.copydefault = iArr;
        iArr[0] = i;
        for (int i2 = 1; i2 < i; i2++) {
            this.copydefault[i2] = byteBuffer.getInt();
        }
        C7032acF c7032acFAEQbTJ = C7032acF.AEQbTJ(byteBuffer);
        this.gEmmrt = c7032acFAEQbTJ;
        int i3 = this.copydefault[2];
        int iEZpvd = c7032acFAEQbTJ.EZpvd();
        if (iEZpvd > i3) {
            throw new java.io.IOException("ubidi.icu: not enough bytes for the trie");
        }
        C7024abY.EZpvd(byteBuffer, i3 - iEZpvd);
        int i4 = this.copydefault[3];
        if (i4 > 0) {
            this.EZpvd = C7024abY.EZpvd(byteBuffer, i4, 0);
        }
        int[] iArr2 = this.copydefault;
        byte[] bArr = new byte[iArr2[5] - iArr2[4]];
        this.AEQbTJ = bArr;
        byteBuffer.get(bArr);
        int[] iArr3 = this.copydefault;
        byte[] bArr2 = new byte[iArr3[7] - iArr3[6]];
        this.OLrzqt = bArr2;
        byteBuffer.get(bArr2);
    }

    /* JADX INFO: renamed from: o.acD$Application */
    public static final class Application implements C7024abY.ActionBar {
        private Application() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return bArr[0] == 2;
        }
    }

    public final void OLrzqt(UnicodeSet unicodeSet) {
        for (Trie2.TaskDescription taskDescription : this.gEmmrt) {
            if (taskDescription.EZpvd) {
                break;
            } else {
                unicodeSet.KWHzl(taskDescription.KWHzl);
            }
        }
        int i = this.copydefault[3];
        for (int i2 = 0; i2 < i; i2++) {
            int iKWHzl = KWHzl(this.EZpvd[i2]);
            unicodeSet.EZpvd(iKWHzl, iKWHzl + 1);
        }
        int[] iArr = this.copydefault;
        int i3 = iArr[4];
        int i4 = iArr[5];
        byte[] bArr = this.AEQbTJ;
        while (true) {
            byte b = 0;
            int i5 = i3;
            for (int i6 = 0; i6 < i4 - i3; i6++) {
                byte b2 = bArr[i6];
                if (b2 != b) {
                    unicodeSet.KWHzl(i5);
                    b = b2;
                }
                i5++;
            }
            if (b != 0) {
                unicodeSet.KWHzl(i4);
            }
            int[] iArr2 = this.copydefault;
            if (i4 != iArr2[5]) {
                return;
            }
            int i7 = iArr2[6];
            int i8 = iArr2[7];
            bArr = this.OLrzqt;
            i3 = i7;
            i4 = i8;
        }
    }

    public final int AhwBna(int i) {
        int i2 = this.copydefault[15];
        if (i == 4096) {
            return i2 & 31;
        }
        if (i == 4117) {
            return (i2 & 768) >> 8;
        }
        if (i == 4102) {
            return (16711680 & i2) >> 16;
        }
        if (i != 4103) {
            return -1;
        }
        return (i2 & 224) >> 5;
    }

    public final int AEQbTJ(int i) {
        return EZpvd(this.gEmmrt.OLrzqt(i));
    }

    public final boolean AkhnZx(int i) {
        return AEQbTJ(this.gEmmrt.OLrzqt(i), 12);
    }

    public final int copydefault(int i, int i2) {
        int iCopydefault = copydefault(i2);
        if (iCopydefault != -4) {
            return i + iCopydefault;
        }
        int i3 = this.copydefault[3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.EZpvd[i4];
            int iKWHzl = KWHzl(i5);
            if (i == iKWHzl) {
                return KWHzl(this.EZpvd[OLrzqt(i5)]);
            }
            if (i < iKWHzl) {
                break;
            }
        }
        return i;
    }

    public final int valueOf(int i) {
        return copydefault(i, this.gEmmrt.OLrzqt(i));
    }

    public final boolean DbNXlk(int i) {
        return AEQbTJ(this.gEmmrt.OLrzqt(i), 11);
    }

    public final boolean fetchVPNInfo(int i) {
        return AEQbTJ(this.gEmmrt.OLrzqt(i), 10);
    }

    public final int AYXKKw(int i) {
        return (this.gEmmrt.OLrzqt(i) & 224) >> 5;
    }

    public final int gEmmrt(int i) {
        byte b;
        int[] iArr = this.copydefault;
        int i2 = iArr[4];
        int i3 = iArr[5];
        if (i2 <= i && i < i3) {
            b = this.AEQbTJ[i - i2];
        } else {
            int i4 = iArr[6];
            int i5 = iArr[7];
            if (i4 > i || i >= i5) {
                return 0;
            }
            b = this.OLrzqt[i - i4];
        }
        return b & UnsignedBytes.MAX_VALUE;
    }

    public final int values(int i) {
        return (this.gEmmrt.OLrzqt(i) & 768) >> 8;
    }

    public final int djBIcL(int i) {
        int iOLrzqt = this.gEmmrt.OLrzqt(i);
        return (iOLrzqt & 768) == 0 ? i : copydefault(i, iOLrzqt);
    }

    static {
        try {
            KWHzl = new C7030acD();
        } catch (java.io.IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }
}
