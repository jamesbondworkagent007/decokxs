package o;

/* JADX INFO: renamed from: o.aqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7789aqU {
    public java.io.File AEQbTJ;
    public java.io.File AYXKKw;
    public InterfaceC7790aqV AhwBna;
    public java.lang.String EZpvd;
    public java.io.File KWHzl;
    public android.content.Context OLrzqt;
    public InterfaceC7792aqX copydefault;
    public java.io.File djBIcL;
    public java.io.File gEmmrt;
    public InterfaceC43015rhM valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7789aqU EZpvd(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7789aqU KWHzl(InterfaceC7792aqX interfaceC7792aqX) {
        this.copydefault = interfaceC7792aqX;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7789aqU OLrzqt(InterfaceC7790aqV interfaceC7790aqV) {
        this.AhwBna = interfaceC7790aqV;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7789aqU copydefault(InterfaceC43015rhM interfaceC43015rhM) {
        this.valueOf = interfaceC43015rhM;
        return this;
    }

    public C7789aqU(android.content.Context context) {
        this.OLrzqt = context.getApplicationContext();
    }

    public C7789aqU copydefault(java.lang.String str) {
        this.djBIcL = new java.io.File(str);
        return this;
    }

    public C7789aqU KWHzl(java.lang.String str) {
        this.AEQbTJ = new java.io.File(str);
        return this;
    }

    public C7789aqU OLrzqt(java.lang.String str) {
        this.KWHzl = new java.io.File(str);
        return this;
    }

    public C7789aqU AEQbTJ(java.lang.String str) {
        this.gEmmrt = new java.io.File(str);
        return this;
    }

    public C7791aqW KWHzl() {
        C7791aqW c7791aqW = new C7791aqW();
        c7791aqW.AEQbTJ = this.OLrzqt;
        c7791aqW.AYXKKw = this.djBIcL;
        c7791aqW.OLrzqt = this.AEQbTJ;
        c7791aqW.KWHzl = this.KWHzl;
        c7791aqW.EZpvd = this.EZpvd;
        c7791aqW.valueOf = this.AYXKKw;
        c7791aqW.AhwBna = this.AhwBna;
        c7791aqW.fetchVPNInfo = this.gEmmrt;
        c7791aqW.gEmmrt = this.valueOf;
        c7791aqW.copydefault = this.copydefault;
        return c7791aqW;
    }
}
