package o;

/* JADX INFO: renamed from: o.auh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8013auh implements InterfaceC60050zuZ {
    public final C8016auk OLrzqt;

    @Override // o.InterfaceC60050zuZ
    public java.lang.String AEQbTJ(java.lang.String str) {
        return str;
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault() {
        return null;
    }

    public C8013auh(C8016auk c8016auk) {
        this.OLrzqt = c8016auk;
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault(java.lang.String str) {
        C8015auj c8015aujAEQbTJ = this.OLrzqt.AEQbTJ(str);
        if (c8015aujAEQbTJ == null || c8015aujAEQbTJ.copydefault()) {
            return null;
        }
        java.lang.String strEZpvd = c8015aujAEQbTJ.EZpvd(this.OLrzqt.copydefault());
        if (new java.io.File(strEZpvd).isFile()) {
            return strEZpvd;
        }
        java.lang.String strCopydefault = c8015aujAEQbTJ.copydefault(this.OLrzqt.copydefault());
        if (new java.io.File(strCopydefault).isFile()) {
            return strCopydefault;
        }
        return null;
    }

    @Override // o.InterfaceC60050zuZ
    public byte[] OLrzqt(java.lang.String str) {
        C8015auj c8015aujAEQbTJ = this.OLrzqt.AEQbTJ(str);
        if (c8015aujAEQbTJ == null) {
            return null;
        }
        return c8015aujAEQbTJ.EZpvd();
    }

    @Override // o.InterfaceC60050zuZ
    public void KWHzl(java.lang.String str) {
        C8015auj c8015aujAEQbTJ = this.OLrzqt.AEQbTJ(str);
        if (c8015aujAEQbTJ != null) {
            c8015aujAEQbTJ.OLrzqt(null);
        }
    }
}
