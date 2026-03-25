package o;

import com.okinc.network.okg.unifieddomain.DomainType;

/* JADX INFO: renamed from: o.mqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33143mqr extends AbstractC33144mqs implements InterfaceC33145mqt {
    public InterfaceC33145mqt AEQbTJ;
    public java.lang.String AYXKKw;
    public C33150mqy EZpvd;
    public java.lang.String djBIcL;
    public DomainType gEmmrt;

    public C33143mqr(android.content.Context context, java.lang.String str, InterfaceC33145mqt interfaceC33145mqt) {
        super(context, str);
        this.AEQbTJ = interfaceC33145mqt;
        this.AYXKKw = C33478mxH.KWHzl.AEQbTJ(AEQbTJ(), "oktmp.data");
    }

    public C33143mqr(android.content.Context context, java.lang.String str, java.lang.String str2, InterfaceC33145mqt interfaceC33145mqt) {
        this(context, str, interfaceC33145mqt);
        this.AYXKKw = str2;
    }

    public C33143mqr(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC33145mqt interfaceC33145mqt) {
        this(context, str, str2, interfaceC33145mqt);
        this.AYXKKw = str2;
        this.djBIcL = str3;
    }

    public C33143mqr(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, DomainType domainType, InterfaceC33145mqt interfaceC33145mqt) {
        this(context, str, str2, interfaceC33145mqt);
        this.AYXKKw = str2;
        this.djBIcL = str3;
        if (C43292rmY.OLrzqt.gHZMYf()) {
            this.gEmmrt = domainType;
        }
    }

    public void EZpvd() {
        pUU.KWHzl("FileDownloadTask", "FileDownloadTask  exec start:" + OLrzqt());
        C33150mqy c33150mqy = new C33150mqy(new java.io.File(this.AYXKKw), OLrzqt(), 60, this.gEmmrt);
        this.EZpvd = c33150mqy;
        c33150mqy.KWHzl(this);
        pUU.KWHzl("FileDownloadTask", "FileDownloadTask  exec end:" + OLrzqt());
    }

    @Override // o.InterfaceC33145mqt
    public void copydefault(long j, long j2) {
        this.AEQbTJ.copydefault(j, j2);
    }

    @Override // o.InterfaceC33145mqt
    public void EZpvd(int i, java.lang.String str) {
        this.OLrzqt = i;
        this.AEQbTJ.EZpvd(i, str);
    }

    @Override // o.InterfaceC33145mqt
    public void copydefault(java.lang.String str) {
        if (this.djBIcL != null) {
            if (KWHzl()) {
                this.AEQbTJ.copydefault(str);
                return;
            } else {
                this.AEQbTJ.EZpvd(1704, "md5 verify failed");
                return;
            }
        }
        this.AEQbTJ.copydefault(str);
    }

    public final boolean KWHzl() {
        return this.djBIcL.equalsIgnoreCase(C33478mxH.KWHzl.OLrzqt(this.AYXKKw));
    }

    public void copydefault() {
        C33150mqy c33150mqy = this.EZpvd;
        if (c33150mqy != null) {
            c33150mqy.OLrzqt();
        }
    }
}
