package com.okinc.tradeuilib.trade.panel.component.input;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C49951uyI;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class AmountInputComponent$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ C49951uyI OLrzqt;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        pUU.AEQbTJ("AmountInputComponent - init onDestroy");
        this.OLrzqt.copydefault().KWHzl(this.OLrzqt.AEQbTJ);
    }
}
