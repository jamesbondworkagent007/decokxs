package o;

/* JADX INFO: renamed from: o.zmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59739zmi extends AbstractC59662zlK {
    public long AYXKKw;
    public final long AhwBna;
    public final long gEmmrt;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59569zjX AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59570zjY KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault(long j) {
        return j >= this.valueOf;
    }

    public C59739zmi(InterfaceC59555zjJ interfaceC59555zjJ, C59570zjY c59570zjY, long j, java.util.concurrent.TimeUnit timeUnit) {
        super(interfaceC59555zjJ, c59570zjY);
        C59851zoo.AEQbTJ(c59570zjY, "HTTP route");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.gEmmrt = jCurrentTimeMillis;
        this.AhwBna = j > 0 ? jCurrentTimeMillis + timeUnit.toMillis(j) : Long.MAX_VALUE;
        this.valueOf = this.AhwBna;
    }

    @Override // o.AbstractC59662zlK
    public void copydefault() {
        super.copydefault();
    }

    public void EZpvd(long j, java.util.concurrent.TimeUnit timeUnit) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.AYXKKw = jCurrentTimeMillis;
        this.valueOf = java.lang.Math.min(this.AhwBna, j > 0 ? jCurrentTimeMillis + timeUnit.toMillis(j) : Long.MAX_VALUE);
    }
}
