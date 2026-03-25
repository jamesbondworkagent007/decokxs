package o;

import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.znX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59781znX {
    private C59781znX() {
    }

    public static java.lang.String OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        java.lang.String str = (java.lang.String) interfaceC59779znV.getParameter("http.protocol.element-charset");
        return str == null ? C59841zoe.KWHzl.name() : str;
    }

    public static void EZpvd(InterfaceC59779znV interfaceC59779znV, java.lang.String str) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setParameter("http.protocol.content-charset", str);
    }

    public static ProtocolVersion copydefault(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        java.lang.Object parameter = interfaceC59779znV.getParameter("http.protocol.version");
        if (parameter == null) {
            return HttpVersion.HTTP_1_1;
        }
        return (ProtocolVersion) parameter;
    }

    public static void copydefault(InterfaceC59779znV interfaceC59779znV, ProtocolVersion protocolVersion) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setParameter("http.protocol.version", protocolVersion);
    }

    public static void copydefault(InterfaceC59779znV interfaceC59779znV, java.lang.String str) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setParameter("http.useragent", str);
    }
}
