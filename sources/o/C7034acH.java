package o;

import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.impl.Trie2;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import o.C7024abY;

/* JADX INFO: renamed from: o.acH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7034acH {
    public static final C7034acH OLrzqt;
    public char[] AYXKKw;
    public java.lang.String EZpvd;
    public int[] KWHzl;
    public C7032acF valueOf;
    public static final byte[] AEQbTJ = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 4, 5, 5, 6, 5, 6, 6, 7, 5, 6, 6, 7, 6, 7, 7, 8};
    public static final java.lang.StringBuilder copydefault = new java.lang.StringBuilder();

    /* JADX INFO: renamed from: o.acH$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(int i);

        int OLrzqt();
    }

    /* JADX INFO: renamed from: o.acH$TaskDescription */
    public static final class TaskDescription {
        public static final byte[] copydefault = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 32, 32, 32, 32, 32, 32, 32, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, -121, 1, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO};
        public static final byte[] KWHzl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 32, 32, 32, 32, 32, 32, 32, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, -121, 1, 0, 1, 0, 1, 0, UnsignedBytes.MAX_POWER_OF_TWO};
        public static final byte[] AEQbTJ = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, -32, -32, -32, -32, -32, -32, -32, 121, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, UnsignedBytes.MAX_POWER_OF_TWO};
        public static final byte[] OLrzqt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32, -32, -32, -32, -32, -32, -32, -32, UnsignedBytes.MAX_POWER_OF_TWO, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, -32, -32, -32, -32, -32, -32, -32, 121, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, UnsignedBytes.MAX_POWER_OF_TWO};
    }

    public static final boolean AEQbTJ(int i) {
        return (i & 2) != 0;
    }

    public static final boolean AhwBna(int i) {
        return (i & 8) != 0;
    }

    public static final int EZpvd(int i) {
        return i >> 4;
    }

    public static final int KWHzl(int i) {
        return ((short) i) >> 7;
    }

    public static final boolean KWHzl(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    public static final int OLrzqt(int i) {
        return i & 3;
    }

    public static final int copydefault(int i) {
        return i & 7;
    }

    private C7034acH() throws java.io.IOException {
        KWHzl(C7024abY.copydefault("ucase.icu"));
    }

    public final void KWHzl(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        C7024abY.OLrzqt(byteBuffer, 1665225541, new Application());
        int i = byteBuffer.getInt();
        if (i < 16) {
            throw new java.io.IOException("indexes[0] too small in ucase.icu");
        }
        int[] iArr = new int[i];
        this.KWHzl = iArr;
        iArr[0] = i;
        for (int i2 = 1; i2 < i; i2++) {
            this.KWHzl[i2] = byteBuffer.getInt();
        }
        C7032acF c7032acFAEQbTJ = C7032acF.AEQbTJ(byteBuffer);
        this.valueOf = c7032acFAEQbTJ;
        int i3 = this.KWHzl[2];
        int iEZpvd = c7032acFAEQbTJ.EZpvd();
        if (iEZpvd > i3) {
            throw new java.io.IOException("ucase.icu: not enough bytes for the trie");
        }
        C7024abY.EZpvd(byteBuffer, i3 - iEZpvd);
        int i4 = this.KWHzl[3];
        if (i4 > 0) {
            this.EZpvd = C7024abY.AEQbTJ(byteBuffer, i4, 0);
        }
        int i5 = this.KWHzl[4];
        if (i5 > 0) {
            this.AYXKKw = C7024abY.OLrzqt(byteBuffer, i5, 0);
        }
    }

    /* JADX INFO: renamed from: o.acH$Application */
    public static final class Application implements C7024abY.ActionBar {
        private Application() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return bArr[0] == 4;
        }
    }

    public final void KWHzl(UnicodeSet unicodeSet) {
        for (Trie2.TaskDescription taskDescription : this.valueOf) {
            if (taskDescription.EZpvd) {
                return;
            } else {
                unicodeSet.KWHzl(taskDescription.KWHzl);
            }
        }
    }

    public static final byte OLrzqt(int i, int i2) {
        return AEQbTJ[i & ((1 << i2) - 1)];
    }

    public final long EZpvd(int i, int i2, int i3) {
        int iOLrzqt;
        long jCharAt;
        if ((i & 256) == 0) {
            iOLrzqt = i3 + OLrzqt(i, i2);
            jCharAt = this.EZpvd.charAt(iOLrzqt);
        } else {
            int iOLrzqt2 = i3 + (OLrzqt(i, i2) * 2);
            int i4 = iOLrzqt2 + 1;
            long jCharAt2 = ((long) this.EZpvd.charAt(iOLrzqt2)) << 16;
            iOLrzqt = i4;
            jCharAt = jCharAt2 | ((long) this.EZpvd.charAt(i4));
        }
        return jCharAt | (((long) iOLrzqt) << 32);
    }

    public final int AEQbTJ(int i, int i2, int i3) {
        if ((i & 256) == 0) {
            return this.EZpvd.charAt(i3 + OLrzqt(i, i2));
        }
        int iOLrzqt = i3 + (OLrzqt(i, i2) * 2);
        return (this.EZpvd.charAt(iOLrzqt) << 16) | this.EZpvd.charAt(iOLrzqt + 1);
    }

    public final void KWHzl(int i, UnicodeSet unicodeSet) {
        int i2;
        int iKWHzl;
        if (i == 73) {
            unicodeSet.KWHzl(105);
            return;
        }
        if (i == 105) {
            unicodeSet.KWHzl(73);
            return;
        }
        if (i == 304) {
            unicodeSet.AEQbTJ("i̇");
            return;
        }
        if (i != 305) {
            int iOLrzqt = this.valueOf.OLrzqt(i);
            if (!AhwBna(iOLrzqt)) {
                if (OLrzqt(iOLrzqt) == 0 || (iKWHzl = KWHzl(iOLrzqt)) == 0) {
                    return;
                }
                unicodeSet.KWHzl(i + iKWHzl);
                return;
            }
            int iEZpvd = EZpvd(iOLrzqt);
            int i3 = iEZpvd + 1;
            char cCharAt = this.EZpvd.charAt(iEZpvd);
            int i4 = 0;
            for (int i5 = 0; i5 <= 3; i5++) {
                if (KWHzl(cCharAt, i5)) {
                    i = AEQbTJ(cCharAt, i5, i3);
                    unicodeSet.KWHzl(i);
                }
            }
            if (KWHzl(cCharAt, 4)) {
                int iAEQbTJ = AEQbTJ(cCharAt, 4, i3);
                unicodeSet.KWHzl((cCharAt & 1024) == 0 ? i + iAEQbTJ : i - iAEQbTJ);
            }
            if (KWHzl(cCharAt, 6)) {
                long jEZpvd = EZpvd(cCharAt, 6, i3);
                i4 = ((int) (jEZpvd >> 32)) + 1;
                i2 = ((int) jEZpvd) & 15;
            } else {
                i2 = 0;
            }
            if (KWHzl(cCharAt, 7)) {
                long jEZpvd2 = EZpvd(cCharAt, 7, i3);
                int i6 = (int) jEZpvd2;
                int i7 = 65535 & i6;
                int i8 = ((int) (jEZpvd2 >> 32)) + 1 + (i6 & 15);
                int i9 = (i7 >> 4) & 15;
                if (i9 != 0) {
                    int i10 = i9 + i8;
                    unicodeSet.AEQbTJ(this.EZpvd.substring(i8, i10));
                    i8 = i10;
                }
                i4 = (i7 >> 12) + i8 + ((i7 >> 8) & 15);
            }
            int iCopydefault = i4;
            while (iCopydefault < i2 + i4) {
                int iCodePointAt = this.EZpvd.codePointAt(iCopydefault);
                unicodeSet.KWHzl(iCodePointAt);
                iCopydefault += C7242agD.copydefault(iCodePointAt);
            }
        }
    }

    public final int copydefault(java.lang.String str, int i, int i2) {
        int length = str.length();
        int i3 = i2 - length;
        int i4 = 0;
        while (true) {
            char cCharAt = str.charAt(i4);
            char[] cArr = this.AYXKKw;
            int i5 = i + 1;
            char c = cArr[i];
            if (c == 0) {
                return 1;
            }
            int i6 = cCharAt - c;
            if (i6 != 0) {
                return i6;
            }
            length--;
            if (length <= 0) {
                if (i3 == 0 || cArr[i5] == 0) {
                    return 0;
                }
                return -i3;
            }
            i4++;
            i = i5;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x002c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x001d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x001d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [char, int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [char] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final boolean OLrzqt(java.lang.String str, UnicodeSet unicodeSet) {
        int length;
        if (this.AYXKKw == null || str == null || (length = str.length()) <= 1) {
            return false;
        }
        char[] cArr = this.AYXKKw;
        char c = cArr[0];
        char c2 = cArr[1];
        char cCopydefault = cArr[2];
        if (length > cCopydefault) {
            return false;
        }
        int i = 0;
        while (i < c) {
            int i2 = (i + (c == true ? 1 : 0)) / 2;
            int i3 = i2 + 1;
            int i4 = i3 * c2;
            int iCopydefault = copydefault(str, i4, (int) cCopydefault);
            if (iCopydefault == 0) {
                while (cCopydefault < c2) {
                    char[] cArr2 = this.AYXKKw;
                    if (cArr2[i4 + cCopydefault] == 0) {
                        break;
                    }
                    int iKWHzl = C7242agD.KWHzl(cArr2, i4, cArr2.length, cCopydefault);
                    unicodeSet.KWHzl(iKWHzl);
                    KWHzl(iKWHzl, unicodeSet);
                    cCopydefault += C7242agD.copydefault(iKWHzl);
                }
                return true;
            }
            if (iCopydefault < 0) {
                c = i2;
            } else {
                i = i3;
            }
        }
        return false;
    }

    public final int valueOf(int i) {
        return OLrzqt(this.valueOf.OLrzqt(i));
    }

    public final int gEmmrt(int i) {
        return copydefault(this.valueOf.OLrzqt(i));
    }

    public final int AYXKKw(int i) {
        int iOLrzqt = this.valueOf.OLrzqt(i);
        return !AhwBna(iOLrzqt) ? iOLrzqt & 96 : (this.EZpvd.charAt(EZpvd(iOLrzqt)) >> 7) & 96;
    }

    public final boolean DbNXlk(int i) {
        return AYXKKw(i) == 32;
    }

    public final boolean djBIcL(int i) {
        int iOLrzqt = this.valueOf.OLrzqt(i);
        return !AhwBna(iOLrzqt) ? (iOLrzqt & 16) != 0 : (this.EZpvd.charAt(EZpvd(iOLrzqt)) & 2048) != 0;
    }

    public static final int KWHzl(ULocale uLocale) {
        return KWHzl(uLocale.getLanguage());
    }

    public static final int KWHzl(java.lang.String str) {
        if (str.length() == 2) {
            if (str.equals("en") || str.charAt(0) > 't') {
                return 1;
            }
            if (str.equals("tr") || str.equals("az")) {
                return 2;
            }
            if (str.equals("el")) {
                return 4;
            }
            if (str.equals("lt")) {
                return 3;
            }
            if (str.equals("nl")) {
                return 5;
            }
            if (str.equals("hy")) {
                return 6;
            }
        } else if (str.length() == 3) {
            if (str.equals("tur") || str.equals("aze")) {
                return 2;
            }
            if (str.equals("ell")) {
                return 4;
            }
            if (str.equals("lit")) {
                return 3;
            }
            if (str.equals("nld")) {
                return 5;
            }
            if (str.equals("hye")) {
                return 6;
            }
        }
        return 1;
    }

    public final boolean KWHzl(StateListAnimator stateListAnimator, int i) {
        if (stateListAnimator == null) {
            return false;
        }
        stateListAnimator.AEQbTJ(i);
        while (true) {
            int iOLrzqt = stateListAnimator.OLrzqt();
            if (iOLrzqt < 0) {
                break;
            }
            int iGEmmrt = gEmmrt(iOLrzqt);
            if ((iGEmmrt & 4) == 0) {
                if (iGEmmrt != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean copydefault(StateListAnimator stateListAnimator) {
        int iAYXKKw;
        if (stateListAnimator == null) {
            return false;
        }
        stateListAnimator.AEQbTJ(-1);
        do {
            int iOLrzqt = stateListAnimator.OLrzqt();
            if (iOLrzqt < 0) {
                break;
            }
            iAYXKKw = AYXKKw(iOLrzqt);
            if (iAYXKKw == 32) {
                return true;
            }
        } while (iAYXKKw == 96);
        return false;
    }

    public final boolean EZpvd(StateListAnimator stateListAnimator) {
        int iOLrzqt;
        if (stateListAnimator == null) {
            return false;
        }
        stateListAnimator.AEQbTJ(-1);
        do {
            iOLrzqt = stateListAnimator.OLrzqt();
            if (iOLrzqt < 0) {
                break;
            }
            if (iOLrzqt == 73) {
                return true;
            }
        } while (AYXKKw(iOLrzqt) == 96);
        return false;
    }

    public final boolean KWHzl(StateListAnimator stateListAnimator) {
        int iAYXKKw;
        if (stateListAnimator == null) {
            return false;
        }
        stateListAnimator.AEQbTJ(1);
        do {
            int iOLrzqt = stateListAnimator.OLrzqt();
            if (iOLrzqt < 0) {
                break;
            }
            iAYXKKw = AYXKKw(iOLrzqt);
            if (iAYXKKw == 64) {
                return true;
            }
        } while (iAYXKKw == 96);
        return false;
    }

    public final boolean OLrzqt(StateListAnimator stateListAnimator) {
        int iOLrzqt;
        if (stateListAnimator == null) {
            return false;
        }
        stateListAnimator.AEQbTJ(1);
        do {
            iOLrzqt = stateListAnimator.OLrzqt();
            if (iOLrzqt < 0) {
                break;
            }
            if (iOLrzqt == 775) {
                return true;
            }
        } while (AYXKKw(iOLrzqt) == 96);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int KWHzl(int i, StateListAnimator stateListAnimator, java.lang.Appendable appendable, int i2) {
        int iAEQbTJ;
        int iOLrzqt = this.valueOf.OLrzqt(i);
        if (!AhwBna(iOLrzqt)) {
            iAEQbTJ = AEQbTJ(iOLrzqt) ? KWHzl(iOLrzqt) + i : i;
        } else {
            int iEZpvd = EZpvd(iOLrzqt);
            int i3 = iEZpvd + 1;
            char cCharAt = this.EZpvd.charAt(iEZpvd);
            if ((cCharAt & 16384) != 0) {
                if (i2 == 3 && (((i == 73 || i == 74 || i == 302) && KWHzl(stateListAnimator)) || i == 204 || i == 205 || i == 296)) {
                    try {
                        if (i == 73) {
                            appendable.append("i̇");
                            return 2;
                        }
                        if (i == 74) {
                            appendable.append("j̇");
                            return 2;
                        }
                        if (i == 204) {
                            appendable.append("i̇̀");
                            return 3;
                        }
                        if (i == 205) {
                            appendable.append("i̇́");
                            return 3;
                        }
                        if (i == 296) {
                            appendable.append("i̇̃");
                            return 3;
                        }
                        if (i != 302) {
                            return 0;
                        }
                        appendable.append("į̇");
                        return 2;
                    } catch (java.io.IOException e) {
                        throw new ICUUncheckedIOException(e);
                    }
                }
                if (i2 == 2 && i == 304) {
                    return 105;
                }
                if (i2 == 2 && i == 775 && EZpvd(stateListAnimator)) {
                    return 0;
                }
                if (i2 == 2 && i == 73 && !OLrzqt(stateListAnimator)) {
                    return 305;
                }
                if (i == 304) {
                    try {
                        appendable.append("i̇");
                        return 2;
                    } catch (java.io.IOException e2) {
                        throw new ICUUncheckedIOException(e2);
                    }
                }
                if (i == 931 && !KWHzl(stateListAnimator, 1) && KWHzl(stateListAnimator, -1)) {
                    return 962;
                }
            } else if (KWHzl(cCharAt, 7)) {
                long jEZpvd = EZpvd(cCharAt, 7, i3);
                int i4 = ((int) jEZpvd) & 15;
                if (i4 != 0) {
                    int i5 = ((int) (jEZpvd >> 32)) + 1;
                    try {
                        appendable.append(this.EZpvd, i5, i5 + i4);
                        return i4;
                    } catch (java.io.IOException e3) {
                        throw new ICUUncheckedIOException(e3);
                    }
                }
            }
            if (KWHzl(cCharAt, 4) && AEQbTJ(iOLrzqt)) {
                int iAEQbTJ2 = AEQbTJ(cCharAt, 4, i3);
                return (cCharAt & 1024) == 0 ? i + iAEQbTJ2 : i - iAEQbTJ2;
            }
            if (KWHzl(cCharAt, 0)) {
                iAEQbTJ = AEQbTJ(cCharAt, 0, i3);
            }
        }
        return iAEQbTJ == i ? ~iAEQbTJ : iAEQbTJ;
    }

    public final int OLrzqt(int i, StateListAnimator stateListAnimator, java.lang.Appendable appendable, int i2, boolean z) {
        int iAEQbTJ;
        int iOLrzqt = this.valueOf.OLrzqt(i);
        if (!AhwBna(iOLrzqt)) {
            iAEQbTJ = OLrzqt(iOLrzqt) == 1 ? KWHzl(iOLrzqt) + i : i;
        } else {
            int iEZpvd = EZpvd(iOLrzqt);
            int i3 = iEZpvd + 1;
            char cCharAt = this.EZpvd.charAt(iEZpvd);
            int i4 = 3;
            if ((cCharAt & 16384) != 0) {
                if (i2 == 2 && i == 105) {
                    return 304;
                }
                if (i2 == 3 && i == 775 && copydefault(stateListAnimator)) {
                    return 0;
                }
                if (i == 1415) {
                    try {
                        if (i2 == 6) {
                            appendable.append(z ? "ԵՎ" : "Եվ");
                        } else {
                            appendable.append(z ? "ԵՒ" : "Եւ");
                        }
                        return 2;
                    } catch (java.io.IOException e) {
                        throw new ICUUncheckedIOException(e);
                    }
                }
            } else if (KWHzl(cCharAt, 7)) {
                long jEZpvd = EZpvd(cCharAt, 7, i3);
                int i5 = (int) jEZpvd;
                int i6 = 65535 & i5;
                int i7 = ((int) (jEZpvd >> 32)) + 1 + (i5 & 15) + ((i6 >> 4) & 15);
                int i8 = i6 >> 8;
                if (!z) {
                    i7 += i8 & 15;
                    i8 = i6 >> 12;
                }
                int i9 = i8 & 15;
                if (i9 != 0) {
                    try {
                        appendable.append(this.EZpvd, i7, i7 + i9);
                        return i9;
                    } catch (java.io.IOException e2) {
                        throw new ICUUncheckedIOException(e2);
                    }
                }
            }
            if (KWHzl(cCharAt, 4) && OLrzqt(iOLrzqt) == 1) {
                int iAEQbTJ2 = AEQbTJ(cCharAt, 4, i3);
                return (cCharAt & 1024) == 0 ? i + iAEQbTJ2 : i - iAEQbTJ2;
            }
            if (z || !KWHzl(cCharAt, 3)) {
                if (!KWHzl(cCharAt, 2)) {
                    return ~i;
                }
                i4 = 2;
            }
            iAEQbTJ = AEQbTJ(cCharAt, i4, i3);
        }
        return iAEQbTJ == i ? ~iAEQbTJ : iAEQbTJ;
    }

    public final int copydefault(int i, StateListAnimator stateListAnimator, java.lang.Appendable appendable, int i2) {
        return OLrzqt(i, stateListAnimator, appendable, i2, true);
    }

    public final int OLrzqt(int i, StateListAnimator stateListAnimator, java.lang.Appendable appendable, int i2) {
        return OLrzqt(i, stateListAnimator, appendable, i2, false);
    }

    public final int copydefault(int i, int i2) {
        int iOLrzqt = this.valueOf.OLrzqt(i);
        if (!AhwBna(iOLrzqt)) {
            return AEQbTJ(iOLrzqt) ? i + KWHzl(iOLrzqt) : i;
        }
        int iEZpvd = EZpvd(iOLrzqt);
        int i3 = iEZpvd + 1;
        char cCharAt = this.EZpvd.charAt(iEZpvd);
        if ((32768 & cCharAt) != 0) {
            if ((i2 & 7) == 0) {
                if (i == 73) {
                    return 105;
                }
                if (i == 304) {
                    return i;
                }
            } else {
                if (i == 73) {
                    return 305;
                }
                if (i == 304) {
                    return 105;
                }
            }
        }
        if ((cCharAt & 512) != 0) {
            return i;
        }
        if (KWHzl(cCharAt, 4) && AEQbTJ(iOLrzqt)) {
            int iAEQbTJ = AEQbTJ(cCharAt, 4, i3);
            return (cCharAt & 1024) == 0 ? i + iAEQbTJ : i - iAEQbTJ;
        }
        int i4 = 1;
        if (!KWHzl(cCharAt, 1)) {
            i4 = 0;
            if (!KWHzl(cCharAt, 0)) {
                return i;
            }
        }
        return AEQbTJ(cCharAt, i4, i3);
    }

    public final int copydefault(int i, java.lang.Appendable appendable, int i2) {
        int iAEQbTJ;
        int iOLrzqt = this.valueOf.OLrzqt(i);
        if (!AhwBna(iOLrzqt)) {
            iAEQbTJ = AEQbTJ(iOLrzqt) ? KWHzl(iOLrzqt) + i : i;
        } else {
            int iEZpvd = EZpvd(iOLrzqt);
            int i3 = iEZpvd + 1;
            char cCharAt = this.EZpvd.charAt(iEZpvd);
            int i4 = 1;
            if ((32768 & cCharAt) != 0) {
                if ((i2 & 7) == 0) {
                    if (i == 73) {
                        return 105;
                    }
                    if (i == 304) {
                        try {
                            appendable.append("i̇");
                            return 2;
                        } catch (java.io.IOException e) {
                            throw new ICUUncheckedIOException(e);
                        }
                    }
                } else {
                    if (i == 73) {
                        return 305;
                    }
                    if (i == 304) {
                        return 105;
                    }
                }
            } else if (KWHzl(cCharAt, 7)) {
                long jEZpvd = EZpvd(cCharAt, 7, i3);
                int i5 = (int) jEZpvd;
                int i6 = ((int) (jEZpvd >> 32)) + 1 + (i5 & 15);
                int i7 = ((i5 & 65535) >> 4) & 15;
                if (i7 != 0) {
                    try {
                        appendable.append(this.EZpvd, i6, i6 + i7);
                        return i7;
                    } catch (java.io.IOException e2) {
                        throw new ICUUncheckedIOException(e2);
                    }
                }
            }
            if ((cCharAt & 512) != 0) {
                return ~i;
            }
            if (KWHzl(cCharAt, 4) && AEQbTJ(iOLrzqt)) {
                int iAEQbTJ2 = AEQbTJ(cCharAt, 4, i3);
                return (cCharAt & 1024) == 0 ? i + iAEQbTJ2 : i - iAEQbTJ2;
            }
            if (!KWHzl(cCharAt, 1)) {
                i4 = 0;
                if (!KWHzl(cCharAt, 0)) {
                    return ~i;
                }
            }
            iAEQbTJ = AEQbTJ(cCharAt, i4, i3);
        }
        return iAEQbTJ == i ? ~iAEQbTJ : iAEQbTJ;
    }

    static {
        try {
            OLrzqt = new C7034acH();
        } catch (java.io.IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public final boolean AEQbTJ(int i, int i2) {
        if (i2 == 22) {
            return 1 == valueOf(i);
        }
        if (i2 == 27) {
            return DbNXlk(i);
        }
        if (i2 == 30) {
            return 2 == valueOf(i);
        }
        if (i2 == 34) {
            return djBIcL(i);
        }
        if (i2 != 55) {
            switch (i2) {
                case 49:
                    if (valueOf(i) == 0) {
                        break;
                    }
                    break;
                case 50:
                    if ((gEmmrt(i) >> 2) == 0) {
                        break;
                    }
                    break;
                case 51:
                    java.lang.StringBuilder sb = copydefault;
                    sb.setLength(0);
                    if (KWHzl(i, null, sb, 1) < 0) {
                        break;
                    }
                    break;
                case 52:
                    java.lang.StringBuilder sb2 = copydefault;
                    sb2.setLength(0);
                    if (copydefault(i, null, sb2, 1) < 0) {
                        break;
                    }
                    break;
                case 53:
                    java.lang.StringBuilder sb3 = copydefault;
                    sb3.setLength(0);
                    if (OLrzqt(i, null, sb3, 1) < 0) {
                        break;
                    }
                    break;
            }
            return false;
        }
        java.lang.StringBuilder sb4 = copydefault;
        sb4.setLength(0);
        return KWHzl(i, null, sb4, 1) >= 0 || copydefault(i, null, sb4, 1) >= 0 || OLrzqt(i, null, sb4, 1) >= 0;
    }

    public static C7032acF KWHzl() {
        return OLrzqt.valueOf;
    }
}
