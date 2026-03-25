package o;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.zlP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59667zlP implements InterfaceC59551zjF {
    public static final AtomicLong AEQbTJ = new AtomicLong();
    public final InterfaceC59499ziG EZpvd;
    public C59734zmd KWHzl;
    public C59676zlY OLrzqt;
    public final InterfaceC59555zjJ copydefault;
    public volatile boolean djBIcL;
    public final C59636zkl gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59551zjF
    public C59636zkl AEQbTJ() {
        return this.gEmmrt;
    }

    public C59667zlP(C59636zkl c59636zkl) {
        this.EZpvd = LogFactory.copydefault(getClass());
        C59851zoo.AEQbTJ(c59636zkl, "Scheme registry");
        this.gEmmrt = c59636zkl;
        this.copydefault = AEQbTJ(c59636zkl);
    }

    public C59667zlP() {
        this(C59732zmb.EZpvd());
    }

    public void finalize() throws java.lang.Throwable {
        try {
            EZpvd();
        } finally {
            super.finalize();
        }
    }

    public InterfaceC59555zjJ AEQbTJ(C59636zkl c59636zkl) {
        return new C59669zlR(c59636zkl);
    }

    @Override // o.InterfaceC59551zjF
    public final InterfaceC59558zjM AEQbTJ(final C59570zjY c59570zjY, final java.lang.Object obj) {
        return new InterfaceC59558zjM() { // from class: o.zlP.3
            @Override // o.InterfaceC59558zjM
            public void OLrzqt() {
            }

            @Override // o.InterfaceC59558zjM
            public InterfaceC59560zjO AEQbTJ(long j, java.util.concurrent.TimeUnit timeUnit) {
                return C59667zlP.this.OLrzqt(c59570zjY, obj);
            }
        };
    }

    public final void KWHzl() {
        C59849zom.EZpvd(!this.djBIcL, "Connection manager has been shut down");
    }

    public InterfaceC59560zjO OLrzqt(C59570zjY c59570zjY, java.lang.Object obj) {
        C59734zmd c59734zmd;
        C59851zoo.AEQbTJ(c59570zjY, "Route");
        synchronized (this) {
            KWHzl();
            if (this.EZpvd.isDebugEnabled()) {
                this.EZpvd.debug("Get connection for route " + c59570zjY);
            }
            C59849zom.EZpvd(this.KWHzl == null, "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
            C59676zlY c59676zlY = this.OLrzqt;
            if (c59676zlY != null && !c59676zlY.KWHzl().equals(c59570zjY)) {
                this.OLrzqt.AEQbTJ();
                this.OLrzqt = null;
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = new C59676zlY(this.EZpvd, java.lang.Long.toString(AEQbTJ.getAndIncrement()), c59570zjY, this.copydefault.copydefault(), 0L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            if (this.OLrzqt.OLrzqt(java.lang.System.currentTimeMillis())) {
                this.OLrzqt.AEQbTJ();
                this.OLrzqt.EZpvd().valueOf();
            }
            c59734zmd = new C59734zmd(this, this.copydefault, this.OLrzqt);
            this.KWHzl = c59734zmd;
        }
        return c59734zmd;
    }

    public final void copydefault(InterfaceC59573zjb interfaceC59573zjb) {
        try {
            interfaceC59573zjb.EZpvd();
        } catch (java.io.IOException e) {
            if (this.EZpvd.isDebugEnabled()) {
                this.EZpvd.debug("I/O exception shutting down connection", e);
            }
        }
    }

    @Override // o.InterfaceC59551zjF
    public void EZpvd(InterfaceC59560zjO interfaceC59560zjO, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.String str;
        C59851zoo.copydefault(interfaceC59560zjO instanceof C59734zmd, "Connection class mismatch, connection not obtained from this manager");
        C59734zmd c59734zmd = (C59734zmd) interfaceC59560zjO;
        synchronized (c59734zmd) {
            if (this.EZpvd.isDebugEnabled()) {
                this.EZpvd.debug("Releasing connection " + interfaceC59560zjO);
            }
            if (c59734zmd.fJNWhG() == null) {
                return;
            }
            C59849zom.EZpvd(c59734zmd.ejfBZ() == this, "Connection not obtained from this manager");
            synchronized (this) {
                if (this.djBIcL) {
                    copydefault(c59734zmd);
                    return;
                }
                try {
                    if (c59734zmd.KWHzl() && !c59734zmd.fARcdN()) {
                        copydefault(c59734zmd);
                    }
                    if (c59734zmd.fARcdN()) {
                        this.OLrzqt.KWHzl(j, timeUnit != null ? timeUnit : java.util.concurrent.TimeUnit.MILLISECONDS);
                        if (this.EZpvd.isDebugEnabled()) {
                            if (j > 0) {
                                str = "for " + j + " " + timeUnit;
                            } else {
                                str = "indefinitely";
                            }
                            this.EZpvd.debug("Connection can be kept alive " + str);
                        }
                    }
                } finally {
                    c59734zmd.AkhnZx();
                    this.KWHzl = null;
                    if (this.OLrzqt.OLrzqt()) {
                        this.OLrzqt = null;
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC59551zjF
    public void EZpvd() {
        synchronized (this) {
            this.djBIcL = true;
            try {
                C59676zlY c59676zlY = this.OLrzqt;
                if (c59676zlY != null) {
                    c59676zlY.AEQbTJ();
                }
            } finally {
                this.OLrzqt = null;
                this.KWHzl = null;
            }
        }
    }
}
