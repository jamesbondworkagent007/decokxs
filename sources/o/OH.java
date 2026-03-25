package o;

import java.util.Collections;
import java.util.Objects;
import o.InterfaceC5353Ol;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: loaded from: classes2.dex */
public class OH implements InterfaceC5353Ol, InterfaceC5353Ol.Application {
    public volatile InterfaceC5386Ps.Application<?> AEQbTJ;
    public volatile C5347Of AhwBna;
    public volatile int EZpvd;
    public final InterfaceC5353Ol.Application KWHzl;
    public volatile java.lang.Object OLrzqt;
    public final C5352Ok<?> copydefault;
    public volatile C5356Oo valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt(InterfaceC5386Ps.Application<?> application) {
        InterfaceC5386Ps.Application<?> application2 = this.AEQbTJ;
        return application2 != null && application2 == application;
    }

    public OH(C5352Ok<?> c5352Ok, InterfaceC5353Ol.Application application) {
        this.copydefault = c5352Ok;
        this.KWHzl = application;
    }

    @Override // o.InterfaceC5353Ol
    public boolean AEQbTJ() {
        if (this.OLrzqt != null) {
            java.lang.Object obj = this.OLrzqt;
            this.OLrzqt = null;
            try {
                if (!KWHzl(obj)) {
                    return true;
                }
            } catch (java.io.IOException unused) {
            }
        }
        if (this.AhwBna != null && this.AhwBna.AEQbTJ()) {
            return true;
        }
        this.AhwBna = null;
        this.AEQbTJ = null;
        boolean z = false;
        while (!z && OLrzqt()) {
            java.util.List<InterfaceC5386Ps.Application<?>> listValueOf = this.copydefault.valueOf();
            int i = this.EZpvd;
            this.EZpvd = i + 1;
            this.AEQbTJ = listValueOf.get(i);
            if (this.AEQbTJ != null && (this.copydefault.EZpvd().AEQbTJ(this.AEQbTJ.EZpvd.OLrzqt()) || this.copydefault.copydefault(this.AEQbTJ.EZpvd.KWHzl()))) {
                EZpvd(this.AEQbTJ);
                z = true;
            }
        }
        return z;
    }

    public final void EZpvd(final InterfaceC5386Ps.Application<?> application) {
        this.AEQbTJ.EZpvd.EZpvd(this.copydefault.AYXKKw(), new NU.TaskDescription<java.lang.Object>() { // from class: o.OH.4
            @Override // o.NU.TaskDescription
            public void KWHzl(@androidx.annotation.Nullable java.lang.Object obj) {
                if (OH.this.OLrzqt(application)) {
                    OH.this.EZpvd(application, obj);
                }
            }

            @Override // o.NU.TaskDescription
            public void copydefault(@androidx.annotation.NonNull java.lang.Exception exc) {
                if (OH.this.OLrzqt(application)) {
                    OH.this.OLrzqt(application, exc);
                }
            }
        });
    }

    private boolean OLrzqt() {
        return this.EZpvd < this.copydefault.valueOf().size();
    }

    public final boolean KWHzl(java.lang.Object obj) throws java.lang.Throwable {
        long jCopydefault = SF.copydefault();
        boolean z = false;
        try {
            NT<T> ntEZpvd = this.copydefault.EZpvd(obj);
            java.lang.Object objAEQbTJ = ntEZpvd.AEQbTJ();
            NI<X> niKWHzl = this.copydefault.KWHzl(objAEQbTJ);
            C5354Om c5354Om = new C5354Om(niKWHzl, objAEQbTJ, this.copydefault.gEmmrt());
            C5356Oo c5356Oo = new C5356Oo(this.AEQbTJ.OLrzqt, this.copydefault.isConnected());
            OP opKWHzl = this.copydefault.KWHzl();
            opKWHzl.EZpvd(c5356Oo, c5354Om);
            if (android.util.Log.isLoggable("SourceGenerator", 2)) {
                c5356Oo.toString();
                Objects.toString(obj);
                Objects.toString(niKWHzl);
                SF.OLrzqt(jCopydefault);
            }
            if (opKWHzl.OLrzqt(c5356Oo) != null) {
                this.valueOf = c5356Oo;
                this.AhwBna = new C5347Of(Collections.singletonList(this.AEQbTJ.OLrzqt), this.copydefault, this);
                this.AEQbTJ.EZpvd.AEQbTJ();
                return true;
            }
            if (android.util.Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.valueOf);
                Objects.toString(obj);
            }
            try {
                this.KWHzl.AEQbTJ(this.AEQbTJ.OLrzqt, ntEZpvd.AEQbTJ(), this.AEQbTJ.EZpvd, this.AEQbTJ.EZpvd.OLrzqt(), this.AEQbTJ.OLrzqt);
                return false;
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.AEQbTJ.EZpvd.AEQbTJ();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // o.InterfaceC5353Ol
    public void EZpvd() {
        InterfaceC5386Ps.Application<?> application = this.AEQbTJ;
        if (application != null) {
            application.EZpvd.copydefault();
        }
    }

    public void EZpvd(InterfaceC5386Ps.Application<?> application, java.lang.Object obj) {
        AbstractC5360Os abstractC5360OsEZpvd = this.copydefault.EZpvd();
        if (obj != null && abstractC5360OsEZpvd.AEQbTJ(application.EZpvd.OLrzqt())) {
            this.OLrzqt = obj;
            this.KWHzl.copydefault();
        } else {
            InterfaceC5353Ol.Application application2 = this.KWHzl;
            NH nh = application.OLrzqt;
            NU<?> nu = application.EZpvd;
            application2.AEQbTJ(nh, obj, nu, nu.OLrzqt(), this.valueOf);
        }
    }

    public void OLrzqt(InterfaceC5386Ps.Application<?> application, @androidx.annotation.NonNull java.lang.Exception exc) {
        InterfaceC5353Ol.Application application2 = this.KWHzl;
        C5356Oo c5356Oo = this.valueOf;
        NU<?> nu = application.EZpvd;
        application2.AEQbTJ(c5356Oo, exc, nu, nu.OLrzqt());
    }

    @Override // o.InterfaceC5353Ol.Application
    public void copydefault() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o.InterfaceC5353Ol.Application
    public void AEQbTJ(NH nh, java.lang.Object obj, NU<?> nu, com.bumptech.glide.load.DataSource dataSource, NH nh2) {
        this.KWHzl.AEQbTJ(nh, obj, nu, this.AEQbTJ.EZpvd.OLrzqt(), nh);
    }

    @Override // o.InterfaceC5353Ol.Application
    public void AEQbTJ(NH nh, java.lang.Exception exc, NU<?> nu, com.bumptech.glide.load.DataSource dataSource) {
        this.KWHzl.AEQbTJ(nh, exc, nu, this.AEQbTJ.EZpvd.OLrzqt());
    }
}
