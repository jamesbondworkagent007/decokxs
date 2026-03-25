package org.kethereum.crypto.impl.kdf;

import org.jetbrains.annotations.NotNull;
import org.kethereum.crypto.impl.hashing.DigestParams;

/* JADX INFO: loaded from: classes24.dex */
public interface PBKDF2 {
    byte[] KWHzl(@NotNull byte[] bArr, byte[] bArr2, int i, @NotNull DigestParams digestParams);

    byte[] copydefault(@NotNull char[] cArr, byte[] bArr, int i, @NotNull DigestParams digestParams);

    public static final class DefaultImpls {
        public static /* synthetic */ byte[] derive$default(PBKDF2 pbkdf2, byte[] bArr, byte[] bArr2, int i, DigestParams digestParams, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: derive");
            }
            if ((i2 & 4) != 0) {
                i = 2048;
            }
            if ((i2 & 8) != 0) {
                digestParams = DigestParams.Sha512.EZpvd;
            }
            return pbkdf2.KWHzl(bArr, bArr2, i, digestParams);
        }

        public static /* synthetic */ byte[] derive$default(PBKDF2 pbkdf2, char[] cArr, byte[] bArr, int i, DigestParams digestParams, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: derive");
            }
            if ((i2 & 4) != 0) {
                i = 2048;
            }
            if ((i2 & 8) != 0) {
                digestParams = DigestParams.Sha512.EZpvd;
            }
            return pbkdf2.copydefault(cArr, bArr, i, digestParams);
        }
    }
}
