package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59919zsA {
    public static final InterfaceC59967zsw AEQbTJ = C59964zst.OLrzqt.AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC59967zsw KWHzl() {
        return AEQbTJ;
    }

    public static /* synthetic */ C59933zsO signMessageHash$default(byte[] bArr, C59926zsH c59926zsH, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return copydefault(bArr, c59926zsH, z);
    }

    public static final C59933zsO copydefault(@NotNull byte[] bArr, @NotNull C59926zsH c59926zsH, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(c59926zsH, "");
        java.math.BigInteger bigIntegerOLrzqt = c59926zsH.OLrzqt();
        java.math.BigInteger bigIntegerAEQbTJ = c59926zsH.AEQbTJ();
        C59921zsC c59921zsCAEQbTJ = AEQbTJ(bArr, bigIntegerOLrzqt, z);
        int iCopydefault = copydefault(c59921zsCAEQbTJ, bArr, bigIntegerAEQbTJ);
        java.math.BigInteger bigIntegerEZpvd = c59921zsCAEQbTJ.EZpvd();
        java.math.BigInteger bigIntegerAEQbTJ2 = c59921zsCAEQbTJ.AEQbTJ();
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(iCopydefault + 27);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        return new C59933zsO(bigIntegerEZpvd, bigIntegerAEQbTJ2, bigIntegerValueOf);
    }

    public static final int copydefault(@NotNull C59921zsC c59921zsC, @NotNull byte[] bArr, @NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(c59921zsC, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bigInteger, "");
        InterfaceC59920zsB interfaceC59920zsBCopydefault = C59964zst.OLrzqt.copydefault();
        for (int i = 0; i < 4; i++) {
            java.math.BigInteger bigIntegerOLrzqt = interfaceC59920zsBCopydefault.OLrzqt(i, c59921zsC, bArr);
            if (bigIntegerOLrzqt != null && Intrinsics.EZpvd(bigIntegerOLrzqt, bigInteger)) {
                return i;
            }
        }
        throw new java.lang.RuntimeException("Could not construct a recoverable key. This should never happen.");
    }

    public static final C59921zsC AEQbTJ(byte[] bArr, java.math.BigInteger bigInteger, boolean z) {
        return C59964zst.OLrzqt.copydefault().OLrzqt(bArr, bigInteger, z);
    }

    public static final java.math.BigInteger AEQbTJ(@NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        return C59925zsG.AEQbTJ(C59964zst.OLrzqt.copydefault().AEQbTJ(bigInteger));
    }
}
