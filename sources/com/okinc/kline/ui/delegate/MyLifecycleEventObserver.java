package com.okinc.kline.ui.delegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39273ppG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MyLifecycleEventObserver implements LifecycleEventObserver {
    public final InterfaceC39273ppG OLrzqt;

    public MyLifecycleEventObserver(@NotNull InterfaceC39273ppG interfaceC39273ppG) {
        Intrinsics.checkNotNullParameter(interfaceC39273ppG, "");
        this.OLrzqt = interfaceC39273ppG;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.OLrzqt.copydefault();
        }
    }
}
