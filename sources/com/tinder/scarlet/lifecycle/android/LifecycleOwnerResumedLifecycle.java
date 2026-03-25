package com.tinder.scarlet.lifecycle.android;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import o.C58071yuP;
import o.C58088yug;
import o.InterfaceC58028ytZ;
import o.InterfaceC60097zve;

/* JADX INFO: loaded from: classes17.dex */
public final class LifecycleOwnerResumedLifecycle implements InterfaceC58028ytZ {
    public final C58071yuP AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.AEQbTJ.subscribe(interfaceC60097zve);
    }

    public final class ALifecycleObserver implements LifecycleObserver {
        public final /* synthetic */ LifecycleOwnerResumedLifecycle OLrzqt;

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            this.OLrzqt.AEQbTJ.onNext(new InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator(new C58088yug(1000, "Paused")));
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            this.OLrzqt.AEQbTJ.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            this.OLrzqt.AEQbTJ.onComplete();
        }
    }
}
