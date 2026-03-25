package o;

/* JADX INFO: loaded from: classes2.dex */
public class PV<T> implements OC<T> {
    public final T KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OC
    public final T AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.OC
    public final int EZpvd() {
        return 1;
    }

    @Override // o.OC
    public void djBIcL() {
    }

    public PV(@androidx.annotation.NonNull T t) {
        this.KWHzl = (T) SE.OLrzqt(t);
    }

    @Override // o.OC
    public java.lang.Class<T> copydefault() {
        return (java.lang.Class<T>) this.KWHzl.getClass();
    }
}
