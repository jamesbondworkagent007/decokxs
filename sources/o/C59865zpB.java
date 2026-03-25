package o;

/* JADX INFO: renamed from: o.zpB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59865zpB implements InterfaceC59902zpv {
    public java.lang.String copydefault;

    public C59865zpB(java.lang.String str) {
        this.copydefault = str;
    }

    @Override // o.InterfaceC59902zpv
    public boolean EZpvd(C59895zpo c59895zpo) {
        if (c59895zpo == null) {
            return false;
        }
        return c59895zpo.values().equalsIgnoreCase(this.copydefault);
    }
}
