package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.global.MTCoreGlobal;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class t extends q {
    public SSLSocket d;

    /* JADX INFO: loaded from: classes14.dex */
    public static class a implements X509TrustManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public X509TrustManager f344a;
        public X509Certificate b;

        /* JADX INFO: renamed from: com.engagelab.privates.common.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes17.dex */
        public static class C0189a extends CertificateException {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C0189a(String str) {
                super("MyCertificateException:" + str);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(String str) throws CertificateException {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
                X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                byteArrayInputStream.close();
                this.b = x509Certificate;
                KeyStore.TrustedCertificateEntry trustedCertificateEntry = new KeyStore.TrustedCertificateEntry(x509Certificate);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setEntry("ca_root", trustedCertificateEntry, null);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f344a = (X509TrustManager) trustManager;
                        return;
                    }
                }
            } catch (Throwable th) {
                MTCommonLog.e("SSLTrustManager", "init trustManager failed, error:" + th);
                throw new C0189a("SSLTrustManager init : " + th);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            MTCommonLog.d("SSLTrustManager", "checkClientTrusted");
            this.f344a.checkClientTrusted(x509CertificateArr, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            MTCommonLog.d("SSLTrustManager", "checkServerTrusted");
            if (x509CertificateArr != null && x509CertificateArr.length != 0) {
                if (x509CertificateArr[0] != null) {
                    try {
                        for (X509Certificate x509Certificate : x509CertificateArr) {
                            x509Certificate.checkValidity();
                            x509Certificate.verify(this.b.getPublicKey());
                        }
                        return;
                    } catch (InvalidKeyException e) {
                        MTCommonLog.e("SSLTrustManager", ":checkServerTrusted: InvalidKeyException:" + e);
                        throw new C0189a("InvalidKeyException:" + e);
                    } catch (NoSuchAlgorithmException e2) {
                        MTCommonLog.e("SSLTrustManager", ":checkServerTrusted: NoSuchAlgorithmException:" + e2);
                        throw new C0189a("NoSuchAlgorithmException:" + e2);
                    } catch (NoSuchProviderException e3) {
                        MTCommonLog.e("SSLTrustManager", ":checkServerTrusted: NoSuchProviderException:" + e3);
                        throw new C0189a("NoSuchProviderException:" + e3);
                    } catch (SignatureException e4) {
                        MTCommonLog.e("SSLTrustManager", ":checkServerTrusted: SignatureException:" + e4);
                        throw new C0189a("SignatureException:" + e4);
                    } catch (CertificateExpiredException e5) {
                        MTCommonLog.e("SSLTrustManager", ":checkServerTrusted: CertificateExpiredException:" + e5);
                        throw new C0189a("CertificateExpiredException:" + e5);
                    } catch (CertificateNotYetValidException e6) {
                        MTCommonLog.e("SSLTrustManager", ":checkServerTrusted: CertificateNotYetValidException:" + e6);
                        throw new C0189a("CertificateNotYetValidException:" + e6);
                    }
                }
            }
            throw new C0189a("Check Server x509Certificates is empty");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            MTCommonLog.d("SSLTrustManager", "getAcceptedIssuers");
            return this.f344a.getAcceptedIssuers();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.q
    public String a() {
        return "TcpSSLClient";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public void a(Context context) {
        try {
            MTCommonLog.d("TcpSSLClient", "tcp disconnectImp");
            SSLSocket sSLSocket = this.d;
            if (sSLSocket != null) {
                sSLSocket.close();
                this.d = null;
            }
        } catch (Throwable th) {
            MTCommonLog.w("TcpSSLClient", "disconnect failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public boolean b(Context context, String str, int i) {
        SSLSocket sSLSocketC = c(context, str, i);
        if (sSLSocketC == null) {
            MTCommonLog.d("TcpSSLClient", "tcp connect fai");
            return false;
        }
        this.d = sSLSocketC;
        MTCommonLog.d("TcpSSLClient", "tcp connect success");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public List<String> c(Context context) {
        return i(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public byte[] d(Context context) {
        try {
        } catch (IOException e) {
            MTCommonLog.w("TcpSSLClient", "receive IOException " + e.getMessage());
            a(context, true);
        } catch (Throwable th) {
            MTCommonLog.w("TcpSSLClient", "receive failed " + th.getMessage());
            a(context, true);
        }
        if (!b()) {
            MTCommonLog.d("TcpSSLClient", "tcp is not connecting");
            return null;
        }
        if (!this.d.isConnected()) {
            MTCommonLog.w("TcpSSLClient", "socketChannel is disConnected");
            a(context, true);
            return null;
        }
        if (b()) {
            byte[] bArr = new byte[2];
            int i = this.d.getInputStream().read(bArr);
            if (i < 0) {
                MTCommonLog.w("TcpSSLClient", "read ahead length = " + i);
                a(context, true);
                return null;
            }
            int i2 = ByteBuffer.wrap(bArr).getShort() & 16383;
            if (i2 == 0) {
                MTCommonLog.w("TcpSSLClient", "read total length = " + i2);
                a(context, true);
                return null;
            }
            int i3 = i2 - 2;
            byte[] bArr2 = new byte[i3];
            int i4 = this.d.getInputStream().read(bArr2);
            if (i4 != 0) {
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                System.arraycopy(bArr2, 0, bArr3, 2, i3);
                return bArr3;
            }
            MTCommonLog.w("TcpSSLClient", "read content length = " + i4);
            a(context, true);
            return null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> i(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> j(Context context) {
        Set<String> setM = w.m(context);
        Address address = MTCoreGlobal.getAddress();
        int defaultPort = address.getDefaultPort();
        if (defaultPort <= 0) {
            return setM;
        }
        String defaultHost = address.getDefaultHost();
        if (!TextUtils.isEmpty(defaultHost)) {
            setM.add(defaultHost + ":" + defaultPort);
        }
        String defaultIp = address.getDefaultIp();
        if (!TextUtils.isEmpty(defaultIp)) {
            setM.add(defaultIp + ":" + defaultPort);
        }
        return setM;
    }

    @Override // com.engagelab.privates.common.q
    public boolean c(Context context, byte[] bArr) throws IOException {
        SSLSocket sSLSocket = this.d;
        if (sSLSocket == null || !sSLSocket.isConnected()) {
            return false;
        }
        this.d.getOutputStream().write(bArr);
        return true;
    }

    public final TrustManager a(String str) throws CertificateException {
        return new a(str);
    }

    public final SSLSocket c(Context context, String str, int i) {
        CertificateException e;
        SSLSocket sSLSocket;
        SSLSocket sSLSocket2 = null;
        try {
            String strA = w.a(context);
            if (TextUtils.isEmpty(strA)) {
                MTCommonLog.e("TcpSSLClient", "ssl cer is null");
                return null;
            }
            MTCommonLog.d("TcpSSLClient", "host:" + str + ",port:" + i);
            SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.SSL);
            sSLContext.init(null, new TrustManager[]{a(strA)}, new SecureRandom());
            sSLSocket = (SSLSocket) sSLContext.getSocketFactory().createSocket(str, i);
            try {
                sSLSocket.setKeepAlive(true);
                return sSLSocket;
            } catch (SocketException e2) {
                e = e2;
                sSLSocket2 = sSLSocket;
                MTCommonLog.e("TcpSSLClient", "ssl SocketException:" + e.getMessage());
                return sSLSocket2;
            } catch (UnknownHostException e3) {
                e = e3;
                sSLSocket2 = sSLSocket;
                MTCommonLog.e("TcpSSLClient", "ssl UnknownHostException:" + e.getMessage());
                return sSLSocket2;
            } catch (IOException e4) {
                e = e4;
                sSLSocket2 = sSLSocket;
                MTCommonLog.e("TcpSSLClient", "ssl IOException:" + e.getMessage());
                return sSLSocket2;
            } catch (KeyManagementException e5) {
                e = e5;
                sSLSocket2 = sSLSocket;
                MTCommonLog.e("TcpSSLClient", "ssl KeyManagementException:" + e.getMessage());
                return sSLSocket2;
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                sSLSocket2 = sSLSocket;
                MTCommonLog.e("TcpSSLClient", "ssl NoSuchAlgorithmException:" + e.getMessage());
                return sSLSocket2;
            } catch (CertificateException e7) {
                e = e7;
                if (!MTGlobal.IS_FOR_ENGAGELAB) {
                    w.a(context, (String) null);
                }
                MTCommonLog.e("TcpSSLClient", "ssl CertificateException:" + e.getMessage());
                return sSLSocket;
            }
        } catch (SocketException e8) {
            e = e8;
        } catch (UnknownHostException e9) {
            e = e9;
        } catch (IOException e10) {
            e = e10;
        } catch (KeyManagementException e11) {
            e = e11;
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
        } catch (CertificateException e13) {
            e = e13;
            sSLSocket = null;
        }
    }
}
