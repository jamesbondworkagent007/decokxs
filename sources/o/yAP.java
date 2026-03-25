package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.single.SingleZipArray;
import java.util.NoSuchElementException;
import o.yAK;

/* JADX INFO: loaded from: classes13.dex */
public final class yAP<T, R> extends AbstractC58260yxt<R> {
    public final java.lang.Iterable<? extends InterfaceC58261yxu<? extends T>> EZpvd;
    public final InterfaceC58229yxO<? super java.lang.Object[], ? extends R> OLrzqt;

    public yAP(java.lang.Iterable<? extends InterfaceC58261yxu<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        this.EZpvd = iterable;
        this.OLrzqt = interfaceC58229yxO;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super R> interfaceC58258yxr) {
        InterfaceC58261yxu[] interfaceC58261yxuArr = new InterfaceC58261yxu[8];
        try {
            int i = 0;
            for (InterfaceC58261yxu<? extends T> interfaceC58261yxu : this.EZpvd) {
                if (interfaceC58261yxu == null) {
                    EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), interfaceC58258yxr);
                    return;
                }
                if (i == interfaceC58261yxuArr.length) {
                    interfaceC58261yxuArr = (InterfaceC58261yxu[]) java.util.Arrays.copyOf(interfaceC58261yxuArr, (i >> 2) + i);
                }
                interfaceC58261yxuArr[i] = interfaceC58261yxu;
                i++;
            }
            if (i == 0) {
                EmptyDisposable.error(new NoSuchElementException(), interfaceC58258yxr);
                return;
            }
            if (i == 1) {
                interfaceC58261yxuArr[0].copydefault(new yAK.StateListAnimator(interfaceC58258yxr, new Activity()));
                return;
            }
            SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator(interfaceC58258yxr, i, this.OLrzqt);
            interfaceC58258yxr.onSubscribe(zipCoordinator);
            for (int i2 = 0; i2 < i && !zipCoordinator.isDisposed(); i2++) {
                interfaceC58261yxuArr[i2].copydefault(zipCoordinator.observers[i2]);
            }
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58258yxr);
        }
    }

    public final class Activity implements InterfaceC58229yxO<T, R> {
        public Activity() {
        }

        /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: ? super java.lang.Object[] */
        @Override // o.InterfaceC58229yxO
        public R apply(T t) throws java.lang.Exception {
            return (R) C58297yyd.AEQbTJ(yAP.this.OLrzqt.apply(new java.lang.Object[]{t}), "The zipper returned a null value");
        }
    }
}
