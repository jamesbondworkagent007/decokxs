package o;

/* JADX INFO: renamed from: o.zoc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59839zoc implements InterfaceC59838zob {
    public final InterfaceC59838zob OLrzqt;
    public final InterfaceC59838zob copydefault;

    public C59839zoc(InterfaceC59838zob interfaceC59838zob, InterfaceC59838zob interfaceC59838zob2) {
        this.OLrzqt = (InterfaceC59838zob) C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        this.copydefault = interfaceC59838zob2;
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object getAttribute(java.lang.String str) {
        java.lang.Object attribute = this.OLrzqt.getAttribute(str);
        return attribute == null ? this.copydefault.getAttribute(str) : attribute;
    }

    @Override // o.InterfaceC59838zob
    public java.lang.Object removeAttribute(java.lang.String str) {
        return this.OLrzqt.removeAttribute(str);
    }

    @Override // o.InterfaceC59838zob
    public void setAttribute(java.lang.String str, java.lang.Object obj) {
        this.OLrzqt.setAttribute(str, obj);
    }

    public java.lang.String toString() {
        return "[local: " + this.OLrzqt + "defaults: " + this.copydefault + "]";
    }
}
