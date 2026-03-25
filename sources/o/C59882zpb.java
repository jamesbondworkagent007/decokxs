package o;

/* JADX INFO: renamed from: o.zpb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59882zpb {
    public java.util.Map OLrzqt = new java.util.HashMap();
    public C59899zps copydefault = new C59899zps();

    public boolean AEQbTJ(java.lang.String str) {
        return str != null && this.OLrzqt.containsKey(str.toLowerCase());
    }

    public C59899zps EZpvd(java.lang.String str) {
        if (str != null) {
            return (C59899zps) this.OLrzqt.get(str.toLowerCase());
        }
        return null;
    }

    public java.util.Map<java.lang.String, java.lang.String> EZpvd(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        C59899zps c59899zpsEZpvd = EZpvd(str);
        if (c59899zpsEZpvd != null) {
            map = c59899zpsEZpvd.OLrzqt(map);
        }
        return this.copydefault.OLrzqt(map);
    }

    public java.lang.String OLrzqt(java.lang.String str) {
        C59899zps c59899zpsEZpvd;
        return (!AEQbTJ(str) || (c59899zpsEZpvd = EZpvd(str)) == null) ? str : c59899zpsEZpvd.AEQbTJ();
    }

    public void EZpvd() {
        this.OLrzqt.clear();
    }
}
