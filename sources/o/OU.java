package o;

import java.util.Objects;
import o.C5336Nu;
import o.OP;

/* JADX INFO: loaded from: classes2.dex */
public class OU implements OP {
    public final long EZpvd;
    public C5336Nu OLrzqt;
    public final java.io.File copydefault;
    public final OX AEQbTJ = new OX();
    public final C5369Pb KWHzl = new C5369Pb();

    public static OP AEQbTJ(java.io.File file, long j) {
        return new OU(file, j);
    }

    @java.lang.Deprecated
    public OU(java.io.File file, long j) {
        this.copydefault = file;
        this.EZpvd = j;
    }

    public final C5336Nu OLrzqt() throws java.io.IOException {
        C5336Nu c5336Nu;
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = C5336Nu.copydefault(this.copydefault, 1, 1, this.EZpvd);
            }
            c5336Nu = this.OLrzqt;
        }
        return c5336Nu;
    }

    @Override // o.OP
    public java.io.File OLrzqt(NH nh) {
        java.lang.String strOLrzqt = this.KWHzl.OLrzqt(nh);
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(nh);
        }
        try {
            C5336Nu.Application applicationOLrzqt = OLrzqt().OLrzqt(strOLrzqt);
            if (applicationOLrzqt != null) {
                return applicationOLrzqt.OLrzqt(0);
            }
        } catch (java.io.IOException unused) {
        }
        return null;
    }

    @Override // o.OP
    public void EZpvd(NH nh, OP.Application application) {
        OX ox;
        C5336Nu c5336NuOLrzqt;
        java.lang.String strOLrzqt = this.KWHzl.OLrzqt(nh);
        this.AEQbTJ.AEQbTJ(strOLrzqt);
        try {
            if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(nh);
            }
            try {
                c5336NuOLrzqt = OLrzqt();
            } catch (java.io.IOException unused) {
            }
            if (c5336NuOLrzqt.OLrzqt(strOLrzqt) == null) {
                C5336Nu.Activity activityKWHzl = c5336NuOLrzqt.KWHzl(strOLrzqt);
                if (activityKWHzl == null) {
                    throw new java.lang.IllegalStateException("Had two simultaneous puts for: " + strOLrzqt);
                }
                try {
                    if (application.KWHzl(activityKWHzl.copydefault(0))) {
                        activityKWHzl.AEQbTJ();
                    }
                    activityKWHzl.KWHzl();
                    ox = this.AEQbTJ;
                    ox.OLrzqt(strOLrzqt);
                } catch (java.lang.Throwable th) {
                    activityKWHzl.KWHzl();
                    throw th;
                }
            }
            ox = this.AEQbTJ;
            ox.OLrzqt(strOLrzqt);
        } catch (java.lang.Throwable th2) {
            this.AEQbTJ.OLrzqt(strOLrzqt);
            throw th2;
        }
    }
}
