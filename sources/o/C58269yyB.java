package o;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yyB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58269yyB extends AbstractC58177ywP {
    public final java.lang.Throwable AEQbTJ;

    public C58269yyB(java.lang.Throwable th) {
        this.AEQbTJ = th;
    }

    @Override // o.AbstractC58177ywP
    public void KWHzl(InterfaceC58179ywR interfaceC58179ywR) {
        EmptyDisposable.error(this.AEQbTJ, interfaceC58179ywR);
    }
}
