package o;

import androidx.work.WorkRequest;
import com.google.common.primitives.Longs;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.auS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7999auS implements InterfaceC7985auE {
    public static final long[] AEQbTJ;
    public static final long[] AYXKKw;
    public static final int AhwBna;
    public static final long AkhnZx;
    public static final C56394yDt[] DbNXlk;
    public static final C7999auS EZpvd;
    public static final long[] KWHzl;
    public static final long[] OLrzqt;
    public static final ActionBar copydefault;
    public static final long[] djBIcL;
    public static final int fIwbmz;
    public static final long fetchVPNInfo;
    public static final long[] gEmmrt;
    public static final long[] isConnected;
    public static final long valueOf;
    public static final long values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7985auE
    public long[] AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7985auE
    public long[] EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7985auE
    public long[] KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7985auE
    public long[] copydefault() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gEmmrt() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return values;
    }

    private C7999auS() {
    }

    public int EZpvd(long j) {
        int i;
        long jCopydefault = C56396yDv.copydefault(j >>> 32);
        if (jCopydefault != 0) {
            i = 31;
            j = jCopydefault;
        } else {
            i = 63;
        }
        long jCopydefault2 = C56396yDv.copydefault(j >>> 16);
        if (jCopydefault2 != 0) {
            i -= 16;
            j = jCopydefault2;
        }
        long jCopydefault3 = C56396yDv.copydefault(j >>> 8);
        if (jCopydefault3 != 0) {
            i -= 8;
            j = jCopydefault3;
        }
        long jCopydefault4 = C56396yDv.copydefault(j >>> 4);
        if (jCopydefault4 != 0) {
            i -= 4;
            j = jCopydefault4;
        }
        long jCopydefault5 = C56396yDv.copydefault(j >>> 2);
        if (jCopydefault5 != 0) {
            i -= 2;
            j = jCopydefault5;
        }
        return C56396yDv.copydefault(j >>> 1) != 0 ? i - 2 : i - ((int) j);
    }

    @Override // o.InterfaceC7985auE
    public int copydefault(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        if (KWHzl(jArr)) {
            return 0;
        }
        int iCopydefault = (C56394yDt.copydefault(jArr) - AEQbTJ(jArr)) - 1;
        return OLrzqt(C56394yDt.copydefault(jArr, iCopydefault)) + (iCopydefault * 63);
    }

    public final int OLrzqt(long j) {
        return 63 - EZpvd(j);
    }

    public final long[] djBIcL(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int iCopydefault = C56394yDt.copydefault(jArr) - AEQbTJ(jArr);
        if (iCopydefault == 0) {
            return copydefault();
        }
        if (C56394yDt.copydefault(jArr) == iCopydefault) {
            return jArr;
        }
        if (C56394yDt.copydefault(jArr) - iCopydefault > 1000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("RLZ original array : ");
            sb.append(C56394yDt.copydefault(jArr));
            sb.append(" contains: ");
            sb.append((C56394yDt.copydefault(jArr) - iCopydefault) - 1);
            sb.append(" zeros");
            java.lang.System.out.println((java.lang.Object) sb.toString());
        }
        return C56394yDt.OLrzqt(yDT.AEQbTJ(jArr, 0, iCopydefault));
    }

    public final int AEQbTJ(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int iCopydefault = C56394yDt.copydefault(jArr) - 1;
        if (iCopydefault <= 0) {
            return 0;
        }
        long jCopydefault = C56394yDt.copydefault(jArr, iCopydefault);
        while (jCopydefault == 0 && iCopydefault > 0) {
            iCopydefault--;
            jCopydefault = C56394yDt.copydefault(jArr, iCopydefault);
        }
        if (C56394yDt.copydefault(jArr, iCopydefault) == 0) {
            iCopydefault--;
        }
        return (C56394yDt.copydefault(jArr) - iCopydefault) - 1;
    }

    public long[] EZpvd(@NotNull long[] jArr, int i) {
        long jCopydefault;
        Intrinsics.checkNotNullParameter(jArr, "");
        if (KWHzl(jArr) || i == 0) {
            return jArr;
        }
        if (C56394yDt.AEQbTJ(jArr)) {
            return copydefault();
        }
        int iAEQbTJ = AEQbTJ(jArr);
        if (C56394yDt.copydefault(jArr) == iAEQbTJ) {
            return copydefault();
        }
        int iCopydefault = C56394yDt.copydefault(jArr) - iAEQbTJ;
        int iEZpvd = EZpvd(C56394yDt.copydefault(jArr, iCopydefault - 1));
        int iAhwBna = i / AhwBna();
        int iAhwBna2 = i % AhwBna();
        int i2 = iAhwBna2 > iEZpvd ? iAhwBna + 1 : iAhwBna;
        int i3 = 0;
        if (iAhwBna2 == 0) {
            int i4 = iCopydefault + i2;
            long[] jArr2 = new long[i4];
            while (i3 < i4) {
                jArr2[i3] = (i3 < 0 || i3 >= iAhwBna) ? C56394yDt.copydefault(jArr, i3 - iAhwBna) : 0L;
                i3++;
            }
            return C56394yDt.OLrzqt(jArr2);
        }
        int i5 = iCopydefault + i2;
        long[] jArr3 = new long[i5];
        while (i3 < i5) {
            if (i3 >= 0 && i3 < iAhwBna) {
                jCopydefault = 0;
            } else if (i3 == iAhwBna) {
                jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56394yDt.copydefault(jArr, i3 - iAhwBna) << iAhwBna2) & EZpvd.OLrzqt());
            } else if (i3 < iCopydefault + iAhwBna && iAhwBna + 1 <= i3) {
                int i6 = i3 - iAhwBna;
                long jCopydefault2 = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i6) << iAhwBna2);
                C7999auS c7999auS = EZpvd;
                jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 & c7999auS.OLrzqt()) | C56396yDv.copydefault(C56394yDt.copydefault(jArr, i6 - 1) >>> (c7999auS.AhwBna() - iAhwBna2)));
            } else if (i3 == i5 - 1) {
                jCopydefault = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i3 - i2) >>> (EZpvd.AhwBna() - iAhwBna2));
            } else {
                throw new java.lang.RuntimeException(Intrinsics.KWHzl("Invalid case ", java.lang.Integer.valueOf(i3)));
            }
            jArr3[i3] = jCopydefault;
            i3++;
        }
        return C56394yDt.OLrzqt(jArr3);
    }

    public long[] KWHzl(@NotNull long[] jArr, int i) {
        long jCopydefault;
        Intrinsics.checkNotNullParameter(jArr, "");
        if (C56394yDt.AEQbTJ(jArr) || i == 0) {
            return jArr;
        }
        int iCopydefault = C56394yDt.copydefault(jArr) - AEQbTJ(jArr);
        int iAhwBna = i % AhwBna();
        int iAhwBna2 = i / AhwBna();
        if (iAhwBna2 >= iCopydefault) {
            return copydefault();
        }
        if (iAhwBna == 0) {
            C56394yDt.OLrzqt(yDT.AEQbTJ(jArr, iCopydefault - iAhwBna2, iCopydefault));
        }
        if (iCopydefault > 1 && iCopydefault - iAhwBna2 == 1) {
            return new long[]{C56396yDv.copydefault(C56394yDt.copydefault(jArr, iCopydefault - 1) >>> iAhwBna)};
        }
        int i2 = iCopydefault - iAhwBna2;
        if (i2 == 0) {
            return copydefault();
        }
        long[] jArr2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 >= 0 && i3 < (iCopydefault - 1) - iAhwBna2) {
                int i4 = i3 + iAhwBna2;
                long jCopydefault2 = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i4) >>> iAhwBna);
                long jCopydefault3 = C56394yDt.copydefault(jArr, i4 + 1);
                C7999auS c7999auS = EZpvd;
                jCopydefault = C56396yDv.copydefault(jCopydefault2 | C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 << (c7999auS.AhwBna() - iAhwBna)) & c7999auS.OLrzqt()));
            } else if (i3 == (iCopydefault - 1) - iAhwBna2) {
                jCopydefault = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i3 + iAhwBna2) >>> iAhwBna);
            } else {
                throw new java.lang.RuntimeException(Intrinsics.KWHzl("Invalid case ", java.lang.Integer.valueOf(i3)));
            }
            jArr2[i3] = jCopydefault;
        }
        return C56394yDt.OLrzqt(jArr2);
    }

    public final int AEQbTJ(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        if (i > i2) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        int i3 = i - 1;
        while (true) {
            if (i3 < 0) {
                z = false;
                z2 = true;
                break;
            }
            if (java.lang.Long.compare(C56394yDt.copydefault(jArr, i3) ^ Long.MIN_VALUE, C56394yDt.copydefault(jArr2, i3) ^ Long.MIN_VALUE) > 0) {
                z2 = false;
                z = true;
                break;
            }
            if (java.lang.Long.compare(C56394yDt.copydefault(jArr, i3) ^ Long.MIN_VALUE, C56394yDt.copydefault(jArr2, i3) ^ Long.MIN_VALUE) < 0) {
                z2 = false;
                z = false;
                break;
            }
            i3--;
        }
        if (z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // o.InterfaceC7985auE
    public int EZpvd(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return AEQbTJ(jArr, jArr2, C56394yDt.copydefault(jArr) - AEQbTJ(jArr), C56394yDt.copydefault(jArr2) - AEQbTJ(jArr2));
    }

    public final void KWHzl(@NotNull long[] jArr, int i, @NotNull long[] jArr2, @NotNull long[] jArr3) {
        C7990auJ c7990auJ;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        Intrinsics.checkNotNullParameter(jArr3, "");
        int i2 = 0;
        if (KWHzl(jArr2)) {
            yDT.AEQbTJ(jArr2, jArr, i, 0, C56394yDt.copydefault(jArr2));
            return;
        }
        if (KWHzl(jArr3)) {
            yDT.AEQbTJ(jArr3, jArr, i, 0, C56394yDt.copydefault(jArr3));
            return;
        }
        int iCopydefault = C56394yDt.copydefault(jArr2) - AEQbTJ(jArr2);
        int iCopydefault2 = C56394yDt.copydefault(jArr3) - AEQbTJ(jArr3);
        if (iCopydefault > iCopydefault2) {
            c7990auJ = new C7990auJ(java.lang.Integer.valueOf(C56394yDt.copydefault(jArr2)), java.lang.Integer.valueOf(C56394yDt.copydefault(jArr3)), C56394yDt.EZpvd(jArr2), C56394yDt.EZpvd(jArr3), java.lang.Integer.valueOf(iCopydefault), java.lang.Integer.valueOf(iCopydefault2));
        } else {
            c7990auJ = new C7990auJ(java.lang.Integer.valueOf(C56394yDt.copydefault(jArr3)), java.lang.Integer.valueOf(C56394yDt.copydefault(jArr2)), C56394yDt.EZpvd(jArr3), C56394yDt.EZpvd(jArr2), java.lang.Integer.valueOf(iCopydefault2), java.lang.Integer.valueOf(iCopydefault));
        }
        int iIntValue = ((java.lang.Number) c7990auJ.KWHzl()).intValue();
        ((java.lang.Number) c7990auJ.OLrzqt()).intValue();
        long[] jArrEZpvd = ((C56394yDt) c7990auJ.copydefault()).EZpvd();
        long[] jArrEZpvd2 = ((C56394yDt) c7990auJ.EZpvd()).EZpvd();
        int iIntValue2 = ((java.lang.Number) c7990auJ.AEQbTJ()).intValue();
        int iIntValue3 = ((java.lang.Number) c7990auJ.AYXKKw()).intValue();
        long jCopydefault = 0;
        while (i2 < iIntValue3) {
            long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + C56394yDt.copydefault(jArrEZpvd, i2)) + C56394yDt.copydefault(jArrEZpvd2, i2));
            C56394yDt.KWHzl(jArr, i2 + i, C56396yDv.copydefault(OLrzqt() & jCopydefault2));
            jCopydefault = C56396yDv.copydefault(jCopydefault2 >>> 63);
            i2++;
        }
        while (jCopydefault != 0) {
            if (i2 == iIntValue) {
                C56394yDt.KWHzl(jArr, iIntValue + i, jCopydefault);
                return;
            }
            long jCopydefault3 = C56396yDv.copydefault(jCopydefault + C56394yDt.copydefault(jArrEZpvd, i2));
            C56394yDt.KWHzl(jArr, i2, C56396yDv.copydefault(OLrzqt() & jCopydefault3));
            jCopydefault = C56396yDv.copydefault(jCopydefault3 >>> 63);
            i2++;
        }
        while (i2 < iIntValue2) {
            C56394yDt.KWHzl(jArr, i2 + i, C56394yDt.copydefault(jArrEZpvd, i2));
            i2++;
        }
    }

    @Override // o.InterfaceC7985auE
    public long[] copydefault(@NotNull long[] jArr, @NotNull long[] jArr2) {
        C7990auJ c7990auJ;
        long[] jArrOLrzqt;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        if (KWHzl(jArr)) {
            return jArr2;
        }
        if (KWHzl(jArr2)) {
            return jArr;
        }
        int iCopydefault = C56394yDt.copydefault(jArr) - AEQbTJ(jArr);
        int iCopydefault2 = C56394yDt.copydefault(jArr2) - AEQbTJ(jArr2);
        if (iCopydefault > iCopydefault2) {
            c7990auJ = new C7990auJ(java.lang.Integer.valueOf(C56394yDt.copydefault(jArr)), java.lang.Integer.valueOf(C56394yDt.copydefault(jArr2)), C56394yDt.EZpvd(jArr), C56394yDt.EZpvd(jArr2), java.lang.Integer.valueOf(iCopydefault), java.lang.Integer.valueOf(iCopydefault2));
        } else {
            c7990auJ = new C7990auJ(java.lang.Integer.valueOf(C56394yDt.copydefault(jArr2)), java.lang.Integer.valueOf(C56394yDt.copydefault(jArr)), C56394yDt.EZpvd(jArr2), C56394yDt.EZpvd(jArr), java.lang.Integer.valueOf(iCopydefault2), java.lang.Integer.valueOf(iCopydefault));
        }
        int iIntValue = ((java.lang.Number) c7990auJ.KWHzl()).intValue();
        ((java.lang.Number) c7990auJ.OLrzqt()).intValue();
        boolean z = (C56396yDv.copydefault(C56394yDt.copydefault(((C56394yDt) c7990auJ.copydefault()).EZpvd(), ((java.lang.Number) c7990auJ.AEQbTJ()).intValue() - 1) & 6917529027641081856L) == 0 && C56396yDv.copydefault(C56394yDt.copydefault(((C56394yDt) c7990auJ.EZpvd()).EZpvd(), ((java.lang.Number) c7990auJ.AYXKKw()).intValue() - 1) & 6917529027641081856L) == 0) ? false : true;
        if (z) {
            int i = iIntValue + 1;
            long[] jArr3 = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr3[i2] = 0;
            }
            jArrOLrzqt = C56394yDt.OLrzqt(jArr3);
        } else {
            long[] jArr4 = new long[iIntValue];
            for (int i3 = 0; i3 < iIntValue; i3++) {
                jArr4[i3] = 0;
            }
            jArrOLrzqt = C56394yDt.OLrzqt(jArr4);
        }
        KWHzl(jArrOLrzqt, 0, jArr, jArr2);
        return z ? djBIcL(jArrOLrzqt) : jArrOLrzqt;
    }

    public final long[] copydefault(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2) {
        C7992auL c7992auL;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        int iAEQbTJ = AEQbTJ(jArr, jArr2, i, i2);
        boolean z = iAEQbTJ == 1;
        if (iAEQbTJ == 0) {
            return copydefault();
        }
        if (i2 + 1 == 1 && C56394yDt.copydefault(jArr2, 0) == 0) {
            return jArr;
        }
        if (!z) {
            throw new java.lang.RuntimeException("subtract result less than zero");
        }
        if (z) {
            c7992auL = new C7992auL(C56394yDt.EZpvd(jArr), C56394yDt.EZpvd(jArr2), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        } else {
            c7992auL = new C7992auL(C56394yDt.EZpvd(jArr2), C56394yDt.EZpvd(jArr), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        }
        long[] jArrEZpvd = ((C56394yDt) c7992auL.KWHzl()).EZpvd();
        long[] jArrEZpvd2 = ((C56394yDt) c7992auL.EZpvd()).EZpvd();
        int iIntValue = ((java.lang.Number) c7992auL.copydefault()).intValue();
        int iIntValue2 = ((java.lang.Number) c7992auL.OLrzqt()).intValue();
        long[] jArr3 = new long[iIntValue];
        for (int i3 = 0; i3 < iIntValue; i3++) {
            jArr3[i3] = 0;
        }
        long[] jArrOLrzqt = C56394yDt.OLrzqt(jArr3);
        int i4 = 0;
        long jCopydefault = 0;
        while (i4 < iIntValue2) {
            long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56394yDt.copydefault(jArrEZpvd, i4) - C56394yDt.copydefault(jArrEZpvd2, i4)) - jCopydefault);
            C56394yDt.KWHzl(jArrOLrzqt, i4, C56396yDv.copydefault(OLrzqt() & jCopydefault2));
            jCopydefault = C56396yDv.copydefault(jCopydefault2 >>> 63);
            i4++;
        }
        while (jCopydefault != 0) {
            long jCopydefault3 = C56396yDv.copydefault(C56394yDt.copydefault(jArrEZpvd, i4) - jCopydefault);
            C56394yDt.KWHzl(jArrOLrzqt, i4, C56396yDv.copydefault(OLrzqt() & jCopydefault3));
            jCopydefault = C56396yDv.copydefault(jCopydefault3 >>> 63);
            i4++;
        }
        while (i4 < iIntValue) {
            C56394yDt.KWHzl(jArrOLrzqt, i4, C56394yDt.copydefault(jArrEZpvd, i4));
            i4++;
        }
        if (AEQbTJ(jArrOLrzqt) == C56394yDt.copydefault(jArrOLrzqt) - 1 && C56394yDt.copydefault(jArrOLrzqt, 0) == 0) {
            return copydefault();
        }
        return djBIcL(jArrOLrzqt);
    }

    @Override // o.InterfaceC7985auE
    public long[] OLrzqt(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return copydefault(jArr, jArr2, C56394yDt.copydefault(jArr) - AEQbTJ(jArr), C56394yDt.copydefault(jArr2) - AEQbTJ(jArr2));
    }

    @Override // o.InterfaceC7985auE
    public long[] KWHzl(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return EZpvd(jArr, jArr2, C56394yDt.copydefault(jArr) - AEQbTJ(jArr), C56394yDt.copydefault(jArr2) - AEQbTJ(jArr2));
    }

    public final long[] EZpvd(long[] jArr, long[] jArr2, int i, int i2) {
        if (KWHzl(jArr) || KWHzl(jArr2)) {
            return copydefault();
        }
        if ((i >= 120 || i2 >= 120) && (i <= 15000 || i2 < 15000)) {
            return OLrzqt(jArr, jArr2, i, i2);
        }
        if (i >= 15000 && i2 >= 15000) {
            return isConnected(jArr, jArr2);
        }
        return KWHzl(jArr, jArr2, i, i2);
    }

    public final long[] KWHzl(long[] jArr, long[] jArr2, int i, int i2) {
        long[] jArrCopydefault = copydefault();
        int length = jArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            long j = jArr2[i3];
            if (i4 <= i2) {
                C7999auS c7999auS = EZpvd;
                jArrCopydefault = c7999auS.values(jArrCopydefault, c7999auS.AEQbTJ(c7999auS.OLrzqt(jArr, j), c7999auS.AhwBna() * i4));
            }
            i3++;
            i4++;
        }
        return jArrCopydefault;
    }

    public final long[] OLrzqt(long[] jArr, long[] jArr2, int i, int i2) {
        boolean z = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ActionBar actionBar = new ActionBar(jArr, z, defaultConstructorMarker);
        ActionBar actionBar2 = new ActionBar(jArr2, z, defaultConstructorMarker);
        int iMax = (java.lang.Math.max(i, i2) + 1) / 2;
        long[] jArrAEQbTJ = AEQbTJ();
        int i3 = fIwbmz;
        int i4 = iMax * i3;
        long[] jArrCopydefault = copydefault(AEQbTJ(jArrAEQbTJ, i4), 1L);
        ActionBar actionBarKWHzl = KWHzl(actionBar, jArrCopydefault);
        ActionBar actionBarCopydefault = copydefault(actionBar, i4);
        ActionBar actionBarKWHzl2 = KWHzl(actionBar2, jArrCopydefault);
        ActionBar actionBarCopydefault2 = copydefault(actionBar2, i4);
        ActionBar actionBarAYXKKw = AYXKKw(actionBarCopydefault, actionBarCopydefault2);
        ActionBar actionBarAYXKKw2 = AYXKKw(actionBarKWHzl, actionBarKWHzl2);
        return EZpvd(EZpvd(KWHzl(actionBarAYXKKw, i3 * 2 * iMax), KWHzl(OLrzqt(OLrzqt(AYXKKw(EZpvd(actionBarCopydefault, actionBarKWHzl), EZpvd(actionBarCopydefault2, actionBarKWHzl2)), actionBarAYXKKw), actionBarAYXKKw2), i4)), actionBarAYXKKw2).OLrzqt();
    }

    public final long[] copydefault(@NotNull long[] jArr, int i, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int iCopydefault = C56394yDt.copydefault(jArr) + i;
        long[] jArr2 = new long[iCopydefault];
        int i2 = 0;
        while (i2 < iCopydefault) {
            jArr2[i2] = i2 < C56394yDt.copydefault(jArr) ? C56394yDt.copydefault(jArr, i2) : j;
            i2++;
        }
        return C56394yDt.OLrzqt(jArr2);
    }

    public final long[] isConnected(@NotNull long[] jArr, @NotNull long[] jArr2) {
        java.util.Collection collectionEZpvd;
        java.util.Collection collectionEZpvd2;
        kotlin.Pair pair;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        if (C56394yDt.copydefault(jArr) % 3 != 0) {
            C56394yDt c56394yDtEZpvd = C56394yDt.EZpvd(jArr);
            int iCopydefault = (((C56394yDt.copydefault(jArr) + 2) / 3) * 3) - C56394yDt.copydefault(jArr);
            long[] jArr3 = new long[iCopydefault];
            for (int i = 0; i < iCopydefault; i++) {
                jArr3[i] = 0;
            }
            collectionEZpvd = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c56394yDtEZpvd, (java.lang.Iterable) C56394yDt.EZpvd(C56394yDt.OLrzqt(jArr3)));
        } else {
            collectionEZpvd = C56394yDt.EZpvd(jArr);
        }
        long[] jArrAEQbTJ = yEK.AEQbTJ(collectionEZpvd);
        if (C56394yDt.copydefault(jArr2) % 3 != 0) {
            C56394yDt c56394yDtEZpvd2 = C56394yDt.EZpvd(jArr2);
            int iCopydefault2 = (((C56394yDt.copydefault(jArr2) + 2) / 3) * 3) - C56394yDt.copydefault(jArr2);
            long[] jArr4 = new long[iCopydefault2];
            for (int i2 = 0; i2 < iCopydefault2; i2++) {
                jArr4[i2] = 0;
            }
            collectionEZpvd2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c56394yDtEZpvd2, (java.lang.Iterable) C56394yDt.EZpvd(C56394yDt.OLrzqt(jArr4)));
        } else {
            collectionEZpvd2 = C56394yDt.EZpvd(jArr2);
        }
        long[] jArrAEQbTJ2 = yEK.AEQbTJ(collectionEZpvd2);
        int iCopydefault3 = C56394yDt.copydefault(jArrAEQbTJ);
        int iCopydefault4 = C56394yDt.copydefault(jArrAEQbTJ2);
        if (iCopydefault3 > iCopydefault4) {
            pair = new kotlin.Pair(C56394yDt.EZpvd(jArrAEQbTJ), C56394yDt.EZpvd(copydefault(jArrAEQbTJ2, iCopydefault3 - iCopydefault4, 0L)));
        } else if (iCopydefault3 < iCopydefault4) {
            pair = new kotlin.Pair(C56394yDt.EZpvd(copydefault(jArrAEQbTJ, iCopydefault4 - iCopydefault3, 0L)), C56394yDt.EZpvd(jArrAEQbTJ2));
        } else {
            pair = new kotlin.Pair(C56394yDt.EZpvd(jArrAEQbTJ), C56394yDt.EZpvd(jArrAEQbTJ2));
        }
        long[] jArrEZpvd = ((C56394yDt) pair.component1()).EZpvd();
        long[] jArrEZpvd2 = ((C56394yDt) pair.component2()).EZpvd();
        int iMax = (java.lang.Math.max(C56394yDt.copydefault(jArrAEQbTJ), C56394yDt.copydefault(jArrAEQbTJ2)) + 2) / 3;
        boolean z = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ActionBar actionBar = new ActionBar(yEK.AEQbTJ(yER.OLrzqt(jArrEZpvd, C56548yJl.AhwBna(0, iMax))), z, defaultConstructorMarker);
        int i3 = iMax * 2;
        ActionBar actionBar2 = new ActionBar(yEK.AEQbTJ(yER.OLrzqt(jArrEZpvd, C56548yJl.AhwBna(iMax, i3))), z, defaultConstructorMarker);
        int i4 = iMax * 3;
        ActionBar actionBar3 = new ActionBar(yEK.AEQbTJ(yER.OLrzqt(jArrEZpvd, C56548yJl.AhwBna(i3, i4))), z, defaultConstructorMarker);
        ActionBar actionBar4 = new ActionBar(yEK.AEQbTJ(yER.OLrzqt(jArrEZpvd2, C56548yJl.AhwBna(0, iMax))), z, defaultConstructorMarker);
        ActionBar actionBar5 = new ActionBar(yEK.AEQbTJ(yER.OLrzqt(jArrEZpvd2, C56548yJl.AhwBna(iMax, i3))), z, defaultConstructorMarker);
        ActionBar actionBar6 = new ActionBar(yEK.AEQbTJ(yER.OLrzqt(jArrEZpvd2, C56548yJl.AhwBna(i3, i4))), z, defaultConstructorMarker);
        ActionBar actionBarEZpvd = EZpvd(actionBar, actionBar3);
        ActionBar actionBarEZpvd2 = EZpvd(actionBarEZpvd, actionBar2);
        ActionBar actionBarOLrzqt = OLrzqt(actionBarEZpvd, actionBar2);
        ActionBar actionBarEZpvd3 = EZpvd(actionBarOLrzqt, actionBar3);
        ActionBar actionBar7 = copydefault;
        ActionBar actionBarOLrzqt2 = OLrzqt(AYXKKw(actionBarEZpvd3, actionBar7), actionBar);
        ActionBar actionBarEZpvd4 = EZpvd(actionBar4, actionBar6);
        ActionBar actionBarEZpvd5 = EZpvd(actionBarEZpvd4, actionBar5);
        ActionBar actionBarOLrzqt3 = OLrzqt(actionBarEZpvd4, actionBar5);
        ActionBar actionBarOLrzqt4 = OLrzqt(AYXKKw(EZpvd(actionBarOLrzqt3, actionBar6), actionBar7), actionBar4);
        ActionBar actionBarAYXKKw = AYXKKw(actionBar, actionBar4);
        ActionBar actionBarAYXKKw2 = AYXKKw(actionBarEZpvd2, actionBarEZpvd5);
        ActionBar actionBarAYXKKw3 = AYXKKw(actionBarOLrzqt, actionBarOLrzqt3);
        ActionBar actionBarAYXKKw4 = AYXKKw(actionBarOLrzqt2, actionBarOLrzqt4);
        ActionBar actionBarAYXKKw5 = AYXKKw(actionBar3, actionBar6);
        ActionBar actionBarCopydefault = copydefault(OLrzqt(actionBarAYXKKw4, actionBarAYXKKw2), new ActionBar(new long[]{3}, z, defaultConstructorMarker));
        ActionBar actionBarCopydefault2 = copydefault(OLrzqt(actionBarAYXKKw2, actionBarAYXKKw3), 1);
        ActionBar actionBarOLrzqt5 = OLrzqt(actionBarAYXKKw3, actionBarAYXKKw);
        ActionBar actionBarEZpvd6 = EZpvd(copydefault(OLrzqt(actionBarOLrzqt5, actionBarCopydefault), 1), AYXKKw(actionBar7, actionBarAYXKKw5));
        ActionBar actionBarOLrzqt6 = OLrzqt(EZpvd(actionBarOLrzqt5, actionBarCopydefault2), actionBarAYXKKw5);
        ActionBar actionBarKWHzl = KWHzl(OLrzqt(actionBarCopydefault2, actionBarEZpvd6), iMax * 63);
        return EZpvd(EZpvd(EZpvd(EZpvd(actionBarAYXKKw, actionBarKWHzl), KWHzl(actionBarOLrzqt6, iMax * WebSocketProtocol.PAYLOAD_SHORT)), KWHzl(actionBarEZpvd6, iMax * 189)), KWHzl(actionBarAYXKKw5, iMax * 252)).OLrzqt();
    }

    public final long[] OLrzqt(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return AEQbTJ(jArr, j, C56394yDt.copydefault(jArr) - AEQbTJ(jArr));
    }

    public final long[] AEQbTJ(@NotNull long[] jArr, long j, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(jArr, "");
        long jCopydefault = C56396yDv.copydefault(AYXKKw() & j);
        long jCopydefault2 = C56396yDv.copydefault(j >>> 32);
        int iCopydefault = copydefault(jArr) + OLrzqt(j);
        if (iCopydefault % 63 != 0) {
            i2 = (iCopydefault / 63) + 1;
        } else {
            i2 = iCopydefault / 63;
        }
        long[] jArrCopydefault = C56394yDt.copydefault(i2);
        int i3 = 0;
        int i4 = 0;
        long jCopydefault3 = 0;
        while (i3 < i) {
            long jCopydefault4 = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i3) & AYXKKw());
            long jCopydefault5 = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i3) >>> 32);
            i3++;
            long jCopydefault6 = C56396yDv.copydefault(jCopydefault4 * jCopydefault);
            long jCopydefault7 = C56396yDv.copydefault(jCopydefault6 >>> 63);
            long jCopydefault8 = C56396yDv.copydefault(jCopydefault3 + C56396yDv.copydefault(jCopydefault6 & OLrzqt()));
            long jCopydefault9 = C56396yDv.copydefault(jCopydefault7 + C56396yDv.copydefault(jCopydefault8 >>> 63));
            long jCopydefault10 = C56396yDv.copydefault(jCopydefault8 & OLrzqt());
            long jCopydefault11 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault4 * jCopydefault2) + C56396yDv.copydefault(jCopydefault * jCopydefault5));
            long jCopydefault12 = C56396yDv.copydefault(jCopydefault9 + C56396yDv.copydefault(jCopydefault11 >>> 31));
            long jCopydefault13 = C56396yDv.copydefault(jCopydefault10 + C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault11 << 32) & OLrzqt()));
            long jCopydefault14 = C56396yDv.copydefault(jCopydefault12 + C56396yDv.copydefault(jCopydefault13 >>> 63));
            C56394yDt.KWHzl(jArrCopydefault, i4, C56396yDv.copydefault(jCopydefault13 & OLrzqt()));
            jCopydefault3 = C56396yDv.copydefault(jCopydefault14 + C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault5 * jCopydefault2) << 1));
            i4++;
        }
        if (jCopydefault3 != 0) {
            C56394yDt.KWHzl(jArrCopydefault, i4, jCopydefault3);
        }
        return jArrCopydefault;
    }

    @Override // o.InterfaceC7985auE
    public long[] EZpvd(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        if (j == 0) {
            return AEQbTJ();
        }
        if (j == 1) {
            return jArr;
        }
        if (C56394yDt.copydefault(jArr) == 1 && C56394yDt.copydefault(jArr, 0) == 10) {
            C56394yDt[] c56394yDtArr = DbNXlk;
            if (j < c56394yDtArr.length) {
                return c56394yDtArr[(int) j].EZpvd();
            }
        }
        C56394yDt.copydefault(jArr);
        AEQbTJ(jArr);
        long[] jArrAEQbTJ = AEQbTJ();
        while (j > 1) {
            long j2 = 2;
            if (j % j2 == 0) {
                jArr = DbNXlk(jArr, jArr);
                j /= j2;
            } else {
                jArrAEQbTJ = DbNXlk(jArr, jArrAEQbTJ);
                jArr = DbNXlk(jArr, jArr);
                j = (j - 1) / j2;
            }
        }
        return DbNXlk(jArrAEQbTJ, jArr);
    }

    public final Triple<C56394yDt, C56394yDt, java.lang.Integer> AkhnZx(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        int iEZpvd = EZpvd(C56394yDt.copydefault(jArr2, C56394yDt.copydefault(jArr2) - 1));
        return new Triple<>(C56394yDt.EZpvd(AEQbTJ(jArr, iEZpvd)), C56394yDt.EZpvd(AEQbTJ(jArr2, iEZpvd)), java.lang.Integer.valueOf(iEZpvd));
    }

    public final long[] copydefault(@NotNull long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return gEmmrt(jArr, i);
    }

    public final kotlin.Pair<C56394yDt, C56394yDt> gEmmrt(@NotNull long[] jArr, @NotNull long[] jArr2) {
        long[] jArrCopydefault;
        long jOLrzqt;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        if (valueOf(jArr2, jArr) > 0) {
            return new kotlin.Pair<>(C56394yDt.EZpvd(copydefault()), C56394yDt.EZpvd(jArr));
        }
        if (C56394yDt.copydefault(jArr2) == 1 && C56394yDt.copydefault(jArr) == 1) {
            return new kotlin.Pair<>(C56394yDt.EZpvd(djBIcL(new long[]{C7994auN.copydefault(C56394yDt.copydefault(jArr, 0), C56394yDt.copydefault(jArr2, 0))})), C56394yDt.EZpvd(djBIcL(new long[]{C7996auP.AEQbTJ(C56394yDt.copydefault(jArr, 0), C56394yDt.copydefault(jArr2, 0))})));
        }
        if (copydefault(jArr) - copydefault(jArr2) == 0) {
            return new kotlin.Pair<>(C56394yDt.EZpvd(AEQbTJ()), C56394yDt.EZpvd(fetchVPNInfo(jArr, jArr2)));
        }
        Triple<C56394yDt, C56394yDt, java.lang.Integer> tripleAkhnZx = AkhnZx(jArr, jArr2);
        long[] jArrEZpvd = tripleAkhnZx.component1().EZpvd();
        long[] jArrEZpvd2 = tripleAkhnZx.component2().EZpvd();
        int iIntValue = tripleAkhnZx.component3().intValue();
        int iCopydefault = C56394yDt.copydefault(jArrEZpvd);
        int iCopydefault2 = C56394yDt.copydefault(jArrEZpvd2);
        int iCopydefault3 = C56394yDt.copydefault(jArrEZpvd2) - AEQbTJ(jArrEZpvd2);
        int i = iCopydefault - iCopydefault2;
        long[] jArrCopydefault2 = C56394yDt.copydefault(i);
        long[] jArrAEQbTJ = AEQbTJ(jArrEZpvd2, AhwBna() * i);
        if (valueOf(jArrEZpvd, jArrAEQbTJ) >= 0) {
            jArrCopydefault2 = C56394yDt.copydefault(i + 1);
            C56394yDt.KWHzl(jArrCopydefault2, i, 1L);
            jArrEZpvd = fetchVPNInfo(jArrEZpvd, jArrAEQbTJ);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                int i4 = iCopydefault2 + i2;
                if (i4 < C56394yDt.copydefault(jArrEZpvd)) {
                    jArrCopydefault = AEQbTJ(AEQbTJ(new long[]{C56394yDt.copydefault(jArrEZpvd, i4)}, AhwBna()), C56394yDt.copydefault(jArrEZpvd, i4 - 1));
                } else {
                    jArrCopydefault = i4 == C56394yDt.copydefault(jArrEZpvd) ? new long[]{C56394yDt.copydefault(jArrEZpvd, i4 - 1)} : copydefault();
                }
                long[] jArrEZpvd3 = EZpvd(C7989auI.copydefault.AEQbTJ(AYXKKw(jArrCopydefault), AYXKKw(new long[]{C56394yDt.copydefault(jArrEZpvd2, iCopydefault2 - 1)})).getFirst().AEQbTJ());
                if (KWHzl(jArrEZpvd3, C56396yDv.copydefault(OLrzqt() - 1)) < 0) {
                    jOLrzqt = C56394yDt.copydefault(jArrEZpvd3, 0);
                } else {
                    jOLrzqt = OLrzqt();
                }
                C56394yDt.KWHzl(jArrCopydefault2, i2, jOLrzqt);
                long[] jArrAEQbTJ2 = AEQbTJ(AEQbTJ(jArrEZpvd2, C56394yDt.copydefault(jArrCopydefault2, i2), iCopydefault3), AhwBna() * i2);
                while (valueOf(jArrAEQbTJ2, jArrEZpvd) > 0) {
                    C56394yDt.KWHzl(jArrCopydefault2, i2, C56396yDv.copydefault(C56394yDt.copydefault(jArrCopydefault2, i2) - C56396yDv.copydefault(((long) 1) & BodyPartID.bodyIdMax)));
                    jArrAEQbTJ2 = AEQbTJ(AEQbTJ(jArrEZpvd2, C56394yDt.copydefault(jArrCopydefault2, i2), iCopydefault3), AhwBna() * i2);
                }
                jArrEZpvd = fetchVPNInfo(jArrEZpvd, jArrAEQbTJ2);
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        while (valueOf(jArrEZpvd, jArrEZpvd2) >= 0) {
            jArrCopydefault2 = AEQbTJ(jArrCopydefault2, 1L);
            jArrEZpvd = fetchVPNInfo(jArrEZpvd, jArrEZpvd2);
        }
        return new kotlin.Pair<>(C56394yDt.EZpvd(djBIcL(jArrCopydefault2)), C56394yDt.EZpvd(copydefault(jArrEZpvd, iIntValue)));
    }

    public final long[] OLrzqt(@NotNull long[] jArr) {
        int i;
        Intrinsics.checkNotNullParameter(jArr, "");
        if (KWHzl(jArr)) {
            return copydefault();
        }
        int iCopydefault = copydefault(jArr);
        if (iCopydefault % 64 == 0) {
            i = iCopydefault / 64;
        } else {
            i = (iCopydefault / 64) + 1;
        }
        long[] jArrCopydefault = C56394yDt.copydefault(i);
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = i2 % 63;
                int i5 = (i2 / 63) + i2;
                int i6 = i5 + 1;
                if (i6 < C56394yDt.copydefault(jArr)) {
                    C56394yDt.KWHzl(jArrCopydefault, i2, C56396yDv.copydefault(C56396yDv.copydefault(C56394yDt.copydefault(jArr, i6) << (63 - i4)) | C56396yDv.copydefault(C56394yDt.copydefault(jArr, i5) >>> i4)));
                } else {
                    C56394yDt.KWHzl(jArrCopydefault, i2, C56396yDv.copydefault(C56394yDt.copydefault(jArr, i5) >>> i4));
                }
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return djBIcL(jArrCopydefault);
    }

    public final int[] EZpvd(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        long[] jArrOLrzqt = OLrzqt(jArr);
        int[] iArrEZpvd = C56397yDw.EZpvd(C56394yDt.copydefault(jArrOLrzqt) * 2);
        int iCopydefault = C56394yDt.copydefault(jArrOLrzqt);
        if (iCopydefault > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int i3 = i * 2;
                C56397yDw.KWHzl(iArrEZpvd, i3, C56395yDu.EZpvd((int) C56396yDv.copydefault(C56394yDt.copydefault(jArrOLrzqt, i) & C56396yDv.copydefault(((long) C7989auI.copydefault.EZpvd()) & BodyPartID.bodyIdMax))));
                C56397yDw.KWHzl(iArrEZpvd, i3 + 1, C56395yDu.EZpvd((int) C56396yDv.copydefault(C56394yDt.copydefault(jArrOLrzqt, i) >>> 32)));
                if (i2 >= iCopydefault) {
                    break;
                }
                i = i2;
            }
        }
        return C7989auI.copydefault.EZpvd(iArrEZpvd);
    }

    public final long[] AEQbTJ(@NotNull int[] iArr) {
        int i;
        Intrinsics.checkNotNullParameter(iArr, "");
        if (C56397yDw.KWHzl(iArr) == 0) {
            return copydefault();
        }
        if (C56397yDw.KWHzl(iArr) == 1) {
            return new long[]{C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 0)) & BodyPartID.bodyIdMax)};
        }
        int iAEQbTJ = C7989auI.copydefault.AEQbTJ(iArr);
        if (iAEQbTJ % 63 == 0) {
            i = iAEQbTJ / 63;
        } else {
            i = (iAEQbTJ / 63) + 1;
        }
        long[] jArrCopydefault = C56394yDt.copydefault(i);
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = i2 % 32;
                int i5 = (i2 * 2) - (i2 / 32);
                if (i == 2) {
                    C56394yDt.KWHzl(jArrCopydefault, 0, C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 0)) & BodyPartID.bodyIdMax) | C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 1)) & BodyPartID.bodyIdMax) << 32) & gEmmrt())));
                    if (C56397yDw.KWHzl(iArr) == 4) {
                        C56394yDt.KWHzl(jArrCopydefault, 1, C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 1)) & BodyPartID.bodyIdMax) >>> 31) | C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 2)) & BodyPartID.bodyIdMax) << 1)) | C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 3)) & BodyPartID.bodyIdMax) << 33)));
                    } else {
                        C56394yDt.KWHzl(jArrCopydefault, 1, C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 1)) & BodyPartID.bodyIdMax) >>> 31) | C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 2)) & BodyPartID.bodyIdMax) << 1)));
                    }
                } else if (i2 == 0) {
                    C56394yDt.KWHzl(jArrCopydefault, i2, C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 0)) & BodyPartID.bodyIdMax) | C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, 1)) & BodyPartID.bodyIdMax) << 32) & gEmmrt())));
                } else if (1 <= i2 && i2 < i - 1) {
                    C56394yDt.KWHzl(jArrCopydefault, i2, C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i5 + 1)) & BodyPartID.bodyIdMax) << (i4 + 32)) & gEmmrt()) | C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i5 - 1)) & BodyPartID.bodyIdMax) >>> (32 - i4)) | C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i5)) & BodyPartID.bodyIdMax) << i4))));
                } else if (i2 == i - 1) {
                    if (i5 < C56397yDw.KWHzl(iArr)) {
                        C56394yDt.KWHzl(jArrCopydefault, i2, C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i5)) & BodyPartID.bodyIdMax) << i4) | C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i5 - 1)) & BodyPartID.bodyIdMax) >>> (32 - i4))));
                    } else {
                        C56394yDt.KWHzl(jArrCopydefault, i2, C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i5 - 1)) & BodyPartID.bodyIdMax) >>> (32 - i4)));
                    }
                }
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return jArrCopydefault;
    }

    @Override // o.InterfaceC7985auE
    public kotlin.Pair<C56394yDt, C56394yDt> AEQbTJ(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return gEmmrt(jArr, jArr2);
    }

    public final boolean KWHzl(long[] jArr) {
        if (C56394yDt.EZpvd(jArr, copydefault())) {
            return true;
        }
        return (C56394yDt.copydefault(jArr) == 1 && C56394yDt.copydefault(jArr, 0) == 0) || C56394yDt.copydefault(jArr) - AEQbTJ(jArr) == 0;
    }

    /* JADX INFO: renamed from: o.auS$ActionBar */
    public static final class ActionBar {
        public final boolean KWHzl;
        public final long[] copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long[]), (r2v0 boolean) A[MD:(long[], boolean):void (m)] call: o.auS.ActionBar.<init>(long[], boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(long[] jArr, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(jArr, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-tBf0fek$default, reason: not valid java name */
        public static /* synthetic */ ActionBar m8560copytBf0fek$default(ActionBar actionBar, long[] jArr, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jArr = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                z = actionBar.KWHzl;
            }
            return actionBar.KWHzl(jArr, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull long[] jArr, boolean z) {
            Intrinsics.checkNotNullParameter(jArr, "");
            return new ActionBar(jArr, z, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long[] OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return C56394yDt.EZpvd(this.copydefault, actionBar.copydefault) && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iKWHzl = C56394yDt.KWHzl(this.copydefault);
            boolean z = this.KWHzl;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return (iKWHzl * 31) + r1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignedULongArray(unsignedValue=" + ((java.lang.Object) C56394yDt.djBIcL(this.copydefault)) + ", sign=" + this.KWHzl + ')';
        }

        public ActionBar(long[] jArr, boolean z) {
            this.copydefault = jArr;
            this.KWHzl = z;
        }
    }

    public final ActionBar KWHzl(ActionBar actionBar, ActionBar actionBar2) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (actionBar.KWHzl() ^ actionBar2.KWHzl()) {
            if (valueOf(actionBar.OLrzqt(), actionBar2.OLrzqt()) > 0) {
                return new ActionBar(fetchVPNInfo(actionBar.OLrzqt(), actionBar2.OLrzqt()), actionBar.KWHzl(), defaultConstructorMarker);
            }
            return new ActionBar(fetchVPNInfo(actionBar2.OLrzqt(), actionBar.OLrzqt()), actionBar2.KWHzl(), defaultConstructorMarker);
        }
        return new ActionBar(values(actionBar.OLrzqt(), actionBar2.OLrzqt()), actionBar.KWHzl(), defaultConstructorMarker);
    }

    static {
        C7999auS c7999auS = new C7999auS();
        EZpvd = c7999auS;
        gEmmrt = new long[0];
        djBIcL = new long[]{0};
        AEQbTJ = new long[]{1};
        OLrzqt = new long[]{2};
        KWHzl = new long[]{10};
        isConnected = new long[]{3074457345618258603L};
        AhwBna = 63;
        fIwbmz = 63;
        valueOf = Long.MAX_VALUE;
        AYXKKw = new long[]{Long.MAX_VALUE};
        fetchVPNInfo = BodyPartID.bodyIdMax;
        AkhnZx = 9223372032559808512L;
        values = Long.MIN_VALUE;
        copydefault = new ActionBar(c7999auS.EZpvd(), true, null);
        DbNXlk = new C56394yDt[]{C56394yDt.EZpvd(new long[]{1}), C56394yDt.EZpvd(new long[]{10}), C56394yDt.EZpvd(new long[]{100}), C56394yDt.EZpvd(new long[]{1000}), C56394yDt.EZpvd(new long[]{WorkRequest.MIN_BACKOFF_MILLIS}), C56394yDt.EZpvd(new long[]{100000}), C56394yDt.EZpvd(new long[]{1000000}), C56394yDt.EZpvd(new long[]{10000000}), C56394yDt.EZpvd(new long[]{100000000}), C56394yDt.EZpvd(new long[]{com.google.android.exoplayer2.C.NANOS_PER_SECOND}), C56394yDt.EZpvd(new long[]{RealConnection.IDLE_CONNECTION_HEALTHY_NS}), C56394yDt.EZpvd(new long[]{100000000000L}), C56394yDt.EZpvd(new long[]{1000000000000L}), C56394yDt.EZpvd(new long[]{10000000000000L}), C56394yDt.EZpvd(new long[]{100000000000000L}), C56394yDt.EZpvd(new long[]{1000000000000000L}), C56394yDt.EZpvd(new long[]{10000000000000000L}), C56394yDt.EZpvd(new long[]{100000000000000000L}), C56394yDt.EZpvd(new long[]{1000000000000000000L}), C56394yDt.EZpvd(new long[]{776627963145224192L, 1}), C56394yDt.EZpvd(new long[]{7766279631452241920L, 10}), C56394yDt.EZpvd(new long[]{3875820019684212736L, 108}), C56394yDt.EZpvd(new long[]{1864712049423024128L, 1084}), C56394yDt.EZpvd(new long[]{200376420520689664L, 10842}), C56394yDt.EZpvd(new long[]{2003764205206896640L, 108420}), C56394yDt.EZpvd(new long[]{1590897978359414784L, 1084202}), C56394yDt.EZpvd(new long[]{6685607746739372032L, 10842021}), C56394yDt.EZpvd(new long[]{2292473209410289664L, 108420217}), C56394yDt.EZpvd(new long[]{4477988020393345024L, 1084202172}), C56394yDt.EZpvd(new long[]{7886392056514347008L, 10842021724L}), C56394yDt.EZpvd(new long[]{5076944270305263616L, 108420217248L}), C56394yDt.EZpvd(new long[]{4652582518778757120L, 1084202172485L}), C56394yDt.EZpvd(new long[]{408965003513692160L, 10842021724855L}), C56394yDt.EZpvd(new long[]{4089650035136921600L, 108420217248550L}), C56394yDt.EZpvd(new long[]{4003012203950112768L, 1084202172485504L}), C56394yDt.EZpvd(new long[]{3136633892082024448L, 10842021724855044L}), C56394yDt.EZpvd(new long[]{3696222810255917056L, 108420217248550443L}), C56394yDt.EZpvd(new long[]{68739955140067328L, 1084202172485504434L}), C56394yDt.EZpvd(new long[]{687399551400673280L, 1618649688000268532L, 1}), C56394yDt.EZpvd(new long[]{6873995514006732800L, 6963124843147909512L, 11}), C56394yDt.EZpvd(new long[]{4176350882083897344L, 5067644173495664471L, 117}), C56394yDt.EZpvd(new long[]{4870020673419870208L, 4559581550682765674L, 1175}), C56394yDt.EZpvd(new long[]{2583346549924823040L, 8702327359408553513L, 11754}), C56394yDt.EZpvd(new long[]{7386721425538678784L, 4012925262392552860L, 117549}), C56394yDt.EZpvd(new long[]{80237960548581376L, 3235764476506425376L, 1175494}), C56394yDt.EZpvd(new long[]{802379605485813760L, 4687528654499926336L, 11754943}), C56394yDt.EZpvd(new long[]{8023796054858137600L, 758426360725384320L, 117549435}), C56394yDt.EZpvd(new long[]{6450984253743169536L, 7584263607253843208L, 1175494350}), C56394yDt.EZpvd(new long[]{9169610316303040512L, 2055659777700225622L, 11754943508L}), C56394yDt.EZpvd(new long[]{8685754831337422848L, 2109853703292704613L, 117549435082L}), C56394yDt.EZpvd(new long[]{3847199981681246208L, 2651792959217494523L, 1175494350822L}), C56394yDt.EZpvd(new long[]{1578511669393358848L, 8071185518465393618L, 11754943508222L}), C56394yDt.EZpvd(new long[]{6561744657078812672L, 6924878889815729717L, 117549435082228L}), C56394yDt.EZpvd(new long[]{1053842312804696064L, 4685184640173866521L, 1175494350822287L}), C56394yDt.EZpvd(new long[]{1315051091192184832L, 734986217464786171L, 11754943508222875L}), C56394yDt.EZpvd(new long[]{3927138875067072512L, 7349862174647861711L, 117549435082228750L}), C56394yDt.EZpvd(new long[]{2377900603251621888L, 8935017488495186458L, 1175494350822287507L}), C56394yDt.EZpvd(new long[]{5332261958806667264L, 6339826553258882310L, 2531571471368099271L, 1}), C56394yDt.EZpvd(new long[]{7205759403792793600L, 8058033311460168257L, 6868970639971441100L, 12}), C56394yDt.EZpvd(new long[]{7493989779944505344L, 6793356819763476113L, 4126102141730980352L, 127}), C56394yDt.EZpvd(new long[]{LockFreeTaskQueueCore.FROZEN_MASK, 3369963939651330482L, 4367533269890700295L, 1274}), C56394yDt.EZpvd(new long[]{LockFreeTaskQueueCore.CLOSED_MASK, 6029523285948977397L, 6781844551487899721L, 12744}), C56394yDt.EZpvd(new long[]{Longs.MAX_POWER_OF_TWO, 4955000638361119124L, 3254841256895566560L, 127447}), C56394yDt.EZpvd(new long[]{0, 3433146199337312205L, 4878296458391338181L, 1274473}), C56394yDt.EZpvd(new long[]{0, 6661345882808794626L, 2666104399639502773L, 12744735}), C56394yDt.EZpvd(new long[]{0, 2049854570104515604L, 8214299922685476121L, 127447352}), C56394yDt.EZpvd(new long[]{0, 2051801627335604424L, 8356022932016554748L, 1274473528}), C56394yDt.EZpvd(new long[]{0, 2071272199646492624L, 549880988472565210L, 12744735289L}), C56394yDt.EZpvd(new long[]{0, 2265977922755374624L, 5498809884725652102L, 127447352890L}), C56394yDt.EZpvd(new long[]{0, 4213035153844194624L, 8871238662982641982L, 1274473528905L}), C56394yDt.EZpvd(new long[]{0, 5236863391022843008L, 5702038298133437552L, 12744735289059L}), C56394yDt.EZpvd(new long[]{0, 6251773725954551040L, 1680150760205720677L, 127447352890596L}), C56394yDt.EZpvd(new long[]{0, 7177505038416855552L, 7578135565202430968L, 1274473528905961L}), C56394yDt.EZpvd(new long[]{0, 7211446126185124864L, 1994379357186103223L, 12744735289059618L}), C56394yDt.EZpvd(new long[]{0, 7550857003867817984L, 1497049498151480621L, 127447352890596182L}), C56394yDt.EZpvd(new long[]{0, 1721593743839973376L, 5747122944660030410L, 1274473528905961821L}), C56394yDt.EZpvd(new long[]{0, 7992565401544957952L, 2130997225471649253L, 3521363252204842408L, 1}), C56394yDt.EZpvd(new long[]{0, 6138677720611373056L, 2863228181006940922L, 7543516411484096658L, 13}), C56394yDt.EZpvd(new long[]{0, 6046544984985075712L, 962165699505081802L, 1648187820002760119L, 138}), C56394yDt.EZpvd(new long[]{0, 5125217628722102272L, 398284958196042218L, 7258506163172825383L, 1381}), C56394yDt.EZpvd(new long[]{0, 5135316102947143680L, 3982849581960422185L, 8021457373744823174L, 13817}), C56394yDt.EZpvd(new long[]{0, 5236300845197557760L, 2935007672185118623L, 6427597442610025280L, 138178}), C56394yDt.EZpvd(new long[]{0, 6246148267701698560L, 1679960611286858811L, 8935742204971597955L, 1381786}), C56394yDt.EZpvd(new long[]{0, 7121250455888330752L, 7576234076013812308L, 6347073718022997279L, 13817869}), C56394yDt.EZpvd(new long[]{0, 6648900300899876864L, 1975364465299916623L, 8130504959101317950L, 138178696}), C56394yDt.EZpvd(new long[]{0, 1925398751015337984L, 1306900579289614621L, 7518073296174973038L, 1381786968}), C56394yDt.EZpvd(new long[]{0, 807243436443828224L, 3845633756041370404L, 1393756666911523917L, 13817869688L}), C56394yDt.EZpvd(new long[]{0, 8072434364438282240L, 1562849412994600808L, 4714194632260463366L, 138178696881L}), C56394yDt.EZpvd(new long[]{0, 6937367349544615936L, 6405122093091232280L, 1025086138330754621L, 1381786968815L}), C56394yDt.EZpvd(new long[]{0, 4810069237462728704L, 8710988709783667959L, 1027489346452770408L, 13817869688151L}), C56394yDt.EZpvd(new long[]{0, 1983832190353408000L, 4099538766143697323L, 1051521427672928281L, 138178696881511L}), C56394yDt.EZpvd(new long[]{0, 1391577829824528384L, 4101899514017870000L, 1291842239874507006L, 1381786968815111L}), C56394yDt.EZpvd(new long[]{0, 4692406261390508032L, 4125506992759596769L, 3695050361890294256L, 13817869688151111L}), C56394yDt.EZpvd(new long[]{0, 807202429631201280L, 4361581780176864463L, 57015471483839332L, 138178696881511114L}), C56394yDt.EZpvd(new long[]{0, 8072024296312012800L, 6722329654349541398L, 570154714838393324L, 1381786968815111140L}), C56394yDt.EZpvd(new long[]{0, 6933266668281921536L, 2659692285511983332L, 5701547148383933247L, 4594497651296335592L, 1}), C56394yDt.EZpvd(new long[]{0, 4769062424835784704L, 8150178781410281711L, 1675239262710677624L, 9051488365544252694L, 14}), C56394yDt.EZpvd(new long[]{0, 1573764064083968000L, 7714811519264610651L, 7529020590252000440L, 7504535323749544669L, 149}), C56394yDt.EZpvd(new long[]{0, 6514268603984904192L, 3361138897807900047L, 1503229607681797944L, 1258376942657240234L, 1498}), C56394yDt.EZpvd(new long[]{0, 579081781865611264L, 5941272867514673053L, 5808924039963203635L, 3360397389717626533L, 14981}), C56394yDt.EZpvd(new long[]{0, 5790817818656112640L, 4072496454018075682L, 2749008178503381508L, 5933857786611937912L, 149813})};
    }

    public final ActionBar valueOf(ActionBar actionBar, ActionBar actionBar2) {
        return KWHzl(actionBar, ActionBar.m8560copytBf0fek$default(actionBar2, null, !actionBar2.KWHzl(), 1, null));
    }

    public final ActionBar djBIcL(ActionBar actionBar, ActionBar actionBar2) {
        return new ActionBar(DbNXlk(actionBar.OLrzqt(), actionBar2.OLrzqt()), !(actionBar.KWHzl() ^ actionBar2.KWHzl()), null);
    }

    public final ActionBar AEQbTJ(ActionBar actionBar, ActionBar actionBar2) {
        return new ActionBar(AhwBna(actionBar.OLrzqt(), actionBar2.OLrzqt()), !(actionBar.KWHzl() ^ actionBar2.KWHzl()), null);
    }

    public final ActionBar EZpvd(@NotNull ActionBar actionBar, @NotNull ActionBar actionBar2) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(actionBar2, "");
        return KWHzl(actionBar, actionBar2);
    }

    public final ActionBar OLrzqt(@NotNull ActionBar actionBar, @NotNull ActionBar actionBar2) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(actionBar2, "");
        return valueOf(actionBar, actionBar2);
    }

    public final ActionBar AYXKKw(@NotNull ActionBar actionBar, @NotNull ActionBar actionBar2) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(actionBar2, "");
        return djBIcL(actionBar, actionBar2);
    }

    public final ActionBar copydefault(@NotNull ActionBar actionBar, @NotNull ActionBar actionBar2) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(actionBar2, "");
        return AEQbTJ(actionBar, actionBar2);
    }

    public final ActionBar copydefault(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        return new ActionBar(gEmmrt(actionBar.OLrzqt(), i), actionBar.KWHzl(), null);
    }

    public final ActionBar KWHzl(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        return new ActionBar(AEQbTJ(actionBar.OLrzqt(), i), actionBar.KWHzl(), null);
    }

    public final ActionBar KWHzl(@NotNull ActionBar actionBar, @NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        return new ActionBar(djBIcL(actionBar.OLrzqt(), jArr), actionBar.KWHzl(), null);
    }

    @Override // o.InterfaceC7985auE
    public long[] copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        long[] jArrCopydefault = copydefault();
        java.lang.String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char cCharAt = lowerCase.charAt(i2);
            C7999auS c7999auS = EZpvd;
            jArrCopydefault = c7999auS.AEQbTJ(c7999auS.gEmmrt(jArrCopydefault, C56396yDv.copydefault(i)), C56396yDv.copydefault(C8000auT.KWHzl(cCharAt, i)));
        }
        return djBIcL(jArrCopydefault);
    }

    @Override // o.InterfaceC7985auE
    public java.lang.String OLrzqt(@NotNull long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        long[] jArrOLrzqt = C56394yDt.OLrzqt(jArrCopyOf);
        long[] jArr2 = {C56396yDv.copydefault(i)};
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (!C56394yDt.EZpvd(jArrOLrzqt, copydefault())) {
            kotlin.Pair<C56394yDt, C56394yDt> pairAYXKKw = AYXKKw(jArrOLrzqt, jArr2);
            if (C56394yDt.AEQbTJ(pairAYXKKw.getSecond().EZpvd())) {
                sb.append(0);
            } else {
                sb.append(C59460zhU.EZpvd(C56394yDt.copydefault(pairAYXKKw.getSecond().EZpvd(), 0), i));
            }
            jArrOLrzqt = pairAYXKKw.getFirst().EZpvd();
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C59454zhO.AwvSrB(string).toString();
    }

    public long[] djBIcL(@NotNull long[] jArr, @NotNull long[] jArr2) {
        kotlin.Pair pair;
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        if (C56394yDt.copydefault(jArr) > C56394yDt.copydefault(jArr2)) {
            pair = new kotlin.Pair(C56394yDt.EZpvd(jArr), C56394yDt.EZpvd(jArr2));
        } else {
            pair = new kotlin.Pair(C56394yDt.EZpvd(jArr2), C56394yDt.EZpvd(jArr));
        }
        ((C56394yDt) pair.component1()).EZpvd();
        int iCopydefault = C56394yDt.copydefault(((C56394yDt) pair.component2()).EZpvd());
        long[] jArr3 = new long[iCopydefault];
        for (int i = 0; i < iCopydefault; i++) {
            jArr3[i] = C56396yDv.copydefault(C56394yDt.copydefault(jArr, i) & C56394yDt.copydefault(jArr2, i));
        }
        return C56394yDt.OLrzqt(jArr3);
    }

    public final long[] AEQbTJ(@NotNull long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return EZpvd(jArr, i);
    }

    public final long[] gEmmrt(@NotNull long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return KWHzl(jArr, i);
    }

    public final long[] values(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return copydefault(jArr, jArr2);
    }

    public final long[] fetchVPNInfo(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return OLrzqt(jArr, jArr2);
    }

    public final long[] DbNXlk(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return KWHzl(jArr, jArr2);
    }

    public final long[] AEQbTJ(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return copydefault(jArr, new long[]{j});
    }

    public final long[] copydefault(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return OLrzqt(jArr, new long[]{j});
    }

    public final long[] gEmmrt(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return OLrzqt(jArr, j);
    }

    public final long[] AhwBna(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return AEQbTJ(jArr, jArr2).getFirst().EZpvd();
    }

    public final kotlin.Pair<C56394yDt, C56394yDt> AYXKKw(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return AEQbTJ(jArr, jArr2);
    }

    public final int valueOf(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        return EZpvd(jArr, jArr2);
    }

    public final int KWHzl(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return EZpvd(jArr, new long[]{j});
    }

    public final int[] AYXKKw(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return EZpvd(jArr);
    }

    public final long[] EZpvd(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return AEQbTJ(iArr);
    }

    @Override // o.InterfaceC7985auE
    public long[] copydefault(long j) {
        return C56396yDv.copydefault(valueOf() & j) != 0 ? new long[]{C56396yDv.copydefault(j & OLrzqt()), 1} : new long[]{j};
    }

    @Override // o.InterfaceC7985auE
    public long[] OLrzqt(int i) {
        return new long[]{C56396yDv.copydefault(((long) i) & BodyPartID.bodyIdMax)};
    }

    @Override // o.InterfaceC7985auE
    public long[] KWHzl(short s) {
        return new long[]{C56396yDv.copydefault(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX)};
    }

    @Override // o.InterfaceC7985auE
    public long[] KWHzl(byte b) {
        return new long[]{C56396yDv.copydefault(((long) b) & 255)};
    }

    @Override // o.InterfaceC7985auE
    public long[] AEQbTJ(long j) {
        return j == Long.MIN_VALUE ? new long[]{0, 1} : new long[]{C56396yDv.copydefault(C56396yDv.copydefault(java.lang.Math.abs(j)) & OLrzqt())};
    }

    @Override // o.InterfaceC7985auE
    public long[] KWHzl(int i) {
        return new long[]{C56396yDv.copydefault(java.lang.Math.abs(i))};
    }

    @Override // o.InterfaceC7985auE
    public long[] AEQbTJ(short s) {
        return new long[]{C56396yDv.copydefault(java.lang.Math.abs((int) s))};
    }

    @Override // o.InterfaceC7985auE
    public long[] EZpvd(byte b) {
        return new long[]{C56396yDv.copydefault(java.lang.Math.abs((int) b))};
    }
}
