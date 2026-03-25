package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class yEG {
    public static final int copydefault(byte[] bArr, int i, int i2) {
        int i3;
        byte bOLrzqt = C56398yDx.OLrzqt(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                byte bOLrzqt2 = C56398yDx.OLrzqt(bArr, i);
                i3 = bOLrzqt & UnsignedBytes.MAX_VALUE;
                if (Intrinsics.copydefault(bOLrzqt2 & UnsignedBytes.MAX_VALUE, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.copydefault(C56398yDx.OLrzqt(bArr, i2) & UnsignedBytes.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bOLrzqt3 = C56398yDx.OLrzqt(bArr, i);
                C56398yDx.copydefault(bArr, i, C56398yDx.OLrzqt(bArr, i2));
                C56398yDx.copydefault(bArr, i2, bOLrzqt3);
                i++;
                i2--;
            }
        }
        return i;
    }

    public static final void OLrzqt(byte[] bArr, int i, int i2) {
        int iCopydefault = copydefault(bArr, i, i2);
        int i3 = iCopydefault - 1;
        if (i < i3) {
            OLrzqt(bArr, i, i3);
        }
        if (iCopydefault < i2) {
            OLrzqt(bArr, iCopydefault, i2);
        }
    }

    public static final int EZpvd(short[] sArr, int i, int i2) {
        int i3;
        short sOLrzqt = yDA.OLrzqt(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                short sOLrzqt2 = yDA.OLrzqt(sArr, i);
                i3 = sOLrzqt & HPKE.aead_EXPORT_ONLY;
                if (Intrinsics.copydefault(sOLrzqt2 & HPKE.aead_EXPORT_ONLY, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.copydefault(yDA.OLrzqt(sArr, i2) & HPKE.aead_EXPORT_ONLY, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sOLrzqt3 = yDA.OLrzqt(sArr, i);
                yDA.EZpvd(sArr, i, yDA.OLrzqt(sArr, i2));
                yDA.EZpvd(sArr, i2, sOLrzqt3);
                i++;
                i2--;
            }
        }
        return i;
    }

    public static final void AEQbTJ(short[] sArr, int i, int i2) {
        int iEZpvd = EZpvd(sArr, i, i2);
        int i3 = iEZpvd - 1;
        if (i < i3) {
            AEQbTJ(sArr, i, i3);
        }
        if (iEZpvd < i2) {
            AEQbTJ(sArr, iEZpvd, i2);
        }
    }

    public static final int OLrzqt(int[] iArr, int i, int i2) {
        int iKWHzl = C56397yDw.KWHzl(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (java.lang.Integer.compare(C56397yDw.KWHzl(iArr, i) ^ Integer.MIN_VALUE, iKWHzl ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (java.lang.Integer.compare(C56397yDw.KWHzl(iArr, i2) ^ Integer.MIN_VALUE, iKWHzl ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iKWHzl2 = C56397yDw.KWHzl(iArr, i);
                C56397yDw.KWHzl(iArr, i, C56397yDw.KWHzl(iArr, i2));
                C56397yDw.KWHzl(iArr, i2, iKWHzl2);
                i++;
                i2--;
            }
        }
        return i;
    }

    public static final void EZpvd(int[] iArr, int i, int i2) {
        int iOLrzqt = OLrzqt(iArr, i, i2);
        int i3 = iOLrzqt - 1;
        if (i < i3) {
            EZpvd(iArr, i, i3);
        }
        if (iOLrzqt < i2) {
            EZpvd(iArr, iOLrzqt, i2);
        }
    }

    public static final int copydefault(long[] jArr, int i, int i2) {
        long jCopydefault = C56394yDt.copydefault(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (java.lang.Long.compare(C56394yDt.copydefault(jArr, i) ^ Long.MIN_VALUE, jCopydefault ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (java.lang.Long.compare(C56394yDt.copydefault(jArr, i2) ^ Long.MIN_VALUE, jCopydefault ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jCopydefault2 = C56394yDt.copydefault(jArr, i);
                C56394yDt.KWHzl(jArr, i, C56394yDt.copydefault(jArr, i2));
                C56394yDt.KWHzl(jArr, i2, jCopydefault2);
                i++;
                i2--;
            }
        }
        return i;
    }

    public static final void KWHzl(long[] jArr, int i, int i2) {
        int iCopydefault = copydefault(jArr, i, i2);
        int i3 = iCopydefault - 1;
        if (i < i3) {
            KWHzl(jArr, i, i3);
        }
        if (iCopydefault < i2) {
            KWHzl(jArr, iCopydefault, i2);
        }
    }

    public static final void AEQbTJ(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        OLrzqt(bArr, i, i2 - 1);
    }

    public static final void OLrzqt(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        AEQbTJ(sArr, i, i2 - 1);
    }

    public static final void AEQbTJ(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        EZpvd(iArr, i, i2 - 1);
    }

    public static final void OLrzqt(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        KWHzl(jArr, i, i2 - 1);
    }
}
