package o;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: o.zkd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59628zkd implements InterfaceC59641zkq, InterfaceC59638zkn {
    public final InterfaceC59632zkh copydefault = null;

    @Override // o.InterfaceC59641zkq, o.InterfaceC59638zkn
    public final boolean isSecure(Socket socket) {
        return false;
    }

    public static C59628zkd KWHzl() {
        return new C59628zkd();
    }

    @Override // o.InterfaceC59638zkn
    public Socket createSocket(InterfaceC59779znV interfaceC59779znV) {
        return new Socket();
    }

    @Override // o.InterfaceC59641zkq
    public Socket createSocket() {
        return new Socket();
    }

    @Override // o.InterfaceC59638zkn
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(inetSocketAddress, "Remote address");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        if (socket == null) {
            socket = createSocket();
        }
        if (inetSocketAddress2 != null) {
            socket.setReuseAddress(C59776znS.AEQbTJ(interfaceC59779znV));
            socket.bind(inetSocketAddress2);
        }
        int iKWHzl = C59776znS.KWHzl(interfaceC59779znV);
        try {
            socket.setSoTimeout(C59776znS.OLrzqt(interfaceC59779znV));
            socket.connect(inetSocketAddress, iKWHzl);
            return socket;
        } catch (SocketTimeoutException unused) {
            throw new ConnectTimeoutException("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // o.InterfaceC59641zkq
    @java.lang.Deprecated
    public Socket connectSocket(Socket socket, java.lang.String str, int i, java.net.InetAddress inetAddress, int i2, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        InetSocketAddress inetSocketAddress;
        java.net.InetAddress byName;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        InterfaceC59632zkh interfaceC59632zkh = this.copydefault;
        if (interfaceC59632zkh != null) {
            byName = interfaceC59632zkh.AEQbTJ(str);
        } else {
            byName = java.net.InetAddress.getByName(str);
        }
        return connectSocket(socket, new InetSocketAddress(byName, i), inetSocketAddress, interfaceC59779znV);
    }
}
