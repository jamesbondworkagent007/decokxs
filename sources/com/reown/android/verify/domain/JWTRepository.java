package com.reown.android.verify.domain;

import com.reown.android.verify.model.JWK;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.reown.util.UtilFunctionsKt;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56548yJl;
import o.C58174ywM;
import o.yDV;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JWTRepository {
    public static final Companion Companion = new Companion(null);

    public final String generateP256PublicKeyFromJWK(@NotNull JWK jwk) {
        Intrinsics.checkNotNullParameter(jwk, "");
        byte[] bArrKWHzl = C58174ywM.KWHzl(jwk.getX());
        Intrinsics.checkNotNullExpressionValue(bArrKWHzl, "");
        byte[] bArrKWHzl2 = C58174ywM.KWHzl(jwk.getY());
        Intrinsics.checkNotNullExpressionValue(bArrKWHzl2, "");
        ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("P-256");
        Intrinsics.checkNotNullExpressionValue(parameterSpec, "");
        ECCurve curve = parameterSpec.getCurve();
        Companion companion = Companion;
        byte[] encoded = new ECPublicKeyParameters(curve.createPoint(companion.toBigInt(bArrKWHzl), companion.toBigInt(bArrKWHzl2)), new ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(), parameterSpec.getN(), parameterSpec.getH())).getQ().getEncoded(false);
        Intrinsics.copydefault(encoded);
        return UtilFunctionsKt.bytesToHex(encoded);
    }

    public final boolean verifyJWT(@NotNull String str, @NotNull byte[] bArr) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 3) {
                throw new Throwable("Unable to split jwt: " + str);
            }
            String str2 = (String) listSplit$default.get(0);
            String str3 = (String) listSplit$default.get(1);
            byte[] bArrKWHzl = C58174ywM.KWHzl((String) listSplit$default.get(2));
            byte[] bytes = (str2 + JwtUtilsKt.JWT_DELIMITER + str3).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.copydefault(bArrKWHzl);
            BigInteger bigInteger = new BigInteger(1, yDV.EZpvd(bArrKWHzl, C56548yJl.AhwBna(0, bArrKWHzl.length / 2)));
            BigInteger bigInteger2 = new BigInteger(1, yDV.EZpvd(bArrKWHzl, C56548yJl.AhwBna(bArrKWHzl.length / 2, bArrKWHzl.length)));
            ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("P-256");
            Intrinsics.checkNotNullExpressionValue(parameterSpec, "");
            ECPoint eCPointDecodePoint = parameterSpec.getCurve().decodePoint(bArr);
            Intrinsics.checkNotNullExpressionValue(eCPointDecodePoint, "");
            ECPublicKeyParameters eCPublicKeyParameters = new ECPublicKeyParameters(eCPointDecodePoint, new ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(), parameterSpec.getN(), parameterSpec.getH()));
            ECDSASigner eCDSASigner = new ECDSASigner();
            eCDSASigner.init(false, eCPublicKeyParameters);
            SHA256Digest sHA256Digest = new SHA256Digest();
            sHA256Digest.update(bytes, 0, bytes.length);
            byte[] bArr2 = new byte[sHA256Digest.getDigestSize()];
            sHA256Digest.doFinal(bArr2, 0);
            return eCDSASigner.verifySignature(bArr2, bigInteger, bigInteger2);
        } catch (Exception unused) {
            return false;
        }
    }

    public final String decodeClaimsJWT(@NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 3) {
            throw new Throwable("Unable to split jwt: " + str);
        }
        byte[] bArrKWHzl = C58174ywM.KWHzl((String) listSplit$default.get(1));
        Intrinsics.checkNotNullExpressionValue(bArrKWHzl, "");
        return new String(bArrKWHzl, Charsets.UTF_8);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.verify.domain.JWTRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final BigInteger toBigInt(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return new BigInteger(1, bArr);
        }
    }
}
