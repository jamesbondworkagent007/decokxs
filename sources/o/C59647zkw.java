package o;

import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: o.zkw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@java.lang.Deprecated
public class C59647zkw {
    public java.lang.String EZpvd;
    public java.security.SecureRandom KWHzl;
    public final java.util.Set<KeyManager> copydefault = new LinkedHashSet();
    public final java.util.Set<javax.net.ssl.TrustManager> OLrzqt = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59647zkw AEQbTJ(java.security.SecureRandom secureRandom) {
        this.KWHzl = secureRandom;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59647zkw EZpvd(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    public C59647zkw AEQbTJ(KeyStore keyStore, InterfaceC59599zkA interfaceC59599zkA) throws java.security.NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (interfaceC59599zkA != null) {
                for (int i = 0; i < trustManagers.length; i++) {
                    javax.net.ssl.TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i] = new TaskDescription((X509TrustManager) trustManager, interfaceC59599zkA);
                    }
                }
            }
            for (javax.net.ssl.TrustManager trustManager2 : trustManagers) {
                this.OLrzqt.add(trustManager2);
            }
        }
        return this;
    }

    public C59647zkw copydefault(KeyStore keyStore) throws java.security.NoSuchAlgorithmException, KeyStoreException {
        return AEQbTJ(keyStore, null);
    }

    public C59647zkw copydefault(KeyStore keyStore, char[] cArr) throws java.security.NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        EZpvd(keyStore, cArr, null);
        return this;
    }

    public C59647zkw EZpvd(KeyStore keyStore, char[] cArr, InterfaceC59643zks interfaceC59643zks) throws java.security.NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            if (interfaceC59643zks != null) {
                for (int i = 0; i < keyManagers.length; i++) {
                    KeyManager keyManager = keyManagers[i];
                    if (keyManager instanceof X509KeyManager) {
                        keyManagers[i] = new Activity((X509KeyManager) keyManager, interfaceC59643zks);
                    }
                }
            }
            for (KeyManager keyManager2 : keyManagers) {
                this.copydefault.add(keyManager2);
            }
        }
        return this;
    }

    public SSLContext OLrzqt() throws java.security.NoSuchAlgorithmException, KeyManagementException {
        KeyManager[] keyManagerArr;
        java.lang.String str = this.EZpvd;
        if (str == null) {
            str = SSLSocketFactory.TLS;
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        javax.net.ssl.TrustManager[] trustManagerArr = null;
        if (this.copydefault.isEmpty()) {
            keyManagerArr = null;
        } else {
            java.util.Set<KeyManager> set = this.copydefault;
            keyManagerArr = (KeyManager[]) set.toArray(new KeyManager[set.size()]);
        }
        if (!this.OLrzqt.isEmpty()) {
            java.util.Set<javax.net.ssl.TrustManager> set2 = this.OLrzqt;
            trustManagerArr = (javax.net.ssl.TrustManager[]) set2.toArray(new javax.net.ssl.TrustManager[set2.size()]);
        }
        sSLContext.init(keyManagerArr, trustManagerArr, this.KWHzl);
        return sSLContext;
    }

    /* JADX INFO: renamed from: o.zkw$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static class TaskDescription implements X509TrustManager {
        public final X509TrustManager OLrzqt;
        public final InterfaceC59599zkA copydefault;

        public TaskDescription(X509TrustManager x509TrustManager, InterfaceC59599zkA interfaceC59599zkA) {
            this.OLrzqt = x509TrustManager;
            this.copydefault = interfaceC59599zkA;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, java.lang.String str) throws CertificateException {
            this.OLrzqt.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, java.lang.String str) throws CertificateException {
            if (this.copydefault.AEQbTJ(x509CertificateArr, str)) {
                return;
            }
            this.OLrzqt.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.OLrzqt.getAcceptedIssuers();
        }
    }

    /* JADX INFO: renamed from: o.zkw$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static class Activity implements X509KeyManager {
        public final InterfaceC59643zks AEQbTJ;
        public final X509KeyManager copydefault;

        public Activity(X509KeyManager x509KeyManager, InterfaceC59643zks interfaceC59643zks) {
            this.copydefault = x509KeyManager;
            this.AEQbTJ = interfaceC59643zks;
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String[] getClientAliases(java.lang.String str, Principal[] principalArr) {
            return this.copydefault.getClientAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String chooseClientAlias(java.lang.String[] strArr, Principal[] principalArr, Socket socket) {
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : strArr) {
                java.lang.String[] clientAliases = this.copydefault.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (java.lang.String str2 : clientAliases) {
                        map.put(str2, new C59646zkv(str, this.copydefault.getCertificateChain(str2)));
                    }
                }
            }
            return this.AEQbTJ.EZpvd(map, socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String[] getServerAliases(java.lang.String str, Principal[] principalArr) {
            return this.copydefault.getServerAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String chooseServerAlias(java.lang.String str, Principal[] principalArr, Socket socket) {
            java.util.HashMap map = new java.util.HashMap();
            java.lang.String[] serverAliases = this.copydefault.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (java.lang.String str2 : serverAliases) {
                    map.put(str2, new C59646zkv(str, this.copydefault.getCertificateChain(str2)));
                }
            }
            return this.AEQbTJ.EZpvd(map, socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(java.lang.String str) {
            return this.copydefault.getCertificateChain(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(java.lang.String str) {
            return this.copydefault.getPrivateKey(str);
        }
    }
}
