package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.ICUException;
import o.C7244agF;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.acZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7052acZ {
    public StateListAnimator AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public final C7048acV OLrzqt;
    public boolean copydefault;
    public final C7033acG djBIcL;
    public TaskDescription gEmmrt;

    public static final boolean EZpvd(int i) {
        return (i & (-1024)) == 56320;
    }

    public static final boolean KWHzl(int i) {
        return (i & (-2048)) == 55296;
    }

    public static final boolean OLrzqt(int i) {
        return (i & (-1024)) == 55296;
    }

    public abstract void AEQbTJ(int i);

    public abstract void AYXKKw(int i);

    public boolean KWHzl() {
        return false;
    }

    public long OLrzqt(int i, int i2) {
        return (((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32);
    }

    public abstract int djBIcL();

    public abstract int fetchVPNInfo();

    public int hashCode() {
        return 0;
    }

    public abstract int isConnected();

    public char valueOf() {
        return (char) 0;
    }

    /* JADX INFO: renamed from: o.acZ$StateListAnimator */
    public static final class StateListAnimator {
        public int EZpvd = 0;
        public long[] OLrzqt = new long[40];

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long[] AEQbTJ() {
            return this.OLrzqt;
        }

        public void KWHzl(long j) {
            if (this.EZpvd >= 40) {
                OLrzqt(1);
            }
            long[] jArr = this.OLrzqt;
            int i = this.EZpvd;
            this.EZpvd = i + 1;
            jArr[i] = j;
        }

        public void copydefault(long j) {
            long[] jArr = this.OLrzqt;
            int i = this.EZpvd;
            this.EZpvd = i + 1;
            jArr[i] = j;
        }

        public void OLrzqt(int i) {
            int i2;
            int length = this.OLrzqt.length;
            if (this.EZpvd + i <= length) {
                return;
            }
            do {
                length = length < 1000 ? length * 4 : length * 2;
                i2 = this.EZpvd;
            } while (length < i2 + i);
            long[] jArr = new long[length];
            java.lang.System.arraycopy(this.OLrzqt, 0, jArr, 0, i2);
            this.OLrzqt = jArr;
        }

        public void EZpvd() {
            if (this.EZpvd >= 40) {
                OLrzqt(1);
            }
            this.EZpvd++;
        }

        public long OLrzqt(int i, long j) {
            this.OLrzqt[i] = j;
            return j;
        }

        public long AEQbTJ(int i) {
            return this.OLrzqt[i];
        }
    }

    /* JADX INFO: renamed from: o.acZ$TaskDescription */
    public static final class TaskDescription {
        public int EZpvd;
        public int OLrzqt;
        public final java.lang.StringBuilder AEQbTJ = new java.lang.StringBuilder();
        public final java.lang.StringBuilder KWHzl = new java.lang.StringBuilder();
        public C7244agF.Application copydefault = new C7244agF.Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ() {
            this.EZpvd++;
        }

        public void KWHzl() {
            this.AEQbTJ.setLength(0);
            this.EZpvd = 0;
        }

        public boolean copydefault() {
            return this.AEQbTJ.length() == 0;
        }

        public boolean OLrzqt() {
            return this.EZpvd < this.AEQbTJ.length();
        }

        public int EZpvd() {
            int iCodePointAt = this.AEQbTJ.codePointAt(this.EZpvd);
            this.EZpvd += java.lang.Character.charCount(iCodePointAt);
            return iCodePointAt;
        }

        public int KWHzl(int i) {
            int length = this.AEQbTJ.length();
            int i2 = this.EZpvd;
            int i3 = i2 - length;
            if (i3 <= 0) {
                this.EZpvd = this.AEQbTJ.offsetByCodePoints(i2, -i);
                return 0;
            }
            if (i3 >= i) {
                this.EZpvd = i2 - i;
                return i;
            }
            this.EZpvd = this.AEQbTJ.offsetByCodePoints(length, i3 - i);
            return i3;
        }

        public void copydefault(int i) {
            this.OLrzqt = 0;
            this.KWHzl.setLength(0);
            this.KWHzl.appendCodePoint(i);
        }

        public void OLrzqt(int i) {
            this.KWHzl.appendCodePoint(i);
        }

        public void AhwBna() {
            this.OLrzqt = this.KWHzl.length();
        }

        public void valueOf() {
            int length = this.AEQbTJ.length();
            if (this.EZpvd > length) {
                this.EZpvd = length;
            }
            this.AEQbTJ.delete(0, this.EZpvd).insert(0, this.KWHzl, 0, this.OLrzqt);
            this.EZpvd = 0;
        }

        public void KWHzl(C7244agF c7244agF) {
            c7244agF.copydefault(this.copydefault);
        }

        public void AEQbTJ(C7244agF c7244agF) {
            c7244agF.AEQbTJ(this.copydefault);
        }
    }

    public AbstractC7052acZ(C7048acV c7048acV) {
        this.djBIcL = c7048acV.fIwbmz;
        this.OLrzqt = c7048acV;
        this.KWHzl = -1;
        this.copydefault = false;
        this.AEQbTJ = null;
    }

    public AbstractC7052acZ(C7048acV c7048acV, boolean z) {
        this.djBIcL = c7048acV.fIwbmz;
        this.OLrzqt = c7048acV;
        this.KWHzl = -1;
        this.copydefault = z;
        this.AEQbTJ = new StateListAnimator();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC7052acZ abstractC7052acZ = (AbstractC7052acZ) obj;
        if (this.AEQbTJ.EZpvd != abstractC7052acZ.AEQbTJ.EZpvd || this.EZpvd != abstractC7052acZ.EZpvd || this.KWHzl != abstractC7052acZ.KWHzl || this.copydefault != abstractC7052acZ.copydefault) {
            return false;
        }
        int i = 0;
        while (true) {
            StateListAnimator stateListAnimator = this.AEQbTJ;
            if (i >= stateListAnimator.EZpvd) {
                return true;
            }
            if (stateListAnimator.AEQbTJ(i) != abstractC7052acZ.AEQbTJ.AEQbTJ(i)) {
                return false;
            }
            i++;
        }
    }

    public final long AYXKKw() {
        int i;
        int iCopydefault;
        C7048acV c7048acV;
        int i2 = this.EZpvd;
        StateListAnimator stateListAnimator = this.AEQbTJ;
        if (i2 < stateListAnimator.EZpvd) {
            this.EZpvd = i2 + 1;
            return stateListAnimator.AEQbTJ(i2);
        }
        stateListAnimator.EZpvd();
        long jAhwBna = AhwBna();
        int i3 = (int) (jAhwBna >> 32);
        int i4 = (int) jAhwBna;
        int i5 = i4 & 255;
        if (i5 < 192) {
            StateListAnimator stateListAnimator2 = this.AEQbTJ;
            int i6 = this.EZpvd;
            this.EZpvd = i6 + 1;
            return stateListAnimator2.OLrzqt(i6, ((long) (i5 << 8)) | (((long) (i4 & 65280)) << 16) | (((long) ((-65536) & i4)) << 32));
        }
        if (i5 != 192) {
            i = i5;
            iCopydefault = i4;
            c7048acV = this.OLrzqt;
        } else {
            if (i3 < 0) {
                StateListAnimator stateListAnimator3 = this.AEQbTJ;
                int i7 = this.EZpvd;
                this.EZpvd = i7 + 1;
                return stateListAnimator3.OLrzqt(i7, 4311744768L);
            }
            c7048acV = this.OLrzqt.OLrzqt;
            iCopydefault = c7048acV.copydefault(i3);
            i = iCopydefault & 255;
            if (i < 192) {
                StateListAnimator stateListAnimator4 = this.AEQbTJ;
                int i8 = this.EZpvd;
                this.EZpvd = i8 + 1;
                return stateListAnimator4.OLrzqt(i8, (((long) ((-65536) & iCopydefault)) << 32) | ((iCopydefault & 65280) << 16) | ((long) (i << 8)));
            }
        }
        if (i == 193) {
            StateListAnimator stateListAnimator5 = this.AEQbTJ;
            int i9 = this.EZpvd;
            this.EZpvd = i9 + 1;
            return stateListAnimator5.OLrzqt(i9, (((long) (iCopydefault - i)) << 32) | 83887360);
        }
        return AEQbTJ(c7048acV, i3, iCopydefault);
    }

    public final int AEQbTJ() {
        while (AYXKKw() != 4311744768L) {
            this.EZpvd = this.AEQbTJ.EZpvd;
        }
        return this.AEQbTJ.EZpvd;
    }

    public final void KWHzl(long j) {
        this.AEQbTJ.OLrzqt(this.EZpvd - 1, j);
    }

    public final int gEmmrt() {
        return this.AEQbTJ.EZpvd;
    }

    public final long valueOf(int i) {
        return this.AEQbTJ.AEQbTJ(i);
    }

    public final long[] EZpvd() {
        return this.AEQbTJ.AEQbTJ();
    }

    public final void OLrzqt() {
        this.AEQbTJ.EZpvd = 0;
        this.EZpvd = 0;
    }

    public final void copydefault() {
        if (this.EZpvd == this.AEQbTJ.EZpvd) {
            OLrzqt();
        }
    }

    public final void values() {
        this.AEQbTJ.EZpvd = 0;
        this.EZpvd = 0;
        TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription != null) {
            taskDescription.KWHzl();
        }
    }

    public final void copydefault(boolean z) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new StateListAnimator();
        }
        values();
        this.copydefault = z;
    }

    public long AhwBna() {
        int iFetchVPNInfo = fetchVPNInfo();
        if (iFetchVPNInfo < 0) {
            return -4294967104L;
        }
        return OLrzqt(iFetchVPNInfo, this.OLrzqt.copydefault(iFetchVPNInfo));
    }

    public int djBIcL(int i) {
        return this.OLrzqt.copydefault(i);
    }

    public int AhwBna(int i) {
        throw new ICUException("internal program error: should be unreachable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r8.AEQbTJ.KWHzl(o.C7046acT.AuCTel(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C7048acV c7048acV, int i, int i2, boolean z) {
        int iDbNXlk;
        while (true) {
            int i3 = i2;
            while (C7046acT.isConnected(i3)) {
                switch (C7046acT.fIwbmz(i3)) {
                    case 0:
                    case 3:
                        throw new ICUException("internal program error: should be unreachable");
                    case 1:
                        this.AEQbTJ.KWHzl(C7046acT.KWHzl(i3));
                        return;
                    case 2:
                        this.AEQbTJ.KWHzl(C7046acT.OLrzqt(i3));
                        return;
                    case 4:
                        this.AEQbTJ.OLrzqt(2);
                        StateListAnimator stateListAnimator = this.AEQbTJ;
                        stateListAnimator.OLrzqt(stateListAnimator.EZpvd, C7046acT.values(i3));
                        StateListAnimator stateListAnimator2 = this.AEQbTJ;
                        stateListAnimator2.OLrzqt(stateListAnimator2.EZpvd + 1, C7046acT.AkhnZx(i3));
                        this.AEQbTJ.EZpvd += 2;
                        return;
                    case 5:
                        int iDjBIcL = C7046acT.djBIcL(i3);
                        int iDbNXlk2 = C7046acT.DbNXlk(i3);
                        this.AEQbTJ.OLrzqt(iDbNXlk2);
                        while (true) {
                            this.AEQbTJ.copydefault(C7046acT.AEQbTJ(c7048acV.copydefault[iDjBIcL]));
                            iDbNXlk2--;
                            if (iDbNXlk2 <= 0) {
                                return;
                            } else {
                                iDjBIcL++;
                            }
                        }
                        break;
                    case 6:
                        int iDjBIcL2 = C7046acT.djBIcL(i3);
                        int iDbNXlk3 = C7046acT.DbNXlk(i3);
                        this.AEQbTJ.OLrzqt(iDbNXlk3);
                        while (true) {
                            this.AEQbTJ.copydefault(c7048acV.AEQbTJ[iDjBIcL2]);
                            iDbNXlk3--;
                            if (iDbNXlk3 <= 0) {
                                return;
                            } else {
                                iDjBIcL2++;
                            }
                        }
                        break;
                    case 7:
                        i2 = AhwBna(i3);
                        if (i2 == 192) {
                            c7048acV = this.OLrzqt.OLrzqt;
                            i2 = c7048acV.copydefault(i);
                        } else {
                            continue;
                        }
                        break;
                    case 8:
                        if (z) {
                            AEQbTJ(1);
                        }
                        i2 = AEQbTJ(c7048acV, i3);
                        if (z) {
                            AYXKKw(1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int iDjBIcL3 = C7046acT.djBIcL(i3);
                        int iKWHzl = c7048acV.KWHzl(iDjBIcL3);
                        if (z) {
                            if (this.gEmmrt == null && this.KWHzl < 0) {
                                iDbNXlk = fetchVPNInfo();
                                if (iDbNXlk >= 0) {
                                    if ((i3 & 512) != 0 && !C7106ada.OLrzqt(iDbNXlk)) {
                                        AEQbTJ(1);
                                    } else {
                                        i2 = OLrzqt(c7048acV, i3, c7048acV.valueOf, iDjBIcL3 + 2, iKWHzl, iDbNXlk);
                                        if (i2 != 1) {
                                        }
                                    }
                                }
                            } else {
                                iDbNXlk = DbNXlk();
                                if (iDbNXlk >= 0) {
                                    if ((i3 & 512) != 0 && !C7106ada.OLrzqt(iDbNXlk)) {
                                        copydefault(1);
                                    } else {
                                        i2 = OLrzqt(c7048acV, i3, c7048acV.valueOf, iDjBIcL3 + 2, iKWHzl, iDbNXlk);
                                        if (i2 != 1) {
                                            return;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        i3 = iKWHzl;
                        break;
                    case 10:
                        if (this.copydefault) {
                            EZpvd(i3, z);
                            return;
                        } else {
                            i2 = c7048acV.copydefault[C7046acT.djBIcL(i3)];
                            continue;
                        }
                    case 11:
                        i2 = c7048acV.copydefault[0];
                        continue;
                    case 12:
                        int[] iArr = c7048acV.gEmmrt;
                        int i4 = i - 44032;
                        int i5 = i4 % 28;
                        int i6 = i4 / 28;
                        int i7 = i6 % 21;
                        int i8 = i6 / 21;
                        if ((i3 & 256) != 0) {
                            this.AEQbTJ.OLrzqt(i5 == 0 ? 2 : 3);
                            StateListAnimator stateListAnimator3 = this.AEQbTJ;
                            stateListAnimator3.OLrzqt(stateListAnimator3.EZpvd, C7046acT.AEQbTJ(iArr[i8]));
                            StateListAnimator stateListAnimator4 = this.AEQbTJ;
                            stateListAnimator4.OLrzqt(stateListAnimator4.EZpvd + 1, C7046acT.AEQbTJ(iArr[i7 + 19]));
                            StateListAnimator stateListAnimator5 = this.AEQbTJ;
                            stateListAnimator5.EZpvd += 2;
                            if (i5 != 0) {
                                stateListAnimator5.copydefault(C7046acT.AEQbTJ(iArr[i5 + 39]));
                                return;
                            }
                            return;
                        }
                        EZpvd(c7048acV, -1, iArr[i8], z);
                        EZpvd(c7048acV, -1, iArr[i7 + 19], z);
                        if (i5 == 0) {
                            return;
                        }
                        i3 = iArr[i5 + 39];
                        i = -1;
                        break;
                        break;
                    case 13:
                        char cValueOf = valueOf();
                        if (java.lang.Character.isLowSurrogate(cValueOf)) {
                            i = java.lang.Character.toCodePoint((char) i, cValueOf);
                            int i9 = i3 & 768;
                            if (i9 != 0) {
                                if (i9 == 256 || (i2 = c7048acV.AEQbTJ(i)) == 192) {
                                    c7048acV = c7048acV.OLrzqt;
                                    i2 = c7048acV.AEQbTJ(i);
                                }
                            }
                        }
                        i3 = -1;
                        break;
                    case 14:
                        this.AEQbTJ.KWHzl(c7048acV.KWHzl(i, i3));
                        return;
                    case 15:
                        if (KWHzl(i) && KWHzl()) {
                            i2 = -195323;
                            continue;
                        }
                        break;
                }
            }
            this.AEQbTJ.KWHzl(C7046acT.EZpvd(i3));
            return;
        }
    }

    public final long AEQbTJ(C7048acV c7048acV, int i, int i2) {
        this.AEQbTJ.EZpvd--;
        EZpvd(c7048acV, i, i2, true);
        StateListAnimator stateListAnimator = this.AEQbTJ;
        int i3 = this.EZpvd;
        this.EZpvd = i3 + 1;
        return stateListAnimator.AEQbTJ(i3);
    }

    public final int AEQbTJ(C7048acV c7048acV, int i) {
        BytesTrie.Result resultAEQbTJ;
        int iDjBIcL = C7046acT.djBIcL(i);
        int iKWHzl = c7048acV.KWHzl(iDjBIcL);
        C7244agF c7244agF = new C7244agF(c7048acV.valueOf, iDjBIcL + 2);
        int i2 = 0;
        do {
            int iIsConnected = isConnected();
            if (iIsConnected < 0) {
                break;
            }
            i2++;
            resultAEQbTJ = c7244agF.AEQbTJ(iIsConnected);
            if (resultAEQbTJ.hasValue()) {
                iKWHzl = c7244agF.EZpvd();
            }
        } while (resultAEQbTJ.hasNext());
        AYXKKw(i2);
        return iKWHzl;
    }

    public final int DbNXlk() {
        TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription != null && taskDescription.OLrzqt()) {
            return this.gEmmrt.EZpvd();
        }
        if (this.KWHzl == 0) {
            return -1;
        }
        int iFetchVPNInfo = fetchVPNInfo();
        TaskDescription taskDescription2 = this.gEmmrt;
        if (taskDescription2 != null && !taskDescription2.copydefault() && iFetchVPNInfo >= 0) {
            this.gEmmrt.AEQbTJ();
        }
        int i = this.KWHzl;
        if (i > 0 && iFetchVPNInfo >= 0) {
            this.KWHzl = i - 1;
        }
        return iFetchVPNInfo;
    }

    public final void copydefault(int i) {
        TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription != null && !taskDescription.copydefault()) {
            i = this.gEmmrt.KWHzl(i);
        }
        AEQbTJ(i);
        int i2 = this.KWHzl;
        if (i2 >= 0) {
            this.KWHzl = i2 + i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt(C7048acV c7048acV, int i, java.lang.CharSequence charSequence, int i2, int i3, int i4) {
        int iDbNXlk;
        int iDbNXlk2;
        int iDbNXlk3;
        C7244agF c7244agF = new C7244agF(charSequence, i2);
        TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription != null && !taskDescription.copydefault()) {
            this.gEmmrt.KWHzl(c7244agF);
        }
        BytesTrie.Result resultKWHzl = c7244agF.KWHzl(i4);
        int i5 = 1;
        int i6 = 1;
        int i7 = i3;
        int i8 = 1;
        while (true) {
            if (resultKWHzl.hasValue()) {
                int iEZpvd = c7244agF.EZpvd();
                if (!resultKWHzl.hasNext() || (iDbNXlk3 = DbNXlk()) < 0) {
                    break;
                }
                TaskDescription taskDescription2 = this.gEmmrt;
                if (taskDescription2 != null && !taskDescription2.copydefault()) {
                    this.gEmmrt.KWHzl(c7244agF);
                }
                i4 = iDbNXlk3;
                i7 = iEZpvd;
                i8 = 1;
            } else {
                if (resultKWHzl == BytesTrie.Result.NO_MATCH || (iDbNXlk2 = DbNXlk()) < 0) {
                    break;
                }
                i8++;
                i4 = iDbNXlk2;
            }
            i6++;
            resultKWHzl = c7244agF.AEQbTJ(i4);
        }
        if ((i & 1024) != 0 && ((i & 256) == 0 || i8 < i6)) {
            if (i8 > 1) {
                copydefault(i8);
                i6 -= i8 - 1;
                iDbNXlk = DbNXlk();
            } else {
                i5 = i8;
                iDbNXlk = i4;
            }
            int i9 = i6;
            if (c7048acV.OLrzqt(iDbNXlk) > 255) {
                return OLrzqt(c7048acV, c7244agF, i7, i9, iDbNXlk);
            }
            i8 = i5;
        }
        copydefault(i8);
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt(C7048acV c7048acV, C7244agF c7244agF, int i, int i2, int i3) {
        int iOLrzqt = c7048acV.OLrzqt(i3);
        int iDbNXlk = DbNXlk();
        if (iDbNXlk < 0) {
            copydefault(1);
            return i;
        }
        int i4 = i2 + 1;
        int i5 = iOLrzqt & 255;
        int iOLrzqt2 = c7048acV.OLrzqt(iDbNXlk);
        int i6 = 2;
        if (iOLrzqt2 <= 255) {
            copydefault(2);
            return i;
        }
        TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription == null || taskDescription.copydefault()) {
            if (this.gEmmrt == null) {
                this.gEmmrt = new TaskDescription();
            }
            c7244agF.OLrzqt();
            if (i4 > 2) {
                AEQbTJ(i4);
                c7244agF.KWHzl(fetchVPNInfo());
                for (int i7 = 3; i7 < i4; i7++) {
                    c7244agF.AEQbTJ(fetchVPNInfo());
                }
                AYXKKw(2);
            }
            this.gEmmrt.KWHzl(c7244agF);
        } else {
            this.gEmmrt.AEQbTJ(c7244agF);
        }
        this.gEmmrt.copydefault(i3);
        do {
            if (i5 < (iOLrzqt2 >> 8)) {
                BytesTrie.Result resultAEQbTJ = c7244agF.AEQbTJ(iDbNXlk);
                if (resultAEQbTJ.hasValue()) {
                    i = c7244agF.EZpvd();
                    this.gEmmrt.AhwBna();
                    i6 = 0;
                    if (!resultAEQbTJ.hasNext()) {
                        break;
                    }
                    this.gEmmrt.KWHzl(c7244agF);
                } else {
                    this.gEmmrt.OLrzqt(iDbNXlk);
                    this.gEmmrt.AEQbTJ(c7244agF);
                    i5 = iOLrzqt2 & 255;
                }
                iDbNXlk = DbNXlk();
                if (iDbNXlk < 0) {
                    break;
                }
                i6++;
                iOLrzqt2 = c7048acV.OLrzqt(iDbNXlk);
            }
        } while (iOLrzqt2 > 255);
        copydefault(i6);
        boolean zCopydefault = this.gEmmrt.copydefault();
        this.gEmmrt.valueOf();
        if (!zCopydefault || this.gEmmrt.copydefault()) {
            return i;
        }
        int iEZpvd = -1;
        while (true) {
            EZpvd(c7048acV, iEZpvd, i, true);
            if (this.gEmmrt.OLrzqt()) {
                iEZpvd = this.gEmmrt.EZpvd();
                i = djBIcL(iEZpvd);
                if (i == 192) {
                    c7048acV = this.OLrzqt.OLrzqt;
                    i = c7048acV.copydefault(iEZpvd);
                } else {
                    c7048acV = this.OLrzqt;
                }
            } else {
                this.gEmmrt.KWHzl();
                return 1;
            }
        }
    }

    public final void EZpvd(int i, boolean z) {
        int iFetchVPNInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            while (true) {
                sb.append(C7046acT.copydefault(i));
                if (this.KWHzl == 0 || (iFetchVPNInfo = fetchVPNInfo()) < 0) {
                    break;
                }
                int iCopydefault = this.OLrzqt.copydefault(iFetchVPNInfo);
                i = iCopydefault == 192 ? this.OLrzqt.OLrzqt.copydefault(iFetchVPNInfo) : iCopydefault;
                if (!C7046acT.KWHzl(i, 10)) {
                    AEQbTJ(1);
                    break;
                } else {
                    int i2 = this.KWHzl;
                    if (i2 > 0) {
                        this.KWHzl = i2 - 1;
                    }
                }
            }
        } else {
            while (true) {
                sb.append(C7046acT.copydefault(i));
                int iIsConnected = isConnected();
                if (iIsConnected < 0) {
                    break;
                }
                int iCopydefault2 = this.OLrzqt.copydefault(iIsConnected);
                i = iCopydefault2 == 192 ? this.OLrzqt.OLrzqt.copydefault(iIsConnected) : iCopydefault2;
                if (!C7046acT.KWHzl(i, 10)) {
                    AYXKKw(1);
                    break;
                }
            }
            sb.reverse();
        }
        int i3 = 0;
        while (true) {
            if (i3 >= sb.length() - 1 || sb.charAt(i3) != 0) {
                int length = sb.length() - i3;
                if (length > 254) {
                    length = 254;
                }
                int i4 = length + i3;
                OLrzqt(sb.subSequence(i3, i4));
                if (i4 >= sb.length()) {
                    return;
                } else {
                    i3 = i4;
                }
            } else {
                i3++;
            }
        }
    }

    public final void OLrzqt(java.lang.CharSequence charSequence) {
        int iCharAt;
        int i;
        int length = charSequence.length();
        long j = this.OLrzqt.AkhnZx;
        int i2 = 8;
        if (length <= 7) {
            int iCharAt2 = charSequence.charAt(0);
            for (int i3 = 1; i3 < length; i3++) {
                iCharAt2 = (iCharAt2 * 10) + charSequence.charAt(i3);
            }
            if (iCharAt2 < 74) {
                this.AEQbTJ.KWHzl(C7046acT.AEQbTJ(j | ((long) ((iCharAt2 + 2) << 16))));
                return;
            }
            int i4 = iCharAt2 - 74;
            if (i4 < 10160) {
                this.AEQbTJ.KWHzl(C7046acT.AEQbTJ(j | ((long) (((i4 / 254) + 76) << 16)) | (((i4 % 254) + 2) << 8)));
                return;
            }
            int i5 = iCharAt2 - 10234;
            if (i5 < 1032256) {
                long j2 = (i5 % 254) + 2;
                int i6 = i5 / 254;
                this.AEQbTJ.KWHzl(C7046acT.AEQbTJ(j | j2 | (((i6 % 254) + 2) << 8) | ((long) ((((i6 / 254) % 254) + AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) << 16))));
                return;
            }
        }
        long j3 = ((long) ((((length + 1) / 2) + 128) << 16)) | j;
        while (charSequence.charAt(length - 1) == 0 && charSequence.charAt(length - 2) == 0) {
            length -= 2;
        }
        if ((length & 1) != 0) {
            iCharAt = charSequence.charAt(0);
            i = 1;
        } else {
            iCharAt = (charSequence.charAt(0) * '\n') + charSequence.charAt(1);
            i = 2;
        }
        int iCharAt3 = (iCharAt * 2) + 11;
        while (i < length) {
            if (i2 == 0) {
                this.AEQbTJ.KWHzl(C7046acT.AEQbTJ(((long) iCharAt3) | j3));
                j3 = j;
                i2 = 16;
            } else {
                j3 |= (long) (iCharAt3 << i2);
                i2 -= 8;
            }
            iCharAt3 = (((charSequence.charAt(i) * '\n') + charSequence.charAt(i + 1)) * 2) + 11;
            i += 2;
        }
        this.AEQbTJ.KWHzl(C7046acT.AEQbTJ(((long) ((iCharAt3 - 1) << i2)) | j3));
    }
}
