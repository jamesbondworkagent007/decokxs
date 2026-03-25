package o;

import io.reactivex.internal.operators.flowable.FlowableSingle;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yyY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58292yyY<T> extends AbstractC58260yxt<T> implements InterfaceC58295yyb<T> {
    public final T EZpvd;
    public final AbstractC58185ywX<T> copydefault;

    public C58292yyY(AbstractC58185ywX<T> abstractC58185ywX, T t) {
        this.copydefault = abstractC58185ywX;
        this.EZpvd = t;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.copydefault.copydefault(new TaskDescription(interfaceC58258yxr, this.EZpvd));
    }

    @Override // o.InterfaceC58295yyb
    public AbstractC58185ywX<T> OLrzqt() {
        return yBG.AEQbTJ(new FlowableSingle(this.copydefault, this.EZpvd, true));
    }

    /* JADX INFO: renamed from: o.yyY$TaskDescription */
    public static final class TaskDescription<T> implements InterfaceC58186ywY<T>, InterfaceC58217yxC {
        public final InterfaceC58258yxr<? super T> AEQbTJ;
        public T EZpvd;
        public boolean KWHzl;
        public final T OLrzqt;
        public InterfaceC60094zvb copydefault;

        public TaskDescription(InterfaceC58258yxr<? super T> interfaceC58258yxr, T t) {
            this.AEQbTJ = interfaceC58258yxr;
            this.OLrzqt = t;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.copydefault, interfaceC60094zvb)) {
                this.copydefault = interfaceC60094zvb;
                this.AEQbTJ.onSubscribe(this);
                interfaceC60094zvb.request(Long.MAX_VALUE);
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (this.KWHzl) {
                return;
            }
            if (this.EZpvd == null) {
                this.EZpvd = t;
                return;
            }
            this.KWHzl = true;
            this.copydefault.cancel();
            this.copydefault = SubscriptionHelper.CANCELLED;
            this.AEQbTJ.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.KWHzl) {
                yBG.copydefault(th);
                return;
            }
            this.KWHzl = true;
            this.copydefault = SubscriptionHelper.CANCELLED;
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.copydefault = SubscriptionHelper.CANCELLED;
            T t = this.EZpvd;
            this.EZpvd = null;
            if (t == null) {
                t = this.OLrzqt;
            }
            if (t != null) {
                this.AEQbTJ.onSuccess(t);
            } else {
                this.AEQbTJ.onError(new NoSuchElementException());
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault.cancel();
            this.copydefault = SubscriptionHelper.CANCELLED;
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault == SubscriptionHelper.CANCELLED;
        }
    }
}
