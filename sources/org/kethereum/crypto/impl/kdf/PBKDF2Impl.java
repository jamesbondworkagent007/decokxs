package org.kethereum.crypto.impl.kdf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.kethereum.crypto.impl.hashing.DigestParams;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes24.dex */
public final class PBKDF2Impl implements PBKDF2 {
    @Override // org.kethereum.crypto.impl.kdf.PBKDF2
    public byte[] KWHzl(@NotNull byte[] bArr, byte[] bArr2, int i, @NotNull DigestParams digestParams) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(digestParams, "");
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(copydefault(digestParams));
        pKCS5S2ParametersGenerator.init(bArr, bArr2, i);
        CipherParameters cipherParametersGenerateDerivedParameters = pKCS5S2ParametersGenerator.generateDerivedParameters(digestParams.copydefault());
        if (cipherParametersGenerateDerivedParameters == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.spongycastle.crypto.params.KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParametersGenerateDerivedParameters).getKey();
        Intrinsics.checkNotNullExpressionValue(key, "");
        return key;
    }

    @Override // org.kethereum.crypto.impl.kdf.PBKDF2
    public byte[] copydefault(@NotNull char[] cArr, byte[] bArr, int i, @NotNull DigestParams digestParams) {
        Intrinsics.checkNotNullParameter(cArr, "");
        Intrinsics.checkNotNullParameter(digestParams, "");
        byte[] bArrPKCS5PasswordToUTF8Bytes = PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(cArr);
        Intrinsics.checkNotNullExpressionValue(bArrPKCS5PasswordToUTF8Bytes, "");
        return KWHzl(bArrPKCS5PasswordToUTF8Bytes, bArr, i, digestParams);
    }

    public final Digest copydefault(@NotNull DigestParams digestParams) {
        Intrinsics.checkNotNullParameter(digestParams, "");
        if (Intrinsics.EZpvd(digestParams, DigestParams.Sha256.EZpvd)) {
            return new SHA256Digest();
        }
        if (Intrinsics.EZpvd(digestParams, DigestParams.Sha512.EZpvd)) {
            return new SHA512Digest();
        }
        throw new NoWhenBranchMatchedException();
    }
}
