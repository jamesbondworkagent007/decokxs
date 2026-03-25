package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.znY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59782znY implements InterfaceC59838zob {
    public final InterfaceC59838zob KWHzl;
    public final java.util.Map<java.lang.String, java.lang.Object> copydefault;

    public C59782znY() {
        this(null);
    }

    public C59782znY(InterfaceC59838zob interfaceC59838zob) {
        this.copydefault = new ConcurrentHashMap();
        this.KWHzl = interfaceC59838zob;
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object getAttribute(java.lang.String str) {
        InterfaceC59838zob interfaceC59838zob;
        C59851zoo.AEQbTJ(str, "Id");
        java.lang.Object obj = this.copydefault.get(str);
        return (obj != null || (interfaceC59838zob = this.KWHzl) == null) ? obj : interfaceC59838zob.getAttribute(str);
    }

    @Override // o.InterfaceC59838zob
    public void setAttribute(java.lang.String str, java.lang.Object obj) {
        C59851zoo.AEQbTJ(str, "Id");
        if (obj != null) {
            this.copydefault.put(str, obj);
        } else {
            this.copydefault.remove(str);
        }
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object removeAttribute(java.lang.String str) {
        C59851zoo.AEQbTJ(str, "Id");
        return this.copydefault.remove(str);
    }

    public java.lang.String toString() {
        return this.copydefault.toString();
    }
}
