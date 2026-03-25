package o;

import o.InterfaceC5353Ol;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: loaded from: classes2.dex */
public class OD implements InterfaceC5353Ol, NU.TaskDescription<java.lang.Object> {
    public java.io.File AEQbTJ;
    public NH AYXKKw;
    public int AhwBna = -1;
    public final C5352Ok<?> EZpvd;
    public C5367Oz KWHzl;
    public final InterfaceC5353Ol.Application OLrzqt;
    public volatile InterfaceC5386Ps.Application<?> copydefault;
    public int djBIcL;
    public java.util.List<InterfaceC5386Ps<java.io.File, ?>> gEmmrt;
    public int valueOf;

    public OD(C5352Ok<?> c5352Ok, InterfaceC5353Ol.Application application) {
        this.EZpvd = c5352Ok;
        this.OLrzqt = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=5] */
    @Override // o.InterfaceC5353Ol
    public boolean AEQbTJ() {
        SH.AEQbTJ("ResourceCacheGenerator.startNext");
        try {
            java.util.List<NH> listCopydefault = this.EZpvd.copydefault();
            boolean z = false;
            if (listCopydefault.isEmpty()) {
                return false;
            }
            java.util.List<java.lang.Class<?>> listFetchVPNInfo = this.EZpvd.fetchVPNInfo();
            if (listFetchVPNInfo.isEmpty()) {
                if (java.io.File.class.equals(this.EZpvd.values())) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Failed to find any load path from " + this.EZpvd.AhwBna() + " to " + this.EZpvd.values());
            }
            while (true) {
                if (this.gEmmrt != null && copydefault()) {
                    this.copydefault = null;
                    while (!z && copydefault()) {
                        java.util.List<InterfaceC5386Ps<java.io.File, ?>> list = this.gEmmrt;
                        int i = this.valueOf;
                        this.valueOf = i + 1;
                        this.copydefault = list.get(i).AEQbTJ(this.AEQbTJ, this.EZpvd.DbNXlk(), this.EZpvd.djBIcL(), this.EZpvd.gEmmrt());
                        if (this.copydefault != null && this.EZpvd.copydefault(this.copydefault.EZpvd.KWHzl())) {
                            this.copydefault.EZpvd.EZpvd(this.EZpvd.AYXKKw(), this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i2 = this.AhwBna + 1;
                this.AhwBna = i2;
                if (i2 >= listFetchVPNInfo.size()) {
                    int i3 = this.djBIcL + 1;
                    this.djBIcL = i3;
                    if (i3 >= listCopydefault.size()) {
                        return false;
                    }
                    this.AhwBna = 0;
                }
                NH nh = listCopydefault.get(this.djBIcL);
                java.lang.Class<?> cls = listFetchVPNInfo.get(this.AhwBna);
                this.KWHzl = new C5367Oz(this.EZpvd.AEQbTJ(), nh, this.EZpvd.isConnected(), this.EZpvd.DbNXlk(), this.EZpvd.djBIcL(), this.EZpvd.KWHzl((java.lang.Class) cls), cls, this.EZpvd.gEmmrt());
                java.io.File fileOLrzqt = this.EZpvd.KWHzl().OLrzqt(this.KWHzl);
                this.AEQbTJ = fileOLrzqt;
                if (fileOLrzqt != null) {
                    this.AYXKKw = nh;
                    this.gEmmrt = this.EZpvd.copydefault(fileOLrzqt);
                    this.valueOf = 0;
                }
            }
        } finally {
            SH.EZpvd();
        }
    }

    private boolean copydefault() {
        return this.valueOf < this.gEmmrt.size();
    }

    @Override // o.InterfaceC5353Ol
    public void EZpvd() {
        InterfaceC5386Ps.Application<?> application = this.copydefault;
        if (application != null) {
            application.EZpvd.copydefault();
        }
    }

    @Override // o.NU.TaskDescription
    public void KWHzl(java.lang.Object obj) {
        this.OLrzqt.AEQbTJ(this.AYXKKw, obj, this.copydefault.EZpvd, com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE, this.KWHzl);
    }

    @Override // o.NU.TaskDescription
    public void copydefault(@androidx.annotation.NonNull java.lang.Exception exc) {
        this.OLrzqt.AEQbTJ(this.KWHzl, exc, this.copydefault.EZpvd, com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE);
    }
}
