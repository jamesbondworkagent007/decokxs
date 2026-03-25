package o;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yzl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58358yzl<T> implements java.lang.Iterable<T> {
    public final T AEQbTJ;
    public final InterfaceC58255yxo<T> copydefault;

    public C58358yzl(InterfaceC58255yxo<T> interfaceC58255yxo, T t) {
        this.copydefault = interfaceC58255yxo;
        this.AEQbTJ = t;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        StateListAnimator stateListAnimator = new StateListAnimator(this.AEQbTJ);
        this.copydefault.subscribe(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.yzl$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T> extends AbstractC56344yBx<T> {
        public volatile java.lang.Object KWHzl;

        public StateListAnimator(T t) {
            this.KWHzl = NotificationLite.next(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.KWHzl = NotificationLite.complete();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.KWHzl = NotificationLite.error(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.KWHzl = NotificationLite.next(t);
        }

        public StateListAnimator<T>.Activity AEQbTJ() {
            return new Activity();
        }

        /* JADX INFO: renamed from: o.yzl$StateListAnimator$Activity */
        public final class Activity implements java.util.Iterator<T> {
            public java.lang.Object EZpvd;

            public Activity() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.EZpvd = StateListAnimator.this.KWHzl;
                return !NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.EZpvd == null) {
                        this.EZpvd = StateListAnimator.this.KWHzl;
                    }
                    if (NotificationLite.isComplete(this.EZpvd)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.EZpvd)) {
                        throw ExceptionHelper.AEQbTJ(NotificationLite.getError(this.EZpvd));
                    }
                    return (T) NotificationLite.getValue(this.EZpvd);
                } finally {
                    this.EZpvd = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
