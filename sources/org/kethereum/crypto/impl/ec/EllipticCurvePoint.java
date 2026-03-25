package org.kethereum.crypto.impl.ec;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59924zsF;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes24.dex */
public final class EllipticCurvePoint implements InterfaceC59924zsF {
    public final ECPoint OLrzqt;

    public EllipticCurvePoint(@NotNull ECPoint eCPoint) {
        Intrinsics.checkNotNullParameter(eCPoint, "");
        this.OLrzqt = eCPoint;
    }

    @Override // o.InterfaceC59924zsF
    public BigInteger copydefault() {
        BigInteger bigInteger = this.OLrzqt.getXCoord().toBigInteger();
        Intrinsics.checkNotNullExpressionValue(bigInteger, "");
        return bigInteger;
    }

    @Override // o.InterfaceC59924zsF
    public BigInteger KWHzl() {
        BigInteger bigInteger = this.OLrzqt.getYCoord().toBigInteger();
        Intrinsics.checkNotNullExpressionValue(bigInteger, "");
        return bigInteger;
    }

    @Override // o.InterfaceC59924zsF
    public InterfaceC59924zsF AEQbTJ(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        ECPoint eCPointMultiply = this.OLrzqt.multiply(bigInteger);
        Intrinsics.checkNotNullExpressionValue(eCPointMultiply, "");
        return EllipticCurvePointKt.copydefault(eCPointMultiply);
    }

    @Override // o.InterfaceC59924zsF
    public InterfaceC59924zsF copydefault(@NotNull InterfaceC59924zsF interfaceC59924zsF) {
        Intrinsics.checkNotNullParameter(interfaceC59924zsF, "");
        InterfaceC59924zsF interfaceC59924zsFCopydefault = null;
        if ((interfaceC59924zsF instanceof EllipticCurvePoint ? (EllipticCurvePoint) interfaceC59924zsF : null) != null) {
            ECPoint eCPointAdd = this.OLrzqt.add(((EllipticCurvePoint) interfaceC59924zsF).OLrzqt);
            Intrinsics.checkNotNullExpressionValue(eCPointAdd, "");
            interfaceC59924zsFCopydefault = EllipticCurvePointKt.copydefault(eCPointAdd);
        }
        if (interfaceC59924zsFCopydefault != null) {
            return interfaceC59924zsFCopydefault;
        }
        throw new UnsupportedOperationException("Only SpongyCurvePoint multiplication available");
    }

    @Override // o.InterfaceC59924zsF
    public InterfaceC59924zsF EZpvd() {
        ECPoint eCPointNormalize = this.OLrzqt.normalize();
        Intrinsics.checkNotNullExpressionValue(eCPointNormalize, "");
        return EllipticCurvePointKt.copydefault(eCPointNormalize);
    }

    @Override // o.InterfaceC59924zsF
    public boolean AEQbTJ() {
        return this.OLrzqt.isInfinity();
    }

    @Override // o.InterfaceC59924zsF
    public byte[] copydefault(boolean z) {
        byte[] encoded = this.OLrzqt.getEncoded(z);
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        return encoded;
    }
}
