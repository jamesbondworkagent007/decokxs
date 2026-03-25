package com.okinc.tradeuilib.viewbinder;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import o.pUU;

/* JADX INFO: loaded from: classes17.dex */
public class FragmentViewBinder implements LifecycleObserver {
    public final Fragment AEQbTJ;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onInVisible() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onVisible() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void clear() {
        pUU.EZpvd("PageWatcher", "Lifecycle.Event.ON_DESTROY");
        this.AEQbTJ.getLifecycle().removeObserver(this);
    }
}
