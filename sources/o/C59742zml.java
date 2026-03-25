package o;

import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ConnectionPoolTimeoutException;

/* JADX INFO: renamed from: o.zml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59742zml implements InterfaceC59551zjF {
    public final InterfaceC59499ziG AEQbTJ;
    public final InterfaceC59555zjJ EZpvd;
    public final C59735zme KWHzl;
    public final AbstractC59738zmh OLrzqt;
    public final C59566zjU copydefault;
    public final C59636zkl djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59551zjF
    public C59636zkl AEQbTJ() {
        return this.djBIcL;
    }

    public C59742zml(C59636zkl c59636zkl) {
        this(c59636zkl, -1L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public C59742zml() {
        this(C59732zmb.EZpvd());
    }

    public C59742zml(C59636zkl c59636zkl, long j, java.util.concurrent.TimeUnit timeUnit) {
        this(c59636zkl, j, timeUnit, new C59566zjU());
    }

    public C59742zml(C59636zkl c59636zkl, long j, java.util.concurrent.TimeUnit timeUnit, C59566zjU c59566zjU) {
        C59851zoo.AEQbTJ(c59636zkl, "Scheme registry");
        this.AEQbTJ = LogFactory.copydefault(getClass());
        this.djBIcL = c59636zkl;
        this.copydefault = c59566zjU;
        this.EZpvd = OLrzqt(c59636zkl);
        C59735zme c59735zmeCopydefault = copydefault(j, timeUnit);
        this.KWHzl = c59735zmeCopydefault;
        this.OLrzqt = c59735zmeCopydefault;
    }

    @java.lang.Deprecated
    public C59742zml(InterfaceC59779znV interfaceC59779znV, C59636zkl c59636zkl) {
        C59851zoo.AEQbTJ(c59636zkl, "Scheme registry");
        this.AEQbTJ = LogFactory.copydefault(getClass());
        this.djBIcL = c59636zkl;
        this.copydefault = new C59566zjU();
        this.EZpvd = OLrzqt(c59636zkl);
        C59735zme c59735zme = (C59735zme) OLrzqt(interfaceC59779znV);
        this.KWHzl = c59735zme;
        this.OLrzqt = c59735zme;
    }

    public void finalize() throws java.lang.Throwable {
        try {
            EZpvd();
        } finally {
            super.finalize();
        }
    }

    @java.lang.Deprecated
    public AbstractC59738zmh OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        return new C59735zme(this.EZpvd, interfaceC59779znV);
    }

    public C59735zme copydefault(long j, java.util.concurrent.TimeUnit timeUnit) {
        return new C59735zme(this.EZpvd, this.copydefault, 20, j, timeUnit);
    }

    public InterfaceC59555zjJ OLrzqt(C59636zkl c59636zkl) {
        return new C59669zlR(c59636zkl);
    }

    @Override // o.InterfaceC59551zjF
    public InterfaceC59558zjM AEQbTJ(final C59570zjY c59570zjY, java.lang.Object obj) {
        final InterfaceC59744zmn interfaceC59744zmnAEQbTJ = this.KWHzl.AEQbTJ(c59570zjY, obj);
        return new InterfaceC59558zjM() { // from class: o.zml.2
            @Override // o.InterfaceC59558zjM
            public void OLrzqt() {
                interfaceC59744zmnAEQbTJ.OLrzqt();
            }

            @Override // o.InterfaceC59558zjM
            public InterfaceC59560zjO AEQbTJ(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, ConnectionPoolTimeoutException {
                C59851zoo.AEQbTJ(c59570zjY, "Route");
                if (C59742zml.this.AEQbTJ.isDebugEnabled()) {
                    C59742zml.this.AEQbTJ.debug("Get connection: " + c59570zjY + ", timeout = " + j);
                }
                return new C59736zmf(C59742zml.this, interfaceC59744zmnAEQbTJ.AEQbTJ(j, timeUnit));
            }
        };
    }

    @Override // o.InterfaceC59551zjF
    public void EZpvd(InterfaceC59560zjO interfaceC59560zjO, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean zValues;
        C59851zoo.copydefault(interfaceC59560zjO instanceof C59736zmf, "Connection class mismatch, connection not obtained from this manager");
        C59736zmf c59736zmf = (C59736zmf) interfaceC59560zjO;
        if (c59736zmf.fJNWhG() != null) {
            C59849zom.EZpvd(c59736zmf.AkhnZx() == this, "Connection not obtained from this manager");
        }
        synchronized (c59736zmf) {
            C59739zmi c59739zmi = (C59739zmi) c59736zmf.fJNWhG();
            try {
                if (c59739zmi == null) {
                    return;
                }
                try {
                    if (c59736zmf.KWHzl() && !c59736zmf.values()) {
                        c59736zmf.EZpvd();
                    }
                    zValues = c59736zmf.values();
                    if (this.AEQbTJ.isDebugEnabled()) {
                        if (zValues) {
                            this.AEQbTJ.debug("Released connection is reusable.");
                        } else {
                            this.AEQbTJ.debug("Released connection is not reusable.");
                        }
                    }
                    c59736zmf.DbNXlk();
                } catch (java.io.IOException e) {
                    if (this.AEQbTJ.isDebugEnabled()) {
                        this.AEQbTJ.debug("Exception shutting down released connection.", e);
                    }
                    zValues = c59736zmf.values();
                    if (this.AEQbTJ.isDebugEnabled()) {
                        if (zValues) {
                            this.AEQbTJ.debug("Released connection is reusable.");
                        } else {
                            this.AEQbTJ.debug("Released connection is not reusable.");
                        }
                    }
                    c59736zmf.DbNXlk();
                }
                this.KWHzl.KWHzl(c59739zmi, zValues, j, timeUnit);
            } catch (java.lang.Throwable th) {
                boolean zValues2 = c59736zmf.values();
                if (this.AEQbTJ.isDebugEnabled()) {
                    if (zValues2) {
                        this.AEQbTJ.debug("Released connection is reusable.");
                    } else {
                        this.AEQbTJ.debug("Released connection is not reusable.");
                    }
                }
                c59736zmf.DbNXlk();
                this.KWHzl.KWHzl(c59739zmi, zValues2, j, timeUnit);
                throw th;
            }
        }
    }

    @Override // o.InterfaceC59551zjF
    public void EZpvd() {
        this.AEQbTJ.debug("Shutting down");
        this.KWHzl.KWHzl();
    }
}
