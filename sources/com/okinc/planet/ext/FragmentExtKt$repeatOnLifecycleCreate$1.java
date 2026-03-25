package com.okinc.planet.ext;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FragmentExtKt$repeatOnLifecycleCreate$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Function0<Unit> AEQbTJ;
    public final /* synthetic */ Function0<Unit> KWHzl;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        this.KWHzl.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.AEQbTJ.invoke();
        super.onDestroy(lifecycleOwner);
    }
}
