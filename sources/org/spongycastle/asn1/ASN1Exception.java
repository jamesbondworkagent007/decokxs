package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes25.dex */
public class ASN1Exception extends IOException {
    private Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ASN1Exception(String str) {
        super(str);
    }

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
