package com.okinc.core.arch.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoReleaseValue<T> implements LifecycleEventObserver {
    public Lifecycle AEQbTJ;
    public T KWHzl;

    public final void EZpvd(Lifecycle lifecycle) {
        Lifecycle lifecycle2 = this.AEQbTJ;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this);
        }
        this.AEQbTJ = lifecycle;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.KWHzl = null;
            EZpvd(null);
        }
    }
}
