package o;

import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.auI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7989auI {
    public static final int[] AEQbTJ;
    public static final int[] AYXKKw;
    public static final int[] AhwBna;
    public static final long DbNXlk;
    public static final int[] EZpvd;
    public static final int[] KWHzl;
    public static final StateListAnimator OLrzqt;
    public static final C7989auI copydefault;
    public static final int djBIcL;
    public static final long fetchVPNInfo;
    public static final long gEmmrt;
    public static final int isConnected;
    public static final int valueOf;
    public static final int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[] AhwBna() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[] valueOf() {
        return AhwBna;
    }

    private C7989auI() {
    }

    static {
        C7989auI c7989auI = new C7989auI();
        copydefault = c7989auI;
        AYXKKw = new int[0];
        gEmmrt = BodyPartID.bodyIdMax;
        valueOf = -1;
        DbNXlk = 4294967296L;
        fetchVPNInfo = WebSocketProtocol.PAYLOAD_SHORT_MAX;
        djBIcL = -1;
        values = 32;
        isConnected = 32;
        AhwBna = C56397yDw.EZpvd(0);
        EZpvd = C56397yDw.AEQbTJ(new int[]{1});
        AEQbTJ = C56397yDw.AEQbTJ(new int[]{2});
        KWHzl = C56397yDw.AEQbTJ(new int[]{10});
        OLrzqt = new StateListAnimator(c7989auI.AhwBna(), true, null);
    }

    public int OLrzqt(int i) {
        int iCopydefault = copydefault();
        int iEZpvd = C56395yDu.EZpvd(i >>> 16);
        if (iEZpvd != 0) {
            iCopydefault -= 16;
            i = iEZpvd;
        }
        int iEZpvd2 = C56395yDu.EZpvd(i >>> 8);
        if (iEZpvd2 != 0) {
            iCopydefault -= 8;
            i = iEZpvd2;
        }
        int iEZpvd3 = C56395yDu.EZpvd(i >>> 4);
        if (iEZpvd3 != 0) {
            iCopydefault -= 4;
            i = iEZpvd3;
        }
        int iEZpvd4 = C56395yDu.EZpvd(i >>> 2);
        if (iEZpvd4 != 0) {
            iCopydefault -= 2;
            i = iEZpvd4;
        }
        return C56395yDu.EZpvd(i >>> 1) != 0 ? iCopydefault - 2 : iCopydefault - i;
    }

    public int AEQbTJ(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        if (C56397yDw.EZpvd(iArr)) {
            return 0;
        }
        return AEQbTJ(C56397yDw.KWHzl(iArr, C56397yDw.KWHzl(iArr) - 1)) + ((C56397yDw.KWHzl(iArr) - 1) * copydefault());
    }

    public final int AEQbTJ(int i) {
        return copydefault() - OLrzqt(i);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    public final int[] EZpvd(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                length = -1;
                break;
            }
            if (C56395yDu.EZpvd(iArr[length]) != 0) {
                break;
            }
        }
        int i = length + 1;
        if (i == -1 || i == 0) {
            return valueOf();
        }
        return C56397yDw.AEQbTJ(yDT.copydefault(iArr, 0, i));
    }

    public final int KWHzl(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int iKWHzl = C56397yDw.KWHzl(iArr) - 1;
        if (iKWHzl <= 0) {
            return 0;
        }
        int iKWHzl2 = C56397yDw.KWHzl(iArr, iKWHzl);
        while (iKWHzl2 == 0 && iKWHzl > 0) {
            iKWHzl--;
            iKWHzl2 = C56397yDw.KWHzl(iArr, iKWHzl);
        }
        if (C56397yDw.KWHzl(iArr, iKWHzl) == 0) {
            iKWHzl--;
        }
        return (C56397yDw.KWHzl(iArr) - iKWHzl) - 1;
    }

    public int[] EZpvd(@NotNull int[] iArr, int i) {
        int iEZpvd;
        Intrinsics.checkNotNullParameter(iArr, "");
        if (C56397yDw.EZpvd(iArr) || i == 0) {
            return iArr;
        }
        int iKWHzl = C56397yDw.KWHzl(iArr);
        int iOLrzqt = OLrzqt(C56397yDw.KWHzl(iArr, C56397yDw.KWHzl(iArr) - 1));
        int iCopydefault = i / copydefault();
        int iCopydefault2 = i % copydefault();
        int i2 = iCopydefault2 > iOLrzqt ? iCopydefault + 1 : iCopydefault;
        if (iCopydefault2 == 0) {
            int iKWHzl2 = C56397yDw.KWHzl(iArr) + i2;
            int[] iArr2 = new int[iKWHzl2];
            int i3 = 0;
            while (i3 < iKWHzl2) {
                iArr2[i3] = (i3 < 0 || i3 >= iCopydefault) ? C56397yDw.KWHzl(iArr, i3 - iCopydefault) : 0;
                i3++;
            }
            return C56397yDw.AEQbTJ(iArr2);
        }
        int iKWHzl3 = C56397yDw.KWHzl(iArr) + i2;
        int[] iArr3 = new int[iKWHzl3];
        for (int i4 = 0; i4 < iKWHzl3; i4++) {
            if (i4 >= 0 && i4 < iCopydefault) {
                iEZpvd = 0;
            } else if (i4 == iCopydefault) {
                iEZpvd = C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i4 - iCopydefault) << iCopydefault2);
            } else if (i4 < iKWHzl + iCopydefault && iCopydefault + 1 <= i4) {
                int i5 = i4 - iCopydefault;
                iEZpvd = C56395yDu.EZpvd(C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i5 - 1) >>> (copydefault.copydefault() - iCopydefault2)) | C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i5) << iCopydefault2));
            } else if (i4 == (iKWHzl + i2) - 1) {
                iEZpvd = C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i4 - i2) >>> (copydefault.copydefault() - iCopydefault2));
            } else {
                throw new java.lang.RuntimeException(Intrinsics.KWHzl("Invalid case ", java.lang.Integer.valueOf(i4)));
            }
            iArr3[i4] = iEZpvd;
        }
        return C56397yDw.AEQbTJ(iArr3);
    }

    public int[] AEQbTJ(@NotNull int[] iArr, int i) {
        int iEZpvd;
        Intrinsics.checkNotNullParameter(iArr, "");
        if (C56397yDw.EZpvd(iArr) || i == 0) {
            return iArr;
        }
        int iCopydefault = i % copydefault();
        int iCopydefault2 = i / copydefault();
        if (iCopydefault2 >= C56397yDw.KWHzl(iArr)) {
            return valueOf();
        }
        if (iCopydefault == 0) {
            return C56397yDw.AEQbTJ(yDT.copydefault(iArr, iCopydefault2, C56397yDw.KWHzl(iArr)));
        }
        if (C56397yDw.KWHzl(iArr) > 1 && C56397yDw.KWHzl(iArr) - iCopydefault2 == 1) {
            return new int[]{C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, C56397yDw.KWHzl(iArr) - 1) >>> iCopydefault)};
        }
        int iKWHzl = C56397yDw.KWHzl(iArr) - iCopydefault2;
        int[] iArr2 = new int[iKWHzl];
        for (int i2 = 0; i2 < iKWHzl; i2++) {
            if (i2 >= 0 && i2 < (C56397yDw.KWHzl(iArr) - 1) - iCopydefault2) {
                int i3 = i2 + iCopydefault2;
                iEZpvd = C56395yDu.EZpvd(C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i3 + 1) << (copydefault.copydefault() - iCopydefault)) | C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i3) >>> iCopydefault));
            } else if (i2 == (C56397yDw.KWHzl(iArr) - 1) - iCopydefault2) {
                iEZpvd = C56395yDu.EZpvd(C56397yDw.KWHzl(iArr, i2 + iCopydefault2) >>> iCopydefault);
            } else {
                throw new java.lang.RuntimeException(Intrinsics.KWHzl("Invalid case ", java.lang.Integer.valueOf(i2)));
            }
            iArr2[i2] = iEZpvd;
        }
        return EZpvd(C56397yDw.AEQbTJ(iArr2));
    }

    public final Triple<C56397yDw, C56397yDw, java.lang.Integer> djBIcL(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        int iOLrzqt = OLrzqt(C56397yDw.KWHzl(iArr2, C56397yDw.KWHzl(iArr2) - 1));
        return new Triple<>(C56397yDw.copydefault(AhwBna(iArr, iOLrzqt)), C56397yDw.copydefault(AhwBna(iArr2, iOLrzqt)), java.lang.Integer.valueOf(iOLrzqt));
    }

    public final int[] OLrzqt(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return gEmmrt(iArr, i);
    }

    public int copydefault(@NotNull int[] iArr, @NotNull int[] iArr2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        int iKWHzl = C56397yDw.KWHzl(iArr) - KWHzl(iArr);
        int iKWHzl2 = C56397yDw.KWHzl(iArr2) - KWHzl(iArr2);
        if (iKWHzl > iKWHzl2) {
            return 1;
        }
        if (iKWHzl2 > iKWHzl) {
            return -1;
        }
        int i = iKWHzl - 1;
        while (true) {
            if (i < 0) {
                z = false;
                z2 = true;
                break;
            }
            if (java.lang.Integer.compare(C56397yDw.KWHzl(iArr, i) ^ Integer.MIN_VALUE, C56397yDw.KWHzl(iArr2, i) ^ Integer.MIN_VALUE) > 0) {
                z2 = false;
                z = true;
                break;
            }
            if (java.lang.Integer.compare(C56397yDw.KWHzl(iArr, i) ^ Integer.MIN_VALUE, C56397yDw.KWHzl(iArr2, i) ^ Integer.MIN_VALUE) < 0) {
                z2 = false;
                z = false;
                break;
            }
            i--;
        }
        if (z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public int[] KWHzl(@NotNull int[] iArr, @NotNull int[] iArr2) {
        C7992auL c7992auL;
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        if (C56397yDw.KWHzl(iArr) == 1 && C56397yDw.KWHzl(iArr, 0) == 0) {
            return iArr2;
        }
        if (C56397yDw.KWHzl(iArr2) == 1 && C56397yDw.KWHzl(iArr2, 0) == 0) {
            return iArr;
        }
        if (C56397yDw.KWHzl(iArr) > C56397yDw.KWHzl(iArr2)) {
            c7992auL = new C7992auL(java.lang.Integer.valueOf(C56397yDw.KWHzl(iArr)), java.lang.Integer.valueOf(C56397yDw.KWHzl(iArr2)), C56397yDw.copydefault(iArr), C56397yDw.copydefault(iArr2));
        } else {
            c7992auL = new C7992auL(java.lang.Integer.valueOf(C56397yDw.KWHzl(iArr2)), java.lang.Integer.valueOf(C56397yDw.KWHzl(iArr)), C56397yDw.copydefault(iArr2), C56397yDw.copydefault(iArr));
        }
        int iIntValue = ((java.lang.Number) c7992auL.KWHzl()).intValue();
        int iIntValue2 = ((java.lang.Number) c7992auL.EZpvd()).intValue();
        int[] iArrAEQbTJ = ((C56397yDw) c7992auL.copydefault()).AEQbTJ();
        int[] iArrAEQbTJ2 = ((C56397yDw) c7992auL.OLrzqt()).AEQbTJ();
        int i = iIntValue + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = 0;
        }
        int[] iArrAEQbTJ3 = C56397yDw.AEQbTJ(iArr3);
        int i3 = 0;
        long jCopydefault = 0;
        while (i3 < iIntValue2) {
            long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ, i3)) & BodyPartID.bodyIdMax)) + C56396yDv.copydefault(BodyPartID.bodyIdMax & ((long) C56397yDw.KWHzl(iArrAEQbTJ2, i3))));
            C56397yDw.KWHzl(iArrAEQbTJ3, i3, C56395yDu.EZpvd((int) C56396yDv.copydefault(OLrzqt() & jCopydefault2)));
            jCopydefault = C56396yDv.copydefault(jCopydefault2 >>> copydefault());
            i3++;
        }
        while (jCopydefault != 0) {
            if (i3 == iIntValue) {
                C56397yDw.KWHzl(iArrAEQbTJ3, iIntValue, C56395yDu.EZpvd((int) jCopydefault));
                return iArrAEQbTJ3;
            }
            long jCopydefault3 = C56396yDv.copydefault(jCopydefault + C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ, i3)) & BodyPartID.bodyIdMax));
            C56397yDw.KWHzl(iArrAEQbTJ3, i3, C56395yDu.EZpvd((int) C56396yDv.copydefault(OLrzqt() & jCopydefault3)));
            jCopydefault = C56396yDv.copydefault(jCopydefault3 >>> copydefault());
            i3++;
        }
        while (i3 < iIntValue) {
            C56397yDw.KWHzl(iArrAEQbTJ3, i3, C56397yDw.KWHzl(iArrAEQbTJ, i3));
            i3++;
        }
        return C56397yDw.KWHzl(iArrAEQbTJ3, C56397yDw.KWHzl(iArrAEQbTJ3) - 1) == 0 ? C56397yDw.AEQbTJ(yDT.copydefault(iArrAEQbTJ3, 0, C56397yDw.KWHzl(iArrAEQbTJ3) - 1)) : iArrAEQbTJ3;
    }

    public int[] gEmmrt(@NotNull int[] iArr, @NotNull int[] iArr2) {
        C7992auL c7992auL;
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        int[] iArrEZpvd = EZpvd(iArr);
        int[] iArrEZpvd2 = EZpvd(iArr2);
        if (copydefault(iArrEZpvd, iArrEZpvd2) == 1) {
            c7992auL = new C7992auL(java.lang.Integer.valueOf(C56397yDw.KWHzl(iArrEZpvd)), java.lang.Integer.valueOf(C56397yDw.KWHzl(iArrEZpvd2)), C56397yDw.copydefault(iArrEZpvd), C56397yDw.copydefault(iArrEZpvd2));
        } else {
            c7992auL = new C7992auL(java.lang.Integer.valueOf(C56397yDw.KWHzl(iArrEZpvd2)), java.lang.Integer.valueOf(C56397yDw.KWHzl(iArrEZpvd)), C56397yDw.copydefault(iArrEZpvd2), C56397yDw.copydefault(iArrEZpvd));
        }
        int iIntValue = ((java.lang.Number) c7992auL.KWHzl()).intValue();
        int iIntValue2 = ((java.lang.Number) c7992auL.EZpvd()).intValue();
        int[] iArrAEQbTJ = ((C56397yDw) c7992auL.copydefault()).AEQbTJ();
        int[] iArrAEQbTJ2 = ((C56397yDw) c7992auL.OLrzqt()).AEQbTJ();
        int i = iIntValue + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = 0;
        }
        int[] iArrAEQbTJ3 = C56397yDw.AEQbTJ(iArr3);
        int i3 = 0;
        long jCopydefault = 0;
        while (i3 < iIntValue2) {
            if (i3 >= C56397yDw.KWHzl(iArrAEQbTJ)) {
                java.lang.System.out.println((java.lang.Object) "Breakpoint");
            }
            if (i3 >= C56397yDw.KWHzl(iArrAEQbTJ2)) {
                java.lang.System.out.println((java.lang.Object) "Breakpoint");
            }
            long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ, i3)) & BodyPartID.bodyIdMax) - C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ2, i3)) & BodyPartID.bodyIdMax)) - jCopydefault);
            C56397yDw.KWHzl(iArrAEQbTJ3, i3, C56395yDu.EZpvd((int) jCopydefault2));
            jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 & KWHzl()) >>> isConnected);
            i3++;
            iArrAEQbTJ = iArrAEQbTJ;
        }
        int[] iArr4 = iArrAEQbTJ;
        while (jCopydefault != 0) {
            long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr4, i3)) & BodyPartID.bodyIdMax) - jCopydefault);
            C56397yDw.KWHzl(iArrAEQbTJ3, i3, C56395yDu.EZpvd(C56395yDu.EZpvd((int) jCopydefault3) & AEQbTJ()));
            jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 & KWHzl()) >>> isConnected);
            i3++;
        }
        while (i3 < iIntValue) {
            C56397yDw.KWHzl(iArrAEQbTJ3, i3, C56397yDw.KWHzl(iArr4, i3));
            i3++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 : iArrAEQbTJ3) {
            if (i4 == 0) {
                arrayList.add(C56395yDu.AEQbTJ(i4));
            }
        }
        if (arrayList.isEmpty()) {
            return valueOf();
        }
        int i5 = -1;
        int length = iArrAEQbTJ3.length - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            if (C56395yDu.EZpvd(iArrAEQbTJ3[length]) != 0) {
                i5 = length;
                break;
            }
            length--;
        }
        return C56397yDw.AEQbTJ(yDT.copydefault(iArrAEQbTJ3, 0, i5 + 1));
    }

    public final int[] KWHzl(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int[] iArrEZpvd = C56397yDw.EZpvd(C56397yDw.KWHzl(iArr) + 1);
        int iKWHzl = C56397yDw.KWHzl(iArr);
        if (iKWHzl > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArr, i2)) & BodyPartID.bodyIdMax) * C56396yDv.copydefault(((long) i) & BodyPartID.bodyIdMax));
                long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrEZpvd, i2)) & BodyPartID.bodyIdMax) + C56396yDv.copydefault(BodyPartID.bodyIdMax & ((long) C56395yDu.EZpvd((int) C56396yDv.copydefault(OLrzqt() & jCopydefault)))));
                C56397yDw.KWHzl(iArrEZpvd, i2, C56395yDu.EZpvd((int) C56396yDv.copydefault(OLrzqt() & jCopydefault2)));
                C56397yDw.KWHzl(iArrEZpvd, i3, C56395yDu.EZpvd(C56395yDu.EZpvd((int) C56396yDv.copydefault(jCopydefault >>> copydefault())) + C56395yDu.EZpvd((int) C56396yDv.copydefault(jCopydefault2 >>> copydefault()))));
                if (i3 >= iKWHzl) {
                    break;
                }
                i2 = i3;
            }
        }
        return EZpvd(iArrEZpvd);
    }

    /* JADX INFO: renamed from: o.auI$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean KWHzl;
        public final int[] OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int[]), (r2v0 boolean) A[MD:(int[], boolean):void (m)] call: o.auI.StateListAnimator.<init>(int[], boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(int[] iArr, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(iArr, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-LpG4sQ0$default, reason: not valid java name */
        public static /* synthetic */ StateListAnimator m8559copyLpG4sQ0$default(StateListAnimator stateListAnimator, int[] iArr, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                iArr = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            return stateListAnimator.copydefault(iArr, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull int[] iArr, boolean z) {
            Intrinsics.checkNotNullParameter(iArr, "");
            return new StateListAnimator(iArr, z, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return C56397yDw.OLrzqt(this.OLrzqt, stateListAnimator.OLrzqt) && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iOLrzqt = C56397yDw.OLrzqt(this.OLrzqt);
            boolean z = this.KWHzl;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return (iOLrzqt * 31) + r1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignedUIntArray(unsignedValue=" + ((java.lang.Object) C56397yDw.djBIcL(this.OLrzqt)) + ", sign=" + this.KWHzl + ')';
        }

        public StateListAnimator(int[] iArr, boolean z) {
            this.OLrzqt = iArr;
            this.KWHzl = z;
        }
    }

    public kotlin.Pair<C56397yDw, C56397yDw> AEQbTJ(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        return EZpvd(iArr, iArr2);
    }

    public final kotlin.Pair<C56397yDw, C56397yDw> EZpvd(@NotNull int[] iArr, @NotNull int[] iArr2) {
        long jCopydefault;
        int iEZpvd;
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        if (OLrzqt(iArr2, iArr) > 0) {
            return new kotlin.Pair<>(C56397yDw.copydefault(valueOf()), C56397yDw.copydefault(iArr));
        }
        if (C56397yDw.KWHzl(iArr2) == 1 && C56397yDw.KWHzl(iArr) == 1) {
            return new kotlin.Pair<>(C56397yDw.copydefault(EZpvd(new int[]{C7988auH.EZpvd(C56397yDw.KWHzl(iArr, 0), C56397yDw.KWHzl(iArr2, 0))})), C56397yDw.copydefault(EZpvd(new int[]{C7995auO.OLrzqt(C56397yDw.KWHzl(iArr, 0), C56397yDw.KWHzl(iArr2, 0))})));
        }
        if (AEQbTJ(iArr) - AEQbTJ(iArr2) == 0) {
            return new kotlin.Pair<>(C56397yDw.copydefault(new int[]{1}), C56397yDw.copydefault(AhwBna(iArr, iArr2)));
        }
        Triple<C56397yDw, C56397yDw, java.lang.Integer> tripleDjBIcL = djBIcL(iArr, iArr2);
        int[] iArrAEQbTJ = tripleDjBIcL.component1().AEQbTJ();
        int[] iArrAEQbTJ2 = tripleDjBIcL.component2().AEQbTJ();
        int iIntValue = tripleDjBIcL.component3().intValue();
        int iKWHzl = C56397yDw.KWHzl(iArrAEQbTJ);
        int iKWHzl2 = C56397yDw.KWHzl(iArrAEQbTJ2);
        int i = iKWHzl - iKWHzl2;
        int[] iArrEZpvd = C56397yDw.EZpvd(i);
        int[] iArrAhwBna = AhwBna(iArrAEQbTJ2, copydefault() * i);
        if (OLrzqt(iArrAEQbTJ, iArrAhwBna) >= 0) {
            iArrEZpvd = C56397yDw.EZpvd(i + 1);
            C56397yDw.KWHzl(iArrEZpvd, i, 1);
            iArrAEQbTJ = AhwBna(iArrAEQbTJ, iArrAhwBna);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                int i4 = iKWHzl2 + i2;
                if (i4 < C56397yDw.KWHzl(iArrAEQbTJ)) {
                    jCopydefault = C56399yDy.KWHzl(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ, i4)) & BodyPartID.bodyIdMax) << copydefault()) + C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ, i4 - 1)) & BodyPartID.bodyIdMax)), C56396yDv.copydefault(((long) C56397yDw.KWHzl(iArrAEQbTJ2, iKWHzl2 - 1)) & BodyPartID.bodyIdMax));
                } else {
                    jCopydefault = i4 == C56397yDw.KWHzl(iArrAEQbTJ) ? C56396yDv.copydefault(((long) C7988auH.EZpvd(C56397yDw.KWHzl(iArrAEQbTJ, i4 - 1), C56397yDw.KWHzl(iArrAEQbTJ2, iKWHzl2 - 1))) & BodyPartID.bodyIdMax) : 0L;
                }
                if (java.lang.Long.compare(jCopydefault ^ Long.MIN_VALUE, C56396yDv.copydefault(C56396yDv.copydefault(BodyPartID.bodyIdMax & ((long) EZpvd())) - 1) ^ Long.MIN_VALUE) < 0) {
                    iEZpvd = C56395yDu.EZpvd((int) jCopydefault);
                } else {
                    iEZpvd = C56395yDu.EZpvd(EZpvd() - 1);
                }
                C56397yDw.KWHzl(iArrEZpvd, i2, iEZpvd);
                int[] iArrAhwBna2 = AhwBna(djBIcL(iArrAEQbTJ2, C56397yDw.KWHzl(iArrEZpvd, i2)), copydefault() * i2);
                while (OLrzqt(iArrAhwBna2, iArrAEQbTJ) > 0) {
                    C56397yDw.KWHzl(iArrEZpvd, i2, C56395yDu.EZpvd(C56397yDw.KWHzl(iArrEZpvd, i2) - 1));
                    iArrAhwBna2 = AhwBna(djBIcL(iArrAEQbTJ2, C56397yDw.KWHzl(iArrEZpvd, i2)), copydefault() * i2);
                }
                iArrAEQbTJ = AhwBna(iArrAEQbTJ, iArrAhwBna2);
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        while (OLrzqt(iArrAEQbTJ, iArrAEQbTJ2) >= 0) {
            iArrEZpvd = copydefault(iArrEZpvd, 1);
            iArrAEQbTJ = AhwBna(iArrAEQbTJ, iArrAEQbTJ2);
        }
        return new kotlin.Pair<>(C56397yDw.copydefault(EZpvd(iArrEZpvd)), C56397yDw.copydefault(OLrzqt(iArrAEQbTJ, iIntValue)));
    }

    public final int[] AhwBna(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return EZpvd(iArr, i);
    }

    public final int[] gEmmrt(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return AEQbTJ(iArr, i);
    }

    public final int[] AhwBna(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        return gEmmrt(iArr, iArr2);
    }

    public final int[] copydefault(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return KWHzl(iArr, new int[]{i});
    }

    public final int[] djBIcL(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return KWHzl(iArr, i);
    }

    public final int OLrzqt(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        return copydefault(iArr, iArr2);
    }
}
