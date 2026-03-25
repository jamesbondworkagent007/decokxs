package org.kethereum.crypto.impl.mac;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59922zsD;
import org.jetbrains.annotations.NotNull;
import org.kethereum.crypto.impl.hashing.DigestParams;

/* JADX INFO: loaded from: classes24.dex */
public final class HmacImpl implements InterfaceC59922zsD {
    public Mac OLrzqt;

    @Override // o.InterfaceC59922zsD
    public InterfaceC59922zsD KWHzl(@NotNull byte[] bArr, @NotNull DigestParams digestParams) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(digestParams, "");
        String strAEQbTJ = AEQbTJ(digestParams);
        Mac mac = Mac.getInstance(strAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(mac, "");
        this.OLrzqt = mac;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, strAEQbTJ);
        Mac mac2 = this.OLrzqt;
        if (mac2 == null) {
            Intrinsics.gEmmrt("");
            mac2 = null;
        }
        mac2.init(secretKeySpec);
        return this;
    }

    @Override // o.InterfaceC59922zsD
    public byte[] AEQbTJ(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Mac mac = this.OLrzqt;
        if (mac == null) {
            Intrinsics.gEmmrt("");
            mac = null;
        }
        byte[] bArrDoFinal = mac.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        return bArrDoFinal;
    }

    public final String AEQbTJ(DigestParams digestParams) {
        if (Intrinsics.EZpvd(digestParams, DigestParams.Sha512.EZpvd)) {
            return "HmacSHA512";
        }
        if (Intrinsics.EZpvd(digestParams, DigestParams.Sha256.EZpvd)) {
            return "HmacSHA256";
        }
        throw new NoWhenBranchMatchedException();
    }
}
