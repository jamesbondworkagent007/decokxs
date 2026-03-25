package com.tinder.scarlet.lifecycle.android;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import o.C58071yuP;
import o.InterfaceC58028ytZ;
import o.InterfaceC60097zve;

/* JADX INFO: loaded from: classes17.dex */
public final class ServiceStartedLifecycle implements InterfaceC58028ytZ {
    public final C58071yuP OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.OLrzqt.subscribe(interfaceC60097zve);
    }

    public final class ALifecycleObserver implements LifecycleObserver {
        public final /* synthetic */ ServiceStartedLifecycle AEQbTJ;

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onResume() {
            this.AEQbTJ.OLrzqt.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            this.AEQbTJ.OLrzqt.onNext(InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.TaskDescription.EZpvd);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            this.AEQbTJ.OLrzqt.onComplete();
        }
    }
}
