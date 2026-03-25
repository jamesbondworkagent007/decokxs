package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60025zuA {
    public static final C60025zuA AEQbTJ = new C60025zuA();
    public static final int[] copydefault = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public static final int[] EZpvd = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    public static final int[] djBIcL = new int[64];
    public static final int[] KWHzl = new int[8];
    public static final int[] OLrzqt = new int[8];

    public final int EZpvd(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    public final int KWHzl(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    private C60025zuA() {
    }

    public final byte[] OLrzqt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int[] iArr = EZpvd;
        C60030zuF.copydefault(iArr, 0, KWHzl, 0, iArr.length);
        int[] iArrCopydefault = C60027zuC.copydefault(EZpvd(bArr));
        int i = 16;
        int length = iArrCopydefault.length / 16;
        int i2 = 0;
        while (i2 < length) {
            int[] iArr2 = djBIcL;
            C60030zuF.copydefault(iArrCopydefault, i2 * 16, iArr2, 0, i);
            int length2 = iArr2.length;
            if (i < length2) {
                int i3 = i;
                while (true) {
                    int i4 = i3 + 1;
                    int[] iArr3 = djBIcL;
                    iArr3[i3] = AEQbTJ(iArr3[i3 - 2]) + iArr3[i3 - 7] + copydefault(iArr3[i3 - 15]) + iArr3[i3 - 16];
                    if (i4 >= length2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            int[] iArr4 = KWHzl;
            C60030zuF.copydefault(iArr4, 0, OLrzqt, 0, iArr4.length);
            int length3 = djBIcL.length - 1;
            if (length3 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    int[] iArr5 = OLrzqt;
                    int iKWHzl = iArr5[7] + KWHzl(iArr5[4]) + KWHzl(iArr5[4], iArr5[5], iArr5[6]) + copydefault[i5] + djBIcL[i5];
                    int iOLrzqt = OLrzqt(iArr5[0]);
                    int iEZpvd = EZpvd(iArr5[0], iArr5[1], iArr5[2]);
                    C60030zuF.copydefault(iArr5, 0, iArr5, 1, iArr5.length - 1);
                    iArr5[4] = iArr5[4] + iKWHzl;
                    iArr5[0] = iKWHzl + iOLrzqt + iEZpvd;
                    if (i6 > length3) {
                        break;
                    }
                    i5 = i6;
                }
            }
            int length4 = KWHzl.length - 1;
            if (length4 >= 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    int[] iArr6 = KWHzl;
                    iArr6[i7] = iArr6[i7] + OLrzqt[i7];
                    if (i8 > length4) {
                        break;
                    }
                    i7 = i8;
                }
            }
            i2++;
            i = 16;
        }
        return C60030zuF.OLrzqt(KWHzl);
    }

    public final byte[] EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length + 9;
        int i = 64 - (length % 64);
        byte[] bArr2 = new byte[length + i];
        C60027zuC.copydefault(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = UnsignedBytes.MAX_POWER_OF_TWO;
        C60027zuC.KWHzl(bArr2, bArr.length + 1 + i, ((long) bArr.length) * 8);
        return bArr2;
    }

    public final int OLrzqt(int i) {
        return C60029zuE.AEQbTJ(i, 22) ^ (C60029zuE.AEQbTJ(i, 2) ^ C60029zuE.AEQbTJ(i, 13));
    }

    public final int KWHzl(int i) {
        return C60029zuE.AEQbTJ(i, 25) ^ (C60029zuE.AEQbTJ(i, 6) ^ C60029zuE.AEQbTJ(i, 11));
    }

    public final int copydefault(int i) {
        return (C60029zuE.AEQbTJ(i, 18) ^ C60029zuE.AEQbTJ(i, 7)) ^ (i >>> 3);
    }

    public final int AEQbTJ(int i) {
        return (C60029zuE.AEQbTJ(i, 19) ^ C60029zuE.AEQbTJ(i, 17)) ^ (i >>> 10);
    }
}
