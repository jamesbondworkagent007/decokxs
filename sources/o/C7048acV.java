package o;

import androidx.core.view.InputDeviceCompat;
import com.ibm.icu.text.UnicodeSet;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;

/* JADX INFO: renamed from: o.acV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7048acV {
    public static final int[] KWHzl = new int[0];
    public long[] AEQbTJ;
    public C7069acq AYXKKw;
    public char[] AhwBna;
    public int DbNXlk;
    public boolean[] EZpvd;
    public C7048acV OLrzqt;
    public int[] copydefault;
    public char[] djBIcL;
    public UnicodeSet ejfBZ;
    public C7033acG fIwbmz;
    public char[] fetchVPNInfo;
    public char[] isConnected;
    public java.lang.String valueOf;
    public long[] values;
    public int[] gEmmrt = new int[67];
    public long AkhnZx = 301989888;

    public C7048acV(C7069acq c7069acq) {
        this.AYXKKw = c7069acq;
    }

    public int copydefault(int i) {
        return this.fIwbmz.OLrzqt(i);
    }

    public int AEQbTJ(int i) {
        return this.fIwbmz.OLrzqt(i);
    }

    public boolean AkhnZx(int i) {
        if (i < 1632) {
            return i <= 57 && 48 <= i;
        }
        return C7046acT.KWHzl(copydefault(i), 10);
    }

    public boolean copydefault(int i, boolean z) {
        return this.ejfBZ.AEQbTJ(i) || (z && AkhnZx(i));
    }

    public int KWHzl(int i) {
        return this.valueOf.charAt(i + 1) | (this.valueOf.charAt(i) << 16);
    }

    public int djBIcL(int i) {
        int iFIwbmz = C7046acT.fIwbmz(i);
        if (iFIwbmz == 10) {
            return this.copydefault[C7046acT.djBIcL(i)];
        }
        if (iFIwbmz == 13) {
            return -1;
        }
        return iFIwbmz == 11 ? this.copydefault[0] : i;
    }

    public int AhwBna(int i) {
        return C7046acT.isConnected(i) ? djBIcL(i) : i;
    }

    public long KWHzl(int i, int i2) {
        return C7046acT.AEQbTJ(C7046acT.KWHzl(i, this.AEQbTJ[C7046acT.djBIcL(i2)]));
    }

    public int OLrzqt(int i) {
        return this.AYXKKw.isConnected(i);
    }

    public long valueOf(int i) {
        int iGEmmrt = gEmmrt(i);
        if (iGEmmrt == 0) {
            return 0L;
        }
        return ((long) this.fetchVPNInfo[iGEmmrt]) << 16;
    }

    public long AYXKKw(int i) {
        int iGEmmrt = gEmmrt(i);
        if (iGEmmrt == 0) {
            return 0L;
        }
        return (((long) this.fetchVPNInfo[iGEmmrt + 1]) << 16) - 1;
    }

    public final int gEmmrt(int i) {
        int i2;
        if (i < 0) {
            return 0;
        }
        int i3 = this.DbNXlk;
        if (i < i3) {
            return this.isConnected[i];
        }
        if (i >= 4096 && i - 4096 < 8) {
            return this.isConnected[i3 + i2];
        }
        return 0;
    }

    public void EZpvd(int[] iArr, C7114adi c7114adi) {
        copydefault(iArr, false, c7114adi);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:118:0x0063 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:125:0x00e6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:131:0x00a8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:134:0x0125 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r7v11, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: int */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0157, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015c, code lost:
    
        if (r5 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0160, code lost:
    
        if (r1 >= (r4.length - 1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0162, code lost:
    
        r21.copydefault((r4[r1] << 16) | (r5 & 65535));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0172, code lost:
    
        if (r1 != (r18.fetchVPNInfo.length - 1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0174, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0175, code lost:
    
        r1 = r1 + 1;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010d, code lost:
    
        r4 = 1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010e, code lost:
    
        r5 = r18.fetchVPNInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0112, code lost:
    
        if (r4 >= (r5.length - 1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0116, code lost:
    
        if (r8[r4] == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
    
        r5 = r5[r4];
        r9 = r9;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011b, code lost:
    
        if (r3 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011d, code lost:
    
        if (r5 <= r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0120, code lost:
    
        r9 = OLrzqt(r8, r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0125, code lost:
    
        r4 = r4 + 1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0128, code lost:
    
        if (r9 <= r7) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012f, code lost:
    
        if (((r9 == true ? 1 : 0) - (65280 & r10)) > r7) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0131, code lost:
    
        copydefault(r19, true, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0134, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013c, code lost:
    
        throw new com.ibm.icu.util.ICUException("setReorderCodes(): reordering too many partial-primary-lead-byte scripts");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
    
        r1 = 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013f, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0140, code lost:
    
        r4 = r18.fetchVPNInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0144, code lost:
    
        if (r1 >= (r4.length - 1)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0146, code lost:
    
        r7 = r8[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0148, code lost:
    
        if (r7 != 255) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x014d, code lost:
    
        r3 = r7 - (r4[r1] >> '\b');
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0154, code lost:
    
        if (r3 == r5) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(int[] iArr, boolean z, C7114adi c7114adi) {
        int i;
        int i2;
        boolean z2;
        int i3;
        c7114adi.EZpvd();
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int i4 = 103;
        if (length != 1 || iArr[0] != 103) {
            char[] cArr = this.fetchVPNInfo;
            short[] sArr = new short[cArr.length - 1];
            char[] cArr2 = this.isConnected;
            int i5 = this.DbNXlk;
            char c = cArr2[i5 + 14];
            if (c != 0) {
                sArr[c] = 255;
            }
            char c2 = cArr2[i5 + 15];
            if (c2 != 0) {
                sArr[c2] = 255;
            }
            char c3 = cArr[1];
            char cAEQbTJ = cArr[cArr.length - 1];
            int i6 = 0;
            for (int i7 : iArr) {
                int i8 = i7 - 4096;
                if (i8 >= 0 && i8 < 8) {
                    i6 |= 1 << i8;
                }
            }
            int i9 = 0;
            int iOLrzqt = c3;
            while (i9 < 8) {
                char c4 = this.isConnected[this.DbNXlk + i9];
                if (c4 != 0 && ((1 << i9) & i6) == 0) {
                    iOLrzqt = OLrzqt(sArr, c4, iOLrzqt);
                }
                i9++;
                iOLrzqt = iOLrzqt;
            }
            if (i6 == 0 && iArr[0] == 25 && !z) {
                char c5 = this.fetchVPNInfo[this.isConnected[25]];
                i = c5 - iOLrzqt;
                i2 = c5;
            } else {
                i = 0;
                i2 = iOLrzqt;
            }
            int i10 = 0;
            int iOLrzqt2 = i2;
            while (true) {
                if (i10 >= length) {
                    z2 = false;
                    i3 = cAEQbTJ;
                    break;
                }
                int i11 = i10 + 1;
                int i12 = iArr[i10];
                if (i12 == i4) {
                    while (i11 < length) {
                        length--;
                        int i13 = iArr[length];
                        if (i13 == i4) {
                            throw new java.lang.IllegalArgumentException("setReorderCodes(): duplicate UScript.UNKNOWN");
                        }
                        if (i13 == -1) {
                            throw new java.lang.IllegalArgumentException("setReorderCodes(): UScript.DEFAULT together with other scripts");
                        }
                        int iGEmmrt = gEmmrt(i13);
                        if (iGEmmrt != 0) {
                            if (sArr[iGEmmrt] != 0) {
                                throw new java.lang.IllegalArgumentException("setReorderCodes(): duplicate or equivalent script " + EZpvd(i13));
                            }
                            cAEQbTJ = AEQbTJ(sArr, iGEmmrt, cAEQbTJ);
                        }
                        i4 = 103;
                    }
                    z2 = true;
                    i3 = cAEQbTJ;
                } else {
                    if (i12 == -1) {
                        throw new java.lang.IllegalArgumentException("setReorderCodes(): UScript.DEFAULT together with other scripts");
                    }
                    int iGEmmrt2 = gEmmrt(i12);
                    if (iGEmmrt2 != 0) {
                        if (sArr[iGEmmrt2] != 0) {
                            throw new java.lang.IllegalArgumentException("setReorderCodes(): duplicate or equivalent script " + EZpvd(i12));
                        }
                        iOLrzqt2 = OLrzqt(sArr, iGEmmrt2, iOLrzqt2 == true ? 1 : 0);
                    }
                    i10 = i11;
                    i4 = 103;
                    iOLrzqt2 = iOLrzqt2;
                }
            }
        }
    }

    public final int OLrzqt(short[] sArr, int i, int i2) {
        char[] cArr = this.fetchVPNInfo;
        char c = cArr[i];
        if ((c & 255) < (i2 & 255)) {
            i2 += 256;
        }
        sArr[i] = (short) (i2 >> 8);
        char c2 = cArr[i + 1];
        return (c2 & 255) | ((i2 & 65280) + ((c2 & 65280) - (65280 & c)));
    }

    public final int AEQbTJ(short[] sArr, int i, int i2) {
        char[] cArr = this.fetchVPNInfo;
        char c = cArr[i + 1];
        if ((c & 255) > (i2 & 255)) {
            i2 += InputDeviceCompat.SOURCE_ANY;
        }
        char c2 = cArr[i];
        int i3 = ((i2 & 65280) - ((c & 65280) - (65280 & c2))) | (c2 & 255);
        sArr[i] = (short) (i3 >> 8);
        return i3;
    }

    public static java.lang.String EZpvd(int i) {
        if (i < 4096) {
            return java.lang.Integer.toString(i);
        }
        return EIP1271Verifier.hexPrefix + java.lang.Integer.toHexString(i);
    }
}
