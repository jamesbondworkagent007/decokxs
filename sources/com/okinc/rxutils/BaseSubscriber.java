package com.okinc.rxutils;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.C48844udO;
import o.InterfaceC58217yxC;
import o.InterfaceC60094zvb;
import o.InterfaceC60097zve;
import o.pUU;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseSubscriber<T> extends AtomicReference<InterfaceC60094zvb> implements InterfaceC60097zve<T>, InterfaceC60094zvb, InterfaceC58217yxC {
    private static final long serialVersionUID = -7251123623737029452L;
    protected String mKey;
    protected Object mObj;

    public BaseSubscriber(Object obj) {
        this.mObj = obj;
        this.mKey = C48844udO.KWHzl();
    }

    public BaseSubscriber(Object obj, int i) {
        this.mObj = obj;
        this.mKey = String.valueOf(i);
    }

    public BaseSubscriber(Object obj, String str) {
        this.mObj = obj;
        this.mKey = str;
    }

    @Override // o.InterfaceC60097zve
    public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        SubscriptionHelper.set(this, interfaceC60094zvb);
        SubHelper.OLrzqt(this.mObj, this, this.mKey);
        request(Long.MAX_VALUE);
    }

    @Override // o.InterfaceC60097zve
    public void onError(Throwable th) {
        Object obj = this.mObj;
        if (obj != null) {
            SubHelper.EZpvd(obj, this.mKey);
            this.mObj = null;
        }
        pUU.copydefault("Rx", "Subscriber Receive error!!");
        th.printStackTrace();
    }

    public void onComplete() {
        Object obj = this.mObj;
        if (obj != null) {
            SubHelper.EZpvd(obj, this.mKey);
            this.mObj = null;
        }
    }

    public void dispose() {
        cancel();
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.InterfaceC60094zvb
    public void request(long j) {
        get().request(j);
    }

    @Override // o.InterfaceC60094zvb
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }
}
