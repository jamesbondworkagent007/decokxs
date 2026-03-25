package o;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58356yzj<T> implements java.lang.Iterable<T> {
    public final InterfaceC58255yxo<T> KWHzl;

    public C58356yzj(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.KWHzl = interfaceC58255yxo;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        ActionBar actionBar = new ActionBar();
        AbstractC58247yxg.wrap(this.KWHzl).materialize().subscribe(actionBar);
        return actionBar;
    }

    /* JADX INFO: renamed from: o.yzj$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T> extends AbstractC56345yBy<C58248yxh<T>> implements java.util.Iterator<T> {
        public final Semaphore EZpvd = new Semaphore(0);
        public final AtomicReference<C58248yxh<T>> OLrzqt = new AtomicReference<>();
        public C58248yxh<T> copydefault;

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
        }

        /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
        @Override // o.InterfaceC58256yxp
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onNext(C58248yxh<T> c58248yxh) {
            if (this.OLrzqt.getAndSet(c58248yxh) == null) {
                this.EZpvd.release();
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            yBG.copydefault(th);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C58248yxh<T> c58248yxh = this.copydefault;
            if (c58248yxh != null && c58248yxh.EZpvd()) {
                throw ExceptionHelper.AEQbTJ(this.copydefault.OLrzqt());
            }
            if (this.copydefault == null) {
                try {
                    C56336yBp.EZpvd();
                    this.EZpvd.acquire();
                    C58248yxh<T> andSet = this.OLrzqt.getAndSet(null);
                    this.copydefault = andSet;
                    if (andSet.EZpvd()) {
                        throw ExceptionHelper.AEQbTJ(andSet.OLrzqt());
                    }
                } catch (java.lang.InterruptedException e) {
                    dispose();
                    this.copydefault = C58248yxh.OLrzqt(e);
                    throw ExceptionHelper.AEQbTJ(e);
                }
            }
            return this.copydefault.djBIcL();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tCopydefault = this.copydefault.copydefault();
                this.copydefault = null;
                return tCopydefault;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Read-only iterator.");
        }
    }
}
