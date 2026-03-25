package o;

import com.bumptech.glide.request.RequestCoordinator;

/* JADX INFO: loaded from: classes2.dex */
public final class RU implements RequestCoordinator, RV {
    public RequestCoordinator.RequestState AEQbTJ;
    public final RequestCoordinator EZpvd;
    public volatile RV KWHzl;
    public volatile RV OLrzqt;
    public RequestCoordinator.RequestState copydefault;
    public final java.lang.Object gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(RV rv, RV rv2) {
        this.OLrzqt = rv;
        this.KWHzl = rv2;
    }

    public RU(java.lang.Object obj, @androidx.annotation.Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.copydefault = requestState;
        this.AEQbTJ = requestState;
        this.gEmmrt = obj;
        this.EZpvd = requestCoordinator;
    }

    @Override // o.RV
    public void OLrzqt() {
        synchronized (this.gEmmrt) {
            RequestCoordinator.RequestState requestState = this.copydefault;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.copydefault = requestState2;
                this.OLrzqt.OLrzqt();
            }
        }
    }

    @Override // o.RV
    public void KWHzl() {
        synchronized (this.gEmmrt) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.copydefault = requestState;
            this.OLrzqt.KWHzl();
            if (this.AEQbTJ != requestState) {
                this.AEQbTJ = requestState;
                this.KWHzl.KWHzl();
            }
        }
    }

    @Override // o.RV
    public void DbNXlk() {
        synchronized (this.gEmmrt) {
            RequestCoordinator.RequestState requestState = this.copydefault;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.copydefault = RequestCoordinator.RequestState.PAUSED;
                this.OLrzqt.DbNXlk();
            }
            if (this.AEQbTJ == requestState2) {
                this.AEQbTJ = RequestCoordinator.RequestState.PAUSED;
                this.KWHzl.DbNXlk();
            }
        }
    }

    @Override // o.RV
    public boolean gEmmrt() {
        boolean z;
        synchronized (this.gEmmrt) {
            RequestCoordinator.RequestState requestState = this.copydefault;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.AEQbTJ == requestState2;
        }
        return z;
    }

    @Override // o.RV
    public boolean valueOf() {
        boolean z;
        synchronized (this.gEmmrt) {
            RequestCoordinator.RequestState requestState = this.copydefault;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.AEQbTJ == requestState2;
        }
        return z;
    }

    @Override // o.RV
    public boolean EZpvd() {
        boolean z;
        synchronized (this.gEmmrt) {
            RequestCoordinator.RequestState requestState = this.copydefault;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.AEQbTJ == requestState2;
        }
        return z;
    }

    @Override // o.RV
    public boolean EZpvd(RV rv) {
        if (rv instanceof RU) {
            RU ru = (RU) rv;
            if (this.OLrzqt.EZpvd(ru.OLrzqt) && this.KWHzl.EZpvd(ru.KWHzl)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean copydefault(RV rv) {
        boolean zDjBIcL;
        synchronized (this.gEmmrt) {
            zDjBIcL = djBIcL();
        }
        return zDjBIcL;
    }

    public final boolean djBIcL() {
        RequestCoordinator requestCoordinator = this.EZpvd;
        return requestCoordinator == null || requestCoordinator.copydefault(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean OLrzqt(RV rv) {
        boolean z;
        synchronized (this.gEmmrt) {
            z = AYXKKw() && AEQbTJ(rv);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean KWHzl(RV rv) {
        boolean z;
        synchronized (this.gEmmrt) {
            z = AhwBna() && rv.equals(this.OLrzqt);
        }
        return z;
    }

    public final boolean AhwBna() {
        RequestCoordinator requestCoordinator = this.EZpvd;
        return requestCoordinator == null || requestCoordinator.KWHzl(this);
    }

    public final boolean AYXKKw() {
        RequestCoordinator requestCoordinator = this.EZpvd;
        return requestCoordinator == null || requestCoordinator.OLrzqt(this);
    }

    public final boolean AEQbTJ(RV rv) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.copydefault;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return rv.equals(this.OLrzqt);
        }
        return rv.equals(this.KWHzl) && ((requestState = this.AEQbTJ) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, o.RV
    public boolean AEQbTJ() {
        boolean z;
        synchronized (this.gEmmrt) {
            z = this.OLrzqt.AEQbTJ() || this.KWHzl.AEQbTJ();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void gEmmrt(RV rv) {
        synchronized (this.gEmmrt) {
            if (rv.equals(this.OLrzqt)) {
                this.copydefault = RequestCoordinator.RequestState.SUCCESS;
            } else if (rv.equals(this.KWHzl)) {
                this.AEQbTJ = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.EZpvd;
            if (requestCoordinator != null) {
                requestCoordinator.gEmmrt(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void djBIcL(RV rv) {
        synchronized (this.gEmmrt) {
            if (!rv.equals(this.KWHzl)) {
                this.copydefault = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.AEQbTJ;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.AEQbTJ = requestState2;
                    this.KWHzl.OLrzqt();
                }
                return;
            }
            this.AEQbTJ = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.EZpvd;
            if (requestCoordinator != null) {
                requestCoordinator.djBIcL(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator copydefault() {
        RequestCoordinator requestCoordinatorCopydefault;
        synchronized (this.gEmmrt) {
            RequestCoordinator requestCoordinator = this.EZpvd;
            requestCoordinatorCopydefault = requestCoordinator != null ? requestCoordinator.copydefault() : this;
        }
        return requestCoordinatorCopydefault;
    }
}
