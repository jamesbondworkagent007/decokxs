package com.okinc.extension;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class OkPlatformExtKt$doOnDismiss$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Function0<Unit> KWHzl;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.KWHzl.invoke();
    }
}
