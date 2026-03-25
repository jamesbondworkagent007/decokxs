package o;

import java.util.TimeZone;

/* JADX INFO: renamed from: o.ado, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7120ado implements InterfaceC7123adr {
    public C7118adm AEQbTJ;
    public long EZpvd;
    public InterfaceC7129adx KWHzl;
    public InterfaceC7122adq OLrzqt;
    public InterfaceC7127adv copydefault;
    public C7125adt gEmmrt;
    public java.lang.String valueOf = java.util.Locale.getDefault().toString();
    public TimeZone AYXKKw = TimeZone.getDefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.AEQbTJ = null;
    }

    public C7120ado(C7125adt c7125adt) {
        this.gEmmrt = c7125adt;
    }

    @Override // o.InterfaceC7123adr
    public InterfaceC7123adr copydefault(java.lang.String str) {
        if (!str.equals(this.valueOf)) {
            this.valueOf = str;
            InterfaceC7129adx interfaceC7129adx = this.KWHzl;
            if (interfaceC7129adx != null) {
                this.KWHzl = interfaceC7129adx.copydefault(str);
            }
            InterfaceC7127adv interfaceC7127adv = this.copydefault;
            if (interfaceC7127adv != null) {
                this.copydefault = interfaceC7127adv.AEQbTJ(str);
            }
            AEQbTJ();
        }
        return this;
    }

    @Override // o.InterfaceC7123adr
    public InterfaceC7124ads EZpvd() {
        if (this.AEQbTJ == null) {
            InterfaceC7122adq interfaceC7122adq = this.OLrzqt;
            if (interfaceC7122adq != null) {
                this.OLrzqt = interfaceC7122adq.AEQbTJ(this.valueOf).AEQbTJ(this.AYXKKw);
            }
            this.copydefault = OLrzqt();
            this.KWHzl = copydefault();
            this.AEQbTJ = KWHzl();
        }
        return this.AEQbTJ;
    }

    public InterfaceC7127adv OLrzqt() {
        if (this.copydefault == null) {
            this.copydefault = this.gEmmrt.EZpvd().KWHzl(this.valueOf).AEQbTJ();
        }
        return this.copydefault;
    }

    public InterfaceC7129adx copydefault() {
        if (this.KWHzl == null) {
            this.KWHzl = this.gEmmrt.copydefault().OLrzqt(this.valueOf).copydefault(this.AYXKKw).KWHzl();
        }
        return this.KWHzl;
    }

    public C7118adm KWHzl() {
        return new C7118adm(this.copydefault, this.KWHzl, this.OLrzqt, this.EZpvd, this.valueOf, this.AYXKKw);
    }
}
