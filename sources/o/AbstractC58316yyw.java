package o;

/* JADX INFO: renamed from: o.yyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC58316yyw<T, U, V> extends C58317yyx implements InterfaceC58256yxp<T>, InterfaceC56342yBv<U, V> {
    public java.lang.Throwable AEQbTJ;
    public final InterfaceC58299yyf<U> EZpvd;
    public volatile boolean KWHzl;
    public final InterfaceC58256yxp<? super V> OLrzqt;
    public volatile boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56342yBv
    public final java.lang.Throwable AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56342yBv
    public final boolean EZpvd() {
        return this.copydefault;
    }

    public void copydefault(InterfaceC58256yxp<? super V> interfaceC58256yxp, U u) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56342yBv
    public final boolean copydefault() {
        return this.KWHzl;
    }

    public AbstractC58316yyw(InterfaceC58256yxp<? super V> interfaceC58256yxp, InterfaceC58299yyf<U> interfaceC58299yyf) {
        this.OLrzqt = interfaceC58256yxp;
        this.EZpvd = interfaceC58299yyf;
    }

    public final boolean KWHzl() {
        return this.djBIcL.getAndIncrement() == 0;
    }

    public final boolean OLrzqt() {
        return this.djBIcL.get() == 0 && this.djBIcL.compareAndSet(0, 1);
    }

    public final void KWHzl(U u, boolean z, InterfaceC58217yxC interfaceC58217yxC) {
        InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
        InterfaceC58299yyf<U> interfaceC58299yyf = this.EZpvd;
        if (this.djBIcL.get() == 0 && this.djBIcL.compareAndSet(0, 1)) {
            copydefault(interfaceC58256yxp, u);
            if (AEQbTJ(-1) == 0) {
                return;
            }
        } else {
            interfaceC58299yyf.offer(u);
            if (!KWHzl()) {
                return;
            }
        }
        yBB.copydefault(interfaceC58299yyf, interfaceC58256yxp, z, interfaceC58217yxC, this);
    }

    public final void copydefault(U u, boolean z, InterfaceC58217yxC interfaceC58217yxC) {
        InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
        InterfaceC58299yyf<U> interfaceC58299yyf = this.EZpvd;
        if (this.djBIcL.get() == 0 && this.djBIcL.compareAndSet(0, 1)) {
            if (interfaceC58299yyf.isEmpty()) {
                copydefault(interfaceC58256yxp, u);
                if (AEQbTJ(-1) == 0) {
                    return;
                }
            } else {
                interfaceC58299yyf.offer(u);
            }
        } else {
            interfaceC58299yyf.offer(u);
            if (!KWHzl()) {
                return;
            }
        }
        yBB.copydefault(interfaceC58299yyf, interfaceC58256yxp, z, interfaceC58217yxC, this);
    }

    @Override // o.InterfaceC56342yBv
    public final int AEQbTJ(int i) {
        return this.djBIcL.addAndGet(i);
    }
}
