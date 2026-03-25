package o;

/* JADX INFO: renamed from: o.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5620Ys<T> {
    public C5620Ys<T> KWHzl;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5620Ys<T> copydefault() {
        return this.KWHzl;
    }

    public C5620Ys(T t, C5620Ys<T> c5620Ys) {
        this.copydefault = t;
        this.KWHzl = c5620Ys;
    }

    public void AEQbTJ(C5620Ys<T> c5620Ys) {
        if (this.KWHzl != null) {
            throw new java.lang.IllegalStateException();
        }
        this.KWHzl = c5620Ys;
    }

    public static <ST> boolean AEQbTJ(C5620Ys<ST> c5620Ys, ST st) {
        while (c5620Ys != null) {
            if (c5620Ys.KWHzl() == st) {
                return true;
            }
            c5620Ys = c5620Ys.copydefault();
        }
        return false;
    }
}
