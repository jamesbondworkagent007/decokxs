package o;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: renamed from: o.yyK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58278yyK<T> extends AbstractC58318yyy<T, T> {
    public final InterfaceC58222yxH AEQbTJ;
    public final InterfaceC58236yxV EZpvd;
    public final InterfaceC58227yxM<? super InterfaceC60094zvb> OLrzqt;

    public C58278yyK(AbstractC58185ywX<T> abstractC58185ywX, InterfaceC58227yxM<? super InterfaceC60094zvb> interfaceC58227yxM, InterfaceC58236yxV interfaceC58236yxV, InterfaceC58222yxH interfaceC58222yxH) {
        super(abstractC58185ywX);
        this.OLrzqt = interfaceC58227yxM;
        this.EZpvd = interfaceC58236yxV;
        this.AEQbTJ = interfaceC58222yxH;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        this.KWHzl.copydefault(new Activity(interfaceC60097zve, this.OLrzqt, this.EZpvd, this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yyK$Activity */
    public static final class Activity<T> implements InterfaceC58186ywY<T>, InterfaceC60094zvb {
        public final InterfaceC58227yxM<? super InterfaceC60094zvb> AEQbTJ;
        public InterfaceC60094zvb EZpvd;
        public final InterfaceC60097zve<? super T> KWHzl;
        public final InterfaceC58222yxH OLrzqt;
        public final InterfaceC58236yxV copydefault;

        public Activity(InterfaceC60097zve<? super T> interfaceC60097zve, InterfaceC58227yxM<? super InterfaceC60094zvb> interfaceC58227yxM, InterfaceC58236yxV interfaceC58236yxV, InterfaceC58222yxH interfaceC58222yxH) {
            this.KWHzl = interfaceC60097zve;
            this.AEQbTJ = interfaceC58227yxM;
            this.OLrzqt = interfaceC58222yxH;
            this.copydefault = interfaceC58236yxV;
        }

        @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
        public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
            try {
                this.AEQbTJ.accept(interfaceC60094zvb);
                if (SubscriptionHelper.validate(this.EZpvd, interfaceC60094zvb)) {
                    this.EZpvd = interfaceC60094zvb;
                    this.KWHzl.onSubscribe(this);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                interfaceC60094zvb.cancel();
                this.EZpvd = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.KWHzl);
            }
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            this.KWHzl.onNext(t);
        }

        @Override // o.InterfaceC60097zve
        public void onError(java.lang.Throwable th) {
            if (this.EZpvd != SubscriptionHelper.CANCELLED) {
                this.KWHzl.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            if (this.EZpvd != SubscriptionHelper.CANCELLED) {
                this.KWHzl.onComplete();
            }
        }

        @Override // o.InterfaceC60094zvb
        public void request(long j) {
            try {
                this.copydefault.AEQbTJ(j);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(th);
            }
            this.EZpvd.request(j);
        }

        @Override // o.InterfaceC60094zvb
        public void cancel() {
            InterfaceC60094zvb interfaceC60094zvb = this.EZpvd;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC60094zvb != subscriptionHelper) {
                this.EZpvd = subscriptionHelper;
                try {
                    this.OLrzqt.run();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    yBG.copydefault(th);
                }
                interfaceC60094zvb.cancel();
            }
        }
    }
}
