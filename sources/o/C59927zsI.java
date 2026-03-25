package o;

import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59927zsI {
    public static final byte[] EZpvd(@NotNull java.math.BigInteger bigInteger, int i) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        byte[] bArr = new byte[i];
        byte[] byteArray = bigInteger.toByteArray();
        int i2 = byteArray[0] == 0 ? 1 : 0;
        if (byteArray.length - i2 > i) {
            throw new java.lang.RuntimeException(Intrinsics.KWHzl("Input is too large to put in byte array of size ", java.lang.Integer.valueOf(i)));
        }
        int length = byteArray.length;
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return yDT.copyInto$default(byteArray, bArr, (i - length) + i2, i2, 0, 8, (java.lang.Object) null);
    }

    public static final java.lang.String OLrzqt(@NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        java.lang.String string = bigInteger.toString(16);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String toHexStringZeroPadded$default(java.math.BigInteger bigInteger, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return AEQbTJ(bigInteger, i, z);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.math.BigInteger bigInteger, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        java.lang.String strOLrzqt = OLrzqt(bigInteger);
        int length = strOLrzqt.length();
        if (length > i) {
            throw new java.lang.UnsupportedOperationException("Value " + strOLrzqt + " is larger then length " + i);
        }
        if (bigInteger.signum() < 0) {
            throw new java.lang.UnsupportedOperationException("Value cannot be negative");
        }
        if (length < i) {
            strOLrzqt = Intrinsics.KWHzl(C59449zhJ.copydefault("0", i - length), strOLrzqt);
        }
        return z ? Intrinsics.KWHzl(EIP1271Verifier.hexPrefix, strOLrzqt) : strOLrzqt;
    }

    public static final java.math.BigInteger KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new java.math.BigInteger(1, bArr);
    }
}
