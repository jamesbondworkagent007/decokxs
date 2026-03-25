package o;

import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.zrX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59915zrX extends AbstractC59916zrY {
    @Override // o.AbstractC59916zrY
    public void KWHzl(java.lang.StringBuilder sb, int i, Document.Activity activity) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59916zrY
    public java.lang.String copydefault() {
        return "#data";
    }

    public C59915zrX(java.lang.String str, java.lang.String str2) {
        super(str2);
        this.KWHzl.copydefault("data", str);
    }

    public java.lang.String KWHzl() {
        return this.KWHzl.copydefault("data");
    }

    @Override // o.AbstractC59916zrY
    public void OLrzqt(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        sb.append(KWHzl());
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String toString() {
        return EZpvd();
    }
}
