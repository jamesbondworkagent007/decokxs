package com.okinc.track;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C49390une;
import o.InterfaceC49398unm;

/* JADX INFO: loaded from: classes16.dex */
public final class ActivityTrackerKt$putThreadTrackPoint$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ InterfaceC49398unm OLrzqt;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        C49390une.EZpvd().remove(this.OLrzqt.getClass().getName());
    }
}
