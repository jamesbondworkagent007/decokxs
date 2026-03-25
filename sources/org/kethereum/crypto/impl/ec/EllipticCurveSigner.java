package org.kethereum.crypto.impl.ec;

import java.math.BigInteger;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import o.C59921zsC;
import o.InterfaceC59920zsB;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.x9.X9IntegerConverter;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.signers.HMacDSAKCalculator;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.ec.FixedPointCombMultiplier;
import org.spongycastle.math.ec.custom.sec.SecP256K1Curve;

/* JADX INFO: loaded from: classes24.dex */
public final class EllipticCurveSigner implements InterfaceC59920zsB {
    @Override // o.InterfaceC59920zsB
    public C59921zsC OLrzqt(@NotNull byte[] bArr, @NotNull BigInteger bigInteger, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bigInteger, "");
        ECDSASigner eCDSASigner = new ECDSASigner(new HMacDSAKCalculator(new SHA256Digest()));
        eCDSASigner.init(true, new ECPrivateKeyParameters(bigInteger, EllipticCurveKt.OLrzqt()));
        BigInteger[] bigIntegerArrGenerateSignature = eCDSASigner.generateSignature(bArr);
        BigInteger bigInteger2 = bigIntegerArrGenerateSignature[0];
        Intrinsics.checkNotNullExpressionValue(bigInteger2, "");
        BigInteger bigInteger3 = bigIntegerArrGenerateSignature[1];
        Intrinsics.checkNotNullExpressionValue(bigInteger3, "");
        C59921zsC c59921zsC = new C59921zsC(bigInteger2, bigInteger3);
        return z ? EllipticCurveUtilsKt.AEQbTJ(c59921zsC) : c59921zsC;
    }

    @Override // o.InterfaceC59920zsB
    public BigInteger OLrzqt(int i, @NotNull C59921zsC c59921zsC, byte[] bArr) {
        Intrinsics.checkNotNullParameter(c59921zsC, "");
        if (i < 0) {
            throw new IllegalArgumentException("recId must be positive".toString());
        }
        if (c59921zsC.EZpvd().signum() < 0) {
            throw new IllegalArgumentException("r must be positive".toString());
        }
        if (c59921zsC.AEQbTJ().signum() < 0) {
            throw new IllegalArgumentException("s must be positive".toString());
        }
        if (bArr == null) {
            throw new IllegalArgumentException("message cannot be null".toString());
        }
        BigInteger n = EllipticCurveKt.EZpvd().getN();
        BigInteger bigIntegerAdd = c59921zsC.EZpvd().add(BigInteger.valueOf(((long) i) / ((long) 2)).multiply(n));
        if (bigIntegerAdd.compareTo(SecP256K1Curve.q) >= 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "");
        ECPoint eCPointKWHzl = KWHzl(bigIntegerAdd, (i & 1) == 1);
        if (!eCPointKWHzl.multiply(n).isInfinity()) {
            return null;
        }
        BigInteger bigIntegerMod = BigInteger.ZERO.subtract(new BigInteger(1, bArr)).mod(n);
        BigInteger bigIntegerModInverse = c59921zsC.EZpvd().modInverse(n);
        byte[] encoded = ECAlgorithms.sumOfTwoMultiplies(EllipticCurveKt.EZpvd().getG(), bigIntegerModInverse.multiply(bigIntegerMod).mod(n), eCPointKWHzl, bigIntegerModInverse.multiply(c59921zsC.AEQbTJ()).mod(n)).getEncoded(false);
        return new BigInteger(1, Arrays.copyOfRange(encoded, 1, encoded.length));
    }

    public final ECPoint KWHzl(BigInteger bigInteger, boolean z) {
        X9IntegerConverter x9IntegerConverter = new X9IntegerConverter();
        byte[] bArrIntegerToBytes = x9IntegerConverter.integerToBytes(bigInteger, x9IntegerConverter.getByteLength(EllipticCurveKt.EZpvd().getCurve()) + 1);
        bArrIntegerToBytes[0] = (byte) (z ? 3 : 2);
        ECPoint eCPointDecodePoint = EllipticCurveKt.OLrzqt().getCurve().decodePoint(bArrIntegerToBytes);
        Intrinsics.checkNotNullExpressionValue(eCPointDecodePoint, "");
        return eCPointDecodePoint;
    }

    @Override // o.InterfaceC59920zsB
    public BigInteger AEQbTJ(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        byte[] encoded = KWHzl(bigInteger).getEncoded(false);
        return new BigInteger(1, Arrays.copyOfRange(encoded, 1, encoded.length));
    }

    public final ECPoint KWHzl(BigInteger bigInteger) {
        if (bigInteger.bitLength() > EllipticCurveKt.EZpvd().getN().bitLength()) {
            bigInteger = bigInteger.mod(EllipticCurveKt.OLrzqt().getN());
        }
        ECPoint eCPointMultiply = new FixedPointCombMultiplier().multiply(EllipticCurveKt.OLrzqt().getG(), bigInteger);
        Intrinsics.checkNotNullExpressionValue(eCPointMultiply, "");
        return eCPointMultiply;
    }
}
