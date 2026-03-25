package o;

import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes20.dex */
public final class Canvas implements Configuration {
    public final java.util.List<java.lang.Object> copydefault = new java.util.ArrayList();

    @Override // o.Configuration
    public void OLrzqt(int i, java.lang.Long l) {
        this.copydefault.add(l);
    }

    @Override // o.Configuration
    public void copydefault(int i, java.lang.String str) {
        this.copydefault.add(str);
    }

    @Override // o.Configuration
    public void OLrzqt(int i, java.lang.Boolean bool) {
        this.copydefault.add(bool);
    }

    public final java.util.List<java.lang.Object> AEQbTJ() {
        java.util.List<java.lang.Object> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.copydefault);
        this.copydefault.clear();
        return listAxsJAYsNCnLh;
    }
}
