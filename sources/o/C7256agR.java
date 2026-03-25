package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.profileinstaller.ProfileVerifier;
import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.agR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7256agR extends CodePointMap implements java.lang.Cloneable {
    public int AEQbTJ;
    public int AYXKKw;
    public int DbNXlk;
    public int OLrzqt;
    public int djBIcL;
    public char[] gEmmrt;
    public int values;
    public byte[] copydefault = new byte[69632];
    public int[] AhwBna = new int[4096];
    public int valueOf = -1;
    public int[] EZpvd = new int[16384];
    public int KWHzl = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.KWHzl = -1;
        this.valueOf = -1;
        this.OLrzqt = 0;
        int i = this.DbNXlk;
        this.values = i;
        this.AYXKKw = i;
        this.djBIcL = 0;
        this.gEmmrt = null;
    }

    public C7256agR(int i, int i2) {
        this.DbNXlk = i;
        this.values = i;
        this.AEQbTJ = i2;
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C7256agR clone() {
        try {
            C7256agR c7256agR = (C7256agR) super.clone();
            int i = this.djBIcL;
            c7256agR.AhwBna = new int[i <= 65536 ? 4096 : 69632];
            c7256agR.copydefault = new byte[69632];
            for (int i2 = 0; i2 < (i >> 4); i2++) {
                c7256agR.AhwBna[i2] = this.AhwBna[i2];
                c7256agR.copydefault[i2] = this.copydefault[i2];
            }
            c7256agR.valueOf = this.valueOf;
            c7256agR.EZpvd = (int[]) this.EZpvd.clone();
            c7256agR.OLrzqt = this.OLrzqt;
            c7256agR.KWHzl = this.KWHzl;
            c7256agR.DbNXlk = this.DbNXlk;
            c7256agR.values = this.values;
            c7256agR.AEQbTJ = this.AEQbTJ;
            c7256agR.djBIcL = this.djBIcL;
            c7256agR.AYXKKw = this.AYXKKw;
            return c7256agR;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public int AEQbTJ(int i) {
        if (i < 0 || 1114111 < i) {
            return this.AEQbTJ;
        }
        if (i >= this.djBIcL) {
            return this.AYXKKw;
        }
        int i2 = i >> 4;
        if (this.copydefault[i2] == 0) {
            return this.AhwBna[i2];
        }
        return this.EZpvd[this.AhwBna[i2] + (i & 15)];
    }

    private static final int KWHzl(int i, int i2, int i3, CodePointMap.ActionBar actionBar) {
        return i == i2 ? i3 : actionBar != null ? actionBar.OLrzqt(i) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009b A[SYNTHETIC] */
    @Override // com.ibm.icu.util.CodePointMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AEQbTJ(int i, CodePointMap.ActionBar actionBar, CodePointMap.StateListAnimator stateListAnimator) {
        int i2;
        boolean z = false;
        if (i < 0 || 1114111 < i) {
            return false;
        }
        if (i >= this.djBIcL) {
            int iOLrzqt = this.AYXKKw;
            if (actionBar != null) {
                iOLrzqt = actionBar.OLrzqt(iOLrzqt);
            }
            stateListAnimator.OLrzqt(i, 1114111, iOLrzqt);
            return true;
        }
        int iOLrzqt2 = this.values;
        if (actionBar != null) {
            iOLrzqt2 = actionBar.OLrzqt(iOLrzqt2);
        }
        int i3 = i;
        int iKWHzl = 0;
        int i4 = i >> 4;
        int i5 = 0;
        loop0: do {
            if (this.copydefault[i4] == 0) {
                int i6 = this.AhwBna[i4];
                if (z) {
                    if (i6 != i5) {
                        if (actionBar == null || KWHzl(i6, this.values, iOLrzqt2, actionBar) != iKWHzl) {
                            stateListAnimator.OLrzqt(i, i3 - 1, iKWHzl);
                            return true;
                        }
                    }
                    i3 = (i3 + 16) & (-16);
                } else {
                    iKWHzl = KWHzl(i6, this.values, iOLrzqt2, actionBar);
                    z = true;
                }
                i5 = i6;
                i3 = (i3 + 16) & (-16);
            } else {
                int i7 = this.AhwBna[i4] + (i3 & 15);
                int i8 = this.EZpvd[i7];
                if (!z) {
                    iKWHzl = KWHzl(i8, this.values, iOLrzqt2, actionBar);
                    z = true;
                } else {
                    if (i8 != i5) {
                        if (actionBar == null || KWHzl(i8, this.values, iOLrzqt2, actionBar) != iKWHzl) {
                            stateListAnimator.OLrzqt(i, i3 - 1, iKWHzl);
                            return true;
                        }
                    }
                    while (true) {
                        i2 = i3 + 1;
                        if ((i2 & 15) != 0) {
                            i3 = i2;
                            break;
                        }
                        i7++;
                        int i9 = this.EZpvd[i7];
                        if (i9 == i5) {
                            i3 = i2;
                        } else {
                            if (actionBar == null || KWHzl(i9, this.values, iOLrzqt2, actionBar) != iKWHzl) {
                                break loop0;
                            }
                            i3 = i2;
                            i5 = i9;
                        }
                    }
                    stateListAnimator.OLrzqt(i, i3, iKWHzl);
                    return true;
                }
                i5 = i8;
                while (true) {
                    i2 = i3 + 1;
                    if ((i2 & 15) != 0) {
                    }
                }
                stateListAnimator.OLrzqt(i, i3, iKWHzl);
                return true;
            }
            i4++;
        } while (i3 < this.djBIcL);
        if (KWHzl(this.AYXKKw, this.values, iOLrzqt2, actionBar) != iKWHzl) {
            stateListAnimator.OLrzqt(i, i3 - 1, iKWHzl);
        } else {
            stateListAnimator.OLrzqt(i, 1114111, iKWHzl);
        }
        return true;
    }

    public final void KWHzl(int i, int i2) {
        java.util.Arrays.fill(this.EZpvd, i, i + 16, i2);
    }

    public void OLrzqt(int i, int i2) {
        if (i < 0 || 1114111 < i) {
            throw new java.lang.IllegalArgumentException("invalid code point");
        }
        OLrzqt(i);
        this.EZpvd[copydefault(i >> 4) + (i & 15)] = i2;
    }

    public CodePointTrie OLrzqt(CodePointTrie.Type type, CodePointTrie.ValueWidth valueWidth) {
        if (type == null || valueWidth == null) {
            throw new java.lang.IllegalArgumentException("The type and valueWidth must be specified.");
        }
        try {
            return copydefault(type, valueWidth);
        } finally {
            KWHzl();
        }
    }

    public final void OLrzqt(int i) {
        int i2 = this.djBIcL;
        if (i >= i2) {
            int i3 = (i + 512) & (-512);
            int i4 = i2 >> 4;
            int i5 = i3 >> 4;
            if (i5 > this.AhwBna.length) {
                int[] iArr = new int[69632];
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr[i6] = this.AhwBna[i6];
                }
                this.AhwBna = iArr;
            }
            do {
                this.copydefault[i4] = 0;
                this.AhwBna[i4] = this.values;
                i4++;
            } while (i4 < i5);
            this.djBIcL = i3;
        }
    }

    public final int KWHzl(int i) {
        int i2 = this.OLrzqt;
        int i3 = i + i2;
        int[] iArr = this.EZpvd;
        if (i3 > iArr.length) {
            int i4 = 131072;
            if (iArr.length >= 131072) {
                i4 = 1114112;
                if (iArr.length >= 1114112) {
                    throw new java.lang.AssertionError();
                }
            }
            int[] iArr2 = new int[i4];
            for (int i5 = 0; i5 < this.OLrzqt; i5++) {
                iArr2[i5] = this.EZpvd[i5];
            }
            this.EZpvd = iArr2;
        }
        this.OLrzqt = i3;
        return i2;
    }

    public final int copydefault(int i) {
        if (this.copydefault[i] == 1) {
            return this.AhwBna[i];
        }
        if (i < 4096) {
            int iKWHzl = KWHzl(64);
            int i2 = i & (-4);
            int i3 = i2;
            while (true) {
                KWHzl(iKWHzl, this.AhwBna[i3]);
                this.copydefault[i3] = 1;
                int[] iArr = this.AhwBna;
                int i4 = i3 + 1;
                iArr[i3] = iKWHzl;
                iKWHzl += 16;
                if (i4 >= i2 + 4) {
                    return iArr[i];
                }
                i3 = i4;
            }
        } else {
            int iKWHzl2 = KWHzl(16);
            if (iKWHzl2 < 0) {
                return iKWHzl2;
            }
            KWHzl(iKWHzl2, this.AhwBna[i]);
            this.copydefault[i] = 1;
            this.AhwBna[i] = iKWHzl2;
            return iKWHzl2;
        }
    }

    public final void AhwBna(int i) {
        this.values &= i;
        this.AEQbTJ &= i;
        this.AYXKKw &= i;
        int i2 = this.djBIcL;
        for (int i3 = 0; i3 < (i2 >> 4); i3++) {
            if (this.copydefault[i3] == 0) {
                int[] iArr = this.AhwBna;
                iArr[i3] = iArr[i3] & i;
            }
        }
        for (int i4 = 0; i4 < this.OLrzqt; i4++) {
            int[] iArr2 = this.EZpvd;
            iArr2[i4] = iArr2[i4] & i;
        }
    }

    public static boolean copydefault(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        while (i3 > 0 && iArr[i] == iArr2[i2]) {
            i++;
            i2++;
            i3--;
        }
        return i3 == 0;
    }

    public static boolean copydefault(char[] cArr, int i, int[] iArr, int i2, int i3) {
        while (i3 > 0 && cArr[i] == iArr[i2]) {
            i++;
            i2++;
            i3--;
        }
        return i3 == 0;
    }

    public static boolean OLrzqt(char[] cArr, int i, char[] cArr2, int i2, int i3) {
        while (i3 > 0 && cArr[i] == cArr2[i2]) {
            i++;
            i2++;
            i3--;
        }
        return i3 == 0;
    }

    public static boolean OLrzqt(int[] iArr, int i, int i2, int i3) {
        int i4 = i2 + i;
        while (i < i4 && iArr[i] == i3) {
            i++;
        }
        return i == i4;
    }

    public static int AEQbTJ(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4) {
        while (i <= i2 - i4) {
            if (OLrzqt(cArr, i, cArr2, i3, i4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int AEQbTJ(int[] iArr, int i, int i2, int i3, int i4) {
        while (i <= i2 - i4) {
            if (iArr[i] == i3) {
                for (int i5 = 1; i5 != i4; i5++) {
                    int i6 = i + i5;
                    if (iArr[i6] != i3) {
                        i = i6;
                    }
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int OLrzqt(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        do {
            i3--;
            if (i3 <= 0) {
                break;
            }
        } while (!copydefault(iArr, i - i3, iArr2, i2, i3));
        return i3;
    }

    public static int OLrzqt(char[] cArr, int i, int[] iArr, int i2, int i3) {
        do {
            i3--;
            if (i3 <= 0) {
                break;
            }
        } while (!copydefault(cArr, i - i3, iArr, i2, i3));
        return i3;
    }

    public static int KWHzl(char[] cArr, int i, char[] cArr2, int i2, int i3) {
        do {
            i3--;
            if (i3 <= 0) {
                break;
            }
        } while (!OLrzqt(cArr, i - i3, cArr2, i2, i3));
        return i3;
    }

    public static int copydefault(int[] iArr, int i, int i2, int i3) {
        int i4 = i;
        while (i - (i3 - 1) < i4 && iArr[i4 - 1] == i2) {
            i4--;
        }
        return i - i4;
    }

    public static boolean OLrzqt(int i, int[] iArr, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 4) {
            if (iArr[i3] == i) {
                return true;
            }
        }
        return false;
    }

    public final int copydefault() {
        int i = this.djBIcL >> 4;
        loop0: while (true) {
            if (i <= 0) {
                return 0;
            }
            int i2 = i - 1;
            if (this.copydefault[i2] == 0) {
                if (this.AhwBna[i2] != this.AYXKKw) {
                    break;
                }
                i = i2;
            } else {
                int i3 = this.AhwBna[i2];
                for (int i4 = 0; i4 != 16; i4++) {
                    if (this.EZpvd[i3 + i4] != this.AYXKKw) {
                        break loop0;
                    }
                }
                i = i2;
            }
        }
        return i << 4;
    }

    /* JADX INFO: renamed from: o.agR$StateListAnimator */
    public static final class StateListAnimator {
        public int AEQbTJ;
        public int[] OLrzqt = new int[32];
        public int[] KWHzl = new int[32];
        public int[] EZpvd = new int[32];
        public int copydefault = -1;

        public int KWHzl(int i, int i2, int i3) {
            int i4 = this.copydefault;
            if (i4 >= 0 && this.KWHzl[i4] == i3) {
                int[] iArr = this.EZpvd;
                iArr[i4] = iArr[i4] + i2;
                return this.OLrzqt[i4];
            }
            int i5 = 0;
            while (true) {
                int i6 = this.AEQbTJ;
                if (i5 >= i6) {
                    if (i6 == 32) {
                        return -2;
                    }
                    this.copydefault = i6;
                    this.OLrzqt[i6] = i;
                    this.KWHzl[i6] = i3;
                    int[] iArr2 = this.EZpvd;
                    this.AEQbTJ = i6 + 1;
                    iArr2[i6] = i2;
                    return -1;
                }
                if (this.KWHzl[i5] == i3) {
                    this.copydefault = i5;
                    int[] iArr3 = this.EZpvd;
                    iArr3[i5] = iArr3[i5] + i2;
                    return this.OLrzqt[i5];
                }
                i5++;
            }
        }

        public void AEQbTJ(int i, int i2, int i3) {
            int i4 = -1;
            int i5 = 69632;
            for (int i6 = 0; i6 < this.AEQbTJ; i6++) {
                int i7 = this.EZpvd[i6];
                if (i7 < i5) {
                    i4 = i6;
                    i5 = i7;
                }
            }
            this.copydefault = i4;
            this.OLrzqt[i4] = i;
            this.KWHzl[i4] = i3;
            this.EZpvd[i4] = i2;
        }

        public int AEQbTJ() {
            if (this.AEQbTJ == 0) {
                return -1;
            }
            int i = -1;
            int i2 = 0;
            for (int i3 = 0; i3 < this.AEQbTJ; i3++) {
                int i4 = this.EZpvd[i3];
                if (i4 > i2) {
                    i = i3;
                    i2 = i4;
                }
            }
            return this.OLrzqt[i];
        }
    }

    /* JADX INFO: renamed from: o.agR$Application */
    public static final class Application {
        public int AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int[] OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd(int i) {
            int i2 = i;
            for (int i3 = 1; i3 < this.KWHzl; i3++) {
                i2 = (i2 * 37) + i;
            }
            return i2;
        }

        private Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:724) call: o.agR.Application.<init>():void type: THIS */
        public /* synthetic */ Application(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void EZpvd(int i, int i2) {
            int i3;
            int i4 = (i - i2) + 1;
            if (i4 <= 4095) {
                this.AEQbTJ = 12;
                this.copydefault = 4095;
                i3 = 6007;
            } else if (i4 <= 32767) {
                this.AEQbTJ = 15;
                this.copydefault = 32767;
                i3 = 50021;
            } else if (i4 <= 131071) {
                this.AEQbTJ = 17;
                this.copydefault = 131071;
                i3 = 200003;
            } else {
                this.AEQbTJ = 21;
                this.copydefault = 2097151;
                i3 = 1500007;
            }
            int[] iArr = this.OLrzqt;
            if (iArr == null || i3 > iArr.length) {
                this.OLrzqt = new int[i3];
            } else {
                java.util.Arrays.fill(iArr, 0, i3, 0);
            }
            this.EZpvd = i3;
            this.KWHzl = i2;
        }

        public void KWHzl(int[] iArr, int i, int i2, int i3) {
            int i4 = this.KWHzl;
            int i5 = i2 - i4;
            if (i5 >= i) {
                i = i5 + 1;
            }
            while (i <= i3 - i4) {
                copydefault(iArr, null, i, AEQbTJ(iArr, i), i);
                i++;
            }
        }

        public void KWHzl(char[] cArr, int i, int i2, int i3) {
            int i4 = this.KWHzl;
            int i5 = i2 - i4;
            if (i5 >= i) {
                i = i5 + 1;
            }
            while (i <= i3 - i4) {
                copydefault(null, cArr, i, AEQbTJ(cArr, i), i);
                i++;
            }
        }

        public int KWHzl(int[] iArr, int[] iArr2, int i) {
            if (OLrzqt(iArr, null, iArr2, null, i, AEQbTJ(iArr2, i)) >= 0) {
                return (this.OLrzqt[r8] & this.copydefault) - 1;
            }
            return -1;
        }

        public int AEQbTJ(char[] cArr, int[] iArr, int i) {
            if (OLrzqt(null, cArr, iArr, null, i, AEQbTJ(iArr, i)) >= 0) {
                return (this.OLrzqt[r8] & this.copydefault) - 1;
            }
            return -1;
        }

        public int OLrzqt(char[] cArr, char[] cArr2, int i) {
            if (OLrzqt(null, cArr, null, cArr2, i, AEQbTJ(cArr2, i)) >= 0) {
                return (this.OLrzqt[r8] & this.copydefault) - 1;
            }
            return -1;
        }

        public int KWHzl(int[] iArr, int i) {
            if (KWHzl(iArr, i, EZpvd(i)) >= 0) {
                return (this.OLrzqt[r2] & this.copydefault) - 1;
            }
            return -1;
        }

        public final int AEQbTJ(int[] iArr, int i) {
            int i2 = this.KWHzl;
            int i3 = i + 1;
            int i4 = iArr[i];
            while (true) {
                int i5 = i3 + 1;
                i4 = (i4 * 37) + iArr[i3];
                if (i5 >= i2 + i) {
                    return i4;
                }
                i3 = i5;
            }
        }

        public final int AEQbTJ(char[] cArr, int i) {
            int i2 = this.KWHzl;
            int i3 = i + 1;
            int i4 = cArr[i];
            while (true) {
                int i5 = i3 + 1;
                int i6 = (i4 * 37) + cArr[i3];
                if (i5 >= i2 + i) {
                    return i6;
                }
                i3 = i5;
                i4 = i6;
            }
        }

        public final void copydefault(int[] iArr, char[] cArr, int i, int i2, int i3) {
            int iOLrzqt = OLrzqt(iArr, cArr, iArr, cArr, i, i2);
            if (iOLrzqt < 0) {
                this.OLrzqt[~iOLrzqt] = (i2 << this.AEQbTJ) | (i3 + 1);
            }
        }

        public final int OLrzqt(int[] iArr, char[] cArr, int[] iArr2, char[] cArr2, int i, int i2) {
            int i3 = this.AEQbTJ;
            int iOLrzqt = OLrzqt(i2, this.EZpvd - 1) + 1;
            int iAEQbTJ = iOLrzqt;
            while (true) {
                int i4 = this.OLrzqt[iAEQbTJ];
                if (i4 == 0) {
                    return ~iAEQbTJ;
                }
                int i5 = this.copydefault;
                if (((~i5) & i4) == (i2 << i3)) {
                    int i6 = (i4 & i5) - 1;
                    if (iArr != null) {
                        if (C7256agR.copydefault(iArr, i6, iArr2, i, this.KWHzl)) {
                            break;
                        }
                    } else if (iArr2 != null) {
                        if (C7256agR.copydefault(cArr, i6, iArr2, i, this.KWHzl)) {
                            break;
                        }
                    } else if (C7256agR.OLrzqt(cArr, i6, cArr2, i, this.KWHzl)) {
                        break;
                    }
                }
                iAEQbTJ = AEQbTJ(iOLrzqt, iAEQbTJ);
            }
            return iAEQbTJ;
        }

        public final int KWHzl(int[] iArr, int i, int i2) {
            int i3 = this.AEQbTJ;
            int iOLrzqt = OLrzqt(i2, this.EZpvd - 1) + 1;
            int iAEQbTJ = iOLrzqt;
            while (true) {
                int i4 = this.OLrzqt[iAEQbTJ];
                if (i4 == 0) {
                    return ~iAEQbTJ;
                }
                if (((~this.copydefault) & i4) == (i2 << i3)) {
                    if (C7256agR.OLrzqt(iArr, (i4 & r4) - 1, this.KWHzl, i)) {
                        return iAEQbTJ;
                    }
                }
                iAEQbTJ = AEQbTJ(iOLrzqt, iAEQbTJ);
            }
        }

        public final int AEQbTJ(int i, int i2) {
            return (i2 + i) % this.EZpvd;
        }

        public final int OLrzqt(int i, int i2) {
            int i3 = i % i2;
            return i3 < 0 ? i3 + i2 : i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(int i, StateListAnimator stateListAnimator) {
        int iKWHzl;
        int i2 = this.djBIcL;
        int i3 = CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA;
        int i4 = 64;
        int i5 = 4;
        for (int i6 = 0; i6 < (i2 >> 4); i6 += i5) {
            if (i6 == i) {
                i4 = 16;
                i5 = 1;
            }
            int i7 = this.AhwBna[i6];
            if (this.copydefault[i6] == 1) {
                int[] iArr = this.EZpvd;
                int i8 = iArr[i7];
                if (OLrzqt(iArr, i7 + 1, i4 - 1, i8)) {
                    this.copydefault[i6] = 0;
                    this.AhwBna[i6] = i8;
                    i7 = i8;
                    iKWHzl = stateListAnimator.KWHzl(i6, i5, i7);
                    if (iKWHzl == -2) {
                        int i9 = 4;
                        int i10 = 0;
                        while (true) {
                            if (i10 == i6) {
                                stateListAnimator.AEQbTJ(i6, i5, i7);
                                break;
                            }
                            if (i10 == i) {
                                i9 = 1;
                            }
                            if (this.copydefault[i10] == 0 && this.AhwBna[i10] == i7) {
                                stateListAnimator.AEQbTJ(i10, i9 + i5, i7);
                                iKWHzl = i10;
                                break;
                            }
                            i10 += i9;
                        }
                    }
                    if (iKWHzl >= 0) {
                        this.copydefault[i6] = 2;
                        this.AhwBna[i6] = iKWHzl;
                    }
                }
                i3 += i4;
            } else if (i5 > 1) {
                for (int i11 = i6 + 1; i11 < i6 + i5; i11++) {
                    if (this.AhwBna[i11] != i7) {
                        if (copydefault(i6) < 0) {
                            return -1;
                        }
                        i3 += i4;
                    }
                }
                iKWHzl = stateListAnimator.KWHzl(i6, i5, i7);
                if (iKWHzl == -2) {
                }
                if (iKWHzl >= 0) {
                    i3 += i4;
                }
            } else {
                iKWHzl = stateListAnimator.KWHzl(i6, i5, i7);
                if (iKWHzl == -2) {
                }
                if (iKWHzl >= 0) {
                }
            }
        }
        return i3;
    }

    public final int AEQbTJ(int i, int[] iArr, int i2, Application application) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < 128) {
            this.AhwBna[i5] = i4;
            i4 += 64;
            i5 += 4;
        }
        int i6 = 64;
        application.EZpvd(iArr.length, 64);
        application.KWHzl(iArr, 0, 0, i4);
        int i7 = this.djBIcL;
        int i8 = 0;
        int i9 = 4;
        for (int i10 = 8; i10 < (i7 >> 4); i10 += i9) {
            if (i10 == i) {
                application.EZpvd(iArr.length, 16);
                application.KWHzl(iArr, 0, 0, i4);
                i8 = i4;
                i6 = 16;
                i9 = 1;
            }
            byte b = this.copydefault[i10];
            if (b == 0) {
                int i11 = this.AhwBna[i10];
                int iKWHzl = application.KWHzl(iArr, i11);
                while (iKWHzl >= 0 && i10 == i2 && i10 >= i && iKWHzl < i8 && OLrzqt(iKWHzl, this.AhwBna, i)) {
                    iKWHzl = AEQbTJ(iArr, iKWHzl + 1, i4, i11, i6);
                }
                if (iKWHzl >= 0) {
                    this.AhwBna[i10] = iKWHzl;
                } else {
                    int iCopydefault = copydefault(iArr, i4, i11, i6);
                    this.AhwBna[i10] = i4 - iCopydefault;
                    i3 = i4;
                    while (iCopydefault < i6) {
                        iArr[i3] = i11;
                        iCopydefault++;
                        i3++;
                    }
                    application.KWHzl(iArr, 0, i4, i3);
                    i4 = i3;
                }
            } else if (b == 1) {
                int i12 = this.AhwBna[i10];
                int iKWHzl2 = application.KWHzl(iArr, this.EZpvd, i12);
                if (iKWHzl2 >= 0) {
                    this.AhwBna[i10] = iKWHzl2;
                } else {
                    int iOLrzqt = OLrzqt(iArr, i4, this.EZpvd, i12, i6);
                    this.AhwBna[i10] = i4 - iOLrzqt;
                    i3 = i4;
                    while (iOLrzqt < i6) {
                        iArr[i3] = this.EZpvd[iOLrzqt + i12];
                        i3++;
                        iOLrzqt++;
                    }
                    application.KWHzl(iArr, 0, i4, i3);
                    i4 = i3;
                }
            } else {
                int[] iArr2 = this.AhwBna;
                iArr2[i10] = iArr2[iArr2[i10]];
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0241 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(int i, Application application) {
        boolean z;
        int i2;
        char[] cArr;
        int iAEQbTJ;
        int i3;
        char[] cArr2;
        int i4;
        char[] cArr3;
        int i5;
        int i6;
        boolean z2;
        C7256agR c7256agR;
        int i7;
        int iKWHzl;
        int iAEQbTJ2;
        int i8;
        Application application2;
        int i9;
        int iOLrzqt;
        int[] iArr;
        int i10;
        int i11;
        C7256agR c7256agR2 = this;
        Application application3 = application;
        int i12 = i >> 2;
        if ((c7256agR2.djBIcL >> 6) <= i12) {
            c7256agR2.valueOf = 32767;
            return i12;
        }
        char[] cArr4 = new char[i12];
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            z = true;
            if (i14 >= i) {
                break;
            }
            int i16 = c7256agR2.AhwBna[i14];
            cArr4[i15] = (char) i16;
            if (i16 != c7256agR2.KWHzl) {
                i13 = -1;
            } else if (i13 < 0) {
                i13 = i15;
            } else if (c7256agR2.valueOf < 0 && (i15 - i13) + 1 == 32) {
                c7256agR2.valueOf = i13;
            }
            int i17 = i14;
            while (true) {
                i17++;
                if (i17 < i14 + 4) {
                    i16 += 16;
                    c7256agR2.AhwBna[i17] = i16;
                }
            }
            i15++;
            i14 = i17;
        }
        application3.EZpvd(i12, 32);
        application3.KWHzl(cArr4, 0, 0, i12);
        int i18 = c7256agR2.valueOf;
        int i19 = i < 4096 ? 0 : 4096;
        int i20 = c7256agR2.djBIcL >> 4;
        int i21 = 0;
        boolean z3 = false;
        int i22 = i19;
        while (true) {
            i2 = 65535;
            if (i22 >= i20) {
                break;
            }
            int i23 = 0;
            int i24 = i22;
            boolean z4 = z;
            while (true) {
                iArr = c7256agR2.AhwBna;
                int i25 = iArr[i24];
                i10 = i23 | i25;
                if (i25 != c7256agR2.KWHzl) {
                    z4 = false;
                }
                i11 = i24 + 1;
                if (i11 >= i22 + 32) {
                    break;
                }
                i23 = i10;
                i24 = i11;
            }
            if (z4) {
                c7256agR2.copydefault[i22] = 0;
                if (i18 < 0) {
                    if (i10 <= 65535) {
                        i21 += 32;
                    } else {
                        i21 += 36;
                        z3 = true;
                    }
                    i18 = 0;
                }
            } else if (i10 <= 65535) {
                int iAEQbTJ3 = application3.AEQbTJ(cArr4, iArr, i22);
                if (iAEQbTJ3 >= 0) {
                    c7256agR2.copydefault[i22] = 1;
                    c7256agR2.AhwBna[i22] = iAEQbTJ3;
                } else {
                    c7256agR2.copydefault[i22] = 2;
                    i21 += 32;
                }
            } else {
                c7256agR2.copydefault[i22] = 3;
                i21 += 36;
                z3 = true;
            }
            i22 = i11;
            z = true;
        }
        byte b = 3;
        int i26 = (i20 - i19) >> 5;
        int i27 = ((i26 + 31) >> 5) + i12;
        int i28 = i21 + i27 + i26 + 1;
        c7256agR2.gEmmrt = java.util.Arrays.copyOf(cArr4, i28);
        application3.EZpvd(i28, 32);
        Application application4 = null;
        byte b2 = 0;
        if (z3) {
            Application application5 = new Application(b2 == true ? 1 : 0);
            application5.EZpvd(i28, 36);
            application4 = application5;
        }
        char[] cArr5 = new char[i26];
        int i29 = c7256agR2.valueOf;
        int i30 = i27;
        int i31 = 0;
        while (i19 < i20) {
            byte b3 = c7256agR2.copydefault[i19];
            if (b3 == 0 && i29 < 0) {
                b3 = c7256agR2.KWHzl <= i2 ? (byte) 2 : b;
                i29 = 0;
            }
            if (b3 == 0) {
                iAEQbTJ2 = c7256agR2.valueOf;
            } else if (b3 == 1) {
                iAEQbTJ2 = c7256agR2.AhwBna[i19];
            } else if (b3 == 2) {
                iAEQbTJ2 = application3.AEQbTJ(c7256agR2.gEmmrt, c7256agR2.AhwBna, i19);
                if (iAEQbTJ2 < 0) {
                    if (i30 == i27) {
                        iOLrzqt = 0;
                        i9 = 32;
                    } else {
                        i9 = 32;
                        iOLrzqt = OLrzqt(c7256agR2.gEmmrt, i30, c7256agR2.AhwBna, i19, 32);
                    }
                    int i32 = i30 - iOLrzqt;
                    int i33 = i30;
                    while (iOLrzqt < i9) {
                        c7256agR2.gEmmrt[i33] = (char) c7256agR2.AhwBna[iOLrzqt + i19];
                        i33++;
                        iOLrzqt++;
                        i20 = i20;
                        i9 = 32;
                    }
                    i3 = i20;
                    application3.KWHzl(c7256agR2.gEmmrt, i27, i30, i33);
                    if (z3) {
                        application4.KWHzl(c7256agR2.gEmmrt, i27, i30, i33);
                    }
                    i30 = i33;
                    iAEQbTJ2 = i32;
                }
                i4 = i12;
                cArr3 = cArr5;
                i6 = i29;
                z2 = z3;
                i5 = i31;
                i7 = 36;
                application2 = application3;
                c7256agR = c7256agR2;
                if (c7256agR.valueOf < 0 && i6 >= 0) {
                    c7256agR.valueOf = iAEQbTJ2;
                }
                cArr3[i5] = (char) iAEQbTJ2;
                i19 += 32;
                i31 = i5 + 1;
                c7256agR2 = c7256agR;
                application3 = application2;
                i20 = i3;
                i12 = i4;
                i29 = i6;
                z3 = z2;
                cArr5 = cArr3;
                b = 3;
                i2 = 65535;
            } else {
                i3 = i20;
                int i34 = i19;
                int i35 = i30;
                while (true) {
                    int[] iArr2 = c7256agR2.AhwBna;
                    int i36 = iArr2[i34];
                    cArr2 = c7256agR2.gEmmrt;
                    i4 = i12;
                    cArr2[i35 + 1] = (char) i36;
                    int i37 = iArr2[i34 + 1];
                    cArr3 = cArr5;
                    cArr2[i35 + 2] = (char) i37;
                    int i38 = iArr2[i34 + 2];
                    i5 = i31;
                    cArr2[i35 + 3] = (char) i38;
                    int i39 = iArr2[i34 + 3];
                    i6 = i29;
                    cArr2[i35 + 4] = (char) i39;
                    int i40 = iArr2[i34 + 4];
                    z2 = z3;
                    cArr2[i35 + 5] = (char) i40;
                    int i41 = iArr2[i34 + 5];
                    cArr2[i35 + 6] = (char) i41;
                    int i42 = iArr2[i34 + 6];
                    cArr2[i35 + 7] = (char) i42;
                    int i43 = i34 + 8;
                    int i44 = iArr2[i34 + 7];
                    cArr2[i35 + 8] = (char) i44;
                    cArr2[i35] = (char) (((i44 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 16) | ((i42 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 14) | ((i37 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 4) | ((i36 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 2) | ((i38 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 6) | ((i39 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 8) | ((i40 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 10) | ((i41 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) >> 12));
                    if (i43 >= i19 + 32) {
                        break;
                    }
                    i35 += 9;
                    i34 = i43;
                    c7256agR2 = this;
                    i12 = i4;
                    i29 = i6;
                    z3 = z2;
                    cArr5 = cArr3;
                    i31 = i5;
                }
                int iOLrzqt2 = application4.OLrzqt(cArr2, cArr2, i30);
                if (iOLrzqt2 >= 0) {
                    iAEQbTJ2 = iOLrzqt2 | 32768;
                    i7 = 36;
                    c7256agR = this;
                    application2 = application;
                } else {
                    if (i30 == i27) {
                        iKWHzl = 0;
                        i7 = 36;
                        c7256agR = this;
                    } else {
                        c7256agR = this;
                        char[] cArr6 = c7256agR.gEmmrt;
                        i7 = 36;
                        iKWHzl = KWHzl(cArr6, i30, cArr6, i30, 36);
                    }
                    iAEQbTJ2 = (i30 - iKWHzl) | 32768;
                    if (iKWHzl > 0) {
                        i8 = i30;
                        while (iKWHzl < i7) {
                            char[] cArr7 = c7256agR.gEmmrt;
                            cArr7[i8] = cArr7[iKWHzl + i30];
                            i8++;
                            iKWHzl++;
                        }
                    } else {
                        i8 = i30 + 36;
                    }
                    application2 = application;
                    application2.KWHzl(c7256agR.gEmmrt, i27, i30, i8);
                    if (z2) {
                        application4.KWHzl(c7256agR.gEmmrt, i27, i30, i8);
                    }
                    i30 = i8;
                }
                if (c7256agR.valueOf < 0) {
                }
                cArr3[i5] = (char) iAEQbTJ2;
                i19 += 32;
                i31 = i5 + 1;
                c7256agR2 = c7256agR;
                application3 = application2;
                i20 = i3;
                i12 = i4;
                i29 = i6;
                z3 = z2;
                cArr5 = cArr3;
                b = 3;
                i2 = 65535;
            }
            i3 = i20;
            i4 = i12;
            cArr3 = cArr5;
            i6 = i29;
            z2 = z3;
            i5 = i31;
            i7 = 36;
            application2 = application3;
            c7256agR = c7256agR2;
            if (c7256agR.valueOf < 0) {
            }
            cArr3[i5] = (char) iAEQbTJ2;
            i19 += 32;
            i31 = i5 + 1;
            c7256agR2 = c7256agR;
            application3 = application2;
            i20 = i3;
            i12 = i4;
            i29 = i6;
            z3 = z2;
            cArr5 = cArr3;
            b = 3;
            i2 = 65535;
        }
        int i45 = i12;
        char[] cArr8 = cArr5;
        int i46 = i31;
        Application application6 = application3;
        C7256agR c7256agR3 = c7256agR2;
        if (c7256agR3.valueOf < 0) {
            c7256agR3.valueOf = 32767;
        }
        if (i30 >= 32799) {
            throw new java.lang.IndexOutOfBoundsException("The trie data exceeds limitations of the data structure.");
        }
        int i47 = i45;
        int i48 = 0;
        int i49 = 32;
        while (i48 < i46) {
            int i50 = i46 - i48;
            if (i50 >= i49) {
                cArr = cArr8;
                iAEQbTJ = application6.OLrzqt(c7256agR3.gEmmrt, cArr, i48);
            } else {
                cArr = cArr8;
                i49 = i50;
                iAEQbTJ = AEQbTJ(c7256agR3.gEmmrt, i27, i30, cArr, i48, i50);
            }
            if (iAEQbTJ < 0) {
                int iKWHzl2 = i30 == i27 ? 0 : KWHzl(c7256agR3.gEmmrt, i30, cArr, i48, i49);
                int i51 = i30;
                for (int i52 = iKWHzl2; i52 < i49; i52++) {
                    c7256agR3.gEmmrt[i51] = cArr[i52 + i48];
                    i51++;
                }
                application6.KWHzl(c7256agR3.gEmmrt, i27, i30, i51);
                iAEQbTJ = i30 - iKWHzl2;
                i30 = i51;
            }
            c7256agR3.gEmmrt[i47] = (char) iAEQbTJ;
            i48 += i49;
            i47++;
            cArr8 = cArr;
        }
        return i30;
    }

    public final int EZpvd(int i) {
        this.AYXKKw = AEQbTJ(1114111);
        int iCopydefault = (copydefault() + FrameMetricsAggregator.EVERY_DURATION) & (-512);
        if (iCopydefault == 1114112) {
            this.AYXKKw = this.values;
        }
        int i2 = i << 4;
        if (iCopydefault < i2) {
            for (int i3 = iCopydefault >> 4; i3 < i; i3++) {
                this.copydefault[i3] = 0;
                this.AhwBna[i3] = this.AYXKKw;
            }
            this.djBIcL = i2;
        } else {
            this.djBIcL = iCopydefault;
        }
        int[] iArr = new int[128];
        for (int i4 = 0; i4 < 128; i4++) {
            iArr[i4] = AEQbTJ(i4);
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, AEQbTJ(i, stateListAnimator));
        int iAEQbTJ = stateListAnimator.AEQbTJ();
        Application application = new Application(null);
        int iAEQbTJ2 = AEQbTJ(i, iArrCopyOf, iAEQbTJ, application);
        this.EZpvd = iArrCopyOf;
        this.OLrzqt = iAEQbTJ2;
        if (iAEQbTJ2 > 262159) {
            throw new java.lang.IndexOutOfBoundsException("The trie data exceeds limitations of the data structure.");
        }
        if (iAEQbTJ >= 0) {
            int i5 = this.AhwBna[iAEQbTJ];
            this.KWHzl = i5;
            this.values = iArrCopyOf[i5];
        } else {
            this.KWHzl = 1048575;
        }
        int iCopydefault2 = copydefault(i, application);
        this.djBIcL = iCopydefault;
        return iCopydefault2;
    }

    /* JADX INFO: renamed from: o.agR$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[CodePointTrie.ValueWidth.values().length];
            EZpvd = iArr;
            try {
                iArr[CodePointTrie.ValueWidth.BITS_32.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[CodePointTrie.ValueWidth.BITS_16.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[CodePointTrie.ValueWidth.BITS_8.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CodePointTrie copydefault(CodePointTrie.Type type, CodePointTrie.ValueWidth valueWidth) {
        char[] cArrCopyOf;
        int i = AnonymousClass1.EZpvd[valueWidth.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AhwBna(65535);
            } else if (i == 3) {
                AhwBna(255);
            } else {
                throw new java.lang.IllegalArgumentException();
            }
        }
        int i2 = type == CodePointTrie.Type.FAST ? 65536 : 4096;
        int iEZpvd = EZpvd(i2 >> 4);
        CodePointTrie.ValueWidth valueWidth2 = CodePointTrie.ValueWidth.BITS_32;
        if (valueWidth == valueWidth2 && (iEZpvd & 1) != 0) {
            this.gEmmrt[iEZpvd] = 65518;
            iEZpvd++;
        }
        if (valueWidth == CodePointTrie.ValueWidth.BITS_16) {
            int i3 = this.OLrzqt;
            if (((iEZpvd ^ i3) & 1) != 0) {
                int[] iArr = this.EZpvd;
                this.OLrzqt = i3 + 1;
                iArr[i3] = this.AEQbTJ;
            }
            int[] iArr2 = this.EZpvd;
            int i4 = this.OLrzqt;
            int i5 = iArr2[i4 - 1];
            int i6 = this.AEQbTJ;
            if (i5 != i6 || iArr2[i4 - 2] != this.AYXKKw) {
                iArr2[i4] = this.AYXKKw;
                this.OLrzqt = i4 + 2;
                iArr2[i4 + 1] = i6;
            }
        } else if (valueWidth == valueWidth2) {
            int[] iArr3 = this.EZpvd;
            int i7 = this.OLrzqt;
            int i8 = iArr3[i7 - 1];
            int i9 = this.AEQbTJ;
            if (i8 != i9 || iArr3[i7 - 2] != this.AYXKKw) {
                int i10 = this.AYXKKw;
                if (i8 != i10) {
                    this.OLrzqt = i7 + 1;
                    iArr3[i7] = i10;
                }
                int i11 = this.OLrzqt;
                this.OLrzqt = i11 + 1;
                iArr3[i11] = i9;
            }
        } else {
            int i12 = this.OLrzqt;
            int i13 = ((iEZpvd * 2) + i12) & 3;
            if (i13 == 0) {
                int[] iArr4 = this.EZpvd;
                if (iArr4[i12 - 1] != this.AEQbTJ || iArr4[i12 - 2] != this.AYXKKw) {
                    if (i13 == 3) {
                        int[] iArr5 = this.EZpvd;
                        if (iArr5[i12 - 1] == this.AYXKKw) {
                            this.OLrzqt = i12 + 1;
                            iArr5[i12] = this.AEQbTJ;
                        } else {
                            while (i13 != 2) {
                                int[] iArr6 = this.EZpvd;
                                int i14 = this.OLrzqt;
                                this.OLrzqt = i14 + 1;
                                iArr6[i14] = this.AYXKKw;
                                i13 = (i13 + 1) & 3;
                            }
                            int[] iArr7 = this.EZpvd;
                            int i15 = this.OLrzqt;
                            iArr7[i15] = this.AYXKKw;
                            this.OLrzqt = i15 + 2;
                            iArr7[i15 + 1] = this.AEQbTJ;
                        }
                    }
                }
            }
        }
        int i16 = 0;
        if (this.djBIcL <= i2) {
            cArrCopyOf = new char[iEZpvd];
            int i17 = 0;
            for (int i18 = 0; i18 < iEZpvd; i18++) {
                cArrCopyOf[i18] = (char) this.AhwBna[i17];
                i17 += 4;
            }
        } else {
            cArrCopyOf = this.gEmmrt;
            if (iEZpvd == cArrCopyOf.length) {
                this.gEmmrt = null;
            } else {
                cArrCopyOf = java.util.Arrays.copyOf(cArrCopyOf, iEZpvd);
            }
        }
        char[] cArr = cArrCopyOf;
        int i19 = AnonymousClass1.EZpvd[valueWidth.ordinal()];
        if (i19 == 1) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.EZpvd, this.OLrzqt);
            return type == CodePointTrie.Type.FAST ? new CodePointTrie.Fragment(cArr, iArrCopyOf, this.djBIcL, this.valueOf, this.KWHzl) : new CodePointTrie.PictureInPictureParams(cArr, iArrCopyOf, this.djBIcL, this.valueOf, this.KWHzl);
        }
        if (i19 == 2) {
            char[] cArr2 = new char[this.OLrzqt];
            while (i16 < this.OLrzqt) {
                cArr2[i16] = (char) this.EZpvd[i16];
                i16++;
            }
            return type == CodePointTrie.Type.FAST ? new CodePointTrie.FragmentManager(cArr, cArr2, this.djBIcL, this.valueOf, this.KWHzl) : new CodePointTrie.LoaderManager(cArr, cArr2, this.djBIcL, this.valueOf, this.KWHzl);
        }
        if (i19 == 3) {
            byte[] bArr = new byte[this.OLrzqt];
            while (i16 < this.OLrzqt) {
                bArr[i16] = (byte) this.EZpvd[i16];
                i16++;
            }
            return type == CodePointTrie.Type.FAST ? new CodePointTrie.Dialog(cArr, bArr, this.djBIcL, this.valueOf, this.KWHzl) : new CodePointTrie.TaskStackBuilder(cArr, bArr, this.djBIcL, this.valueOf, this.KWHzl);
        }
        throw new java.lang.IllegalArgumentException();
    }
}
