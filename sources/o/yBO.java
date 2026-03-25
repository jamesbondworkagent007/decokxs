package o;

/* JADX INFO: loaded from: classes17.dex */
public final class yBO<T> {
    public final long KWHzl;
    public final java.util.concurrent.TimeUnit OLrzqt;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long KWHzl() {
        return this.KWHzl;
    }

    public yBO(T t, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.copydefault = t;
        this.KWHzl = j;
        this.OLrzqt = (java.util.concurrent.TimeUnit) C58297yyd.AEQbTJ(timeUnit, "unit is null");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yBO) {
            yBO ybo = (yBO) obj;
            if (C58297yyd.AEQbTJ(this.copydefault, ybo.copydefault) && this.KWHzl == ybo.KWHzl && C58297yyd.AEQbTJ(this.OLrzqt, ybo.OLrzqt)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.copydefault;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.KWHzl;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.OLrzqt.hashCode();
    }

    public java.lang.String toString() {
        return "Timed[time=" + this.KWHzl + ", unit=" + this.OLrzqt + ", value=" + this.copydefault + "]";
    }
}
