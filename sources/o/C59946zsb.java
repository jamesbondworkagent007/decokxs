package o;

import o.AbstractC59956zsl;
import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.zsb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C59946zsb extends AbstractC59916zrY {
    public C59949zse EZpvd;
    public java.util.Set<java.lang.String> copydefault;

    @Override // o.AbstractC59916zrY
    public boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59949zse fetchVPNInfo() {
        return this.EZpvd;
    }

    public C59946zsb(C59949zse c59949zse, java.lang.String str, C59913zrV c59913zrV) {
        super(str, c59913zrV);
        C59912zrU.KWHzl(c59949zse);
        this.EZpvd = c59949zse;
    }

    public C59946zsb(C59949zse c59949zse, java.lang.String str) {
        this(c59949zse, str, new C59913zrV());
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String copydefault() {
        return this.EZpvd.AEQbTJ();
    }

    public java.lang.String isConnected() {
        return this.EZpvd.AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/String;Ljava/lang/String;)Lo/zrY; */
    @Override // o.AbstractC59916zrY
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C59946zsb EZpvd(java.lang.String str, java.lang.String str2) {
        super.EZpvd(str, str2);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/zrY; */
    @Override // o.AbstractC59916zrY
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public final C59946zsb AhwBna() {
        return (C59946zsb) this.valueOf;
    }

    public C59946zsb KWHzl(AbstractC59916zrY abstractC59916zrY) {
        C59912zrU.KWHzl(abstractC59916zrY);
        AEQbTJ(abstractC59916zrY);
        return this;
    }

    public C59946zsb AEQbTJ(java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        java.util.List<AbstractC59916zrY> listOLrzqt = C59948zsd.OLrzqt(str, this, values());
        EZpvd(0, (AbstractC59916zrY[]) listOLrzqt.toArray(new AbstractC59916zrY[listOLrzqt.size()]));
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zrY;)Lo/zrY; */
    @Override // o.AbstractC59916zrY
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59946zsb AEQbTJ(AbstractC59916zrY abstractC59916zrY) {
        return (C59946zsb) super.AEQbTJ(abstractC59916zrY);
    }

    public C59952zsh copydefault(java.lang.String str) {
        C59912zrU.copydefault(str);
        return C59955zsk.EZpvd(new AbstractC59956zsl.Activity(str.toLowerCase().trim()), this);
    }

    public static boolean OLrzqt(AbstractC59916zrY abstractC59916zrY) {
        if (abstractC59916zrY != null && (abstractC59916zrY instanceof C59946zsb)) {
            C59946zsb c59946zsb = (C59946zsb) abstractC59916zrY;
            if (c59946zsb.EZpvd.copydefault() || (c59946zsb.AhwBna() != null && c59946zsb.AhwBna().EZpvd.copydefault())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC59916zrY
    public void OLrzqt(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        if (sb.length() > 0 && activity.djBIcL() && (this.EZpvd.KWHzl() || ((AhwBna() != null && AhwBna().fetchVPNInfo().KWHzl()) || activity.AEQbTJ()))) {
            AEQbTJ(sb, i, activity);
        }
        sb.append("<");
        sb.append(isConnected());
        this.KWHzl.KWHzl(sb, activity);
        if (this.gEmmrt.isEmpty() && this.EZpvd.EZpvd()) {
            sb.append(" />");
        } else {
            sb.append(">");
        }
    }

    @Override // o.AbstractC59916zrY
    public void KWHzl(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        if (this.gEmmrt.isEmpty() && this.EZpvd.EZpvd()) {
            return;
        }
        if (activity.djBIcL() && !this.gEmmrt.isEmpty() && (this.EZpvd.KWHzl() || (activity.AEQbTJ() && (this.gEmmrt.size() > 1 || (this.gEmmrt.size() == 1 && !(this.gEmmrt.get(0) instanceof C59917zrZ)))))) {
            AEQbTJ(sb, i, activity);
        }
        sb.append("</");
        sb.append(isConnected());
        sb.append(">");
    }

    public java.lang.String valueOf() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        copydefault(sb);
        return sb.toString().trim();
    }

    public final void copydefault(java.lang.StringBuilder sb) {
        java.util.Iterator<AbstractC59916zrY> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(sb);
        }
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String toString() {
        return EZpvd();
    }

    @Override // o.AbstractC59916zrY
    public int hashCode() {
        int iHashCode = super.hashCode();
        C59949zse c59949zse = this.EZpvd;
        return (iHashCode * 31) + (c59949zse != null ? c59949zse.hashCode() : 0);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/zrY; */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // o.AbstractC59916zrY
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C59946zsb clone() {
        C59946zsb c59946zsb = (C59946zsb) super.clone();
        c59946zsb.copydefault = null;
        return c59946zsb;
    }
}
