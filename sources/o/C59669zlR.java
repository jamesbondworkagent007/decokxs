package o;

import com.google.common.net.HttpHeaders;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpInetSocketAddress;

/* JADX INFO: renamed from: o.zlR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59669zlR implements InterfaceC59555zjJ {
    public final InterfaceC59499ziG EZpvd = LogFactory.copydefault(getClass());
    public final InterfaceC59559zjN OLrzqt;
    public final C59636zkl copydefault;

    public C59669zlR(C59636zkl c59636zkl) {
        C59851zoo.AEQbTJ(c59636zkl, "Scheme registry");
        this.copydefault = c59636zkl;
        this.OLrzqt = new C59733zmc();
    }

    @Override // o.InterfaceC59555zjJ
    public InterfaceC59569zjX copydefault() {
        return new C59668zlQ();
    }

    public final C59636zkl AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
        C59636zkl c59636zkl = (C59636zkl) interfaceC59838zob.getAttribute(ClientContext.SCHEME_REGISTRY);
        return c59636zkl == null ? this.copydefault : c59636zkl;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[SYNTHETIC] */
    @Override // o.InterfaceC59555zjJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(InterfaceC59569zjX interfaceC59569zjX, HttpHost httpHost, java.net.InetAddress inetAddress, InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        java.net.InetAddress inetAddress2 = inetAddress;
        C59851zoo.AEQbTJ(interfaceC59569zjX, HttpHeaders.CONNECTION);
        C59851zoo.AEQbTJ(httpHost, "Target host");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        int i = 1;
        C59849zom.EZpvd(!interfaceC59569zjX.KWHzl(), "Connection must not be open");
        C59635zkk c59635zkkAEQbTJ = AEQbTJ(interfaceC59838zob).AEQbTJ(httpHost.getSchemeName());
        InterfaceC59638zkn interfaceC59638zknKWHzl = c59635zkkAEQbTJ.KWHzl();
        java.net.InetAddress[] inetAddressArrKWHzl = KWHzl(httpHost.getHostName());
        int iAEQbTJ = c59635zkkAEQbTJ.AEQbTJ(httpHost.getPort());
        int i2 = 0;
        int i3 = 0;
        while (i3 < inetAddressArrKWHzl.length) {
            java.net.InetAddress inetAddress3 = inetAddressArrKWHzl[i3];
            int i4 = i3 == inetAddressArrKWHzl.length - i ? i : i2;
            Socket socketCreateSocket = interfaceC59638zknKWHzl.createSocket(interfaceC59779znV);
            interfaceC59569zjX.KWHzl(socketCreateSocket, httpHost);
            HttpInetSocketAddress httpInetSocketAddress = new HttpInetSocketAddress(httpHost, inetAddress3, iAEQbTJ);
            InetSocketAddress inetSocketAddress = inetAddress2 != null ? new InetSocketAddress(inetAddress2, i2) : null;
            if (this.EZpvd.isDebugEnabled()) {
                this.EZpvd.debug("Connecting to " + httpInetSocketAddress);
            }
            try {
                Socket socketConnectSocket = interfaceC59638zknKWHzl.connectSocket(socketCreateSocket, httpInetSocketAddress, inetSocketAddress, interfaceC59779znV);
                if (socketCreateSocket != socketConnectSocket) {
                    interfaceC59569zjX.KWHzl(socketConnectSocket, httpHost);
                    socketCreateSocket = socketConnectSocket;
                }
                copydefault(socketCreateSocket, interfaceC59838zob, interfaceC59779znV);
                interfaceC59569zjX.OLrzqt(interfaceC59638zknKWHzl.isSecure(socketCreateSocket), interfaceC59779znV);
                return;
            } catch (ConnectException e) {
                if (i4 != 0) {
                    throw e;
                }
                if (!this.EZpvd.isDebugEnabled()) {
                    this.EZpvd.debug("Connect to " + httpInetSocketAddress + " timed out. Connection will be retried using another IP address");
                }
                i3++;
                inetAddress2 = inetAddress;
                i = 1;
                i2 = 0;
            } catch (ConnectTimeoutException e2) {
                if (i4 != 0) {
                    throw e2;
                }
                if (!this.EZpvd.isDebugEnabled()) {
                }
                i3++;
                inetAddress2 = inetAddress;
                i = 1;
                i2 = 0;
            }
        }
    }

    @Override // o.InterfaceC59555zjJ
    public void AEQbTJ(InterfaceC59569zjX interfaceC59569zjX, HttpHost httpHost, InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59569zjX, HttpHeaders.CONNECTION);
        C59851zoo.AEQbTJ(httpHost, "Target host");
        C59851zoo.AEQbTJ(interfaceC59779znV, "Parameters");
        C59849zom.EZpvd(interfaceC59569zjX.KWHzl(), "Connection must be open");
        C59635zkk c59635zkkAEQbTJ = AEQbTJ(interfaceC59838zob).AEQbTJ(httpHost.getSchemeName());
        C59849zom.EZpvd(c59635zkkAEQbTJ.KWHzl() instanceof InterfaceC59637zkm, "Socket factory must implement SchemeLayeredSocketFactory");
        InterfaceC59637zkm interfaceC59637zkm = (InterfaceC59637zkm) c59635zkkAEQbTJ.KWHzl();
        Socket socketCreateLayeredSocket = interfaceC59637zkm.createLayeredSocket(interfaceC59569zjX.AhwBna(), httpHost.getHostName(), c59635zkkAEQbTJ.AEQbTJ(httpHost.getPort()), interfaceC59779znV);
        copydefault(socketCreateLayeredSocket, interfaceC59838zob, interfaceC59779znV);
        interfaceC59569zjX.OLrzqt(socketCreateLayeredSocket, httpHost, interfaceC59637zkm.isSecure(socketCreateLayeredSocket), interfaceC59779znV);
    }

    public void copydefault(Socket socket, InterfaceC59838zob interfaceC59838zob, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        socket.setTcpNoDelay(C59776znS.copydefault(interfaceC59779znV));
        socket.setSoTimeout(C59776znS.OLrzqt(interfaceC59779znV));
        int iEZpvd = C59776znS.EZpvd(interfaceC59779znV);
        if (iEZpvd >= 0) {
            socket.setSoLinger(iEZpvd > 0, iEZpvd);
        }
    }

    public java.net.InetAddress[] KWHzl(java.lang.String str) throws UnknownHostException {
        return this.OLrzqt.AEQbTJ(str);
    }
}
