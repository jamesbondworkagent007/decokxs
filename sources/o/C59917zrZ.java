package o;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;

/* JADX INFO: renamed from: o.zrZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59917zrZ extends AbstractC59916zrY {
    public java.lang.String AEQbTJ;

    @Override // o.AbstractC59916zrY
    public void KWHzl(java.lang.StringBuilder sb, int i, Document.Activity activity) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59916zrY
    public java.lang.String copydefault() {
        return "#text";
    }

    public C59917zrZ(java.lang.String str, java.lang.String str2) {
        this.djBIcL = str2;
        this.AEQbTJ = str;
    }

    public java.lang.String KWHzl() {
        C59913zrV c59913zrV = this.KWHzl;
        return c59913zrV == null ? this.AEQbTJ : c59913zrV.copydefault("text");
    }

    public boolean gEmmrt() {
        return C59910zrS.AEQbTJ(KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // o.AbstractC59916zrY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        java.lang.String strCopydefault = Entities.copydefault(KWHzl(), activity);
        if (activity.djBIcL() && (AhwBna() instanceof C59946zsb) && !C59946zsb.OLrzqt((C59946zsb) AhwBna())) {
            strCopydefault = copydefault(strCopydefault);
        }
        if (activity.djBIcL()) {
            if (iwGUEr() == 0) {
                AbstractC59916zrY abstractC59916zrY = this.valueOf;
                if (!(abstractC59916zrY instanceof C59946zsb) || !((C59946zsb) abstractC59916zrY).fetchVPNInfo().KWHzl() || gEmmrt()) {
                    if (activity.AEQbTJ() && hDKMBd().size() > 0 && !gEmmrt()) {
                        AEQbTJ(sb, i, activity);
                    }
                }
            }
        }
        sb.append(strCopydefault);
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String toString() {
        return EZpvd();
    }

    public static java.lang.String copydefault(java.lang.String str) {
        return C59910zrS.OLrzqt(str);
    }

    public final void AEQbTJ() {
        if (this.KWHzl == null) {
            C59913zrV c59913zrV = new C59913zrV();
            this.KWHzl = c59913zrV;
            c59913zrV.copydefault("text", this.AEQbTJ);
        }
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String EZpvd(java.lang.String str) {
        AEQbTJ();
        return super.EZpvd(str);
    }

    @Override // o.AbstractC59916zrY
    public C59913zrV DbNXlk() {
        AEQbTJ();
        return super.DbNXlk();
    }

    @Override // o.AbstractC59916zrY
    public AbstractC59916zrY EZpvd(java.lang.String str, java.lang.String str2) {
        AEQbTJ();
        return super.EZpvd(str, str2);
    }

    @Override // o.AbstractC59916zrY
    public boolean KWHzl(java.lang.String str) {
        AEQbTJ();
        return super.KWHzl(str);
    }

    @Override // o.AbstractC59916zrY
    public java.lang.String OLrzqt(java.lang.String str) {
        AEQbTJ();
        return super.OLrzqt(str);
    }
}
