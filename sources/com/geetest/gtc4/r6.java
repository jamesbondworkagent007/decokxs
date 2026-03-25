package com.geetest.gtc4;

import android.util.Base64;
import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes21.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f500a;
    public final boolean b;
    public final int c;
    public final byte[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r6(w wVar) throws CertificateParsingException {
        if (!(wVar instanceof z)) {
            throw new CertificateParsingException("Expected sequence for root of trust, found ".concat(wVar.getClass().getName()));
        }
        z zVar = (z) wVar;
        boolean z = false;
        this.f500a = q0.a(zVar.a(0));
        f fVarA = zVar.a(1);
        if (!(fVarA instanceof e)) {
            throw new CertificateParsingException("Expected boolean, found ".concat(fVarA.getClass().getName()));
        }
        e eVar = (e) fVarA;
        if (eVar.b(e.c)) {
            z = true;
        } else if (!eVar.b(e.b)) {
            throw new CertificateParsingException("DER-encoded boolean values must contain either 0x00 or 0xFF");
        }
        this.b = z;
        this.c = q0.b(zVar.a(2));
        if (zVar.k() == 3) {
            this.d = null;
        } else {
            this.d = q0.a(zVar.a(3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Verified boot Key: ");
        sb.append(Base64.encodeToString(this.f500a, 0));
        sb.append(" (base64)\nDevice locked: ");
        sb.append(this.b);
        sb.append("\nVerified boot state: ");
        int i = this.c;
        if (i == 0) {
            str = "Verified";
        } else if (i == 1) {
            str = "Self-signed";
        } else if (i == 2) {
            str = "Unverified";
        } else if (i != 3) {
            str = "Unknown (" + i + ")";
        } else {
            str = "Failed";
        }
        sb.append(str);
        sb.append('\n');
        if (this.d != null) {
            sb.append("Verified boot hash: ");
            sb.append(Base64.encodeToString(this.d, 0));
            sb.append(" (base64)");
        }
        return sb.toString();
    }

    public r6(byte[] bArr, boolean z, int i, byte[] bArr2) {
        this.f500a = bArr;
        this.b = z;
        this.c = i;
        this.d = bArr2;
    }
}
