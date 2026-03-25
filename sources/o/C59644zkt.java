package o;

import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.SSLInitializationException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: o.zkt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59644zkt {
    public static SSLContext AEQbTJ() throws SSLInitializationException {
        try {
            SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.TLS);
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e) {
            throw new SSLInitializationException(e.getMessage(), e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new SSLInitializationException(e2.getMessage(), e2);
        }
    }

    public static C59647zkw OLrzqt() {
        return new C59647zkw();
    }
}
