package o;

/* JADX INFO: renamed from: o.yyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58303yyj<T> extends AbstractC58304yyk<T> {
    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        if (this.OLrzqt == null) {
            this.OLrzqt = t;
            this.EZpvd.dispose();
            countDown();
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        if (this.OLrzqt == null) {
            this.AEQbTJ = th;
        }
        countDown();
    }
}
