package o;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.impl.conn.ConnectionShutdownException;

/* JADX INFO: renamed from: o.zmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59734zmd implements InterfaceC59560zjO {
    public final InterfaceC59551zjF AEQbTJ;
    public final InterfaceC59555zjJ EZpvd;
    public volatile C59676zlY KWHzl;
    public volatile boolean OLrzqt;
    public volatile long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59560zjO
    public void AhwBna() {
        this.OLrzqt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59676zlY AkhnZx() {
        C59676zlY c59676zlY = this.KWHzl;
        this.KWHzl = null;
        return c59676zlY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59560zjO
    public void djBIcL() {
        this.OLrzqt = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59551zjF ejfBZ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59676zlY fJNWhG() {
        return this.KWHzl;
    }

    public C59734zmd(InterfaceC59551zjF interfaceC59551zjF, InterfaceC59555zjJ interfaceC59555zjJ, C59676zlY c59676zlY) {
        C59851zoo.AEQbTJ(interfaceC59551zjF, "Connection manager");
        C59851zoo.AEQbTJ(interfaceC59555zjJ, "Connection operator");
        C59851zoo.AEQbTJ(c59676zlY, "HTTP pool entry");
        this.AEQbTJ = interfaceC59551zjF;
        this.EZpvd = interfaceC59555zjJ;
        this.KWHzl = c59676zlY;
        this.OLrzqt = false;
        this.copydefault = Long.MAX_VALUE;
    }

    public final InterfaceC59569zjX DbNXlk() {
        C59676zlY c59676zlY = this.KWHzl;
        if (c59676zlY == null) {
            return null;
        }
        return c59676zlY.gEmmrt();
    }

    public final InterfaceC59569zjX isConnected() {
        C59676zlY c59676zlY = this.KWHzl;
        if (c59676zlY == null) {
            throw new ConnectionShutdownException();
        }
        return c59676zlY.gEmmrt();
    }

    public final C59676zlY values() {
        C59676zlY c59676zlY = this.KWHzl;
        if (c59676zlY != null) {
            return c59676zlY;
        }
        throw new ConnectionShutdownException();
    }

    @Override // o.InterfaceC59572zja, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        C59676zlY c59676zlY = this.KWHzl;
        if (c59676zlY != null) {
            InterfaceC59569zjX interfaceC59569zjXGEmmrt = c59676zlY.gEmmrt();
            c59676zlY.EZpvd().valueOf();
            interfaceC59569zjXGEmmrt.close();
        }
    }

    @Override // o.InterfaceC59572zja
    public void EZpvd() throws java.io.IOException {
        C59676zlY c59676zlY = this.KWHzl;
        if (c59676zlY != null) {
            InterfaceC59569zjX interfaceC59569zjXGEmmrt = c59676zlY.gEmmrt();
            c59676zlY.EZpvd().valueOf();
            interfaceC59569zjXGEmmrt.EZpvd();
        }
    }

    @Override // o.InterfaceC59572zja
    public boolean KWHzl() {
        InterfaceC59569zjX interfaceC59569zjXDbNXlk = DbNXlk();
        if (interfaceC59569zjXDbNXlk != null) {
            return interfaceC59569zjXDbNXlk.KWHzl();
        }
        return false;
    }

    @Override // o.InterfaceC59572zja
    public boolean OLrzqt() {
        InterfaceC59569zjX interfaceC59569zjXDbNXlk = DbNXlk();
        if (interfaceC59569zjXDbNXlk != null) {
            return interfaceC59569zjXDbNXlk.OLrzqt();
        }
        return true;
    }

    @Override // o.InterfaceC59572zja
    public void KWHzl(int i) {
        isConnected().KWHzl(i);
    }

    @Override // o.InterfaceC59573zjb
    public void copydefault() throws java.io.IOException {
        isConnected().copydefault();
    }

    @Override // o.InterfaceC59573zjb
    public boolean OLrzqt(int i) throws java.io.IOException {
        return isConnected().OLrzqt(i);
    }

    @Override // o.InterfaceC59573zjb
    public void OLrzqt(InterfaceC59584zjm interfaceC59584zjm) throws HttpException, java.io.IOException {
        isConnected().OLrzqt(interfaceC59584zjm);
    }

    @Override // o.InterfaceC59573zjb
    public InterfaceC59584zjm AEQbTJ() throws HttpException, java.io.IOException {
        return isConnected().AEQbTJ();
    }

    @Override // o.InterfaceC59573zjb
    public void KWHzl(InterfaceC59578zjg interfaceC59578zjg) throws HttpException, java.io.IOException {
        isConnected().KWHzl(interfaceC59578zjg);
    }

    @Override // o.InterfaceC59573zjb
    public void EZpvd(InterfaceC59577zjf interfaceC59577zjf) throws HttpException, java.io.IOException {
        isConnected().EZpvd(interfaceC59577zjf);
    }

    @Override // o.InterfaceC59579zjh
    public java.net.InetAddress gEmmrt() {
        return isConnected().gEmmrt();
    }

    @Override // o.InterfaceC59579zjh
    public int valueOf() {
        return isConnected().valueOf();
    }

    @Override // o.InterfaceC59562zjQ
    public SSLSession fetchVPNInfo() {
        Socket socketAhwBna = isConnected().AhwBna();
        if (socketAhwBna instanceof SSLSocket) {
            return ((SSLSocket) socketAhwBna).getSession();
        }
        return null;
    }

    @Override // o.InterfaceC59560zjO, o.InterfaceC59564zjS
    public C59570zjY AYXKKw() {
        return values().copydefault();
    }

    @Override // o.InterfaceC59560zjO
    public void AEQbTJ(C59570zjY c59570zjY, InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXGEmmrt;
        C59851zoo.AEQbTJ(c59570zjY, "Route");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new ConnectionShutdownException();
            }
            C59849zom.AEQbTJ(this.KWHzl.EZpvd(), "Route tracker");
            C59849zom.EZpvd(!r0.AhwBna(), "Connection already open");
            interfaceC59569zjXGEmmrt = this.KWHzl.gEmmrt();
        }
        HttpHost httpHostEZpvd = c59570zjY.EZpvd();
        this.EZpvd.EZpvd(interfaceC59569zjXGEmmrt, httpHostEZpvd != null ? httpHostEZpvd : c59570zjY.copydefault(), c59570zjY.OLrzqt(), interfaceC59838zob, interfaceC59779znV);
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new java.io.InterruptedIOException();
            }
            C59631zkg c59631zkgEZpvd = this.KWHzl.EZpvd();
            if (httpHostEZpvd == null) {
                c59631zkgEZpvd.copydefault(interfaceC59569zjXGEmmrt.AYXKKw());
            } else {
                c59631zkgEZpvd.EZpvd(httpHostEZpvd, interfaceC59569zjXGEmmrt.AYXKKw());
            }
        }
    }

    @Override // o.InterfaceC59560zjO
    public void AEQbTJ(boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        HttpHost httpHostCopydefault;
        InterfaceC59569zjX interfaceC59569zjXGEmmrt;
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new ConnectionShutdownException();
            }
            C59631zkg c59631zkgEZpvd = this.KWHzl.EZpvd();
            C59849zom.AEQbTJ(c59631zkgEZpvd, "Route tracker");
            C59849zom.EZpvd(c59631zkgEZpvd.AhwBna(), "Connection not open");
            C59849zom.EZpvd(!c59631zkgEZpvd.gEmmrt(), "Connection is already tunnelled");
            httpHostCopydefault = c59631zkgEZpvd.copydefault();
            interfaceC59569zjXGEmmrt = this.KWHzl.gEmmrt();
        }
        interfaceC59569zjXGEmmrt.OLrzqt(null, httpHostCopydefault, z, interfaceC59779znV);
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new java.io.InterruptedIOException();
            }
            this.KWHzl.EZpvd().KWHzl(z);
        }
    }

    @Override // o.InterfaceC59560zjO
    public void EZpvd(HttpHost httpHost, boolean z, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXGEmmrt;
        C59851zoo.AEQbTJ(httpHost, "Next proxy");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new ConnectionShutdownException();
            }
            C59631zkg c59631zkgEZpvd = this.KWHzl.EZpvd();
            C59849zom.AEQbTJ(c59631zkgEZpvd, "Route tracker");
            C59849zom.EZpvd(c59631zkgEZpvd.AhwBna(), "Connection not open");
            interfaceC59569zjXGEmmrt = this.KWHzl.gEmmrt();
        }
        interfaceC59569zjXGEmmrt.OLrzqt(null, httpHost, z, interfaceC59779znV);
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new java.io.InterruptedIOException();
            }
            this.KWHzl.EZpvd().OLrzqt(httpHost, z);
        }
    }

    @Override // o.InterfaceC59560zjO
    public void KWHzl(InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        HttpHost httpHostCopydefault;
        InterfaceC59569zjX interfaceC59569zjXGEmmrt;
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new ConnectionShutdownException();
            }
            C59631zkg c59631zkgEZpvd = this.KWHzl.EZpvd();
            C59849zom.AEQbTJ(c59631zkgEZpvd, "Route tracker");
            C59849zom.EZpvd(c59631zkgEZpvd.AhwBna(), "Connection not open");
            C59849zom.EZpvd(c59631zkgEZpvd.gEmmrt(), "Protocol layering without a tunnel not supported");
            C59849zom.EZpvd(!c59631zkgEZpvd.KWHzl(), "Multiple protocol layering not supported");
            httpHostCopydefault = c59631zkgEZpvd.copydefault();
            interfaceC59569zjXGEmmrt = this.KWHzl.gEmmrt();
        }
        this.EZpvd.AEQbTJ(interfaceC59569zjXGEmmrt, httpHostCopydefault, interfaceC59838zob, interfaceC59779znV);
        synchronized (this) {
            if (this.KWHzl == null) {
                throw new java.io.InterruptedIOException();
            }
            this.KWHzl.EZpvd().EZpvd(interfaceC59569zjXGEmmrt.AYXKKw());
        }
    }

    @Override // o.InterfaceC59560zjO
    public void EZpvd(java.lang.Object obj) {
        values().EZpvd(obj);
    }

    @Override // o.InterfaceC59560zjO
    public void EZpvd(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.copydefault = j > 0 ? timeUnit.toMillis(j) : -1L;
    }

    @Override // o.InterfaceC59556zjK
    public void ca_() {
        synchronized (this) {
            if (this.KWHzl == null) {
                return;
            }
            this.AEQbTJ.EZpvd(this, this.copydefault, java.util.concurrent.TimeUnit.MILLISECONDS);
            this.KWHzl = null;
        }
    }

    @Override // o.InterfaceC59556zjK
    public void bZ_() {
        synchronized (this) {
            if (this.KWHzl == null) {
                return;
            }
            this.OLrzqt = false;
            try {
                this.KWHzl.gEmmrt().EZpvd();
            } catch (java.io.IOException unused) {
            }
            this.AEQbTJ.EZpvd(this, this.copydefault, java.util.concurrent.TimeUnit.MILLISECONDS);
            this.KWHzl = null;
        }
    }
}
