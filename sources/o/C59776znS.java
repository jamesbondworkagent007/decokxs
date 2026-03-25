package o;

/* JADX INFO: renamed from: o.znS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59776znS {
    private C59776znS() {
    }

    public static int OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getIntParameter("http.socket.timeout", 0);
    }

    public static void OLrzqt(InterfaceC59779znV interfaceC59779znV, int i) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setIntParameter("http.socket.timeout", i);
    }

    public static boolean AEQbTJ(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getBooleanParameter("http.socket.reuseaddr", false);
    }

    public static boolean copydefault(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getBooleanParameter("http.tcp.nodelay", true);
    }

    public static void OLrzqt(InterfaceC59779znV interfaceC59779znV, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setBooleanParameter("http.tcp.nodelay", z);
    }

    public static void KWHzl(InterfaceC59779znV interfaceC59779znV, int i) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setIntParameter("http.socket.buffer-size", i);
    }

    public static int EZpvd(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getIntParameter("http.socket.linger", -1);
    }

    public static int KWHzl(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getIntParameter("http.connection.timeout", 0);
    }

    public static void copydefault(InterfaceC59779znV interfaceC59779znV, int i) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setIntParameter("http.connection.timeout", i);
    }

    public static boolean valueOf(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getBooleanParameter("http.connection.stalecheck", true);
    }

    public static void KWHzl(InterfaceC59779znV interfaceC59779znV, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setBooleanParameter("http.connection.stalecheck", z);
    }
}
