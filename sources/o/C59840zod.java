package o;

import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59840zod implements InterfaceC59838zob {
    public static final java.lang.String HTTP_CONNECTION = "http.connection";
    public static final java.lang.String HTTP_REQUEST = "http.request";
    public static final java.lang.String HTTP_REQ_SENT = "http.request_sent";
    public static final java.lang.String HTTP_RESPONSE = "http.response";
    public static final java.lang.String HTTP_TARGET_HOST = "http.target_host";
    private final InterfaceC59838zob context;

    public static C59840zod create() {
        return new C59840zod(new C59782znY());
    }

    public static C59840zod adapt(InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        if (interfaceC59838zob instanceof C59840zod) {
            return (C59840zod) interfaceC59838zob;
        }
        return new C59840zod(interfaceC59838zob);
    }

    public C59840zod(InterfaceC59838zob interfaceC59838zob) {
        this.context = interfaceC59838zob;
    }

    public C59840zod() {
        this.context = new C59782znY();
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object getAttribute(java.lang.String str) {
        return this.context.getAttribute(str);
    }

    @Override // o.InterfaceC59838zob
    public void setAttribute(java.lang.String str, java.lang.Object obj) {
        this.context.setAttribute(str, obj);
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object removeAttribute(java.lang.String str) {
        return this.context.removeAttribute(str);
    }

    public <T> T getAttribute(java.lang.String str, java.lang.Class<T> cls) {
        C59851zoo.AEQbTJ(cls, "Attribute class");
        java.lang.Object attribute = getAttribute(str);
        if (attribute == null) {
            return null;
        }
        return cls.cast(attribute);
    }

    public <T extends InterfaceC59572zja> T getConnection(java.lang.Class<T> cls) {
        return (T) getAttribute(HTTP_CONNECTION, cls);
    }

    public InterfaceC59572zja getConnection() {
        return (InterfaceC59572zja) getAttribute(HTTP_CONNECTION, InterfaceC59572zja.class);
    }

    public InterfaceC59577zjf getRequest() {
        return (InterfaceC59577zjf) getAttribute(HTTP_REQUEST, InterfaceC59577zjf.class);
    }

    public boolean isRequestSent() {
        java.lang.Boolean bool = (java.lang.Boolean) getAttribute(HTTP_REQ_SENT, java.lang.Boolean.class);
        return bool != null && bool.booleanValue();
    }

    public InterfaceC59584zjm getResponse() {
        return (InterfaceC59584zjm) getAttribute(HTTP_RESPONSE, InterfaceC59584zjm.class);
    }

    public void setTargetHost(HttpHost httpHost) {
        setAttribute(HTTP_TARGET_HOST, httpHost);
    }

    public HttpHost getTargetHost() {
        return (HttpHost) getAttribute(HTTP_TARGET_HOST, HttpHost.class);
    }
}
