package o;

/* JADX INFO: renamed from: o.zpi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59889zpi extends C59895zpo {
    public C59895zpo EZpvd;
    public C59835zoY KWHzl;
    public C59881zpa OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59833zoW OLrzqt() {
        C59881zpa c59881zpa = this.OLrzqt;
        return c59881zpa != null ? c59881zpa : this.KWHzl;
    }

    @Override // o.C59895zpo
    public C59895zpo copydefault() {
        return null;
    }

    public C59889zpi(C59881zpa c59881zpa, C59895zpo c59895zpo) {
        super("");
        this.OLrzqt = c59881zpa;
        this.EZpvd = c59895zpo;
    }

    public C59889zpi(C59835zoY c59835zoY, C59895zpo c59895zpo) {
        super("");
        this.KWHzl = c59835zoY;
        this.EZpvd = c59895zpo;
    }

    @Override // o.C59895zpo
    public boolean KWHzl() {
        this.EZpvd.copydefault(OLrzqt());
        return true;
    }
}
