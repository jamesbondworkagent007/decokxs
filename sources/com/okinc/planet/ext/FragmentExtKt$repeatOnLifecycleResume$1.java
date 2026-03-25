package com.okinc.planet.ext;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FragmentExtKt$repeatOnLifecycleResume$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Function0<Unit> AEQbTJ;
    public final /* synthetic */ Function0<Unit> KWHzl;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        this.KWHzl.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.AEQbTJ.invoke();
        super.onPause(lifecycleOwner);
    }
}
