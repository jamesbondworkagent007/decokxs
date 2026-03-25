package o;

import com.google.api.client.http.HttpMethods;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.zog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59843zog implements InterfaceC59580zji {
    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        C59840zod c59840zodAdapt = C59840zod.adapt(interfaceC59838zob);
        ProtocolVersion protocolVersion = interfaceC59577zjf.getRequestLine().getProtocolVersion();
        if ((interfaceC59577zjf.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT) && protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) || interfaceC59577zjf.containsHeader("Host")) {
            return;
        }
        HttpHost targetHost = c59840zodAdapt.getTargetHost();
        if (targetHost == null) {
            InterfaceC59572zja connection = c59840zodAdapt.getConnection();
            if (connection instanceof InterfaceC59579zjh) {
                InterfaceC59579zjh interfaceC59579zjh = (InterfaceC59579zjh) connection;
                java.net.InetAddress inetAddressGEmmrt = interfaceC59579zjh.gEmmrt();
                int iValueOf = interfaceC59579zjh.valueOf();
                if (inetAddressGEmmrt != null) {
                    targetHost = new HttpHost(inetAddressGEmmrt.getHostName(), iValueOf);
                }
            }
            if (targetHost == null) {
                if (!protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    throw new ProtocolException("Target host missing");
                }
                return;
            }
        }
        interfaceC59577zjf.addHeader("Host", targetHost.toHostString());
    }
}
