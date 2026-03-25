package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.C56307yAn;

/* JADX INFO: renamed from: o.yAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56308yAo<T, R> extends AbstractC58260yxt<R> {
    public final InterfaceC58223yxI<R, ? super T, R> AEQbTJ;
    public final InterfaceC58255yxo<T> EZpvd;
    public final Callable<R> copydefault;

    public C56308yAo(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<R> callable, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        this.EZpvd = interfaceC58255yxo;
        this.copydefault = callable;
        this.AEQbTJ = interfaceC58223yxI;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super R> interfaceC58258yxr) {
        try {
            this.EZpvd.subscribe(new C56307yAn.ActionBar(interfaceC58258yxr, this.AEQbTJ, C58297yyd.AEQbTJ(this.copydefault.call(), "The seedSupplier returned a null value")));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58258yxr);
        }
    }
}
