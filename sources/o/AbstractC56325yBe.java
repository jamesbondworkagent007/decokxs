package o;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: renamed from: o.yBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56325yBe<T, U, V> extends C56333yBm implements InterfaceC58186ywY<T>, InterfaceC56340yBt<U, V> {
    public volatile boolean AkhnZx;
    public final InterfaceC60097zve<? super V> DbNXlk;
    public final InterfaceC58299yyf<U> ejfBZ;
    public java.lang.Throwable fetchVPNInfo;
    public volatile boolean isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56340yBt
    public final boolean AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56340yBt
    public final java.lang.Throwable EZpvd() {
        return this.fetchVPNInfo;
    }

    @Override // o.InterfaceC56340yBt
    public boolean EZpvd(InterfaceC60097zve<? super V> interfaceC60097zve, U u) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56340yBt
    public final boolean KWHzl() {
        return this.isConnected;
    }

    public AbstractC56325yBe(InterfaceC60097zve<? super V> interfaceC60097zve, InterfaceC58299yyf<U> interfaceC58299yyf) {
        this.DbNXlk = interfaceC60097zve;
        this.ejfBZ = interfaceC58299yyf;
    }

    public final boolean OLrzqt() {
        return this.fARcdN.getAndIncrement() == 0;
    }

    public final boolean valueOf() {
        return this.fARcdN.get() == 0 && this.fARcdN.compareAndSet(0, 1);
    }

    public final void AEQbTJ(U u, boolean z, InterfaceC58217yxC interfaceC58217yxC) {
        InterfaceC60097zve<? super V> interfaceC60097zve = this.DbNXlk;
        InterfaceC58299yyf<U> interfaceC58299yyf = this.ejfBZ;
        if (valueOf()) {
            long j = this.AuCTel.get();
            if (j != 0) {
                if (EZpvd(interfaceC60097zve, u) && j != Long.MAX_VALUE) {
                    OLrzqt(1L);
                }
                if (EZpvd(-1) == 0) {
                    return;
                }
            } else {
                interfaceC58217yxC.dispose();
                interfaceC60097zve.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            interfaceC58299yyf.offer(u);
            if (!OLrzqt()) {
                return;
            }
        }
        yBB.KWHzl(interfaceC58299yyf, interfaceC60097zve, z, interfaceC58217yxC, this);
    }

    public final void KWHzl(U u, boolean z, InterfaceC58217yxC interfaceC58217yxC) {
        InterfaceC60097zve<? super V> interfaceC60097zve = this.DbNXlk;
        InterfaceC58299yyf<U> interfaceC58299yyf = this.ejfBZ;
        if (valueOf()) {
            long j = this.AuCTel.get();
            if (j != 0) {
                if (interfaceC58299yyf.isEmpty()) {
                    if (EZpvd(interfaceC60097zve, u) && j != Long.MAX_VALUE) {
                        OLrzqt(1L);
                    }
                    if (EZpvd(-1) == 0) {
                        return;
                    }
                } else {
                    interfaceC58299yyf.offer(u);
                }
            } else {
                this.isConnected = true;
                interfaceC58217yxC.dispose();
                interfaceC60097zve.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            interfaceC58299yyf.offer(u);
            if (!OLrzqt()) {
                return;
            }
        }
        yBB.KWHzl(interfaceC58299yyf, interfaceC60097zve, z, interfaceC58217yxC, this);
    }

    @Override // o.InterfaceC56340yBt
    public final int EZpvd(int i) {
        return this.fARcdN.addAndGet(i);
    }

    @Override // o.InterfaceC56340yBt
    public final long gEmmrt() {
        return this.AuCTel.get();
    }

    @Override // o.InterfaceC56340yBt
    public final long OLrzqt(long j) {
        return this.AuCTel.addAndGet(-j);
    }

    public final void copydefault(long j) {
        if (SubscriptionHelper.validate(j)) {
            C56334yBn.EZpvd(this.AuCTel, j);
        }
    }
}
