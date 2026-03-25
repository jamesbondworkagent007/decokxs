package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58315yyv<T> implements InterfaceC58258yxr<T> {
    public final AtomicReference<InterfaceC58217yxC> AEQbTJ;
    public final InterfaceC58258yxr<? super T> copydefault;

    public C58315yyv(AtomicReference<InterfaceC58217yxC> atomicReference, InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.AEQbTJ = atomicReference;
        this.copydefault = interfaceC58258yxr;
    }

    @Override // o.InterfaceC58258yxr
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        DisposableHelper.replace(this.AEQbTJ, interfaceC58217yxC);
    }

    @Override // o.InterfaceC58258yxr
    public void onSuccess(T t) {
        this.copydefault.onSuccess(t);
    }

    @Override // o.InterfaceC58258yxr
    public void onError(java.lang.Throwable th) {
        this.copydefault.onError(th);
    }
}
