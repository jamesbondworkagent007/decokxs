package com.okinc.lib.monitor.memory;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.pJX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LeakLifecycleObserver implements DefaultLifecycleObserver {
    public final Object OLrzqt;

    public LeakLifecycleObserver(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.OLrzqt = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        pJX.Companion.copydefault().KWHzl(this.OLrzqt);
    }
}
