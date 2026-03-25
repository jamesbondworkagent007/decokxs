package com.geetest.gtc4;

import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes21.dex */
public final class y0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f536a;
    public final long b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y0(f fVar) throws CertificateParsingException {
        if (!(fVar instanceof z)) {
            throw new CertificateParsingException("Expected sequence for AttestationPackageInfo, found ".concat(fVar.getClass().getName()));
        }
        z zVar = (z) fVar;
        try {
            this.f536a = q0.d(zVar.a(0));
            this.b = q0.c(zVar.a(1)).longValue();
        } catch (UnsupportedEncodingException e) {
            throw new CertificateParsingException("Converting octet stream to String triggered an UnsupportedEncodingException", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        int iCompareTo = this.f536a.compareTo(y0Var.f536a);
        return iCompareTo != 0 ? iCompareTo : Long.compare(this.b, y0Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            int iCompareTo = this.f536a.compareTo(y0Var.f536a);
            if (iCompareTo == 0) {
                iCompareTo = Long.compare(this.b, y0Var.b);
            }
            if (iCompareTo == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f536a + " (version code " + this.b + ")\n";
    }
}
