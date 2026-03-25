package o;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.yzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58355yzi<T> implements java.lang.Iterable<T> {
    public final InterfaceC58255yxo<T> copydefault;

    public C58355yzi(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.copydefault = interfaceC58255yxo;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new ActionBar(this.copydefault, new Application());
    }

    /* JADX INFO: renamed from: o.yzi$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T> implements java.util.Iterator<T> {
        public T AEQbTJ;
        public boolean AYXKKw;
        public java.lang.Throwable KWHzl;
        public final InterfaceC58255yxo<T> copydefault;
        public final Application<T> djBIcL;
        public boolean OLrzqt = true;
        public boolean EZpvd = true;

        public ActionBar(InterfaceC58255yxo<T> interfaceC58255yxo, Application<T> application) {
            this.copydefault = interfaceC58255yxo;
            this.djBIcL = application;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            java.lang.Throwable th = this.KWHzl;
            if (th != null) {
                throw ExceptionHelper.AEQbTJ(th);
            }
            if (this.OLrzqt) {
                return !this.EZpvd || EZpvd();
            }
            return false;
        }

        public final boolean EZpvd() {
            if (!this.AYXKKw) {
                this.AYXKKw = true;
                this.djBIcL.EZpvd();
                new C56298yAe(this.copydefault).subscribe(this.djBIcL);
            }
            try {
                C58248yxh<T> c58248yxhOLrzqt = this.djBIcL.OLrzqt();
                if (c58248yxhOLrzqt.djBIcL()) {
                    this.EZpvd = false;
                    this.AEQbTJ = c58248yxhOLrzqt.copydefault();
                    return true;
                }
                this.OLrzqt = false;
                if (c58248yxhOLrzqt.KWHzl()) {
                    return false;
                }
                java.lang.Throwable thOLrzqt = c58248yxhOLrzqt.OLrzqt();
                this.KWHzl = thOLrzqt;
                throw ExceptionHelper.AEQbTJ(thOLrzqt);
            } catch (java.lang.InterruptedException e) {
                this.djBIcL.dispose();
                this.KWHzl = e;
                throw ExceptionHelper.AEQbTJ(e);
            }
        }

        @Override // java.util.Iterator
        public T next() {
            java.lang.Throwable th = this.KWHzl;
            if (th != null) {
                throw ExceptionHelper.AEQbTJ(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.EZpvd = true;
            return this.AEQbTJ;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: renamed from: o.yzi$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application<T> extends AbstractC56345yBy<C58248yxh<T>> {
        public final BlockingQueue<C58248yxh<T>> copydefault = new ArrayBlockingQueue(1);
        public final AtomicInteger OLrzqt = new AtomicInteger();

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            yBG.copydefault(th);
        }

        /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
        @Override // o.InterfaceC58256yxp
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onNext(C58248yxh<T> c58248yxh) {
            if (this.OLrzqt.getAndSet(0) == 1 || !c58248yxh.djBIcL()) {
                while (!this.copydefault.offer(c58248yxh)) {
                    C58248yxh<T> c58248yxhPoll = this.copydefault.poll();
                    if (c58248yxhPoll != null && !c58248yxhPoll.djBIcL()) {
                        c58248yxh = c58248yxhPoll;
                    }
                }
            }
        }

        public C58248yxh<T> OLrzqt() throws java.lang.InterruptedException {
            EZpvd();
            C56336yBp.EZpvd();
            return this.copydefault.take();
        }

        public void EZpvd() {
            this.OLrzqt.set(1);
        }
    }
}
