package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import o.C59640zkp;
import o.C59644zkt;
import o.C59776znS;
import o.C59849zom;
import o.C59851zoo;
import o.C59853zoq;
import o.InterfaceC59599zkA;
import o.InterfaceC59629zke;
import o.InterfaceC59630zkf;
import o.InterfaceC59632zkh;
import o.InterfaceC59637zkm;
import o.InterfaceC59779znV;
import o.InterfaceC59838zob;
import org.apache.http.HttpHost;
import org.apache.http.conn.HttpInetSocketAddress;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class SSLSocketFactory implements InterfaceC59637zkm, InterfaceC59629zke, InterfaceC59630zkf {
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final String TLS = "TLS";
    private volatile X509HostnameVerifier hostnameVerifier;
    private final InterfaceC59632zkh nameResolver;
    private final javax.net.ssl.SSLSocketFactory socketfactory;
    private final String[] supportedCipherSuites;
    private final String[] supportedProtocols;
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new C59640zkp();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public X509HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public void prepareSocket(SSLSocket sSLSocket) throws IOException {
    }

    public static SSLSocketFactory getSocketFactory() throws SSLInitializationException {
        return new SSLSocketFactory(C59644zkt.AEQbTJ(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private static String[] split(String str) {
        if (C59853zoq.OLrzqt(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public static SSLSocketFactory getSystemSocketFactory() throws SSLInitializationException {
        return new SSLSocketFactory((javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(), split(System.getProperty("https.protocols")), split(System.getProperty("https.cipherSuites")), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, InterfaceC59632zkh interfaceC59632zkh) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().EZpvd(str).AEQbTJ(secureRandom).copydefault(keyStore, str2 != null ? str2.toCharArray() : null).copydefault(keyStore2).OLrzqt(), interfaceC59632zkh);
    }

    public SSLSocketFactory(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, InterfaceC59599zkA interfaceC59599zkA, X509HostnameVerifier x509HostnameVerifier) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().EZpvd(str).AEQbTJ(secureRandom).copydefault(keyStore, str2 != null ? str2.toCharArray() : null).AEQbTJ(keyStore2, interfaceC59599zkA).OLrzqt(), x509HostnameVerifier);
    }

    public SSLSocketFactory(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, X509HostnameVerifier x509HostnameVerifier) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().EZpvd(str).AEQbTJ(secureRandom).copydefault(keyStore, str2 != null ? str2.toCharArray() : null).copydefault(keyStore2).OLrzqt(), x509HostnameVerifier);
    }

    public SSLSocketFactory(KeyStore keyStore, String str, KeyStore keyStore2) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().copydefault(keyStore, str != null ? str.toCharArray() : null).copydefault(keyStore2).OLrzqt(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(KeyStore keyStore, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().copydefault(keyStore, str != null ? str.toCharArray() : null).OLrzqt(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(KeyStore keyStore) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().copydefault(keyStore).OLrzqt(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(InterfaceC59599zkA interfaceC59599zkA, X509HostnameVerifier x509HostnameVerifier) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().AEQbTJ(null, interfaceC59599zkA).OLrzqt(), x509HostnameVerifier);
    }

    public SSLSocketFactory(InterfaceC59599zkA interfaceC59599zkA) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        this(C59644zkt.OLrzqt().AEQbTJ(null, interfaceC59599zkA).OLrzqt(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sSLContext) {
        this(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sSLContext, InterfaceC59632zkh interfaceC59632zkh) {
        this.socketfactory = sSLContext.getSocketFactory();
        this.hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        this.nameResolver = interfaceC59632zkh;
        this.supportedProtocols = null;
        this.supportedCipherSuites = null;
    }

    public SSLSocketFactory(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) C59851zoo.AEQbTJ(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) C59851zoo.AEQbTJ(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this.socketfactory = (javax.net.ssl.SSLSocketFactory) C59851zoo.AEQbTJ(sSLSocketFactory, "SSL socket factory");
        this.supportedProtocols = strArr;
        this.supportedCipherSuites = strArr2;
        this.hostnameVerifier = x509HostnameVerifier == null ? BROWSER_COMPATIBLE_HOSTNAME_VERIFIER : x509HostnameVerifier;
        this.nameResolver = null;
    }

    @Override // o.InterfaceC59638zkn
    public Socket createSocket(InterfaceC59779znV interfaceC59779znV) throws IOException {
        return createSocket((InterfaceC59838zob) null);
    }

    public Socket createSocket() throws IOException {
        return createSocket((InterfaceC59838zob) null);
    }

    @Override // o.InterfaceC59638zkn
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC59779znV interfaceC59779znV) throws IOException {
        HttpHost httpHost;
        C59851zoo.AEQbTJ(inetSocketAddress, "Remote address");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        if (inetSocketAddress instanceof HttpInetSocketAddress) {
            httpHost = ((HttpInetSocketAddress) inetSocketAddress).getHttpHost();
        } else {
            httpHost = new HttpHost(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        }
        HttpHost httpHost2 = httpHost;
        int iOLrzqt = C59776znS.OLrzqt(interfaceC59779znV);
        int iKWHzl = C59776znS.KWHzl(interfaceC59779znV);
        socket.setSoTimeout(iOLrzqt);
        return connectSocket(iKWHzl, socket, httpHost2, inetSocketAddress, inetSocketAddress2, (InterfaceC59838zob) null);
    }

    @Override // o.InterfaceC59638zkn
    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        C59851zoo.AEQbTJ(socket, "Socket");
        C59849zom.EZpvd(socket instanceof SSLSocket, "Socket not created by this factory");
        C59849zom.EZpvd(!socket.isClosed(), "Socket is closed");
        return true;
    }

    @Override // o.InterfaceC59637zkm
    public Socket createLayeredSocket(Socket socket, String str, int i, InterfaceC59779znV interfaceC59779znV) throws IOException {
        return createLayeredSocket(socket, str, i, (InterfaceC59838zob) null);
    }

    @Override // o.InterfaceC59629zke
    public Socket createLayeredSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return createLayeredSocket(socket, str, i, (InterfaceC59838zob) null);
    }

    public void setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        C59851zoo.AEQbTJ(x509HostnameVerifier, "Hostname verifier");
        this.hostnameVerifier = x509HostnameVerifier;
    }

    @Override // o.InterfaceC59641zkq
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, InterfaceC59779znV interfaceC59779znV) throws IOException {
        InetAddress byName;
        InetSocketAddress inetSocketAddress;
        InterfaceC59632zkh interfaceC59632zkh = this.nameResolver;
        if (interfaceC59632zkh != null) {
            byName = interfaceC59632zkh.AEQbTJ(str);
        } else {
            byName = InetAddress.getByName(str);
        }
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        return connectSocket(socket, new HttpInetSocketAddress(new HttpHost(str, i), byName, i), inetSocketAddress, interfaceC59779znV);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return createLayeredSocket(socket, str, i, z);
    }

    public final void internalPrepareSocket(SSLSocket sSLSocket) throws IOException {
        String[] strArr = this.supportedProtocols;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.supportedCipherSuites;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        prepareSocket(sSLSocket);
    }

    public Socket createSocket(InterfaceC59838zob interfaceC59838zob) throws IOException {
        return SocketFactory.getDefault().createSocket();
    }

    public Socket connectSocket(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC59838zob interfaceC59838zob) throws IOException {
        C59851zoo.AEQbTJ(httpHost, "HTTP host");
        C59851zoo.AEQbTJ(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = createSocket(interfaceC59838zob);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                sSLSocket.startHandshake();
                verifyHostname(sSLSocket, httpHost.getHostName());
                return socket;
            }
            return createLayeredSocket(socket, httpHost.getHostName(), inetSocketAddress.getPort(), interfaceC59838zob);
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, InterfaceC59838zob interfaceC59838zob) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i, true);
        internalPrepareSocket(sSLSocket);
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, str);
        return sSLSocket;
    }

    private void verifyHostname(SSLSocket sSLSocket, String str) throws IOException {
        try {
            this.hostnameVerifier.verify(str, sSLSocket);
        } catch (IOException e) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e;
        }
    }
}
