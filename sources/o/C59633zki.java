package o;

import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: renamed from: o.zki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59633zki implements InterfaceC59637zkm {
    public final InterfaceC59629zke copydefault;

    public C59633zki(InterfaceC59629zke interfaceC59629zke) {
        this.copydefault = interfaceC59629zke;
    }

    @Override // o.InterfaceC59638zkn
    public Socket createSocket(InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return this.copydefault.createSocket(interfaceC59779znV);
    }

    @Override // o.InterfaceC59638zkn
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return this.copydefault.connectSocket(socket, inetSocketAddress, inetSocketAddress2, interfaceC59779znV);
    }

    @Override // o.InterfaceC59638zkn
    public boolean isSecure(Socket socket) throws java.lang.IllegalArgumentException {
        return this.copydefault.isSecure(socket);
    }

    @Override // o.InterfaceC59637zkm
    public Socket createLayeredSocket(Socket socket, java.lang.String str, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return this.copydefault.createLayeredSocket(socket, str, i, true);
    }
}
