package o;

import com.google.common.net.HttpHeaders;

/* JADX INFO: renamed from: o.znW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59780znW<T, C> {
    public long AEQbTJ;
    public volatile java.lang.Object AYXKKw;
    public final java.lang.String AhwBna;
    public final long KWHzl;
    public final C copydefault;
    public final T djBIcL;
    public long gEmmrt;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.Object obj) {
        this.AYXKKw = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C gEmmrt() {
        return this.copydefault;
    }

    public AbstractC59780znW(java.lang.String str, T t, C c, long j, java.util.concurrent.TimeUnit timeUnit) {
        C59851zoo.AEQbTJ(t, "Route");
        C59851zoo.AEQbTJ(c, HttpHeaders.CONNECTION);
        C59851zoo.AEQbTJ(timeUnit, "Time unit");
        this.AhwBna = str;
        this.djBIcL = t;
        this.copydefault = c;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.KWHzl = jCurrentTimeMillis;
        this.gEmmrt = jCurrentTimeMillis;
        long j2 = Long.MAX_VALUE;
        if (j > 0) {
            long millis = jCurrentTimeMillis + timeUnit.toMillis(j);
            if (millis > 0) {
                j2 = millis;
            }
        }
        this.valueOf = j2;
        this.AEQbTJ = this.valueOf;
    }

    public long djBIcL() {
        long j;
        synchronized (this) {
            j = this.AEQbTJ;
        }
        return j;
    }

    public void KWHzl(long j, java.util.concurrent.TimeUnit timeUnit) {
        synchronized (this) {
            C59851zoo.AEQbTJ(timeUnit, "Time unit");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.gEmmrt = jCurrentTimeMillis;
            this.AEQbTJ = java.lang.Math.min(j > 0 ? jCurrentTimeMillis + timeUnit.toMillis(j) : Long.MAX_VALUE, this.valueOf);
        }
    }

    public boolean OLrzqt(long j) {
        boolean z;
        synchronized (this) {
            z = j >= this.AEQbTJ;
        }
        return z;
    }

    public java.lang.String toString() {
        return "[id:" + this.AhwBna + "][route:" + this.djBIcL + "][state:" + this.AYXKKw + "]";
    }
}
