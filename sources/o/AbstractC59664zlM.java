package o;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpException;
import org.apache.http.impl.conn.ConnectionShutdownException;

/* JADX INFO: renamed from: o.zlM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59664zlM implements InterfaceC59560zjO, InterfaceC59838zob {
    public final InterfaceC59551zjF EZpvd;
    public volatile InterfaceC59569zjX OLrzqt;
    public volatile boolean copydefault = false;
    public volatile boolean KWHzl = false;
    public volatile long AEQbTJ = Long.MAX_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59560zjO
    public void AhwBna() {
        this.copydefault = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59551zjF AkhnZx() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59560zjO
    public void djBIcL() {
        this.copydefault = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59569zjX isConnected() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.copydefault;
    }

    public AbstractC59664zlM(InterfaceC59551zjF interfaceC59551zjF, InterfaceC59569zjX interfaceC59569zjX) {
        this.EZpvd = interfaceC59551zjF;
        this.OLrzqt = interfaceC59569zjX;
    }

    public void DbNXlk() {
        synchronized (this) {
            this.OLrzqt = null;
            this.AEQbTJ = Long.MAX_VALUE;
        }
    }

    public final void AEQbTJ(InterfaceC59569zjX interfaceC59569zjX) throws ConnectionShutdownException {
        if (fARcdN() || interfaceC59569zjX == null) {
            throw new ConnectionShutdownException();
        }
    }

    @Override // o.InterfaceC59572zja
    public boolean KWHzl() {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        if (interfaceC59569zjXIsConnected == null) {
            return false;
        }
        return interfaceC59569zjXIsConnected.KWHzl();
    }

    @Override // o.InterfaceC59572zja
    public boolean OLrzqt() {
        InterfaceC59569zjX interfaceC59569zjXIsConnected;
        if (fARcdN() || (interfaceC59569zjXIsConnected = isConnected()) == null) {
            return true;
        }
        return interfaceC59569zjXIsConnected.OLrzqt();
    }

    @Override // o.InterfaceC59572zja
    public void KWHzl(int i) {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        interfaceC59569zjXIsConnected.KWHzl(i);
    }

    @Override // o.InterfaceC59573zjb
    public void copydefault() throws java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        interfaceC59569zjXIsConnected.copydefault();
    }

    @Override // o.InterfaceC59573zjb
    public boolean OLrzqt(int i) throws java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        return interfaceC59569zjXIsConnected.OLrzqt(i);
    }

    @Override // o.InterfaceC59573zjb
    public void OLrzqt(InterfaceC59584zjm interfaceC59584zjm) throws HttpException, java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        djBIcL();
        interfaceC59569zjXIsConnected.OLrzqt(interfaceC59584zjm);
    }

    @Override // o.InterfaceC59573zjb
    public InterfaceC59584zjm AEQbTJ() throws HttpException, java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        djBIcL();
        return interfaceC59569zjXIsConnected.AEQbTJ();
    }

    @Override // o.InterfaceC59573zjb
    public void KWHzl(InterfaceC59578zjg interfaceC59578zjg) throws HttpException, java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        djBIcL();
        interfaceC59569zjXIsConnected.KWHzl(interfaceC59578zjg);
    }

    @Override // o.InterfaceC59573zjb
    public void EZpvd(InterfaceC59577zjf interfaceC59577zjf) throws HttpException, java.io.IOException {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        djBIcL();
        interfaceC59569zjXIsConnected.EZpvd(interfaceC59577zjf);
    }

    @Override // o.InterfaceC59579zjh
    public java.net.InetAddress gEmmrt() {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        return interfaceC59569zjXIsConnected.gEmmrt();
    }

    @Override // o.InterfaceC59579zjh
    public int valueOf() {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        return interfaceC59569zjXIsConnected.valueOf();
    }

    @Override // o.InterfaceC59562zjQ
    public SSLSession fetchVPNInfo() {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        if (!KWHzl()) {
            return null;
        }
        Socket socketAhwBna = interfaceC59569zjXIsConnected.AhwBna();
        if (socketAhwBna instanceof SSLSocket) {
            return ((SSLSocket) socketAhwBna).getSession();
        }
        return null;
    }

    @Override // o.InterfaceC59560zjO
    public void EZpvd(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.AEQbTJ = j > 0 ? timeUnit.toMillis(j) : -1L;
    }

    @Override // o.InterfaceC59556zjK
    public void ca_() {
        synchronized (this) {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.EZpvd.EZpvd(this, this.AEQbTJ, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    @Override // o.InterfaceC59556zjK
    public void bZ_() {
        synchronized (this) {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            djBIcL();
            try {
                EZpvd();
            } catch (java.io.IOException unused) {
            }
            this.EZpvd.EZpvd(this, this.AEQbTJ, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object getAttribute(java.lang.String str) {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        if (interfaceC59569zjXIsConnected instanceof InterfaceC59838zob) {
            return ((InterfaceC59838zob) interfaceC59569zjXIsConnected).getAttribute(str);
        }
        return null;
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object removeAttribute(java.lang.String str) {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        if (interfaceC59569zjXIsConnected instanceof InterfaceC59838zob) {
            return ((InterfaceC59838zob) interfaceC59569zjXIsConnected).removeAttribute(str);
        }
        return null;
    }

    @Override // o.InterfaceC59838zob
    public void setAttribute(java.lang.String str, java.lang.Object obj) {
        InterfaceC59569zjX interfaceC59569zjXIsConnected = isConnected();
        AEQbTJ(interfaceC59569zjXIsConnected);
        if (interfaceC59569zjXIsConnected instanceof InterfaceC59838zob) {
            ((InterfaceC59838zob) interfaceC59569zjXIsConnected).setAttribute(str, obj);
        }
    }
}
