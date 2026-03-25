package o;

import java.security.cert.X509Certificate;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zkv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@java.lang.Deprecated
public final class C59646zkv {
    public final java.lang.String AEQbTJ;
    public final X509Certificate[] OLrzqt;

    public C59646zkv(java.lang.String str, X509Certificate[] x509CertificateArr) {
        this.AEQbTJ = (java.lang.String) C59851zoo.AEQbTJ(str, "Private key type");
        this.OLrzqt = x509CertificateArr;
    }

    public java.lang.String toString() {
        return this.AEQbTJ + AbstractJsonLexerKt.COLON + java.util.Arrays.toString(this.OLrzqt);
    }
}
