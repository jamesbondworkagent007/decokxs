package com.okinc.kline.ui.component.basic;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC39034pkg;
import o.C39041pkn;

/* JADX INFO: loaded from: classes23.dex */
public final class ComponentManager$1 implements LifecycleEventObserver {
    public final /* synthetic */ C39041pkn<T> copydefault;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC39034pkg abstractC39034pkgOLrzqt;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event != Lifecycle.Event.ON_DESTROY || (abstractC39034pkgOLrzqt = this.copydefault.OLrzqt()) == null) {
            return;
        }
        abstractC39034pkgOLrzqt.KWHzl();
    }
}
