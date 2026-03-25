package o;

import com.bumptech.glide.request.RequestCoordinator;

/* JADX INFO: renamed from: o.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5447Sb implements RequestCoordinator, RV {
    public final java.lang.Object AEQbTJ;
    public volatile RV AYXKKw;
    public RequestCoordinator.RequestState AhwBna;
    public volatile RV EZpvd;
    public RequestCoordinator.RequestState KWHzl;
    public boolean OLrzqt;
    public final RequestCoordinator copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(RV rv, RV rv2) {
        this.EZpvd = rv;
        this.AYXKKw = rv2;
    }

    public C5447Sb(java.lang.Object obj, @androidx.annotation.Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.KWHzl = requestState;
        this.AhwBna = requestState;
        this.AEQbTJ = obj;
        this.copydefault = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean copydefault(RV rv) {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = AYXKKw() && (rv.equals(this.EZpvd) || this.KWHzl != RequestCoordinator.RequestState.SUCCESS);
        }
        return z;
    }

    private boolean AYXKKw() {
        RequestCoordinator requestCoordinator = this.copydefault;
        return requestCoordinator == null || requestCoordinator.copydefault(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean OLrzqt(RV rv) {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = djBIcL() && rv.equals(this.EZpvd) && !AEQbTJ();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean KWHzl(RV rv) {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = AhwBna() && rv.equals(this.EZpvd) && this.KWHzl != RequestCoordinator.RequestState.PAUSED;
        }
        return z;
    }

    private boolean AhwBna() {
        RequestCoordinator requestCoordinator = this.copydefault;
        return requestCoordinator == null || requestCoordinator.KWHzl(this);
    }

    private boolean djBIcL() {
        RequestCoordinator requestCoordinator = this.copydefault;
        return requestCoordinator == null || requestCoordinator.OLrzqt(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, o.RV
    public boolean AEQbTJ() {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = this.AYXKKw.AEQbTJ() || this.EZpvd.AEQbTJ();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void gEmmrt(RV rv) {
        synchronized (this.AEQbTJ) {
            if (rv.equals(this.AYXKKw)) {
                this.AhwBna = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.KWHzl = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.copydefault;
            if (requestCoordinator != null) {
                requestCoordinator.gEmmrt(this);
            }
            if (!this.AhwBna.isComplete()) {
                this.AYXKKw.KWHzl();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void djBIcL(RV rv) {
        synchronized (this.AEQbTJ) {
            if (!rv.equals(this.EZpvd)) {
                this.AhwBna = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.KWHzl = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.copydefault;
            if (requestCoordinator != null) {
                requestCoordinator.djBIcL(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator copydefault() {
        RequestCoordinator requestCoordinatorCopydefault;
        synchronized (this.AEQbTJ) {
            RequestCoordinator requestCoordinator = this.copydefault;
            requestCoordinatorCopydefault = requestCoordinator != null ? requestCoordinator.copydefault() : this;
        }
        return requestCoordinatorCopydefault;
    }

    @Override // o.RV
    public void OLrzqt() {
        synchronized (this.AEQbTJ) {
            this.OLrzqt = true;
            try {
                if (this.KWHzl != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.AhwBna;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.AhwBna = requestState2;
                        this.AYXKKw.OLrzqt();
                    }
                }
                if (this.OLrzqt) {
                    RequestCoordinator.RequestState requestState3 = this.KWHzl;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.KWHzl = requestState4;
                        this.EZpvd.OLrzqt();
                    }
                }
            } finally {
                this.OLrzqt = false;
            }
        }
    }

    @Override // o.RV
    public void KWHzl() {
        synchronized (this.AEQbTJ) {
            this.OLrzqt = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.KWHzl = requestState;
            this.AhwBna = requestState;
            this.AYXKKw.KWHzl();
            this.EZpvd.KWHzl();
        }
    }

    @Override // o.RV
    public void DbNXlk() {
        synchronized (this.AEQbTJ) {
            if (!this.AhwBna.isComplete()) {
                this.AhwBna = RequestCoordinator.RequestState.PAUSED;
                this.AYXKKw.DbNXlk();
            }
            if (!this.KWHzl.isComplete()) {
                this.KWHzl = RequestCoordinator.RequestState.PAUSED;
                this.EZpvd.DbNXlk();
            }
        }
    }

    @Override // o.RV
    public boolean gEmmrt() {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = this.KWHzl == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // o.RV
    public boolean valueOf() {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = this.KWHzl == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // o.RV
    public boolean EZpvd() {
        boolean z;
        synchronized (this.AEQbTJ) {
            z = this.KWHzl == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // o.RV
    public boolean EZpvd(RV rv) {
        if (rv instanceof C5447Sb) {
            C5447Sb c5447Sb = (C5447Sb) rv;
            if (this.EZpvd != null ? this.EZpvd.EZpvd(c5447Sb.EZpvd) : c5447Sb.EZpvd == null) {
                if (this.AYXKKw != null ? this.AYXKKw.EZpvd(c5447Sb.AYXKKw) : c5447Sb.AYXKKw == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
