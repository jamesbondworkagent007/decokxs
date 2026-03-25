package o;

import com.bumptech.glide.Glide;
import java.util.Collections;
import o.C5331Np;
import o.OP;
import o.OY;
import o.RD;

/* JADX INFO: renamed from: o.Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5328Nm {
    public ExecutorServiceC5373Pf AEQbTJ;
    public OP.Activity AYXKKw;
    public OY AkhnZx;
    public OG EZpvd;
    public OF KWHzl;
    public java.util.List<RY<java.lang.Object>> OLrzqt;
    public InterfaceC5438Rs copydefault;
    public RD.TaskDescription fIwbmz;
    public ExecutorServiceC5373Pf fJNWhG;
    public boolean fetchVPNInfo;
    public C5357Op gEmmrt;
    public ExecutorServiceC5373Pf valueOf;
    public InterfaceC5368Pa values;
    public final java.util.Map<java.lang.Class<?>, AbstractC5334Ns<?, ?>> AhwBna = new androidx.collection.ArrayMap();
    public final C5331Np.Application isConnected = new C5331Np.Application();
    public int DbNXlk = 4;
    public Glide.Application djBIcL = new Glide.Application() { // from class: o.Nm.3
        @Override // com.bumptech.glide.Glide.Application
        public C5448Sc EZpvd() {
            return new C5448Sc();
        }
    };

    /* JADX INFO: renamed from: o.Nm$Activity */
    public static final class Activity {
    }

    /* JADX INFO: renamed from: o.Nm$StateListAnimator */
    public static final class StateListAnimator {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5328Nm KWHzl(@androidx.annotation.Nullable InterfaceC5368Pa interfaceC5368Pa) {
        this.values = interfaceC5368Pa;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5328Nm OLrzqt(@androidx.annotation.Nullable OP.Activity activity) {
        this.AYXKKw = activity;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable RD.TaskDescription taskDescription) {
        this.fIwbmz = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5328Nm copydefault(@androidx.annotation.Nullable OG og) {
        this.EZpvd = og;
        return this;
    }

    public C5328Nm EZpvd(@androidx.annotation.Nullable final C5448Sc c5448Sc) {
        return OLrzqt(new Glide.Application() { // from class: o.Nm.5
            @Override // com.bumptech.glide.Glide.Application
            public C5448Sc EZpvd() {
                C5448Sc c5448Sc2 = c5448Sc;
                return c5448Sc2 != null ? c5448Sc2 : new C5448Sc();
            }
        });
    }

    public C5328Nm OLrzqt(@androidx.annotation.NonNull Glide.Application application) {
        this.djBIcL = (Glide.Application) SE.OLrzqt(application);
        return this;
    }

    public C5328Nm OLrzqt(@androidx.annotation.NonNull RY<java.lang.Object> ry) {
        if (this.OLrzqt == null) {
            this.OLrzqt = new java.util.ArrayList();
        }
        this.OLrzqt.add(ry);
        return this;
    }

    public Glide KWHzl(@androidx.annotation.NonNull android.content.Context context, java.util.List<RL> list, RN rn) {
        if (this.fJNWhG == null) {
            this.fJNWhG = ExecutorServiceC5373Pf.valueOf();
        }
        if (this.valueOf == null) {
            this.valueOf = ExecutorServiceC5373Pf.AYXKKw();
        }
        if (this.AEQbTJ == null) {
            this.AEQbTJ = ExecutorServiceC5373Pf.copydefault();
        }
        if (this.AkhnZx == null) {
            this.AkhnZx = new OY.StateListAnimator(context).KWHzl();
        }
        if (this.copydefault == null) {
            this.copydefault = new C5437Rr();
        }
        if (this.EZpvd == null) {
            int iAEQbTJ = this.AkhnZx.AEQbTJ();
            if (iAEQbTJ > 0) {
                this.EZpvd = new OR(iAEQbTJ);
            } else {
                this.EZpvd = new OM();
            }
        }
        if (this.KWHzl == null) {
            this.KWHzl = new OL(this.AkhnZx.KWHzl());
        }
        if (this.values == null) {
            this.values = new C5370Pc(this.AkhnZx.copydefault());
        }
        if (this.AYXKKw == null) {
            this.AYXKKw = new OZ(context);
        }
        if (this.gEmmrt == null) {
            this.gEmmrt = new C5357Op(this.values, this.AYXKKw, this.valueOf, this.fJNWhG, ExecutorServiceC5373Pf.AhwBna(), this.AEQbTJ, this.fetchVPNInfo);
        }
        java.util.List<RY<java.lang.Object>> list2 = this.OLrzqt;
        if (list2 == null) {
            this.OLrzqt = Collections.emptyList();
        } else {
            this.OLrzqt = Collections.unmodifiableList(list2);
        }
        C5331Np c5331NpEZpvd = this.isConnected.EZpvd();
        return new Glide(context, this.gEmmrt, this.values, this.EZpvd, this.KWHzl, new RD(this.fIwbmz, c5331NpEZpvd), this.copydefault, this.DbNXlk, this.djBIcL, this.AhwBna, this.OLrzqt, list, rn, c5331NpEZpvd);
    }

    /* JADX INFO: renamed from: o.Nm$Application */
    public static final class Application {
        private Application() {
        }
    }
}
