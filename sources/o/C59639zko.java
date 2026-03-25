package o;

import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: renamed from: o.zko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59639zko implements InterfaceC59638zkn {
    public final InterfaceC59641zkq EZpvd;

    public C59639zko(InterfaceC59641zkq interfaceC59641zkq) {
        this.EZpvd = interfaceC59641zkq;
    }

    @Override // o.InterfaceC59638zkn
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        java.net.InetAddress address;
        int port;
        java.lang.String hostName = inetSocketAddress.getHostName();
        int port2 = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            address = inetSocketAddress2.getAddress();
            port = inetSocketAddress2.getPort();
        } else {
            address = null;
            port = 0;
        }
        return this.EZpvd.connectSocket(socket, hostName, port2, address, port, interfaceC59779znV);
    }

    @Override // o.InterfaceC59638zkn
    public Socket createSocket(InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return this.EZpvd.createSocket();
    }

    @Override // o.InterfaceC59638zkn
    public boolean isSecure(Socket socket) throws java.lang.IllegalArgumentException {
        return this.EZpvd.isSecure(socket);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C59639zko) {
            return this.EZpvd.equals(((C59639zko) obj).EZpvd);
        }
        return this.EZpvd.equals(obj);
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }
}
