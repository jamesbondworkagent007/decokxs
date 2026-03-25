package com.okinc.core.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class WidgetExtKt$observeFocusChanged$1 implements LifecycleEventObserver {
    public final /* synthetic */ View AEQbTJ;
    public final /* synthetic */ LifecycleOwner EZpvd;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.AEQbTJ.setOnFocusChangeListener(null);
            this.EZpvd.getLifecycle().removeObserver(this);
        }
    }
}
