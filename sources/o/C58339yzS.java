package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: renamed from: o.yzS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58339yzS<T> extends AbstractC58247yxg<T> {
    public final InterfaceC60096zvd<? extends T> AEQbTJ;

    public C58339yzS(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        this.AEQbTJ = interfaceC60096zvd;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.AEQbTJ.subscribe(new TaskDescription(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yzS$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T> implements InterfaceC58186ywY<T>, InterfaceC58217yxC {
        public InterfaceC60094zvb EZpvd;
        public final InterfaceC58256yxp<? super T> copydefault;

        public TaskDescription(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
            this.copydefault = interfaceC58256yxp;
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            this.copydefault.onComplete();
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            this.copydefault.onError(th);
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            this.copydefault.onNext(t);
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.EZpvd, interfaceC60094zvb)) {
                this.EZpvd = interfaceC60094zvb;
                this.copydefault.onSubscribe(this);
                interfaceC60094zvb.request(Long.MAX_VALUE);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.EZpvd.cancel();
            this.EZpvd = SubscriptionHelper.CANCELLED;
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd == SubscriptionHelper.CANCELLED;
        }
    }
}
