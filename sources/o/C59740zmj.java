package o;

import java.util.Date;

/* JADX INFO: renamed from: o.zmj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59740zmj {
    public final java.util.concurrent.locks.Condition AEQbTJ;
    public java.lang.Thread EZpvd;
    public boolean KWHzl;
    public final C59741zmk OLrzqt;

    public C59740zmj(java.util.concurrent.locks.Condition condition, C59741zmk c59741zmk) {
        C59851zoo.AEQbTJ(condition, "Condition");
        this.AEQbTJ = condition;
        this.OLrzqt = c59741zmk;
    }

    public boolean EZpvd(Date date) throws java.lang.InterruptedException {
        boolean zAwaitUntil;
        if (this.EZpvd != null) {
            throw new java.lang.IllegalStateException("A thread is already waiting on this object.\ncaller: " + java.lang.Thread.currentThread() + "\nwaiter: " + this.EZpvd);
        }
        if (this.KWHzl) {
            throw new java.lang.InterruptedException("Operation interrupted");
        }
        this.EZpvd = java.lang.Thread.currentThread();
        try {
            if (date != null) {
                zAwaitUntil = this.AEQbTJ.awaitUntil(date);
            } else {
                this.AEQbTJ.await();
                zAwaitUntil = true;
            }
            if (this.KWHzl) {
                throw new java.lang.InterruptedException("Operation interrupted");
            }
            return zAwaitUntil;
        } finally {
            this.EZpvd = null;
        }
    }

    public void KWHzl() {
        if (this.EZpvd == null) {
            throw new java.lang.IllegalStateException("Nobody waiting on this object.");
        }
        this.AEQbTJ.signalAll();
    }

    public void AEQbTJ() {
        this.KWHzl = true;
        this.AEQbTJ.signalAll();
    }
}
