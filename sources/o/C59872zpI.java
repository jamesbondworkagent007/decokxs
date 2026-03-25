package o;

import org.jdom2.output.Format;

/* JADX INFO: renamed from: o.zpI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59872zpI {
    public final java.lang.String AhwBna;
    public final Format.TextMode EZpvd;
    public final java.lang.String OLrzqt;
    public final boolean ejfBZ;
    public final boolean fIwbmz;
    public final boolean gEmmrt;
    public final java.lang.String isConnected;
    public final InterfaceC59875zpL valueOf;
    public final boolean values;
    public int AEQbTJ = 16;
    public int KWHzl = 0;
    public java.lang.String[] fetchVPNInfo = new java.lang.String[16];
    public java.lang.String[] djBIcL = new java.lang.String[16];
    public java.lang.String[] DbNXlk = new java.lang.String[16];
    public java.lang.String[] fJNWhG = new java.lang.String[16];
    public boolean[] AYXKKw = new boolean[16];
    public Format.TextMode[] AkhnZx = new Format.TextMode[16];
    public boolean[] copydefault = new boolean[16];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.isConnected;
    }

    public C59872zpI(Format format) {
        this.AhwBna = format.AhwBna();
        this.isConnected = format.djBIcL();
        this.OLrzqt = format.copydefault();
        this.values = format.valueOf();
        this.ejfBZ = format.gEmmrt();
        this.gEmmrt = format.OLrzqt();
        this.valueOf = format.KWHzl();
        this.EZpvd = format.AkhnZx();
        this.fIwbmz = format.fetchVPNInfo();
        this.fetchVPNInfo[this.KWHzl] = format.AhwBna() == null ? null : "";
        this.djBIcL[this.KWHzl] = format.djBIcL();
        java.lang.String[] strArr = this.DbNXlk;
        int i = this.KWHzl;
        java.lang.String str = this.fetchVPNInfo[i] != null ? this.djBIcL[i] : null;
        strArr[i] = str;
        this.fJNWhG[i] = str;
        this.AYXKKw[i] = format.AYXKKw();
        this.AkhnZx[this.KWHzl] = format.AkhnZx();
        this.copydefault[this.KWHzl] = true;
    }

    public boolean copydefault() {
        return this.AYXKKw[this.KWHzl];
    }

    public void copydefault(boolean z) {
        this.AYXKKw[this.KWHzl] = z;
    }

    public void KWHzl(boolean z) {
        this.copydefault[this.KWHzl] = z;
    }
}
