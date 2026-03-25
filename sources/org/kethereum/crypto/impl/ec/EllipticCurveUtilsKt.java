package org.kethereum.crypto.impl.ec;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import o.C59921zsC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EllipticCurveUtilsKt {
    public static final BigInteger OLrzqt = EllipticCurveKt.EZpvd().getN().shiftRight(1);

    public static final boolean copydefault(C59921zsC c59921zsC) {
        return c59921zsC.AEQbTJ().compareTo(OLrzqt) <= 0;
    }

    public static final C59921zsC AEQbTJ(@NotNull C59921zsC c59921zsC) {
        Intrinsics.checkNotNullParameter(c59921zsC, "");
        if (copydefault(c59921zsC)) {
            return c59921zsC;
        }
        BigInteger bigIntegerEZpvd = c59921zsC.EZpvd();
        BigInteger bigIntegerSubtract = EllipticCurveKt.EZpvd().getN().subtract(c59921zsC.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "");
        return new C59921zsC(bigIntegerEZpvd, bigIntegerSubtract);
    }
}
