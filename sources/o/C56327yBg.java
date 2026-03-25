package o;

/* JADX INFO: renamed from: o.yBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56327yBg<T> extends AbstractC56328yBh<T> {
    @Override // o.InterfaceC60097zve
    public void onNext(T t) {
        if (this.EZpvd == null) {
            this.EZpvd = t;
            this.OLrzqt.cancel();
            countDown();
        }
    }

    @Override // o.InterfaceC60097zve
    public void onError(java.lang.Throwable th) {
        if (this.EZpvd == null) {
            this.AEQbTJ = th;
        } else {
            yBG.copydefault(th);
        }
        countDown();
    }
}
