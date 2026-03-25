package o;

/* JADX INFO: renamed from: o.zcK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59185zcK<T> {
    public final T AEQbTJ;
    public final java.lang.Thread OLrzqt = java.lang.Thread.currentThread();

    public C59185zcK(T t) {
        this.AEQbTJ = t;
    }

    public boolean copydefault() {
        return this.OLrzqt == java.lang.Thread.currentThread();
    }

    public T AEQbTJ() {
        if (copydefault()) {
            return this.AEQbTJ;
        }
        throw new java.lang.IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
