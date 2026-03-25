package o;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zlQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59668zlQ extends C59681zld implements InterfaceC59569zjX, InterfaceC59562zjQ, InterfaceC59838zob {
    public volatile boolean AkhnZx;
    public volatile Socket AuCTel;
    public HttpHost ejfBZ;
    public boolean values;
    public final InterfaceC59499ziG fetchVPNInfo = LogFactory.copydefault(getClass());
    public final InterfaceC59499ziG DbNXlk = LogFactory.KWHzl("org.apache.http.headers");
    public final InterfaceC59499ziG fJNWhG = LogFactory.KWHzl("org.apache.http.wire");
    public final java.util.Map<java.lang.String, java.lang.Object> isConnected = new java.util.HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59569zjX
    public final boolean AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59681zld, o.InterfaceC59569zjX
    public final Socket AhwBna() {
        return this.AuCTel;
    }

    @Override // o.InterfaceC59562zjQ
    public SSLSession fetchVPNInfo() {
        if (this.AuCTel instanceof SSLSocket) {
            return ((SSLSocket) this.AuCTel).getSession();
        }
        return null;
    }

    @Override // o.InterfaceC59569zjX
    public void KWHzl(Socket socket, HttpHost httpHost) throws java.io.IOException {
        fARcdN();
        this.AuCTel = socket;
        this.ejfBZ = httpHost;
        if (this.AkhnZx) {
            socket.close();
            throw new java.io.InterruptedIOException("Connection already shutdown");
        }
    }

    @Override // o.InterfaceC59569zjX
    public void OLrzqt(boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        fARcdN();
        this.values = z;
        AEQbTJ(this.AuCTel, interfaceC59779znV);
    }

    @Override // o.C59681zld, o.InterfaceC59572zja
    public void EZpvd() throws java.io.IOException {
        this.AkhnZx = true;
        try {
            super.EZpvd();
            if (this.fetchVPNInfo.isDebugEnabled()) {
                this.fetchVPNInfo.debug("Connection " + this + " shut down");
            }
            Socket socket = this.AuCTel;
            if (socket != null) {
                socket.close();
            }
        } catch (java.io.IOException e) {
            this.fetchVPNInfo.debug("I/O error shutting down connection", e);
        }
    }

    @Override // o.C59681zld, o.InterfaceC59572zja, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        try {
            super.close();
            if (this.fetchVPNInfo.isDebugEnabled()) {
                this.fetchVPNInfo.debug("Connection " + this + " closed");
            }
        } catch (java.io.IOException e) {
            this.fetchVPNInfo.debug("I/O error closing connection", e);
        }
    }

    @Override // o.C59681zld
    public InterfaceC59758znA KWHzl(Socket socket, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        if (i <= 0) {
            i = 8192;
        }
        InterfaceC59758znA interfaceC59758znAKWHzl = super.KWHzl(socket, i, interfaceC59779znV);
        return this.fJNWhG.isDebugEnabled() ? new C59674zlW(interfaceC59758znAKWHzl, new C59737zmg(this.fJNWhG), C59781znX.OLrzqt(interfaceC59779znV)) : interfaceC59758znAKWHzl;
    }

    @Override // o.C59681zld
    public InterfaceC59808zny copydefault(Socket socket, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        if (i <= 0) {
            i = 8192;
        }
        InterfaceC59808zny interfaceC59808znyCopydefault = super.copydefault(socket, i, interfaceC59779znV);
        return this.fJNWhG.isDebugEnabled() ? new C59731zma(interfaceC59808znyCopydefault, new C59737zmg(this.fJNWhG), C59781znX.OLrzqt(interfaceC59779znV)) : interfaceC59808znyCopydefault;
    }

    @Override // o.AbstractC59623zkY
    public InterfaceC59806znw<InterfaceC59584zjm> AEQbTJ(InterfaceC59758znA interfaceC59758znA, InterfaceC59583zjl interfaceC59583zjl, InterfaceC59779znV interfaceC59779znV) {
        return new C59670zlS(interfaceC59758znA, null, interfaceC59583zjl, interfaceC59779znV);
    }

    @Override // o.InterfaceC59569zjX
    public void OLrzqt(Socket socket, HttpHost httpHost, boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        djBIcL();
        C59851zoo.AEQbTJ(httpHost, "Target host");
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        if (socket != null) {
            this.AuCTel = socket;
            AEQbTJ(socket, interfaceC59779znV);
        }
        this.ejfBZ = httpHost;
        this.values = z;
    }

    @Override // o.AbstractC59623zkY, o.InterfaceC59573zjb
    public InterfaceC59584zjm AEQbTJ() throws HttpException, java.io.IOException {
        InterfaceC59584zjm interfaceC59584zjmAEQbTJ = super.AEQbTJ();
        if (this.fetchVPNInfo.isDebugEnabled()) {
            this.fetchVPNInfo.debug("Receiving response: " + interfaceC59584zjmAEQbTJ.AEQbTJ());
        }
        if (this.DbNXlk.isDebugEnabled()) {
            this.DbNXlk.debug("<< " + interfaceC59584zjmAEQbTJ.AEQbTJ().toString());
            for (InterfaceC59518ziZ interfaceC59518ziZ : interfaceC59584zjmAEQbTJ.getAllHeaders()) {
                this.DbNXlk.debug("<< " + interfaceC59518ziZ.toString());
            }
        }
        return interfaceC59584zjmAEQbTJ;
    }

    @Override // o.AbstractC59623zkY, o.InterfaceC59573zjb
    public void EZpvd(InterfaceC59577zjf interfaceC59577zjf) throws HttpException, java.io.IOException {
        if (this.fetchVPNInfo.isDebugEnabled()) {
            this.fetchVPNInfo.debug("Sending request: " + interfaceC59577zjf.getRequestLine());
        }
        super.EZpvd(interfaceC59577zjf);
        if (this.DbNXlk.isDebugEnabled()) {
            this.DbNXlk.debug(">> " + interfaceC59577zjf.getRequestLine().toString());
            for (InterfaceC59518ziZ interfaceC59518ziZ : interfaceC59577zjf.getAllHeaders()) {
                this.DbNXlk.debug(">> " + interfaceC59518ziZ.toString());
            }
        }
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object getAttribute(java.lang.String str) {
        return this.isConnected.get(str);
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object removeAttribute(java.lang.String str) {
        return this.isConnected.remove(str);
    }

    @Override // o.InterfaceC59838zob
    public void setAttribute(java.lang.String str, java.lang.Object obj) {
        this.isConnected.put(str, obj);
    }
}
