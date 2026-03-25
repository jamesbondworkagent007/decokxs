package o;

import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.zrW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59914zrW extends AbstractC59916zrY {
    @Override // o.AbstractC59916zrY
    public void KWHzl(java.lang.StringBuilder sb, int i, Document.Activity activity) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59916zrY
    public java.lang.String copydefault() {
        return "#comment";
    }

    public C59914zrW(java.lang.String str, java.lang.String str2) {
        super(str2);
        this.KWHzl.copydefault("comment", str);
    }

    public java.lang.String AEQbTJ() {
        return this.KWHzl.copydefault("comment");
    }

    @Override // o.AbstractC59916zrY
    public void OLrzqt(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        if (activity.djBIcL()) {
            AEQbTJ(sb, i, activity);
        }
        sb.append("<!--");
        sb.append(AEQbTJ());
        sb.append("-->");
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String toString() {
        return EZpvd();
    }
}
