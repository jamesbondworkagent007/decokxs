package o;

import org.jaxen.NamespaceContext;
import org.jdom2.Namespace;

/* JADX INFO: renamed from: o.zpO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59878zpO extends C59876zpM implements NamespaceContext {
    public final java.util.HashMap<java.lang.String, java.lang.String> copydefault = new java.util.HashMap<>();
    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ = new java.util.HashMap<>();

    @Override // o.C59876zpM
    public void EZpvd() {
        super.EZpvd();
        this.copydefault.clear();
    }

    public void KWHzl(java.lang.Object obj) {
        java.util.List<Namespace> namespacesInScope;
        this.copydefault.clear();
        if (obj instanceof InterfaceC59869zpF) {
            namespacesInScope = ((InterfaceC59869zpF) obj).getNamespacesInScope();
        } else {
            namespacesInScope = obj instanceof C59879zpP ? ((C59879zpP) obj).EZpvd().getNamespacesInScope() : null;
        }
        if (namespacesInScope != null) {
            for (Namespace namespace : namespacesInScope) {
                this.copydefault.put(namespace.getPrefix(), namespace.getURI());
            }
        }
    }

    public void OLrzqt(Namespace namespace) {
        this.AEQbTJ.put(namespace.getPrefix(), namespace.getURI());
    }
}
