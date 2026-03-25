package o;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59681zld extends AbstractC59623zkY implements InterfaceC59579zjh {
    public volatile Socket AhwBna = null;
    public volatile boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Socket AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59572zja
    public boolean KWHzl() {
        return this.djBIcL;
    }

    public void fARcdN() {
        C59849zom.EZpvd(!this.djBIcL, "Connection is already open");
    }

    @Override // o.AbstractC59623zkY
    public void djBIcL() {
        C59849zom.EZpvd(this.djBIcL, "Connection is not open");
    }

    public InterfaceC59758znA KWHzl(Socket socket, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return new C59802zns(socket, i, interfaceC59779znV);
    }

    public InterfaceC59808zny copydefault(Socket socket, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return new C59804znu(socket, i, interfaceC59779znV);
    }

    public void AEQbTJ(Socket socket, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(socket, "Socket");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        this.AhwBna = socket;
        int intParameter = interfaceC59779znV.getIntParameter("http.socket.buffer-size", -1);
        EZpvd(KWHzl(socket, intParameter, interfaceC59779znV), copydefault(socket, intParameter, interfaceC59779znV), interfaceC59779znV);
        this.djBIcL = true;
    }

    @Override // o.InterfaceC59579zjh
    public java.net.InetAddress gEmmrt() {
        if (this.AhwBna != null) {
            return this.AhwBna.getInetAddress();
        }
        return null;
    }

    @Override // o.InterfaceC59579zjh
    public int valueOf() {
        if (this.AhwBna != null) {
            return this.AhwBna.getPort();
        }
        return -1;
    }

    @Override // o.InterfaceC59572zja
    public void KWHzl(int i) {
        djBIcL();
        if (this.AhwBna != null) {
            try {
                this.AhwBna.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // o.InterfaceC59572zja
    public void EZpvd() throws java.io.IOException {
        this.djBIcL = false;
        Socket socket = this.AhwBna;
        if (socket != null) {
            socket.close();
        }
    }

    @Override // o.InterfaceC59572zja, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.djBIcL) {
            this.djBIcL = false;
            Socket socket = this.AhwBna;
            try {
                AkhnZx();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (java.io.IOException | java.lang.UnsupportedOperationException unused) {
                    }
                } catch (java.io.IOException unused2) {
                }
                socket.shutdownInput();
            } finally {
                socket.close();
            }
        }
    }

    public static void copydefault(java.lang.StringBuilder sb, SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            sb.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(inetSocketAddress.getPort());
            return;
        }
        sb.append(socketAddress);
    }

    public java.lang.String toString() {
        if (this.AhwBna != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            SocketAddress remoteSocketAddress = this.AhwBna.getRemoteSocketAddress();
            SocketAddress localSocketAddress = this.AhwBna.getLocalSocketAddress();
            if (remoteSocketAddress != null && localSocketAddress != null) {
                copydefault(sb, localSocketAddress);
                sb.append("<->");
                copydefault(sb, remoteSocketAddress);
            }
            return sb.toString();
        }
        return super.toString();
    }
}
