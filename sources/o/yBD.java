package o;

import io.reactivex.internal.subscriptions.EmptySubscription;

/* JADX INFO: loaded from: classes24.dex */
public abstract class yBD<T> {
    public abstract int KWHzl();

    public abstract void copydefault(InterfaceC60097zve<? super T>[] interfaceC60097zveArr);

    public final boolean OLrzqt(InterfaceC60097zve<?>[] interfaceC60097zveArr) {
        int iKWHzl = KWHzl();
        if (interfaceC60097zveArr.length == iKWHzl) {
            return true;
        }
        java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("parallelism = " + iKWHzl + ", subscribers = " + interfaceC60097zveArr.length);
        int length = interfaceC60097zveArr.length;
        for (int i = 0; i < length; i++) {
            EmptySubscription.error(illegalArgumentException, interfaceC60097zveArr[i]);
        }
        return false;
    }
}
