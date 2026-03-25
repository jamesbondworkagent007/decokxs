package o;

import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: o.adm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7118adm implements InterfaceC7124ads {
    public InterfaceC7122adq AEQbTJ;
    public TimeZone AYXKKw;
    public InterfaceC7129adx EZpvd;
    public long KWHzl;
    public java.lang.String OLrzqt;
    public InterfaceC7127adv copydefault;

    public C7118adm(InterfaceC7127adv interfaceC7127adv, InterfaceC7129adx interfaceC7129adx, InterfaceC7122adq interfaceC7122adq, long j, java.lang.String str, TimeZone timeZone) {
        this.copydefault = interfaceC7127adv;
        this.EZpvd = interfaceC7129adx;
        this.AEQbTJ = interfaceC7122adq;
        this.KWHzl = j;
        this.OLrzqt = str;
        this.AYXKKw = timeZone;
    }

    @Override // o.InterfaceC7124ads
    public java.lang.String AEQbTJ(Date date) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        return copydefault(date.getTime() - jCurrentTimeMillis, jCurrentTimeMillis);
    }

    @Override // o.InterfaceC7124ads
    public java.lang.String copydefault(long j) {
        return copydefault(j, java.lang.System.currentTimeMillis());
    }

    @Override // o.InterfaceC7124ads
    public java.lang.String copydefault(long j, long j2) {
        java.lang.String strOLrzqt = OLrzqt(j, j2);
        return strOLrzqt == null ? AEQbTJ(KWHzl(j, j2)) : strOLrzqt;
    }

    public java.lang.String OLrzqt(long j, long j2) {
        if (this.AEQbTJ == null || this.KWHzl <= 0 || java.lang.Math.abs(j) < this.KWHzl) {
            return null;
        }
        return this.AEQbTJ.KWHzl(j2 + j);
    }

    public C7126adu KWHzl(long j, long j2) {
        return this.EZpvd.OLrzqt(j, j2);
    }

    public java.lang.String AEQbTJ(C7126adu c7126adu) {
        if (!c7126adu.AEQbTJ()) {
            throw new java.lang.IllegalArgumentException("period is not set");
        }
        return this.copydefault.OLrzqt(c7126adu);
    }
}
