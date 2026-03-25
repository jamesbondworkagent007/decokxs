package org.komputing.khash.keccak;

import java.util.Arrays;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes24.dex */
public enum KeccakParameter {
    KECCAK_224(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 28, 1),
    KECCAK_256(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 32, 1),
    KECCAK_384(104, 48, 1),
    KECCAK_512(72, 64, 1),
    SHA3_224(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 28, 6),
    SHA3_256(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 32, 6),
    SHA3_384(104, 48, 6),
    SHA3_512(72, 64, 6),
    SHAKE128(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 32, 31),
    SHAKE256(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 64, 31);

    private final int d;
    private final int outputLengthInBytes;
    private final int rateInBytes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getD() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOutputLengthInBytes() {
        return this.outputLengthInBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRateInBytes() {
        return this.rateInBytes;
    }

    KeccakParameter(int i, int i2, int i3) {
        this.rateInBytes = i;
        this.outputLengthInBytes = i2;
        this.d = i3;
    }

    /* JADX DEBUG: Replace access to removed values field ($VALUES) with 'values()' method */
    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static KeccakParameter[] valuesCustom() {
        KeccakParameter[] keccakParameterArrValuesCustom = values();
        return (KeccakParameter[]) Arrays.copyOf(keccakParameterArrValuesCustom, keccakParameterArrValuesCustom.length);
    }
}
