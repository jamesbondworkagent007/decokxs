package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.zkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59610zkL implements InterfaceC59548zjC<InterfaceC59607zkI> {
    public final ConcurrentHashMap<java.lang.String, InterfaceC59608zkJ> OLrzqt = new ConcurrentHashMap<>();

    public void copydefault(java.lang.String str, InterfaceC59608zkJ interfaceC59608zkJ) {
        C59851zoo.AEQbTJ(str, "Name");
        C59851zoo.AEQbTJ(interfaceC59608zkJ, "Cookie spec factory");
        this.OLrzqt.put(str.toLowerCase(java.util.Locale.ENGLISH), interfaceC59608zkJ);
    }

    public InterfaceC59605zkG KWHzl(java.lang.String str, InterfaceC59779znV interfaceC59779znV) throws java.lang.IllegalStateException {
        C59851zoo.AEQbTJ(str, "Name");
        InterfaceC59608zkJ interfaceC59608zkJ = this.OLrzqt.get(str.toLowerCase(java.util.Locale.ENGLISH));
        if (interfaceC59608zkJ != null) {
            return interfaceC59608zkJ.KWHzl(interfaceC59779znV);
        }
        throw new java.lang.IllegalStateException("Unsupported cookie spec: " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.InterfaceC59548zjC
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC59607zkI KWHzl(final java.lang.String str) {
        return new InterfaceC59607zkI() { // from class: o.zkL.4
            @Override // o.InterfaceC59607zkI
            public InterfaceC59605zkG AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
                return C59610zkL.this.KWHzl(str, ((InterfaceC59577zjf) interfaceC59838zob.getAttribute(C59840zod.HTTP_REQUEST)).getParams());
            }
        };
    }
}
