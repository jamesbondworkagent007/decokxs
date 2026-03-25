package o;

/* JADX INFO: renamed from: o.ywf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58193ywf implements InterfaceC58206yws<java.lang.Object> {
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public final InterfaceC58191ywd KWHzl;
    public volatile java.lang.Object copydefault;

    public C58193ywf(InterfaceC58191ywd interfaceC58191ywd) {
        this.KWHzl = interfaceC58191ywd;
    }

    @Override // o.InterfaceC58206yws
    public java.lang.Object aA_() {
        if (this.copydefault == null) {
            synchronized (this.AEQbTJ) {
                if (this.copydefault == null) {
                    this.copydefault = this.KWHzl.EZpvd();
                }
            }
        }
        return this.copydefault;
    }
}
