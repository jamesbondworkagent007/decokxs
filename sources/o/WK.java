package o;

import o.WM;

/* JADX INFO: loaded from: classes21.dex */
public class WK<A extends WM, M> {
    public final A KWHzl;
    public final M copydefault;

    public WK(A a2, M m) {
        this.KWHzl = a2;
        this.copydefault = m;
    }

    public static <A extends WM, M> WK<A, M> KWHzl(A a2, M m) {
        return new WK<>(a2, m);
    }
}
