package com.trello.lifecycle2.android.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import o.C58152yvr;
import o.C58155yvu;
import o.C58159yvy;
import o.InterfaceC58151yvq;
import o.yBM;

/* JADX INFO: loaded from: classes12.dex */
public final class AndroidLifecycle implements InterfaceC58151yvq<Lifecycle.Event>, LifecycleObserver {
    public final yBM<Lifecycle.Event> OLrzqt = yBM.AEQbTJ();

    public static InterfaceC58151yvq<Lifecycle.Event> copydefault(LifecycleOwner lifecycleOwner) {
        return new AndroidLifecycle(lifecycleOwner);
    }

    public AndroidLifecycle(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Lo/yvu; */
    @Override // o.InterfaceC58151yvq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public <T> C58155yvu<T> OLrzqt(@NonNull Lifecycle.Event event) {
        return C58159yvy.KWHzl(this.OLrzqt, event);
    }

    @Override // o.InterfaceC58151yvq
    public <T> C58155yvu<T> EZpvd() {
        return C58152yvr.OLrzqt(this.OLrzqt);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.OLrzqt.onNext(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
