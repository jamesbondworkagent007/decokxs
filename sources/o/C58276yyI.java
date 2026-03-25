package o;

import io.reactivex.internal.operators.flowable.FlowableElementAt;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yyI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58276yyI<T> extends AbstractC58260yxt<T> implements InterfaceC58295yyb<T> {
    public final long KWHzl;
    public final T OLrzqt;
    public final AbstractC58185ywX<T> copydefault;

    public C58276yyI(AbstractC58185ywX<T> abstractC58185ywX, long j, T t) {
        this.copydefault = abstractC58185ywX;
        this.KWHzl = j;
        this.OLrzqt = t;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        this.copydefault.copydefault(new StateListAnimator(interfaceC58258yxr, this.KWHzl, this.OLrzqt));
    }

    @Override // o.InterfaceC58295yyb
    public AbstractC58185ywX<T> OLrzqt() {
        return yBG.AEQbTJ(new FlowableElementAt(this.copydefault, this.KWHzl, this.OLrzqt, true));
    }

    /* JADX INFO: renamed from: o.yyI$StateListAnimator */
    public static final class StateListAnimator<T> implements InterfaceC58186ywY<T>, InterfaceC58217yxC {
        public boolean AEQbTJ;
        public final InterfaceC58258yxr<? super T> EZpvd;
        public long KWHzl;
        public final long OLrzqt;
        public final T copydefault;
        public InterfaceC60094zvb valueOf;

        public StateListAnimator(InterfaceC58258yxr<? super T> interfaceC58258yxr, long j, T t) {
            this.EZpvd = interfaceC58258yxr;
            this.OLrzqt = j;
            this.copydefault = t;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            if (SubscriptionHelper.validate(this.valueOf, interfaceC60094zvb)) {
                this.valueOf = interfaceC60094zvb;
                this.EZpvd.onSubscribe(this);
                interfaceC60094zvb.request(Long.MAX_VALUE);
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            if (this.AEQbTJ) {
                return;
            }
            long j = this.KWHzl;
            if (j != this.OLrzqt) {
                this.KWHzl = j + 1;
                return;
            }
            this.AEQbTJ = true;
            this.valueOf.cancel();
            this.valueOf = SubscriptionHelper.CANCELLED;
            this.EZpvd.onSuccess(t);
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.AEQbTJ) {
                yBG.copydefault(th);
                return;
            }
            this.AEQbTJ = true;
            this.valueOf = SubscriptionHelper.CANCELLED;
            this.EZpvd.onError(th);
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            this.valueOf = SubscriptionHelper.CANCELLED;
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            T t = this.copydefault;
            if (t != null) {
                this.EZpvd.onSuccess(t);
            } else {
                this.EZpvd.onError(new NoSuchElementException());
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.valueOf.cancel();
            this.valueOf = SubscriptionHelper.CANCELLED;
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.valueOf == SubscriptionHelper.CANCELLED;
        }
    }
}
