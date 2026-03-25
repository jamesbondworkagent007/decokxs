package o;

import android.view.ViewGroup;
import o.C7343ahz;

/* JADX INFO: renamed from: o.akN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7464akN implements InterfaceC7949atV {
    public final InterfaceC8006aua AEQbTJ;
    public InterfaceC7951atX AYXKKw;
    public java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public byte valueOf = 0;
    public boolean copydefault = false;
    public int gEmmrt = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7949atV
    public int AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7949atV
    public void EZpvd(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.copydefault;
    }

    @Override // o.InterfaceC7949atV
    public boolean djBIcL() {
        return true;
    }

    public C7464akN(android.content.Context context, InterfaceC7951atX interfaceC7951atX) {
        this.AYXKKw = interfaceC7951atX;
        C7946atS c7946atS = new C7946atS(context);
        c7946atS.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.AEQbTJ = c7946atS;
        this.OLrzqt = context.getString(C7343ahz.Fragment.ejfBZ);
        this.EZpvd = context.getString(C7343ahz.Fragment.fARcdN);
        this.KWHzl = context.getString(C7343ahz.Fragment.fIwbmz);
        this.AhwBna = this.OLrzqt;
    }

    @Override // o.InterfaceC7949atV
    public <T extends android.view.View & InterfaceC8006aua> T copydefault() {
        return (T) ((android.view.View) this.AEQbTJ);
    }

    @Override // o.InterfaceC7949atV
    public boolean OLrzqt(boolean z) {
        InterfaceC7951atX interfaceC7951atX = this.AYXKKw;
        if (interfaceC7951atX != null && this.gEmmrt != interfaceC7951atX.djBIcL()) {
            this.gEmmrt = this.AYXKKw.djBIcL();
            AhwBna();
        }
        if (!KWHzl()) {
            this.AEQbTJ.OLrzqt().setVisibility(8);
            return false;
        }
        InterfaceC7951atX interfaceC7951atX2 = this.AYXKKw;
        if (interfaceC7951atX2 == null || interfaceC7951atX2.copydefault() == 0) {
            this.AEQbTJ.AhwBna();
            this.AEQbTJ.OLrzqt().setVisibility(8);
            return false;
        }
        this.AEQbTJ.OLrzqt().setVisibility(0);
        this.AEQbTJ.setLoadText(this.AhwBna);
        byte b = this.valueOf;
        if (b == 0) {
            this.AEQbTJ.gEmmrt();
            this.AEQbTJ.EZpvd();
            return true;
        }
        if (b == 2) {
            this.AEQbTJ.KWHzl();
            return z;
        }
        this.AEQbTJ.KWHzl();
        return false;
    }

    @Override // o.InterfaceC7949atV
    public boolean OLrzqt() {
        return KWHzl() && this.valueOf == 0;
    }

    @Override // o.InterfaceC7949atV
    public void gEmmrt() {
        this.valueOf = (byte) 0;
        this.AhwBna = this.OLrzqt;
        OLrzqt(false);
    }

    @Override // o.InterfaceC7949atV
    public void valueOf() {
        this.valueOf = (byte) 0;
        this.AhwBna = this.OLrzqt;
        OLrzqt(false);
    }

    @Override // o.InterfaceC7949atV
    public void AYXKKw() {
        this.valueOf = (byte) 1;
        this.AhwBna = this.EZpvd;
        OLrzqt(false);
    }

    @Override // o.InterfaceC7949atV
    public void EZpvd() {
        this.valueOf = (byte) 2;
        this.AhwBna = this.KWHzl;
        OLrzqt(false);
    }

    public final void AhwBna() {
        ViewGroup.LayoutParams layoutParams = this.AEQbTJ.OLrzqt().getLayoutParams();
        if (this.gEmmrt == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        this.AEQbTJ.OLrzqt().setLayoutParams(layoutParams);
    }
}
