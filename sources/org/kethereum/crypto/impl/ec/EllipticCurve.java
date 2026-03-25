package org.kethereum.crypto.impl.ec;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59924zsF;
import o.InterfaceC59967zsw;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes24.dex */
public final class EllipticCurve implements InterfaceC59967zsw {
    @Override // o.InterfaceC59967zsw
    public BigInteger EZpvd() {
        BigInteger n = EllipticCurveKt.EZpvd().getN();
        Intrinsics.checkNotNullExpressionValue(n, "");
        return n;
    }

    @Override // o.InterfaceC59967zsw
    public InterfaceC59924zsF AEQbTJ() {
        ECPoint g = EllipticCurveKt.EZpvd().getG();
        Intrinsics.checkNotNullExpressionValue(g, "");
        return EllipticCurvePointKt.copydefault(g);
    }

    @Override // o.InterfaceC59967zsw
    public InterfaceC59924zsF KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        ECPoint eCPointDecodePoint = EllipticCurveKt.EZpvd().getCurve().decodePoint(bArr);
        Intrinsics.checkNotNullExpressionValue(eCPointDecodePoint, "");
        return EllipticCurvePointKt.copydefault(eCPointDecodePoint);
    }

    @Override // o.InterfaceC59967zsw
    public InterfaceC59924zsF KWHzl(@NotNull BigInteger bigInteger, @NotNull BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        ECPoint eCPointCreatePoint = EllipticCurveKt.EZpvd().getCurve().createPoint(bigInteger, bigInteger2);
        Intrinsics.checkNotNullExpressionValue(eCPointCreatePoint, "");
        return EllipticCurvePointKt.copydefault(eCPointCreatePoint);
    }
}
