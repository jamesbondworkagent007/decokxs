package o;

import o.InterfaceC5353Ol;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5347Of implements InterfaceC5353Ol, NU.TaskDescription<java.lang.Object> {
    public final C5352Ok<?> AEQbTJ;
    public NH AYXKKw;
    public int AhwBna;
    public java.io.File EZpvd;
    public volatile InterfaceC5386Ps.Application<?> KWHzl;
    public final java.util.List<NH> OLrzqt;
    public final InterfaceC5353Ol.Application copydefault;
    public int djBIcL;
    public java.util.List<InterfaceC5386Ps<java.io.File, ?>> gEmmrt;

    public C5347Of(C5352Ok<?> c5352Ok, InterfaceC5353Ol.Application application) {
        this(c5352Ok.copydefault(), c5352Ok, application);
    }

    public C5347Of(java.util.List<NH> list, C5352Ok<?> c5352Ok, InterfaceC5353Ol.Application application) {
        this.djBIcL = -1;
        this.OLrzqt = list;
        this.AEQbTJ = c5352Ok;
        this.copydefault = application;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (OLrzqt() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.gEmmrt;
        r3 = r7.AhwBna;
        r7.AhwBna = r3 + 1;
        r7.KWHzl = r0.get(r3).AEQbTJ(r7.EZpvd, r7.AEQbTJ.DbNXlk(), r7.AEQbTJ.djBIcL(), r7.AEQbTJ.gEmmrt());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.KWHzl == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.AEQbTJ.copydefault(r7.KWHzl.EZpvd.KWHzl()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.KWHzl.EZpvd.EZpvd(r7.AEQbTJ.AYXKKw(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.KWHzl = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L39;
     */
    @Override // o.InterfaceC5353Ol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AEQbTJ() {
        SH.AEQbTJ("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.gEmmrt != null && OLrzqt()) {
                    break;
                }
                int i = this.djBIcL + 1;
                this.djBIcL = i;
                if (i >= this.OLrzqt.size()) {
                    return false;
                }
                NH nh = this.OLrzqt.get(this.djBIcL);
                java.io.File fileOLrzqt = this.AEQbTJ.KWHzl().OLrzqt(new C5356Oo(nh, this.AEQbTJ.isConnected()));
                this.EZpvd = fileOLrzqt;
                if (fileOLrzqt != null) {
                    this.AYXKKw = nh;
                    this.gEmmrt = this.AEQbTJ.copydefault(fileOLrzqt);
                    this.AhwBna = 0;
                }
            } finally {
                SH.EZpvd();
            }
        }
    }

    public final boolean OLrzqt() {
        return this.AhwBna < this.gEmmrt.size();
    }

    @Override // o.InterfaceC5353Ol
    public void EZpvd() {
        InterfaceC5386Ps.Application<?> application = this.KWHzl;
        if (application != null) {
            application.EZpvd.copydefault();
        }
    }

    @Override // o.NU.TaskDescription
    public void KWHzl(java.lang.Object obj) {
        this.copydefault.AEQbTJ(this.AYXKKw, obj, this.KWHzl.EZpvd, com.bumptech.glide.load.DataSource.DATA_DISK_CACHE, this.AYXKKw);
    }

    @Override // o.NU.TaskDescription
    public void copydefault(@androidx.annotation.NonNull java.lang.Exception exc) {
        this.copydefault.AEQbTJ(this.AYXKKw, exc, this.KWHzl.EZpvd, com.bumptech.glide.load.DataSource.DATA_DISK_CACHE);
    }
}
