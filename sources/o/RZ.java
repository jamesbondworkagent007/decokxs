package o;

import com.bumptech.glide.load.engine.GlideException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class RZ<R> implements RW<R>, RY<R> {
    public static final StateListAnimator copydefault = new StateListAnimator();
    public final boolean AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public GlideException KWHzl;
    public final int OLrzqt;
    public RV djBIcL;
    public final int fetchVPNInfo;
    public final StateListAnimator gEmmrt;
    public R valueOf;

    @Override // o.InterfaceC5441Rv
    public void AYXKKw() {
    }

    @Override // o.InterfaceC5441Rv
    public void AhwBna() {
    }

    @Override // o.InterfaceC5462Sq
    public void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
    }

    @Override // o.InterfaceC5462Sq
    public void KWHzl(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
    }

    @Override // o.InterfaceC5462Sq
    public void a_(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
    }

    @Override // o.InterfaceC5441Rv
    public void valueOf() {
    }

    public RZ(int i, int i2) {
        this(i, i2, true, copydefault);
    }

    public RZ(int i, int i2, boolean z, StateListAnimator stateListAnimator) {
        this.fetchVPNInfo = i;
        this.OLrzqt = i2;
        this.AEQbTJ = z;
        this.gEmmrt = stateListAnimator;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.EZpvd = true;
            this.gEmmrt.OLrzqt(this);
            RV rv = null;
            if (z) {
                RV rv2 = this.djBIcL;
                this.djBIcL = null;
                rv = rv2;
            }
            if (rv != null) {
                rv.KWHzl();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this) {
            z = this.EZpvd;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDone() {
        boolean z;
        synchronized (this) {
            if (this.EZpvd || this.AYXKKw) {
                z = true;
            } else if (!this.AhwBna) {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, java.lang.InterruptedException {
        try {
            return EZpvd((java.lang.Long) null);
        } catch (TimeoutException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @androidx.annotation.NonNull java.util.concurrent.TimeUnit timeUnit) throws ExecutionException, java.lang.InterruptedException, TimeoutException {
        return EZpvd(java.lang.Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // o.InterfaceC5462Sq
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        interfaceC5457Sl.OLrzqt(this.fetchVPNInfo, this.OLrzqt);
    }

    @Override // o.InterfaceC5462Sq
    public void AEQbTJ(@androidx.annotation.Nullable RV rv) {
        synchronized (this) {
            this.djBIcL = rv;
        }
    }

    @Override // o.InterfaceC5462Sq
    public RV OLrzqt() {
        RV rv;
        synchronized (this) {
            rv = this.djBIcL;
        }
        return rv;
    }

    @Override // o.InterfaceC5462Sq
    public void AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        synchronized (this) {
        }
    }

    @Override // o.InterfaceC5462Sq
    public void copydefault(@androidx.annotation.NonNull R r, @androidx.annotation.Nullable InterfaceC5460So<? super R> interfaceC5460So) {
        synchronized (this) {
        }
    }

    public final R EZpvd(java.lang.Long l) throws ExecutionException, java.lang.InterruptedException, TimeoutException {
        synchronized (this) {
            if (this.AEQbTJ && !isDone()) {
                SI.KWHzl();
            }
            if (this.EZpvd) {
                throw new CancellationException();
            }
            if (this.AhwBna) {
                throw new ExecutionException(this.KWHzl);
            }
            if (this.AYXKKw) {
                return this.valueOf;
            }
            if (l == null) {
                this.gEmmrt.AEQbTJ(this, 0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.gEmmrt.AEQbTJ(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                }
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            if (this.AhwBna) {
                throw new ExecutionException(this.KWHzl);
            }
            if (this.EZpvd) {
                throw new CancellationException();
            }
            if (!this.AYXKKw) {
                throw new TimeoutException();
            }
            return this.valueOf;
        }
    }

    @Override // o.RY
    public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<R> interfaceC5462Sq, boolean z) {
        synchronized (this) {
            this.AhwBna = true;
            this.KWHzl = glideException;
            this.gEmmrt.OLrzqt(this);
        }
        return false;
    }

    @Override // o.RY
    public boolean copydefault(R r, java.lang.Object obj, InterfaceC5462Sq<R> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
        synchronized (this) {
            this.AYXKKw = true;
            this.valueOf = r;
            this.gEmmrt.OLrzqt(this);
        }
        return false;
    }

    public java.lang.String toString() {
        RV rv;
        java.lang.String str;
        java.lang.String str2 = super.toString() + "[status=";
        synchronized (this) {
            rv = null;
            if (this.EZpvd) {
                str = "CANCELLED";
            } else if (this.AhwBna) {
                str = "FAILURE";
            } else if (this.AYXKKw) {
                str = "SUCCESS";
            } else {
                str = CardSyncResponse.PENDING;
                rv = this.djBIcL;
            }
        }
        if (rv != null) {
            return str2 + str + ", request=[" + rv + "]]";
        }
        return str2 + str + "]";
    }

    public static class StateListAnimator {
        public void AEQbTJ(java.lang.Object obj, long j) throws java.lang.InterruptedException {
            obj.wait(j);
        }

        public void OLrzqt(java.lang.Object obj) {
            obj.notifyAll();
        }
    }
}
