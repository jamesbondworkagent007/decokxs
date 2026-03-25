package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59908zr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C59907zq {
    public static final byte[] KWHzl(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull InterfaceC59908zr interfaceC59908zr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        byte[] bArrAEQbTJ = AEQbTJ(bArr, interfaceC59908zr);
        byte[] bArrEZpvd = EZpvd(bArrAEQbTJ, (byte) 54);
        byte[] bArrEZpvd2 = EZpvd(bArrAEQbTJ, (byte) 92);
        InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr, bArrEZpvd, 0, 0, 6, null);
        InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr, bArr2, 0, 0, 6, null);
        byte[] bArrAEQbTJ2 = interfaceC59908zr.AEQbTJ();
        InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr, bArrEZpvd2, 0, 0, 6, null);
        InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr, bArrAEQbTJ2, 0, 0, 6, null);
        return interfaceC59908zr.AEQbTJ();
    }

    public static final byte[] EZpvd(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull Function0<? extends InterfaceC59908zr> function0) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return KWHzl(bArr, bArr2, function0.invoke());
    }

    public static final byte[] AEQbTJ(byte[] bArr, InterfaceC59908zr interfaceC59908zr) {
        int iCopydefault = interfaceC59908zr.copydefault();
        if (bArr.length > iCopydefault) {
            bArr = C59971zt.OLrzqt(bArr, interfaceC59908zr);
        }
        if (bArr.length >= iCopydefault) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, iCopydefault);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public static final byte[] EZpvd(byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ b);
        }
        return bArr2;
    }
}
