package o;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: o.ace, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7057ace {
    public ReentrantReadWriteLock OLrzqt = new ReentrantReadWriteLock();
    public ActionBar EZpvd = null;

    /* JADX INFO: renamed from: o.ace$ActionBar */
    public static final class ActionBar {
        public int AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;

        private ActionBar() {
        }

        public java.lang.String toString() {
            return " rc: " + this.EZpvd + " mrc: " + this.KWHzl + " wrc: " + this.OLrzqt + " wc: " + this.copydefault + " wwc: " + this.AEQbTJ;
        }
    }

    public void EZpvd() {
        if (this.EZpvd != null) {
            synchronized (this) {
                this.EZpvd.EZpvd++;
                if (this.OLrzqt.getReadLockCount() > 0) {
                    this.EZpvd.KWHzl++;
                }
                if (this.OLrzqt.isWriteLocked()) {
                    this.EZpvd.OLrzqt++;
                }
            }
        }
        this.OLrzqt.readLock().lock();
    }

    public void OLrzqt() {
        this.OLrzqt.readLock().unlock();
    }

    public void copydefault() {
        if (this.EZpvd != null) {
            synchronized (this) {
                this.EZpvd.copydefault++;
                if (this.OLrzqt.getReadLockCount() > 0 || this.OLrzqt.isWriteLocked()) {
                    this.EZpvd.AEQbTJ++;
                }
            }
        }
        this.OLrzqt.writeLock().lock();
    }

    public void AEQbTJ() {
        this.OLrzqt.writeLock().unlock();
    }
}
