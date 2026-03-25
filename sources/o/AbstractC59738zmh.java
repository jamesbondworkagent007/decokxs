package o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.zmh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59738zmh {
    public volatile boolean AEQbTJ;
    public final InterfaceC59499ziG copydefault = LogFactory.copydefault(getClass());
    public java.util.Set<C59739zmi> EZpvd = new java.util.HashSet();
    public C59672zlU OLrzqt = new C59672zlU();
    public final Lock KWHzl = new ReentrantLock();

    public void KWHzl() {
        Lock lock;
        this.KWHzl.lock();
        try {
            if (this.AEQbTJ) {
                lock = this.KWHzl;
            } else {
                java.util.Iterator<C59739zmi> it = this.EZpvd.iterator();
                while (it.hasNext()) {
                    C59739zmi next = it.next();
                    it.remove();
                    EZpvd(next.AEQbTJ());
                }
                this.OLrzqt.KWHzl();
                this.AEQbTJ = true;
                lock = this.KWHzl;
            }
            lock.unlock();
        } catch (java.lang.Throwable th) {
            this.KWHzl.unlock();
            throw th;
        }
    }

    public void EZpvd(InterfaceC59569zjX interfaceC59569zjX) {
        if (interfaceC59569zjX != null) {
            try {
                interfaceC59569zjX.close();
            } catch (java.io.IOException e) {
                this.copydefault.debug("I/O error closing connection", e);
            }
        }
    }
}
