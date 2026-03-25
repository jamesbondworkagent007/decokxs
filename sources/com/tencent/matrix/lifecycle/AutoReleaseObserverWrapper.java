package com.tencent.matrix.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.Intrinsics;
import o.C57977ysb;

/* JADX INFO: loaded from: classes12.dex */
public final class AutoReleaseObserverWrapper extends C57977ysb implements LifecycleObserver {
    public final LifecycleOwner copydefault;

    @Override // o.C57977ysb
    public boolean OLrzqt(LifecycleOwner lifecycleOwner) {
        return Intrinsics.EZpvd(this.copydefault, lifecycleOwner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        KWHzl().AEQbTJ(AEQbTJ());
    }
}
