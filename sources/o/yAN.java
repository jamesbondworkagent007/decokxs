package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class yAN<T> extends AbstractC58260yxt<T> {
    public final InterfaceC60096zvd<? extends T> KWHzl;

    public yAN(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        this.KWHzl = interfaceC60096zvd;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.KWHzl.subscribe(new Activity(interfaceC58258yxr));
    }

    public static final class Activity<T> implements InterfaceC58186ywY<T>, InterfaceC58217yxC {
        public final InterfaceC58258yxr<? super T> AEQbTJ;
        public volatile boolean EZpvd;
        public InterfaceC60094zvb KWHzl;
        public boolean OLrzqt;
        public T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd;
        }

        public Activity(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
            this.AEQbTJ = interfaceC58258yxr;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.KWHzl, interfaceC60094zvb)) {
                this.KWHzl = interfaceC60094zvb;
                this.AEQbTJ.onSubscribe(this);
                interfaceC60094zvb.request(Long.MAX_VALUE);
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (this.OLrzqt) {
                return;
            }
            if (this.copydefault == null) {
                this.copydefault = t;
                return;
            }
            this.KWHzl.cancel();
            this.OLrzqt = true;
            this.copydefault = null;
            this.AEQbTJ.onError(new java.lang.IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.OLrzqt) {
                yBG.copydefault(th);
                return;
            }
            this.OLrzqt = true;
            this.copydefault = null;
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            if (this.OLrzqt) {
                return;
            }
            this.OLrzqt = true;
            T t = this.copydefault;
            this.copydefault = null;
            if (t == null) {
                this.AEQbTJ.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.AEQbTJ.onSuccess(t);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.EZpvd = true;
            this.KWHzl.cancel();
        }
    }
}
