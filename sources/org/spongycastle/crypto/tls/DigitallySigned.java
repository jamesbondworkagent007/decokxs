package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes25.dex */
public class DigitallySigned {
    protected SignatureAndHashAlgorithm algorithm;
    protected byte[] signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignatureAndHashAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSignature() {
        return this.signature;
    }

    public DigitallySigned(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'signature' cannot be null");
        }
        this.algorithm = signatureAndHashAlgorithm;
        this.signature = bArr;
    }

    public void encode(OutputStream outputStream) throws IOException {
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = this.algorithm;
        if (signatureAndHashAlgorithm != null) {
            signatureAndHashAlgorithm.encode(outputStream);
        }
        TlsUtils.writeOpaque16(this.signature, outputStream);
    }

    public static DigitallySigned parse(TlsContext tlsContext, InputStream inputStream) throws IOException {
        return new DigitallySigned(TlsUtils.isTLSv12(tlsContext) ? SignatureAndHashAlgorithm.parse(inputStream) : null, TlsUtils.readOpaque16(inputStream));
    }
}
