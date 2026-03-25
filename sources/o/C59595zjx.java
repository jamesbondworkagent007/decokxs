package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.zjx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59595zjx implements InterfaceC59548zjC<InterfaceC59594zjw> {
    public final ConcurrentHashMap<java.lang.String, InterfaceC59592zju> copydefault = new ConcurrentHashMap<>();

    public void KWHzl(java.lang.String str, InterfaceC59592zju interfaceC59592zju) {
        C59851zoo.AEQbTJ(str, "Name");
        C59851zoo.AEQbTJ(interfaceC59592zju, "Authentication scheme factory");
        this.copydefault.put(str.toLowerCase(java.util.Locale.ENGLISH), interfaceC59592zju);
    }

    public InterfaceC59588zjq AEQbTJ(java.lang.String str, InterfaceC59779znV interfaceC59779znV) throws java.lang.IllegalStateException {
        C59851zoo.AEQbTJ(str, "Name");
        InterfaceC59592zju interfaceC59592zju = this.copydefault.get(str.toLowerCase(java.util.Locale.ENGLISH));
        if (interfaceC59592zju != null) {
            return interfaceC59592zju.OLrzqt(interfaceC59779znV);
        }
        throw new java.lang.IllegalStateException("Unsupported authentication scheme: " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.InterfaceC59548zjC
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC59594zjw KWHzl(final java.lang.String str) {
        return new InterfaceC59594zjw() { // from class: o.zjx.1
            @Override // o.InterfaceC59594zjw
            public InterfaceC59588zjq copydefault(InterfaceC59838zob interfaceC59838zob) {
                return C59595zjx.this.AEQbTJ(str, ((InterfaceC59577zjf) interfaceC59838zob.getAttribute(C59840zod.HTTP_REQUEST)).getParams());
            }
        };
    }
}
