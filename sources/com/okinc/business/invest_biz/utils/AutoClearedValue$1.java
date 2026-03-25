package com.okinc.business.invest_biz.utils;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C27485jwA;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoClearedValue$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ C27485jwA<T> copydefault;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        this.copydefault.OLrzqt = null;
    }
}
