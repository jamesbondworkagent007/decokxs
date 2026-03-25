package o;

import java.util.Date;

/* JADX INFO: renamed from: o.zlY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59676zlY extends AbstractC59780znW<C59570zjY, InterfaceC59569zjX> {
    public final C59631zkg EZpvd;
    public final InterfaceC59499ziG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59631zkg EZpvd() {
        return this.EZpvd;
    }

    public C59676zlY(InterfaceC59499ziG interfaceC59499ziG, java.lang.String str, C59570zjY c59570zjY, InterfaceC59569zjX interfaceC59569zjX, long j, java.util.concurrent.TimeUnit timeUnit) {
        super(str, c59570zjY, interfaceC59569zjX, j, timeUnit);
        this.OLrzqt = interfaceC59499ziG;
        this.EZpvd = new C59631zkg(c59570zjY);
    }

    @Override // o.AbstractC59780znW
    public boolean OLrzqt(long j) {
        boolean zOLrzqt = super.OLrzqt(j);
        if (zOLrzqt && this.OLrzqt.isDebugEnabled()) {
            this.OLrzqt.debug("Connection " + this + " expired @ " + new Date(djBIcL()));
        }
        return zOLrzqt;
    }

    public C59570zjY KWHzl() {
        return AhwBna();
    }

    public C59570zjY copydefault() {
        return this.EZpvd.djBIcL();
    }

    public boolean OLrzqt() {
        return !gEmmrt().KWHzl();
    }

    public void AEQbTJ() {
        try {
            gEmmrt().close();
        } catch (java.io.IOException e) {
            this.OLrzqt.debug("I/O error closing connection", e);
        }
    }
}
