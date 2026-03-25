package o;

/* JADX INFO: renamed from: o.yyr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58311yyr<T> extends AbstractC58304yyk<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        this.OLrzqt = t;
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        this.OLrzqt = null;
        this.AEQbTJ = th;
        countDown();
    }
}
