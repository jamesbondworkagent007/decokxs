package o;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ConnectionPoolTimeoutException;

/* JADX INFO: renamed from: o.zme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59735zme extends AbstractC59738zmh {
    public final java.util.Set<C59739zmi> AYXKKw;
    public final long AhwBna;
    public volatile int AkhnZx;
    public final java.util.Map<C59570zjY, C59741zmk> AuCTel;
    public final InterfaceC59555zjJ DbNXlk;
    public final Queue<C59739zmi> djBIcL;
    public volatile boolean ejfBZ;
    public final Queue<C59740zmj> fIwbmz;
    public final InterfaceC59499ziG fetchVPNInfo;
    public final InterfaceC59568zjW gEmmrt;
    public volatile int isConnected;
    public final java.util.concurrent.TimeUnit valueOf;
    public final Lock values;

    public C59735zme(InterfaceC59555zjJ interfaceC59555zjJ, InterfaceC59568zjW interfaceC59568zjW, int i) {
        this(interfaceC59555zjJ, interfaceC59568zjW, i, -1L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public C59735zme(InterfaceC59555zjJ interfaceC59555zjJ, InterfaceC59568zjW interfaceC59568zjW, int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.fetchVPNInfo = LogFactory.copydefault(getClass());
        C59851zoo.AEQbTJ(interfaceC59555zjJ, "Connection operator");
        C59851zoo.AEQbTJ(interfaceC59568zjW, "Connections per route");
        this.values = this.KWHzl;
        this.AYXKKw = this.EZpvd;
        this.DbNXlk = interfaceC59555zjJ;
        this.gEmmrt = interfaceC59568zjW;
        this.isConnected = i;
        this.djBIcL = AEQbTJ();
        this.fIwbmz = OLrzqt();
        this.AuCTel = copydefault();
        this.AhwBna = j;
        this.valueOf = timeUnit;
    }

    @java.lang.Deprecated
    public C59735zme(InterfaceC59555zjJ interfaceC59555zjJ, InterfaceC59779znV interfaceC59779znV) {
        this(interfaceC59555zjJ, C59567zjV.AEQbTJ(interfaceC59779znV), C59567zjV.EZpvd(interfaceC59779znV));
    }

    public Queue<C59739zmi> AEQbTJ() {
        return new LinkedList();
    }

    public Queue<C59740zmj> OLrzqt() {
        return new LinkedList();
    }

    public java.util.Map<C59570zjY, C59741zmk> copydefault() {
        return new java.util.HashMap();
    }

    public C59741zmk AEQbTJ(C59570zjY c59570zjY) {
        return new C59741zmk(c59570zjY, this.gEmmrt);
    }

    public C59740zmj copydefault(java.util.concurrent.locks.Condition condition, C59741zmk c59741zmk) {
        return new C59740zmj(condition, c59741zmk);
    }

    public final void KWHzl(C59739zmi c59739zmi) {
        InterfaceC59569zjX interfaceC59569zjXAEQbTJ = c59739zmi.AEQbTJ();
        if (interfaceC59569zjXAEQbTJ != null) {
            try {
                interfaceC59569zjXAEQbTJ.close();
            } catch (java.io.IOException e) {
                this.fetchVPNInfo.debug("I/O error closing connection", e);
            }
        }
    }

    public C59741zmk copydefault(C59570zjY c59570zjY, boolean z) {
        this.values.lock();
        try {
            C59741zmk c59741zmkAEQbTJ = this.AuCTel.get(c59570zjY);
            if (c59741zmkAEQbTJ == null && z) {
                c59741zmkAEQbTJ = AEQbTJ(c59570zjY);
                this.AuCTel.put(c59570zjY, c59741zmkAEQbTJ);
            }
            return c59741zmkAEQbTJ;
        } finally {
            this.values.unlock();
        }
    }

    public InterfaceC59744zmn AEQbTJ(final C59570zjY c59570zjY, final java.lang.Object obj) {
        final C59743zmm c59743zmm = new C59743zmm();
        return new InterfaceC59744zmn() { // from class: o.zme.1
            @Override // o.InterfaceC59744zmn
            public void OLrzqt() {
                C59735zme.this.values.lock();
                try {
                    c59743zmm.KWHzl();
                } finally {
                    C59735zme.this.values.unlock();
                }
            }

            @Override // o.InterfaceC59744zmn
            public C59739zmi AEQbTJ(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, ConnectionPoolTimeoutException {
                return C59735zme.this.KWHzl(c59570zjY, obj, j, timeUnit, c59743zmm);
            }
        };
    }

    public C59739zmi KWHzl(C59570zjY c59570zjY, java.lang.Object obj, long j, java.util.concurrent.TimeUnit timeUnit, C59743zmm c59743zmm) throws ConnectionPoolTimeoutException, java.lang.InterruptedException {
        C59739zmi c59739zmiCopydefault = null;
        Date date = j > 0 ? new Date(java.lang.System.currentTimeMillis() + timeUnit.toMillis(j)) : null;
        this.values.lock();
        try {
            C59741zmk c59741zmkCopydefault = copydefault(c59570zjY, true);
            C59740zmj c59740zmjCopydefault = null;
            while (c59739zmiCopydefault == null) {
                C59849zom.EZpvd(!this.ejfBZ, "Connection pool shut down");
                if (this.fetchVPNInfo.isDebugEnabled()) {
                    this.fetchVPNInfo.debug("[" + c59570zjY + "] total kept alive: " + this.djBIcL.size() + ", total issued: " + this.AYXKKw.size() + ", total allocated: " + this.AkhnZx + " out of " + this.isConnected);
                }
                c59739zmiCopydefault = copydefault(c59741zmkCopydefault, obj);
                if (c59739zmiCopydefault != null) {
                    break;
                }
                boolean z = c59741zmkCopydefault.KWHzl() > 0;
                if (this.fetchVPNInfo.isDebugEnabled()) {
                    this.fetchVPNInfo.debug("Available capacity: " + c59741zmkCopydefault.KWHzl() + " out of " + c59741zmkCopydefault.AEQbTJ() + " [" + c59570zjY + "][" + obj + "]");
                }
                if (z && this.AkhnZx < this.isConnected) {
                    c59739zmiCopydefault = EZpvd(c59741zmkCopydefault, this.DbNXlk);
                } else if (z && !this.djBIcL.isEmpty()) {
                    EZpvd();
                    c59741zmkCopydefault = copydefault(c59570zjY, true);
                    c59739zmiCopydefault = EZpvd(c59741zmkCopydefault, this.DbNXlk);
                } else {
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        this.fetchVPNInfo.debug("Need to wait for connection [" + c59570zjY + "][" + obj + "]");
                    }
                    if (c59740zmjCopydefault == null) {
                        c59740zmjCopydefault = copydefault(this.values.newCondition(), c59741zmkCopydefault);
                        c59743zmm.OLrzqt(c59740zmjCopydefault);
                    }
                    try {
                        c59741zmkCopydefault.OLrzqt(c59740zmjCopydefault);
                        this.fIwbmz.add(c59740zmjCopydefault);
                        if (!c59740zmjCopydefault.EZpvd(date) && date != null && date.getTime() <= java.lang.System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
                        }
                    } finally {
                        c59741zmkCopydefault.copydefault(c59740zmjCopydefault);
                        this.fIwbmz.remove(c59740zmjCopydefault);
                    }
                }
            }
            return c59739zmiCopydefault;
        } finally {
            this.values.unlock();
        }
    }

    public void KWHzl(C59739zmi c59739zmi, boolean z, long j, java.util.concurrent.TimeUnit timeUnit) {
        Lock lock;
        java.lang.String str;
        C59570zjY c59570zjYKWHzl = c59739zmi.KWHzl();
        if (this.fetchVPNInfo.isDebugEnabled()) {
            this.fetchVPNInfo.debug("Releasing connection [" + c59570zjYKWHzl + "][" + c59739zmi.OLrzqt() + "]");
        }
        this.values.lock();
        try {
            if (this.ejfBZ) {
                KWHzl(c59739zmi);
                lock = this.values;
            } else {
                this.AYXKKw.remove(c59739zmi);
                C59741zmk c59741zmkCopydefault = copydefault(c59570zjYKWHzl, true);
                if (z && c59741zmkCopydefault.KWHzl() >= 0) {
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        if (j > 0) {
                            str = "for " + j + " " + timeUnit;
                        } else {
                            str = "indefinitely";
                        }
                        this.fetchVPNInfo.debug("Pooling connection [" + c59570zjYKWHzl + "][" + c59739zmi.OLrzqt() + "]; keep alive " + str);
                    }
                    c59741zmkCopydefault.copydefault(c59739zmi);
                    c59739zmi.EZpvd(j, timeUnit);
                    this.djBIcL.add(c59739zmi);
                } else {
                    KWHzl(c59739zmi);
                    c59741zmkCopydefault.copydefault();
                    this.AkhnZx--;
                }
                OLrzqt(c59741zmkCopydefault);
                lock = this.values;
            }
            lock.unlock();
        } catch (java.lang.Throwable th) {
            this.values.unlock();
            throw th;
        }
    }

    public C59739zmi copydefault(C59741zmk c59741zmk, java.lang.Object obj) {
        this.values.lock();
        C59739zmi c59739zmiAEQbTJ = null;
        boolean z = false;
        while (!z) {
            try {
                c59739zmiAEQbTJ = c59741zmk.AEQbTJ(obj);
                if (c59739zmiAEQbTJ != null) {
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        this.fetchVPNInfo.debug("Getting free connection [" + c59741zmk.OLrzqt() + "][" + obj + "]");
                    }
                    this.djBIcL.remove(c59739zmiAEQbTJ);
                    if (c59739zmiAEQbTJ.copydefault(java.lang.System.currentTimeMillis())) {
                        if (this.fetchVPNInfo.isDebugEnabled()) {
                            this.fetchVPNInfo.debug("Closing expired free connection [" + c59741zmk.OLrzqt() + "][" + obj + "]");
                        }
                        KWHzl(c59739zmiAEQbTJ);
                        c59741zmk.copydefault();
                        this.AkhnZx--;
                    } else {
                        this.AYXKKw.add(c59739zmiAEQbTJ);
                    }
                } else if (this.fetchVPNInfo.isDebugEnabled()) {
                    this.fetchVPNInfo.debug("No free connections [" + c59741zmk.OLrzqt() + "][" + obj + "]");
                }
                z = true;
            } finally {
                this.values.unlock();
            }
        }
        return c59739zmiAEQbTJ;
    }

    public C59739zmi EZpvd(C59741zmk c59741zmk, InterfaceC59555zjJ interfaceC59555zjJ) {
        if (this.fetchVPNInfo.isDebugEnabled()) {
            this.fetchVPNInfo.debug("Creating new connection [" + c59741zmk.OLrzqt() + "]");
        }
        C59739zmi c59739zmi = new C59739zmi(interfaceC59555zjJ, c59741zmk.OLrzqt(), this.AhwBna, this.valueOf);
        this.values.lock();
        try {
            c59741zmk.AEQbTJ(c59739zmi);
            this.AkhnZx++;
            this.AYXKKw.add(c59739zmi);
            return c59739zmi;
        } finally {
            this.values.unlock();
        }
    }

    public void AEQbTJ(C59739zmi c59739zmi) {
        C59570zjY c59570zjYKWHzl = c59739zmi.KWHzl();
        if (this.fetchVPNInfo.isDebugEnabled()) {
            this.fetchVPNInfo.debug("Deleting connection [" + c59570zjYKWHzl + "][" + c59739zmi.OLrzqt() + "]");
        }
        this.values.lock();
        try {
            KWHzl(c59739zmi);
            C59741zmk c59741zmkCopydefault = copydefault(c59570zjYKWHzl, true);
            c59741zmkCopydefault.KWHzl(c59739zmi);
            this.AkhnZx--;
            if (c59741zmkCopydefault.valueOf()) {
                this.AuCTel.remove(c59570zjYKWHzl);
            }
        } finally {
            this.values.unlock();
        }
    }

    public void EZpvd() {
        this.values.lock();
        try {
            C59739zmi c59739zmiRemove = this.djBIcL.remove();
            if (c59739zmiRemove != null) {
                AEQbTJ(c59739zmiRemove);
            } else if (this.fetchVPNInfo.isDebugEnabled()) {
                this.fetchVPNInfo.debug("No free connection to delete");
            }
        } finally {
            this.values.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0015, B:9:0x0034, B:21:0x006b, B:10:0x0039, B:12:0x0041, B:14:0x0049, B:15:0x0050, B:16:0x0059, B:18:0x0061), top: B:27:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(C59741zmk c59741zmk) {
        C59740zmj c59740zmjGEmmrt;
        this.values.lock();
        if (c59741zmk != null) {
            try {
                if (c59741zmk.EZpvd()) {
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        this.fetchVPNInfo.debug("Notifying thread waiting on pool [" + c59741zmk.OLrzqt() + "]");
                    }
                    c59740zmjGEmmrt = c59741zmk.gEmmrt();
                } else if (!this.fIwbmz.isEmpty()) {
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        this.fetchVPNInfo.debug("Notifying thread waiting on any pool");
                    }
                    c59740zmjGEmmrt = this.fIwbmz.remove();
                } else {
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        this.fetchVPNInfo.debug("Notifying no-one, there are no waiting threads");
                    }
                    c59740zmjGEmmrt = null;
                }
            } finally {
                this.values.unlock();
            }
        }
        if (c59740zmjGEmmrt != null) {
            c59740zmjGEmmrt.KWHzl();
        }
    }

    @Override // o.AbstractC59738zmh
    public void KWHzl() {
        Lock lock;
        this.values.lock();
        try {
            if (this.ejfBZ) {
                lock = this.values;
            } else {
                this.ejfBZ = true;
                java.util.Iterator<C59739zmi> it = this.AYXKKw.iterator();
                while (it.hasNext()) {
                    C59739zmi next = it.next();
                    it.remove();
                    KWHzl(next);
                }
                java.util.Iterator<C59739zmi> it2 = this.djBIcL.iterator();
                while (it2.hasNext()) {
                    C59739zmi next2 = it2.next();
                    it2.remove();
                    if (this.fetchVPNInfo.isDebugEnabled()) {
                        this.fetchVPNInfo.debug("Closing connection [" + next2.KWHzl() + "][" + next2.OLrzqt() + "]");
                    }
                    KWHzl(next2);
                }
                java.util.Iterator<C59740zmj> it3 = this.fIwbmz.iterator();
                while (it3.hasNext()) {
                    C59740zmj next3 = it3.next();
                    it3.remove();
                    next3.KWHzl();
                }
                this.AuCTel.clear();
                lock = this.values;
            }
            lock.unlock();
        } catch (java.lang.Throwable th) {
            this.values.unlock();
            throw th;
        }
    }
}
