package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;
import o.AbstractC59642zkr;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BrowserCompatHostnameVerifier extends AbstractC59642zkr {
    public static final BrowserCompatHostnameVerifier INSTANCE = new BrowserCompatHostnameVerifier();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
        verify(str, strArr, strArr2, false);
    }
}
