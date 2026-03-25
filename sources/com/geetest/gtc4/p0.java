package com.geetest.gtc4;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 extends t0 {
    public final int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p0(X509Certificate x509Certificate) throws CertificateParsingException {
        super(x509Certificate);
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.17");
        }
        z zVarB = q0.b(extensionValue);
        this.f511a = q0.b(zVarB.a(0));
        this.h = q0.b(zVarB.a(1));
        this.b = q0.b(zVarB.a(2));
        this.c = q0.b(zVarB.a(3));
        this.d = q0.a(zVarB.a(4));
        this.e = q0.a(zVarB.a(5));
        this.f = new a1(zVarB.a(6));
        this.g = new a1(zVarB.a(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.t0
    public final int a() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.t0
    public final r6 b() {
        r6 r6Var = this.g.s;
        return r6Var != null ? r6Var : this.f.s;
    }
}
