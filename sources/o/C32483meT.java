package o;

import com.okinc.core.util.SPUtils;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.meT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32483meT {
    public static final C32483meT AEQbTJ = new C32483meT();

    /* JADX INFO: renamed from: o.meT$TaskDescription */
    public static final class TaskDescription implements X509TrustManager {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, java.lang.String str) throws CertificateException {
            Intrinsics.checkNotNullParameter(x509CertificateArr, "");
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, java.lang.String str) throws CertificateException {
            Intrinsics.checkNotNullParameter(x509CertificateArr, "");
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private C32483meT() {
    }

    public final void KWHzl(@NotNull OkHttpClient.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "");
        if (z || SPUtils.getBoolean("requests_dev_device", false)) {
            C33495mxY.OLrzqt("unsafeOperation", "忽略证书校验");
            try {
                javax.net.ssl.TrustManager[] trustManagerArr = {new TaskDescription()};
                SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.SSL);
                sSLContext.init(null, trustManagerArr, new java.security.SecureRandom());
                javax.net.ssl.SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                Intrinsics.copydefault(socketFactory);
                javax.net.ssl.TrustManager trustManager = trustManagerArr[0];
                Intrinsics.copydefault(trustManager, "");
                builder.sslSocketFactory(socketFactory, (X509TrustManager) trustManager);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }
}
